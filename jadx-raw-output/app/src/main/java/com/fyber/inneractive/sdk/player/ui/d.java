package com.fyber.inneractive.sdk.player.ui;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f18066b;

    public d(e eVar, boolean z10) {
        this.f18066b = eVar;
        this.f18065a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f18065a == this.f18066b.hasWindowFocus()) {
            this.f18066b.e();
        }
    }
}
