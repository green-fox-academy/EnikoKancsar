package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    private final
    BankAccountService bankService;

    @Autowired
    public WebController(BankAccountService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("show")
    public String getAllAccount(Model thymeLeafModel) {
        BankAccount simba = new BankAccount("Simba", 2000.00, "lion");
        bankService.add(simba);
        thymeLeafModel.addAttribute("bankAccounts", bankService.getAllAccount());
        return "bankaccounts";
    }

    @GetMapping("HTMLception")
    public String getHTML(Model thymeLeafModel) {
        thymeLeafModel.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }
}
