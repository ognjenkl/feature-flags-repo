package com.ok.featureflags.feature.flags;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feature-flag")
@RestController
@RequiredArgsConstructor
public class FeatureFlagsController {

    private final FeatureFlags featureFlags;

    @GetMapping
    public ResponseEntity<?> getFeatureFlags() {
        return ResponseEntity.ok(featureFlags);
    }
}
