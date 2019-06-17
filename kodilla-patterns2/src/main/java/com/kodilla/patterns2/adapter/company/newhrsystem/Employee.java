package com.kodilla.patterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {
    private final String peselId;
    private final String firstName;
    private final String lastName;
    private final BigDecimal baseSalary;

    public Employee(String peselId, String firstName, String lastName, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public int hashCode() {
        return peselId != null ? peselId.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;

        Employee employee = (Employee) obj;

        return peselId != null ? peselId.equals(employee.peselId) : employee.peselId == null;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + "\'" +
                ", firstName='" + firstName + "\'" +
                ", lastName='" + lastName + "\'" +
                ", baseSalary=" + baseSalary + "}";
    }
}
