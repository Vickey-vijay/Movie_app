package com.bytedance.sdk.component.vt.ouw.ouw.ouw;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class le extends com.bytedance.sdk.component.vt.ouw.yu {
    public ExecutorService ouw;
    public List<com.bytedance.sdk.component.vt.ouw.vt> vt = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private List<com.bytedance.sdk.component.vt.ouw.vt> f11943lh = new CopyOnWriteArrayList();
    private AtomicInteger yu = new AtomicInteger(64);

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> fkw() {
        return this.f11943lh;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final ExecutorService lh() {
        return this.ouw;
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final void ouw() {
        this.yu.set(32);
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final int vt() {
        return this.yu.get();
    }

    @Override // com.bytedance.sdk.component.vt.ouw.yu
    public final List<com.bytedance.sdk.component.vt.ouw.vt> yu() {
        return this.vt;
    }

    public le() {
        if (this.ouw == null) {
            this.ouw = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.vt.ouw.ouw.ouw.le.1
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }
}
