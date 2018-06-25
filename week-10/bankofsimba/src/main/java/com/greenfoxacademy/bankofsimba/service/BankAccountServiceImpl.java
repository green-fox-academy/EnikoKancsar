package com.greenfoxacademy.bankofsimba.service;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankAccountServiceImpl implements BankAccountService {
    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public BankAccountServiceImpl() {
        createSomeAccounts();
    }

    public void createSomeAccounts() {
        bankAccounts.add(new BankAccount("Simba", 2000.00, "lion", true, true));
        bankAccounts.add(new BankAccount("Nala", 2000.00, "lion", false, true));
        bankAccounts.add(new BankAccount("Zazu", 2000.00, "red-bild hornbill", false, true));
        bankAccounts.add(new BankAccount("Rafiki", 2000.00, "mandrill", false, true));
        bankAccounts.add(new BankAccount("Me", 2000.00, "human", true, false));
    }

    @Override
    public void add(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }


    @Override
    public ArrayList<BankAccount> getAllAccount() {
        return bankAccounts;
    }
}