package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.model.BankAccount;

import java.util.ArrayList;

public interface BankAccountService {
    void add(BankAccount bankAccount);

    ArrayList<BankAccount> getAllAccount();
}
