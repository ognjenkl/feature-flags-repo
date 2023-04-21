package com.ok.featureflags.book;

import com.ok.featureflags.conditional.FeatureFlags;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@RequiredArgsConstructor
@RefreshScope
public class BookServiceImpl implements BookService {

    private BookService bookService;
    private final FeatureFlags featureFlags;

    @PostConstruct
    private void init() {
        if (featureFlags.getBookFeatureFlag()) {
            bookService = new MostReadBookNewService();
        } else {
            bookService = new MostReadBookOldService();
        }
    }

    @Override
    public String getMostReadBookTitle() {
        return bookService.getMostReadBookTitle();
    }
}