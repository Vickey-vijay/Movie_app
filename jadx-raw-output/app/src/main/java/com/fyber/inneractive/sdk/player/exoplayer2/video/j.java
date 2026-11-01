package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f17937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f17938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f17939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f17940d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f17940d = eventDispatcher;
        this.f17937a = str;
        this.f17938b = j10;
        this.f17939c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17940d.listener.onVideoDecoderInitialized(this.f17937a, this.f17938b, this.f17939c);
    }
}
