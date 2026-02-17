package BuilderPattern;

public class Car {

    private String make;
    private String model;
    private int year;
    private String color;
    private String engineType;
    private boolean sunroof;
    private boolean navigationSystem;
    private boolean leatherSeats;

    public static Builder newBuilder() {
        return new Car().new Builder();
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", sunroof=" + sunroof +
                ", navigationSystem=" + navigationSystem +
                ", leatherSeats=" + leatherSeats +
                '}';
    }

    class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private String engineType;
        private boolean sunroof;
        private boolean navigationSystem;
        private boolean leatherSeats;

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder setSunroof(boolean sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Builder setNavigationSystem(boolean navigationSystem) {
            this.navigationSystem = navigationSystem;
            return this;
        }

        public Builder setLeatherSeats(boolean leatherSeats) {
            this.leatherSeats = leatherSeats;
            return this;
        }

        public Builder newBuilder() {
            return new Builder();
        }

        public Car build() {
            Car car = new Car();
            car.make = this.make;
            car.model = this.model;
            car.year = this.year;
            car.color = this.color;
            car.engineType = this.engineType;
            car.sunroof = this.sunroof;
            car.navigationSystem = this.navigationSystem;
            car.leatherSeats = this.leatherSeats;
            return car;
        }
    }
}