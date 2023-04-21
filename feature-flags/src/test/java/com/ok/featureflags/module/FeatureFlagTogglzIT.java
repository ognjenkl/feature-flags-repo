package com.ok.featureflags.module;

import com.ok.featureflags.togglz.module.GreetingService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FeatureFlagTogglzIT {

    @Autowired
    private GreetingService service;

    @Test
    void tuesdayTest() {
        Assertions.assertEquals("Tuesday good morning", service.goodMorning());
        Assertions.assertEquals("Tuesday good afternoon", service.goodAfternoon());
    }
}
