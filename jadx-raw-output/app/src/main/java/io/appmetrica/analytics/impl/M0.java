package io.appmetrica.analytics.impl;

import android.content.Intent;

/* JADX INFO: loaded from: classes6.dex */
public final class M0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Intent f55536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4558u1 f55537b;

    public M0(C4558u1 c4558u1, Intent intent) {
        this.f55537b = c4558u1;
        this.f55536a = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4689z7 c4689z7 = this.f55537b.d().f57105b;
        Intent intent = this.f55536a;
        c4689z7.getClass();
        if (intent != null) {
            c4689z7.a(intent.getDataString(), false);
        }
    }
}
