package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {

    private final
    BankAccountService bankService;

    @Autowired
    public WebController(BankAccountService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("showAll")
    public String getAllAccount(Model model) {
        model.addAttribute("newBankAccount", new BankAccount());
        model.addAttribute("bankAccounts", bankService.getAllAccount());
        return "allAccounts";
    }

    @PostMapping("showAll")
    public String postAllAccount(@ModelAttribute BankAccount newBankAccount) {
        bankService.add(newBankAccount);
        return "redirect:/showAll";
    }

    @GetMapping("HTMLception")
    public String getHTML(Model thymeLeafModel) {
        thymeLeafModel.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }
}