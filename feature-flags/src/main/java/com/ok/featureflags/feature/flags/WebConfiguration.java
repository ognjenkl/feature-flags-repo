//package com.ok.featureflags.feature.flags;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///*
//Not sure why this is needed.
//After trying to add spring security to the project and removed,
//after that I was getting 401 unauthorized error.
//When I added this class, it started working.
// */
//@Configuration
//@EnableWebSecurity
//public class WebConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    public void configure(WebSecurity web) {
//        web.ignoring().antMatchers("/**");
//    }
//}