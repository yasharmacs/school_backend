package com.schoolbackend.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Name {

    private String prefix;
    private String firstName;
    private String lastName;
}
