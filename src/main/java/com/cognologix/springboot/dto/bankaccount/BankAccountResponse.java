package com.cognologix.springboot.dto.bankaccount;

import com.cognologix.springboot.dto.BaseResponse;
import com.cognologix.springboot.entities.Account;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BankAccountResponse extends BaseResponse {
    private Account employee;

    public BankAccountResponse(Account acc) {
        super(true);
        this.employee = acc;
    }

    public BankAccountResponse(boolean isSuccess) {
        super(isSuccess);
    }
}
