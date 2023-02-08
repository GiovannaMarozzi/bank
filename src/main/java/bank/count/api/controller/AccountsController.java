package bank.count.api.controller;


import bank.count.api.accounts.Account;
import bank.count.api.service.AccountService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountsController {

    @Autowired
    private AccountService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account cadAccount(@RequestBody @Valid Account informations){
        return service.cadAccount(informations);
    }
}
