package com.fyber.inneractive.sdk.activities;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f14853a;

    public c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f14853a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f14853a.isFinishing()) {
            return;
        }
        this.f14853a.hideNavigationBar();
    }
}
