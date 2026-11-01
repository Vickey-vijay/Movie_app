package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: loaded from: classes8.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a3<a1> f43175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a4 f43176b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a0 f43177a = new a0();
    }

    public static a0 a() {
        return b.f43177a;
    }

    public a4 b() {
        if (this.f43176b == null) {
            synchronized (a0.class) {
                if (this.f43176b == null) {
                    this.f43176b = a("ssdk_net_handler");
                }
            }
        }
        return this.f43176b;
    }

    private a0() {
        this.f43175a = a3.a(2);
    }

    public a4 a(String str) {
        return b(null, str);
    }

    public a4 c() {
        if (this.f43176b == null) {
            synchronized (a0.class) {
                if (this.f43176b == null) {
                    this.f43176b = a("ssdk_handler");
                }
            }
        }
        return this.f43176b;
    }

    private a1 a(a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new a1(handlerThread, aVar);
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public a4 b(a4.a aVar, String str) {
        a1 a1Var = (a1) this.f43175a.a();
        if (a1Var != null) {
            a1Var.a(aVar);
            a1Var.a(str);
            return a1Var;
        }
        return a(aVar, str);
    }
}
