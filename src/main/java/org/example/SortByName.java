package org.example;

import java.util.Comparator;

public class SortByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return CharSequence.compare( o1.getNom(), o2.getNom());
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
