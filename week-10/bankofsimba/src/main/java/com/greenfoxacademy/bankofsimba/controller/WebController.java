package com.greenfoxacademy.bankofsimba.controller;

import com.greenfoxacademy.bankofsimba.model.BankAccount;
import com.greenfoxacademy.bankofsimba.service.BankAccountService;
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
    public String getSimba(Model thymeLeafModel) {
        BankAccount simba = new BankAccount("Simba", 2000.00, "lion", true);
        bankService.add(simba);
        thymeLeafModel.addAttribute("bankAccounts", bankService.getAllAccount());
        return "accountSimba";
    }

    @GetMapping("showAll")
    public String getAllAccount(Model thymeLeafModel) {
        BankAccount simba = new BankAccount("Simba", 2000.00, "lion", true);
        bankService.add(simba);
        BankAccount nala = new BankAccount("Nala", 2000.00, "lion", false);
        bankService.add(nala);
        BankAccount zazu = new BankAccount("Zazu", 2000.00, "red-bild hornbill", false);
        bankService.add(zazu);
        BankAccount rafiki = new BankAccount("Rafiki", 2000.00, "mandrill", false);
        bankService.add(rafiki);
        thymeLeafModel.addAttribute("bankAccounts", bankService.getAllAccount());
        return "allAccounts";
    }

    @GetMapping("HTMLception")
    public String getHTML(Model thymeLeafModel) {
        thymeLeafModel.addAttribute("htmlText", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "htmlception";
    }
}