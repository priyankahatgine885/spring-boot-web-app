package com.cognologix.springboot.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    private String accountNumber;
    private String FullName;
    private String phone;
    private double balance;

    @Override
    public String toString() {
        return String.format("AccountNO : %-5s FullName : %-5s Phone : %-5s  Balance : %-5.2f", this.accountNumber, this.FullName,this.phone, this.balance);
    }

}

