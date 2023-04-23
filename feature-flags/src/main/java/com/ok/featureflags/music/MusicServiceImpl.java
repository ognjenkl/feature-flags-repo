package com.ok.featureflags.music;

import org.springframework.stereotype.Service;

@Service
public class MusicServiceImpl implements MusicService {
    @Override
    public String getMusicTitle() {
        return "Music Title: Stariway to Heaven";
    }
}
