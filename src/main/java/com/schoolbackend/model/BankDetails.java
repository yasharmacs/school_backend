package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BankDetails {

    private  String ifscCode;
    private String bankName;
    private String bankAccountNumber;
    private String branchName;
}
