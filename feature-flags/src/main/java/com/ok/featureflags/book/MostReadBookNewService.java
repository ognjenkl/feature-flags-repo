package com.ok.featureflags.book;

public class MostReadBookNewService implements BookService {
    @Override
    public String getMostReadBookTitle() {
        return "The most read book: Spring Boot book";
    }
}
