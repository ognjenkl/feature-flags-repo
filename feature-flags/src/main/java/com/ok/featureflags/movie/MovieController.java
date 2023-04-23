package com.ok.featureflags.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeansException;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Conditional;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Conditional(MovieFeatureCondition.class)
//@ConditionalOnExpression(value = "${featureFlags.getMovie:true}")
@RequiredArgsConstructor
@RequestMapping("/movies")
@RestController
@Conditional(MovieFeatureCondition.class)
@RefreshScope
public class MovieController implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private final MovieService service;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getTheBestMovie());
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
