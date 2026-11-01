package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolder f17992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f17993b;

    public e(p pVar, SurfaceHolder surfaceHolder) {
        this.f17993b = pVar;
        this.f17992a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p.a(this.f17993b, this.f17992a);
    }
}
