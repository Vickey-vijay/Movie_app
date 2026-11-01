package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f17941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f17942b;

    public k(VideoRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.f17942b = eventDispatcher;
        this.f17941a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17942b.listener.onVideoInputFormatChanged(this.f17941a);
    }
}
