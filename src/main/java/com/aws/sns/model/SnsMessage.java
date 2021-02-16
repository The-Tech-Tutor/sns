package com.aws.sns.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SnsMessage {
    @JsonProperty(value = "Subject")
    private String subject;

    @JsonProperty(value = "Message")
    private String message;
}
