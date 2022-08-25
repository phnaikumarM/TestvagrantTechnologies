package controlFlow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlanetaryData {

    static List<Planet> planetList = new ArrayList<>();

    public static Integer getMoonsCountHavingRings() {
        int count = 0;
        for (Planet planet: planetList) {
            if (planet.hasRings()) {
                count += planet.getNumberOfMoons();
            }
        }
        return count;
    }

    public static String maximumGasFound() {
        HashMap<String, Integer> map = new HashMap<>();
        for (Planet planet : planetList) {
            planet.getSurfaceGases().stream().forEach(item -> {
                map.putIfAbsent(item, 0);
                map.put(item, map.get(item) + 1);
            });
        }

        int max = 0;
        String maximumGasName = null;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                maximumGasName = entry.getKey();
            }
        }
        return maximumGasName;
    }

    public static void main(String[] args) {
        planetList.add(new Planet("Mercury", Arrays.asList(), 0, false));
        planetList.add(new Planet("Venus", Arrays.asList("Carbon Dioxide", "Nitrogen"), 0, false));
        planetList.add(new Planet("Earth", Arrays.asList("Nitrogen", "Oxygen"), 1, false));
        planetList.add(new Planet("Jupitor", Arrays.asList("Hydrogen", "Helium"), 79, true));
        planetList.add(new Planet("Saturn", Arrays.asList("Hydrogen", "Helium"), 83, true));
        planetList.add(new Planet("Uranus", Arrays.asList("Hydrogen", "Helium", "Methane"), 27, true));

        System.out.println(getMoonsCountHavingRings());
        System.out.println(maximumGasFound());
    }
}