package factoryMethod;

public class EUVacPolicy extends VacationPolicy {

    public EUVacPolicy() {

        this.daysForAllowedVacation = 22;
        this.numberOfMonth = 6;
        this.numberOfDaysTakenVacation = 7;
    }

    @Override
    protected void alterForLegalMinimum() {
        if (numberOfMonth >= 2) {
            System.out.println("It is allowed to take vac");
        } else {
            throw new RuntimeException("Not possible to take vac");
        }
    }
}
