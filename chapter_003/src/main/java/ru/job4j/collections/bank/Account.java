package ru.job4j.collections.bank;

public class Account {

    private double value;
    private int requisites;

    public Account(double value, int requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public int getRequisites() {
        return requisites;
    }
}
