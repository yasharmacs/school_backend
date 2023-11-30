package com.schoolbackend.model;


import com.schoolbackend.constants.PhoneTypeEnum;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contact {

    private PhoneTypeEnum type;
    private String number;
    private String extn;
}
