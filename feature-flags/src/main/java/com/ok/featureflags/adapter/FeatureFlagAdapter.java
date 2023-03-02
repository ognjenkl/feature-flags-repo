package com.ok.featureflags.adapter;

import com.ok.featureflags.module.FeatureFlagService;
import com.ok.featureflags.module.Features;
import org.springframework.stereotype.Component;

@Component
public class FeatureFlagAdapter implements FeatureFlagService {

    @Override
    public Boolean isNewServiceEnabled() {
        return Features.TUESDAY_FEATURE.isActive();
    }
}
