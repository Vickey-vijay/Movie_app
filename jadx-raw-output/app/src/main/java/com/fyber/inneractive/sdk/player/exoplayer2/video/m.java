package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f17948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f17949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f17950e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, int i11, int i12, float f10) {
        this.f17950e = eventDispatcher;
        this.f17946a = i10;
        this.f17947b = i11;
        this.f17948c = i12;
        this.f17949d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17950e.listener.onVideoSizeChanged(this.f17946a, this.f17947b, this.f17948c, this.f17949d);
    }
}
