package com.example.demo.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountResponse {

  @JsonProperty("message")
  private String message;
}
