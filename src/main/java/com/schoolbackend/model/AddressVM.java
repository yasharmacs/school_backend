package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@Builder
@Document
public class AddressVM {
    private String houseNo;
    private String city;
    private String remainingAddress;
    private String pincode;
    private String state;
    private String country;

}
