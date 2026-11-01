package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class Km implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f23027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Lm f23028b;

    public Km(ExoPlayer exoPlayer, Lm lm2) {
        this.f23027a = exoPlayer;
        this.f23028b = lm2;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f23027a.removeListener(this.f23028b);
        this.f23027a.stop();
        this.f23027a.clearMediaItems();
        return mj.r.f64562a;
    }
}
