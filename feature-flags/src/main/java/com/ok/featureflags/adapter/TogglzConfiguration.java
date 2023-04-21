//package com.ok.featureflags.adapter;
//
//import com.ok.featureflags.module.Features;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.util.ResourceUtils;
//import org.togglz.core.Feature;
//import org.togglz.core.manager.TogglzConfig;
//import org.togglz.core.repository.StateRepository;
//import org.togglz.core.repository.file.FileBasedStateRepository;
//import org.togglz.core.user.FeatureUser;
//import org.togglz.core.user.SimpleFeatureUser;
//import org.togglz.core.user.UserProvider;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//
//@Configuration
//public class TogglzConfiguration implements TogglzConfig {
//    public Class<? extends Feature> getFeatureClass() {
//        return Features.class;
//    }
//
//    public StateRepository getStateRepository() {
//        File file;
//        try {
//            file = ResourceUtils.getFile("classpath:feature.properties");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        return new FileBasedStateRepository(file);
//    }
//
//    public UserProvider getUserProvider() {
//        return new UserProvider() {
//            @Override
//            public FeatureUser getCurrentUser() {
//                return new  SimpleFeatureUser("admin", true);
//            }
//        };
//    }
//}