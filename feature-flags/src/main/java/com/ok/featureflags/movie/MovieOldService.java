package com.ok.featureflags.movie;

public class MovieOldService implements MovieService {
    @Override
    public String getTheBestMovie() {
        return "The best old movie: Indio";
    }
}
