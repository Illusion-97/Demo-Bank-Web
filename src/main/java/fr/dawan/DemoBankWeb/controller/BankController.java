package fr.dawan.DemoBankWeb.controller;

import fr.dawan.demobank.DemoBankApplication;
import fr.dawan.demobank.dtos.AccountDto;
import fr.dawan.demobank.exceptions.AccountNotFoundException;
import fr.dawan.demobank.serveur.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank")
public class BankController {

    @GetMapping("/check/{name}")
    public String getData(@PathVariable String name) throws AccountNotFoundException {
        return BankService.getAccountData(name);
    }
}
