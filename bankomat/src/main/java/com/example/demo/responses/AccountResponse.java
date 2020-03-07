package com.example.demo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountResponse {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("fName")
    private String fName;

    @JsonProperty("sName")
    private String sName;

    @JsonProperty("balance")
    private double balance;
}
