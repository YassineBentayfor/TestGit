package EmployeeCDICDD;

public class EmployeeCDD extends Employee implements IEmployeeCommition, IEmployeeNoComission{

    @Override
    public double calculerCommition() {
        return 0;
    }

    @Override
    public double calculerSalaireNet() {
        System.out.println("Commition");
        return 0;

    }
}
