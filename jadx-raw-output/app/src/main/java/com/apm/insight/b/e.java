package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* JADX INFO: compiled from: AbsLooperDispatchListener.java */
/* JADX INFO: loaded from: classes9.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f6281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f6282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f6283c = false;

    @CallSuper
    public void a(String str) {
        this.f6283c = true;
    }

    public boolean a() {
        return false;
    }

    @CallSuper
    public void b(String str) {
        this.f6283c = false;
    }
}
