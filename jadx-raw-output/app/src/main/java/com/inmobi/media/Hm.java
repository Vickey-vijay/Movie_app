package com.inmobi.media;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes6.dex */
public final class Hm implements bk.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f22827a;

    public Hm(MediaPlayer mediaPlayer) {
        this.f22827a = mediaPlayer;
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        this.f22827a.release();
        return mj.r.f64562a;
    }
}
