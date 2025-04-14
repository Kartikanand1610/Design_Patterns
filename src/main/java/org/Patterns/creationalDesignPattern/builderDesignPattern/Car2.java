package org.Patterns.creationalDesignPattern.builderDesignPattern;

public class Car2 {
    private String engine;
    private int wheels;
    private int seats;
    private String color;
    private boolean navigationSystems;

    private Car2(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats = builder.seats;
        this.color = builder.color;
        this.navigationSystems = builder.navigationSystems;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public boolean getNavigationSystems() {
        return navigationSystems;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats +
                ", color=" + color + ", navigationSystems=" + navigationSystems + "]";
    }

    // ✅ Static nested builder class
    public static class CarBuilder {
        private String engine;
        private int wheels = 4;
        private int seats = 4;
        private String color = "black";
        private boolean navigationSystems = false;

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setNavigationSystems(boolean navigationSystems) {
            this.navigationSystems = navigationSystems;
            return this;
        }

        public Car2 build() {
            return new Car2(this);
        }
    }
}
