package org.example;

import java.util.Comparator;
import java.util.List;

public class EmployeeService {
    public void sortEmployee(List<Employee> employeList, Comparator<Employee> comparator) {
        employeList.sort(comparator);
        employeList.forEach(System.out::println);

    }

}
