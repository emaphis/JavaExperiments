package org.maphis.devoxx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/**
 *
 * @author emaph
 */
public class H_FunWithCityRecords {

    record City(int id, String name, State state, int population, double surface) {

        public static City of(String line) {
            // 1;New York;New York;8 336 817;780,9
            var elements = line.split(";");
            var id = Integer.parseInt(elements[0]);
            var name = elements[1];
            var state = new State(elements[2]);
            var population = Integer.parseInt(elements[3].replaceAll(" ", ""));
            var surface = Double.parseDouble(elements[4].replaceAll("[ ,]", ""));
            return new City(id, name, state, population, surface);
        }
    }  // end of record City

    record State(String name) {
    }

    record PopulationState(State state, int population) {
        PopulationState(Map.Entry<State, Integer> entry) {
            this(entry.getKey(), entry.getValue());
        }

        public static Comparator<? super PopulationState> comparingByPopulation() {
            return Comparator.comparing(PopulationState::population);
        }
    }

    public static void main(String[] args) throws IOException {
        var main = new H_FunWithCityRecords();
        main.run();
    }

    public void run() throws IOException {
        var path = Path.of("files/cities.csv");

        var cities = readCities(path);
        System.out.println("cities.size() = " + cities.size());
        //cities.stream().forEach(System.out::println);

        // Read all states
        var states
                = cities.stream()
                        .map(City::state)
                        .distinct()
                        .toList();
        //states.stream().forEach(System.out::println);
        System.out.println("states.size() = " + states.size());

        //  Population by state
        Map<State, Integer> populationByState
                = cities.stream()
                        .collect(
                                groupingBy(
                                        City::state, summingInt(City::population)
                                ));
        //System.out.println("Population = " + populationByState);
        System.out.println("States = " + populationByState.size());

        // Most poulated state
//        Map<State,Integer> mostPopulatedState
//                = populationByState.entrySet().stream()
//                        .map(PopulationState::new);
//                        //.max(populationByState.comparingByPopulation())
//                        //.orElseThrow();

        //System.out.println(mostPopulatedState.toString());
    }


    private List<City> readCities(Path path) throws IOException {
        try ( var lines = Files.lines(path);) {

            return lines.skip(2)
                    .map(City::of)
                    .toList();
        }
    }

}
