package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;

import java.util.ArrayList;

public interface BankAccountService {
    void add(BankAccount bankAccount);

    ArrayList<BankAccount> getAllAccount();

    void raiseBalance(BankAccount selectedAccount);
}