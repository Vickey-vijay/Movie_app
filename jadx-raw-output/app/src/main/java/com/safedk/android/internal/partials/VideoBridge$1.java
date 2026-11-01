package com.safedk.android.internal.partials;

import com.fyber.inneractive.sdk.external.VideoContentListener;

/* JADX INFO: loaded from: classes.dex */
class VideoBridge$1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ VideoContentListener f44881a;

    VideoBridge$1(VideoContentListener videoContentListener) {
        this.f44881a = videoContentListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        VideoBridge.a(this.f44881a);
    }
}
