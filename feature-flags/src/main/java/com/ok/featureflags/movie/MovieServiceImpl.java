package com.ok.featureflags.movie;

import com.ok.featureflags.feature.flags.FeatureFlags;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@RefreshScope
@RequiredArgsConstructor
@Service
public class MovieServiceImpl implements MovieService {

    private MovieService movieService;
    private final FeatureFlags featureFlags;

    @PostConstruct
    private void init() {
        if (featureFlags.getMovie()) {
            movieService = new MovieNewService();
        } else {
            movieService = new MovieOldService();
        }
    }

    @Override
    public String getTheBestMovie() {
        return movieService.getTheBestMovie();
    }
}
