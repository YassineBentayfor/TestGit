package EmployeeCDICDD;

public class EmployeeIntern extends Employee implements IEmployeeNoComission{
    @Override
    public double calculerSalaireNet() {
        return 0;
    }
}
