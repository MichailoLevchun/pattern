package factoryMethod;

public class FactoryMethod {

    public void factoryMethodRun() {
        AutoFactory autoFactory = readFiles("ford");
        Auto auto = autoFactory.createTheAuto();
        auto.readAuto();
        autoFactory = readFiles("audi");
        auto = autoFactory.createTheAuto();
        auto.readAuto();
    }

    private AutoFactory readFiles(String name) {
        if (name.equals("ford")) {
            return new FordFactory();
        }
        if (name.equals("audi")) {
            return new AudiFactory();
        }
        else throw new RuntimeException(name + " concern is unknown");
    }
}
