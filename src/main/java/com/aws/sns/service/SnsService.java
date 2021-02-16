package com.aws.sns.service;

public interface SnsService {
    void sendSnsMessage(String topic, Object message, String subject);
}
