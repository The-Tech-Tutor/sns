package com.aws.sns.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "queue")
public class QueueConfiguration {

    private String firstQueue;

    private String secondQueue;
}
