package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3643p4 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f30412a;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C3660q4 c3660q4 = new C3660q4(th2);
        if (c3660q4.d()) {
            new P5(c3660q4.b(), "" + System.currentTimeMillis(), Z7.f27989i).a();
        }
        this.f30412a.uncaughtException(thread, th2);
    }

    public C3643p4(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f30412a = uncaughtExceptionHandler;
    }
}
