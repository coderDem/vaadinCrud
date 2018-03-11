package de.health.crud.task.samples.backend.data;

public enum Release {
    YES("Yes"), 
    NO("No"); 

    private final String name;

    private Release(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
