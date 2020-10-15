package com.sib.portal.ebank.individual.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/ebank/profile")
public class ProfileController {
    private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

    AtomicInteger counter = new AtomicInteger();

    @GetMapping("")
    public String getIndividualProfile() {
        return "individualProfile";
    }

    @GetMapping("/500")
    public String throwNotFoundError() {
        logger.info("counter={}", counter.incrementAndGet());
        if (counter.get() > 3) {
            return "SUCCESS";
        } else {
            throw new RuntimeException("test 500 INTERNAL_SERVER_ERROR");
        }
    }

}
