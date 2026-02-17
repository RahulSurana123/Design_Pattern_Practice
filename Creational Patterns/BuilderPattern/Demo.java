package BuilderPattern;

public class Demo {

    public static void main(String[] args) {
        Car car = Car.newBuilder()
                .setMake("Toyota")
                .setModel("Camry")
                .setYear(2020)
                .setColor("Red")
                .setEngineType("V6")
                .setSunroof(true)
                .setNavigationSystem(true)
                .setLeatherSeats(true)
                .build();

        System.out.println(car);
    }
}