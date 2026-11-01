package com.ironsource;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: renamed from: com.ironsource.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3738uf extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static C3738uf f31420b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f31421a;

    /* JADX INFO: renamed from: com.ironsource.uf$a */
    public class a extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f31422a;

        public a(String str) {
            super(str);
            setUncaughtExceptionHandler(new com.ironsource.mediationsdk.logger.c());
        }

        public Handler a() {
            return this.f31422a;
        }

        public void b() {
            this.f31422a = new Handler(getLooper());
        }
    }

    public static synchronized C3738uf a() {
        if (f31420b == null) {
            f31420b = new C3738uf();
        }
        return f31420b;
    }

    private C3738uf() {
        a aVar = new a(getClass().getSimpleName());
        this.f31421a = aVar;
        aVar.start();
        this.f31421a.b();
    }

    public synchronized void a(Runnable runnable) {
        a aVar = this.f31421a;
        if (aVar == null) {
            return;
        }
        Handler handlerA = aVar.a();
        if (handlerA != null) {
            handlerA.post(runnable);
        }
    }
}
