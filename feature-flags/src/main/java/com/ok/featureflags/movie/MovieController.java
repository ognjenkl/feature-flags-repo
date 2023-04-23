package com.ok.featureflags.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/movies")
@RestController
public class MovieController {

    private final MovieService service;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(service.getTheBestMovie());
    }
}
