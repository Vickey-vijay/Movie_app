package com.bytedance.sdk.component.fkw.yu.ouw;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
public final class ouw implements ThreadFactory {
    private final ThreadGroup ouw;
    private final AtomicInteger vt = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.ouw, runnable, "tt_img_" + this.vt.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }

    public ouw(String str) {
        this.ouw = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }
}
