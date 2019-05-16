package factoryMethod;

public class AudiFactory extends AutoFactory {
    @Override
    public Auto createTheAuto() {
        return new Audi();
    }
}

