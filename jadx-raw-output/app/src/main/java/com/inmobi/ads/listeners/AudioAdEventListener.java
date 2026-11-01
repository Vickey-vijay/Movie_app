package com.inmobi.ads.listeners;

import ck.p;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiAudio;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class AudioAdEventListener extends AdEventListener<InMobiAudio> {
    public void onAdDismissed(InMobiAudio inMobiAudio) {
        p.j(inMobiAudio, "ad");
    }

    public void onAdDisplayFailed(InMobiAudio inMobiAudio) {
        p.j(inMobiAudio, "ad");
    }

    public void onAdDisplayed(InMobiAudio inMobiAudio) {
        p.j(inMobiAudio, "ad");
    }

    public void onAdFetchFailed(InMobiAudio inMobiAudio, InMobiAdRequestStatus inMobiAdRequestStatus) {
        p.j(inMobiAudio, "ad");
        p.j(inMobiAdRequestStatus, "status");
    }

    public void onAudioStatusChanged(InMobiAudio inMobiAudio, AudioStatus audioStatus) {
        p.j(inMobiAudio, "ad");
        p.j(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(InMobiAudio inMobiAudio, Map<Object, ? extends Object> map) {
        p.j(inMobiAudio, "ad");
        p.j(map, "rewards");
    }

    public void onUserLeftApplication(InMobiAudio inMobiAudio) {
        p.j(inMobiAudio, "ad");
    }
}
