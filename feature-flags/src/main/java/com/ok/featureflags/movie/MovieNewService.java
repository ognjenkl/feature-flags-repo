package com.ok.featureflags.movie;

public class MovieNewService implements MovieService {
    @Override
    public String getTheBestMovie() {
        return "The best new movie: The Matrix";
    }
}
