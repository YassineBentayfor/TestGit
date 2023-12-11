package org.example;

import java.util.Comparator;
import java.util.List;

public class SortByAge implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

