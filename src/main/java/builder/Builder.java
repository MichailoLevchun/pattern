package builder;

public class Builder {

    public void startDecoratorDemo() {
        Director director = new Director();
        director.setBuilder(new MitsubishiBuilder());
        Car car = director.buildCar();
        System.out.println(car);
        director.setBuilder(new FordBuilder());
        car = director.buildCar();
        System.out.println(car);
    }
}
