package com.schoolbackend.constants;


import lombok.ToString;

@ToString
public enum PhoneTypeEnum {
    MOBILE("MOBILE"),
    LADNLINE("LANDLINE"),
    OTHER("OTHER");

    private String value;


    PhoneTypeEnum(String value) {
       this.value=value;
    }

}
