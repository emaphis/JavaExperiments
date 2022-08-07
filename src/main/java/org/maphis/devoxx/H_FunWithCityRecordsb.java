package org.maphis.devoxx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.summingInt;

/**
 *
 * @author emaph
 */
public class H_FunWithCityRecordsb {

    record City(int id, String name, State state, Population population, double surface) {

        public static City of(String line) {
            // 1;New York;New York;8 336 817;780,9
            var elements = line.split(";");
            var id = Integer.parseInt(elements[0]);
            var name = elements[1];
            var state = new State(elements[2]);
            var population
                    = new Population(Integer.parseInt(elements[3].replaceAll(" ", "")));
            var surface = Double.parseDouble(elements[4].replaceAll("[ ,]", ""));
            return new City(id, name, state, population, surface);
        }
    }

    record State(String name) {

    }

    record Population(int amount) implements Comparable<Population> {

        @Override
        public int compareTo(Population other) {
            return Integer.compare(this.amount, other.amount);
        }

        private static Collector<City, ?, Population> summing() {
            return collectingAndThen(
                    summingInt(city -> city.population().amount()),
                    Population::new);
        }
    }

    public static void main(String[] args) throws IOException {
        var main = new H_FunWithCityRecordsb();
        main.run();
    }

    public void run() throws IOException {
        var path = Path.of("files/cities.csv");

        List<City> cities = readCities(path);
        //cities.stream().forEach(System.out::println);
        System.out.println("cities.size() = " + cities.size());

        // Read all states
        List<State> states
                = cities.stream()
                        .map(City::state)
                        .distinct()
                        .toList();
        //states.stream().forEach(System.out::println);
        System.out.println("state count = " + states.size());


        // Population by state
        Map<State, Population> populationByState
                = cities.stream()
                        .collect(Collectors.groupingBy(City::state, Population.summing()));
        //populationByState.entrySet().forEach(System.out::println);
        System.out.println("populationByState count = " + populationByState.size());

        // Most populated state
        Map.Entry<State, Population> mostPopulatedState
                = populationByState.entrySet().stream()
                        .max(Map.Entry.comparingByValue())
                        .orElseThrow();
        System.out.println("most populated state = " + mostPopulatedState);
    }

    private List<City> readCities(Path path) throws IOException {
        try ( var lines = Files.lines(path);) {

            return lines.skip(2)
                    .map(City::of)
                    .toList();
        }
    }

}
