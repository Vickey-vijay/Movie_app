package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.o f16304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f16305b;

    public f(AudioRendererEventListener.EventDispatcher eventDispatcher, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        this.f16305b = eventDispatcher;
        this.f16304a = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16305b.listener.onAudioInputFormatChanged(this.f16304a);
    }
}
