package org.example;

public class Employee {
    private int age;
    private double salary;
    private String nom;

    public Employee() {
    }

    public Employee(String name, double salary, int age) {
        this.setNom(name);
        this.setSalary(salary);
        this.setAge(age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return this.getNom() + " - Salary: " + this.getSalary() + this.getAge() ;
    }
}