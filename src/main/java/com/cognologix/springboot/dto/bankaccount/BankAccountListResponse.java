package com.cognologix.springboot.dto.bankaccount;
import com.cognologix.springboot.dto.BaseResponse;
import com.cognologix.springboot.entities.Account;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BankAccountListResponse extends BaseResponse {
    private List<Account> accountList;
    private Integer size;
    public BankAccountListResponse(List<Account> acc, Integer size) {
        super(true);
        this.accountList = acc;
        this.size = size;
    }
}
