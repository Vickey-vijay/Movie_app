package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f17994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17995b;

    public f(p pVar, Surface surface) {
        this.f17995b = pVar;
        this.f17994a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f17995b, this.f17994a);
    }
}
