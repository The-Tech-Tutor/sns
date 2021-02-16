package com.aws.sns.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SampleListener {

    @SqsListener(value = "${queue.first-queue}", deletionPolicy = SqsMessageDeletionPolicy.ALWAYS)
    public void listenToFirstQueue(@Headers Map<String, Object> headers, String message) {
        log.info("Received a subject: {} and message on first queue: {}", headers.getOrDefault("NOTIFICATION_SUBJECT_HEADER", "Subject N/A"), message);
    }

    @SqsListener(value = "${queue.secondQueue}", deletionPolicy = SqsMessageDeletionPolicy.ALWAYS)
    public void listenToSecondQueue(@Headers Map<String, Object> headers, String message) {
        log.info("Received a subject: {} and message on second queue: {}", headers.getOrDefault("NOTIFICATION_SUBJECT_HEADER", "Subject N/A"), message);
    }
}
