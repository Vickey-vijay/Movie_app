package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f16313b;

    public i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10) {
        this.f16313b = eventDispatcher;
        this.f16312a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16313b.listener.onAudioSessionId(this.f16312a);
    }
}
