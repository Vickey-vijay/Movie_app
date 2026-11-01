package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: compiled from: NpthHandlerThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile p f6741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Handler f6742b;

    public static p a() {
        if (f6741a == null) {
            b();
        }
        return f6741a;
    }

    private static HandlerThread b() {
        if (f6741a == null) {
            synchronized (m.class) {
                if (f6741a == null) {
                    p pVar = new p("default_npth_thread");
                    f6741a = pVar;
                    pVar.b();
                }
            }
        }
        return f6741a.c();
    }
}
