package factoryMethod;

import lombok.Data;

@Data
public abstract class VacationPolicy {
    protected int daysForAllowedVacation;
    protected int numberOfMonth;
    protected int numberOfDaysTakenVacation;

    public void accurateVacation() {
        calculateBaseVacationHour();
        alterForLegalMinimum();
        applyToPayRoll();

    }

    abstract void alterForLegalMinimum();

    private void applyToPayRoll() {
        System.out.printf("Employee take  %s days of vacation. Approved \n", numberOfDaysTakenVacation);
        System.out.printf("Remained balance is  %s days of vacation. \n", daysForAllowedVacation);

    }

    private void calculateBaseVacationHour() {
        daysForAllowedVacation -= numberOfDaysTakenVacation;
    }
}
