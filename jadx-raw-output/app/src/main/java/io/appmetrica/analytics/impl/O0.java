package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f55661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55662b;

    public O0(C4558u1 c4558u1, Intent intent) {
        this.f55662b = c4558u1;
        this.f55661a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4689z7 c4689z7 = this.f55662b.d().f57105b;
        Intent intent = this.f55661a;
        c4689z7.getClass();
        if (intent != null) {
            c4689z7.a(intent.getDataString(), false);
        }
    }
}
