package com.ok.featureflags.feature.flags;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Getter
@Setter
@ConfigurationProperties("feature-flags")
public class FeatureFlags {
    Boolean feature;
    Boolean book;
    Boolean movie;
}
