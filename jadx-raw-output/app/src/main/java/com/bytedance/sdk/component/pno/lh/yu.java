package com.bytedance.sdk.component.pno.lh;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class yu implements ThreadFactory {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static volatile boolean f11897lh;
    public final ThreadGroup ouw;
    public final String vt;
    private final AtomicInteger yu = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (f11897lh) {
            return null;
        }
        Thread thread = new Thread(this.ouw, runnable, this.vt + "_" + this.yu.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public yu(String str) {
        this.ouw = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.vt = ouw(str);
    }

    public static String ouw(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
