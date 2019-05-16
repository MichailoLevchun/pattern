package factoryMethod;

/* This is concrete product */

public class Audi implements Auto {

    @Override
    public void readAuto() {
        System.out.println("This is audi");
    }
}
