package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f17951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f17952b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f17952b = eventDispatcher;
        this.f17951a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17952b.listener.onRenderedFirstFrame(this.f17951a);
    }
}
