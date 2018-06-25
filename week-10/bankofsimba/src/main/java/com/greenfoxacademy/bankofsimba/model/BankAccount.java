package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private boolean isKing;
    private boolean morality;

    public BankAccount(String name, Double balance, String animalType, boolean isKing, boolean morality) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = isKing;
        this.morality = morality;
    }

    public BankAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        this.isKing = king;
    }

    public boolean isMorality() {
        return morality;
    }

    public void setMorality(boolean morality) {
        this.morality = morality;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                ", animalType='" + animalType + '\'' +
                ", isKing='" + isKing + '\'' +
                ", morality='" + morality + '\'' +
                '}';
    }
}