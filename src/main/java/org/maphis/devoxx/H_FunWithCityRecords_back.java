package org.maphis.devoxx;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 *
 * @author emaph
 */
public class H_FunWithCityRecords_back {

    record City(int id, String name, String state, int population, double surface) {

        public static City of(String line) {
            // 1;New York;New York;8 336 817;780,9
            var elements = line.split(";");
            var id = Integer.parseInt(elements[0]);
            var name = elements[1];
            var state = elements[2];
            var population = Integer.parseInt(elements[3].replaceAll(" ", ""));
            var surface = Double.parseDouble(elements[4].replaceAll("[ ,]", ""));
            return new City(id, name, state, population, surface);
        }
    }

    public static void main(String[] args) throws IOException {
        var main = new H_FunWithCityRecords_back();
        main.run();
    }

    public void run() throws IOException {
        var path = Path.of("files/cities.csv");

        var cities = readCities(path);
        System.out.println("cities.size() = " + cities.size());

        // Read all states

        //  by state

        // Most poulates state
    }

    private List<City> readCities(Path path) throws IOException {
        try (var lines = Files.lines(path);) {

            return lines.skip(2)
                    .map(City::of)
                    .toList();
        }
    }

}
