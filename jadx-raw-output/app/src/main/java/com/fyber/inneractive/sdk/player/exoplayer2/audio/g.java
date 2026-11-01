package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f16309d;

    public g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10, long j11) {
        this.f16309d = eventDispatcher;
        this.f16306a = i10;
        this.f16307b = j10;
        this.f16308c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16309d.listener.onAudioTrackUnderrun(this.f16306a, this.f16307b, this.f16308c);
    }
}
