package Builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.makeSports(carBuilder);
        Car car = carBuilder.build();

        System.out.println(car.toString());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.makeSUV(carManualBuilder);
        Manual manual = carManualBuilder.build();

        System.out.println(manual);

    }
}
