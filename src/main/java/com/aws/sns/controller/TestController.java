package com.aws.sns.controller;

import com.aws.sns.service.SnsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {

    private final SnsService snsService;

    @PostMapping(path = "/sns/{subject}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity sendMessageToFirstQueue(@PathVariable String subject, @RequestBody Object message) {
        snsService.sendSnsMessage("testTopic", message, subject);
        return new ResponseEntity(HttpStatus.OK);
    }

}
