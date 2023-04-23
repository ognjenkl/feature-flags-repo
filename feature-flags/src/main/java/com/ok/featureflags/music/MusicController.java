package com.ok.featureflags.music;

import com.ok.featureflags.feature.flags.FeatureFlags;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RequiredArgsConstructor
@RequestMapping("/music")
@RestController
public class MusicController {

    private final FeatureFlags featureFlags;
    private final MusicService musicService;

    @GetMapping
    public String getMusic() {
        if (!featureFlags.getMusic()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Page not found");
        }
        return musicService.getMusicTitle();
    }
}
