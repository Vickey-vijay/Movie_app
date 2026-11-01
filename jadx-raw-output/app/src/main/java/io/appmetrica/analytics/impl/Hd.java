package io.appmetrica.analytics.impl;

import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public final class Hd implements InterfaceC4096bl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55300a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4096bl
    public final boolean a(String str) {
        return this.f55300a != Process.myPid();
    }

    public Hd(int i10) {
        this.f55300a = i10;
    }
}
