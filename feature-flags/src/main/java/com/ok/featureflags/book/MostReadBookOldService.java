package com.ok.featureflags.book;

public class MostReadBookOldService implements BookService {
    @Override
    public String getMostReadBookTitle() {
        return "The most read book: Java book";
    }
}
