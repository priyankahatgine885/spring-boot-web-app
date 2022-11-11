package com.cognologix.springboot.controller;

import com.cognologix.springboot.dto.BaseResponse;
import com.cognologix.springboot.entities.Account;
import com.cognologix.springboot.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class BankAccountController {
    @Autowired
    private BankAccountService bankAccountService;

    @PostMapping("/bank")
    public ResponseEntity<BaseResponse> addEmployee(@RequestBody Account account) {
        BaseResponse baseResponse = null;
        HttpStatus statusCode = null;
        try {
           baseResponse = this.bankAccountService.addAccount(account);
            baseResponse.setMessage("'POST method' received request ");
            statusCode = baseResponse.getSuccess() ? HttpStatus.OK : HttpStatus.BAD_REQUEST;
        } catch (Exception ex) {
            ex.getCause();
        }
        return new ResponseEntity<>(baseResponse, statusCode);
    }
    @GetMapping("/bank")
    public ResponseEntity<BaseResponse> getAccounts() {
        BaseResponse response = null;
        HttpStatus statusCode = null;
        try {
            response = this.bankAccountService.displayAllAccounts();
            response.setMessage("'GET method' received request ");
            statusCode = response.getSuccess() ? HttpStatus.OK : HttpStatus.NO_CONTENT;
        } catch (Exception ex) {
            ex.getCause();
        }
        return new ResponseEntity<>(response, statusCode);
    }

}
