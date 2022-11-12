package factoryMethod;

public class USVacPolicy extends VacationPolicy{

    public USVacPolicy() {

        this.daysForAllowedVacation = 14;
        this.numberOfMonth = 5;
        this.numberOfDaysTakenVacation = 10;
    }

    @Override
    protected void alterForLegalMinimum() {
        if (numberOfMonth >= 3 && numberOfMonth <= 10) {
            System.out.println("It is allowed to take vac");
        } else {
            throw new RuntimeException("Not possible to take vac");
        }
    }
}
