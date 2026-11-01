package com.yandex.mobile.ads.common;

import androidx.annotation.MainThread;
import yads.jv3;
import yads.lh3;

/* JADX INFO: loaded from: classes10.dex */
@MainThread
public final class VideoController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh3 f51036a;

    public final void setVideoEventListener(VideoEventListener videoEventListener) {
        if (videoEventListener != null) {
            this.f51036a.f79788b = new jv3(videoEventListener);
        } else {
            this.f51036a.f79788b = null;
        }
    }

    public VideoController(lh3 lh3Var) {
        this.f51036a = lh3Var;
    }
}
