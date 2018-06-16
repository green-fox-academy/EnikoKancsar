package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAccount() {
        return bankAccounts;
    }
}
