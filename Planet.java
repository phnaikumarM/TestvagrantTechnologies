package controlFlow;

import java.util.*;

class Planet {
    private String name;
    private List<String> surfaceGases;
    private Integer  numberOfMoons;
    private Boolean hasRings;

    public Planet() {}

    public Planet(String name, List<String> surfaceGases, Integer numberOfMoons, Boolean hasRings) {
        this.name = name;
        this.surfaceGases = surfaceGases;
        this.numberOfMoons = numberOfMoons;
        this.hasRings = hasRings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSurfaceGases() {
        return surfaceGases;
    }

    public void setSurfaceGases(List<String> surfaceGases) {
        this.surfaceGases = surfaceGases;
    }

    public Integer getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(Integer numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public Boolean hasRings() {
        return hasRings;
    }

    public void setHasRings(Boolean hasRings) {
        this.hasRings = hasRings;
    }
}

