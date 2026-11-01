package com.inmobi.media.ads.network.inmobiJson.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public final class VideoExperience {
    private final Boolean loopVideoOnComplete;
    private final VideoProgressConfig progress = new VideoProgressConfig();
    private final VideoAudioExperience audio = new VideoAudioExperience();

    public final VideoAudioExperience getAudio() {
        return this.audio;
    }

    public final Boolean getLoopVideoOnComplete() {
        return this.loopVideoOnComplete;
    }

    public final VideoProgressConfig getProgress() {
        return this.progress;
    }
}
