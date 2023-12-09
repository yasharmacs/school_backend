package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@Builder
@Document
public class BankDetailsVM {

    @Id
    private String bankdetailsId;
    private  String ifscCode;
    private String bankName;
    private String bankAccountNumber;
    private String branchName;

}
