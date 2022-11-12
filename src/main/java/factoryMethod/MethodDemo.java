package factoryMethod;

public class MethodDemo {

    public void demo() {

        EUVacPolicy vacPolicy = new EUVacPolicy();
        vacPolicy.accurateVacation();

        USVacPolicy usVacPolicy = new USVacPolicy();
        usVacPolicy.accurateVacation();
    }
}
