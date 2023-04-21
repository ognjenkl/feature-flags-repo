package com.ok.featureflags.togglz.adapter;

import com.ok.featureflags.togglz.module.Features;
import org.springframework.util.ResourceUtils;
import org.togglz.core.manager.FeatureManager;
import org.togglz.core.manager.FeatureManagerBuilder;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.spi.FeatureManagerProvider;
import org.togglz.core.user.FeatureUser;
import org.togglz.core.user.SimpleFeatureUser;
import org.togglz.core.user.UserProvider;

import java.io.File;
import java.io.FileNotFoundException;

public class SingletonFeatureManagerProvider implements FeatureManagerProvider {

    private static FeatureManager featureManager;

    @Override
    public int priority() {
        return 30;
    }

    @Override
    public synchronized FeatureManager getFeatureManager() {

        if (featureManager == null) {
            File file;
            try {
                file = ResourceUtils.getFile("classpath:feature.properties");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            featureManager = new FeatureManagerBuilder()
                    .featureEnum(Features.class)
                    .stateRepository(new FileBasedStateRepository(file))
                    .userProvider(new UserProvider() {
                        @Override
                        public FeatureUser getCurrentUser() {
                            return new SimpleFeatureUser("admin", true);
                        }
                    })
//                    .userProvider(new NoOpUserProvider())
                    .build();
        }
        return featureManager;
    }
}