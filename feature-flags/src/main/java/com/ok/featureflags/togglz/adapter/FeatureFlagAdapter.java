package com.ok.featureflags.togglz.adapter;

import com.ok.featureflags.togglz.module.FeatureFlagService;
import com.ok.featureflags.togglz.module.Features;
import org.springframework.stereotype.Component;

@Component
public class FeatureFlagAdapter implements FeatureFlagService {

    @Override
    public Boolean isNewServiceEnabled() {
        return Features.TUESDAY_FEATURE.isActive();
    }
}
