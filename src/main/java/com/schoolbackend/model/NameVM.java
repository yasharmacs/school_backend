package com.schoolbackend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Document;


@Data
@Builder
@AllArgsConstructor
@Document
public class NameVM {
    private String prefix;
    private String firstName;
    private String lastName;
}
