package it.immobiliare.account.controller;

import it.immobiliare.account.dto.AccountDTO;
import it.immobiliare.account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/apiAccount")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/crea/account/supporto")
    public ResponseEntity<Boolean> creaAccount(@RequestBody AccountDTO account){
        boolean accountInserito = accountService.insertAccount(account);
        if (accountInserito) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
        }
    }
}
