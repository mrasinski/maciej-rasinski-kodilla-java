package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"67032906720", "John", "Smith"},
            {"62081612187", "Ivonne", "Novak"},
            {"75021310799", "Jessie", "Pinkman"},
            {"75010231341", "Walter", "White"},
            {"75146851688", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            9631.00,
            2000.00,
            4256.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + workers[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
