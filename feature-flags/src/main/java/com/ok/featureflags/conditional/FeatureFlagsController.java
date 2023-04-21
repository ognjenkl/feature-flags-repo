package com.ok.featureflags.conditional;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/feature-flags")
@RestController
@RequiredArgsConstructor
public class FeatureFlagsController {

    private final FeatureFlags featureFlags;

    @GetMapping
    public ResponseEntity<?> getFeatureFlags() {
        return ResponseEntity.ok(featureFlags.getFeature1());
    }
}
