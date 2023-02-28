package com.ok.featureflags.modul;

import org.springframework.stereotype.Component;

@Component
class FeatureFlaggedService extends FeatureFlagFactoryBean<GreetingService> {

    public FeatureFlaggedService(FeatureFlagService featureFlagService) {
        super(
                GreetingService.class,
                featureFlagService::isNewServiceEnabled,
                new TuesdayGreetingService(),
                new MondayGreetingService());
    }
}
