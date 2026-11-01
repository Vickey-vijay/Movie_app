package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f16300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f16303d;

    public e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f16303d = eventDispatcher;
        this.f16300a = str;
        this.f16301b = j10;
        this.f16302c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f16303d.listener.onAudioDecoderInitialized(this.f16300a, this.f16301b, this.f16302c);
    }
}
