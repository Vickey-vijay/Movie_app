package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f17945c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10) {
        this.f17945c = eventDispatcher;
        this.f17943a = i10;
        this.f17944b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17945c.listener.onDroppedFrames(this.f17943a, this.f17944b);
    }
}
