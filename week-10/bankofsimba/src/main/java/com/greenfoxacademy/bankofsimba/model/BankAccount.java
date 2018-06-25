package com.greenfoxacademy.bankofsimba.model;

public class BankAccount {
    private String name;
    private Double balance;
    private String animalType;
    private boolean kingness;
    private boolean morality;

    public BankAccount(String name, Double balance, String animalType, boolean kingness, boolean morality) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.kingness = kingness;
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

    public boolean isKingness() {
        return kingness;
    }

    public void setKingness(boolean kingness) {
        this.kingness = kingness;
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
                ", kingness='" + kingness + '\'' +
                ", morality='" + morality + '\'' +
                '}';
    }
}