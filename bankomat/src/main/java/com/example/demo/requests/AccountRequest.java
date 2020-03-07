package com.example.demo.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountRequest {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("fName")
    private String fName;

    @JsonProperty("sName")
    private String sName;

    @JsonProperty("balance")
    private double balance;
}
