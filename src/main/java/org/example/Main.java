package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 50000.0,34));
        employeeList.add(new Employee("Alice", 60000.0,45));
        employeeList.add(new Employee("Bob", 55000.0,54));
        employeeList.add(new Employee("Eve", 65000.0,23));

        // Create an instance of SortEmployee
        EmployeeService sorter = new EmployeeService();

        // Sort the employeeList using the salaryComparator
        Comparator<Employee> sortBySalary = new SortBySalary();
        Comparator<Employee> sortByAge = new SortByAge();
        Comparator<Employee> sortByName = new SortByName();

        sorter.sortEmployee(employeeList, sortByName);
        System.out.println();
        sorter.sortEmployee(employeeList, sortByAge);
        System.out.println();
        sorter.sortEmployee(employeeList, sortBySalary);



    }
}
