package com.schoolbackend.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String houseNo;
    private String city;
    private String remainingAddress;
    private String pincode;
    private String state;
    private String country;

}
