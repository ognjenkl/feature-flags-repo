package com.ok.featureflags.book;

public class MostReadBookOldService implements BookService {
    @Override
    public String getMostReadBookTitle() {
        return "Most read book: Java book";
    }
}
