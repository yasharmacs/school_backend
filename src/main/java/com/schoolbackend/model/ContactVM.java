package com.schoolbackend.model;


import com.schoolbackend.constants.PhoneTypeEnum;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Data
@Builder
@Document
public class ContactVM {

    @Id
    private String contactId;
    private PhoneTypeEnum type;
    private String number;
    private String extn;
}
