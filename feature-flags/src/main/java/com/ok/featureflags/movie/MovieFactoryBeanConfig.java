package com.ok.featureflags.movie;

import com.ok.featureflags.feature.flags.FeatureFlagFactoryBean;
import com.ok.featureflags.feature.flags.FeatureFlags;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class MovieFactoryBeanConfig {
//public class MovieFactoryBeanConfig extends WebSecurityConfigurerAdapter {

    private final FeatureFlags featureFlags;

    @Bean
    FeatureFlagFactoryBean<MovieService> movieFactoryBean() {
        return new FeatureFlagFactoryBean<>(
                MovieService.class,
                featureFlags::getMovie,
                new MovieNewService(),
                new MovieOldService());
    }
}
