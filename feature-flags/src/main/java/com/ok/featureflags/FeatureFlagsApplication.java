package com.ok.featureflags;

import com.ok.featureflags.togglz.module.Features;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

@SpringBootApplication
public class FeatureFlagsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureFlagsApplication.class, args);
	}

	@Bean
	public FeatureProvider featureProvider() {
		return new EnumBasedFeatureProvider(Features.class);
	}
}
