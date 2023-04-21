package com.ok.featureflags.book;

public class MostReadBookNewService implements BookService {
    @Override
    public String getMostReadBookTitle() {
        return "Most read book: Spring Boot book";
    }
}
