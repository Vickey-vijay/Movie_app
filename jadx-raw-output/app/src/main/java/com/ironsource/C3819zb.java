package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import java.util.Date;

/* JADX INFO: renamed from: com.ironsource.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C3819zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f31719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f31720b;

    /* JADX INFO: renamed from: com.ironsource.zb$a */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f31721a;

        private a() {
        }

        public Handler a() {
            return this.f31721a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Looper.prepare();
            this.f31721a = new Handler();
            Looper.loop();
        }
    }

    public boolean a(Object obj) {
        return (obj == null || this.f31719a == null) ? false : true;
    }

    public void a(Runnable runnable) {
        Handler handlerA;
        a aVar = this.f31719a;
        if (aVar == null || (handlerA = aVar.a()) == null) {
            return;
        }
        handlerA.post(runnable);
    }

    public C3819zb() {
        a aVar = new a();
        this.f31719a = aVar;
        aVar.start();
        this.f31720b = new Date().getTime();
    }
}
