package com.mbridge.msdk.thrid.okhttp.internal;

/* JADX INFO: compiled from: NamedRunnable.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37504a;

    public abstract void b();

    public b(String str, Object... objArr) {
        this.f37504a = c.a(str, objArr);
    }

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f37504a);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
