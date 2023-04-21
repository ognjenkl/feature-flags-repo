package com.ok.featureflags.conditional;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;


@Getter
@Setter
@RefreshScope
@ConfigurationProperties("feature-flags")
public class FeatureFlags {
    Boolean feature1;
    Boolean bookFeatureFlag;

}
