package com.ok.featureflags.module;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.when;

@SpringBootTest
public class FeatureFlagModuleIT {

    @MockBean
    private FeatureFlagService featureFlagService;

    @Autowired
    private GreetingService service;


    @Test
    void mondayTest() {
        when(featureFlagService.isNewServiceEnabled()).thenReturn(false);
        Assertions.assertEquals("Monday good morning", service.goodMorning());
        Assertions.assertEquals("Monday good afternoon", service.goodAfternoon());
    }

    @Test
    void tuesdayTest() {
        when(featureFlagService.isNewServiceEnabled()).thenReturn(true);
        Assertions.assertEquals("Tuesday good morning", service.goodMorning());
        Assertions.assertEquals("Tuesday good afternoon", service.goodAfternoon());
    }
}
