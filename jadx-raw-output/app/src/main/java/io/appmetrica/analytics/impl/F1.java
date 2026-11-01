package io.appmetrica.analytics.impl;

import android.os.Bundle;
import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes2.dex */
public final class F1 implements InterfaceC4172ek {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E1 f55215b = new E1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f55216c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4507s0 f55217a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4172ek
    @WorkerThread
    public final void reportData(int i10, Bundle bundle) {
        ((C1) this.f55217a).a(bundle);
    }

    public F1(InterfaceC4507s0 interfaceC4507s0) {
        this.f55217a = interfaceC4507s0;
    }
}
