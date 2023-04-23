package com.ok.featureflags.movie;

import com.ok.featureflags.feature.flags.FeatureFlags;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.boot.context.properties.source.ConfigurationPropertySources;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

//@RefreshScope
public class MovieFeatureCondition implements Condition, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        FeatureFlags featureFlags = new Binder(ConfigurationPropertySources.get(env))
                .bind("feature-flags", FeatureFlags.class).get();
        Boolean isEnabled = featureFlags.getMovie();
        return isEnabled;
//        return false;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

