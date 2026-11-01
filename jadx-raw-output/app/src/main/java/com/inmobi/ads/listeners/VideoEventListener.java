package com.inmobi.ads.listeners;

import ck.p;
import com.inmobi.ads.InMobiNative;

/* JADX INFO: loaded from: classes10.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(InMobiNative inMobiNative, boolean z10) {
        p.j(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onVideoPaused(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onVideoResumed(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onVideoSkipped(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }

    public void onVideoStarted(InMobiNative inMobiNative) {
        p.j(inMobiNative, "ad");
    }
}
