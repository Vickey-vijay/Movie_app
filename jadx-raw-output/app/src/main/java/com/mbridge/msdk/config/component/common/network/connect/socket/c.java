package com.mbridge.msdk.config.component.common.network.connect.socket;

import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: SocketThreadPoolManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile c f33120d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f33121a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ThreadPoolExecutor f33122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f33123c;

    /* JADX INFO: compiled from: SocketThreadPoolManager.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f33124a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Socket-Thread-" + this.f33124a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    public static c a() {
        if (f33120d == null) {
            synchronized (c.class) {
                if (f33120d == null) {
                    f33120d = new c();
                }
            }
        }
        return f33120d;
    }

    private boolean b() {
        int iV;
        try {
            int iH = m0.h();
            return iH > 0 && (iV = m0.v()) > 0 && (((double) iH) / ((double) iV)) * 100.0d <= 5.0d;
        } catch (Exception e10) {
            q0.b("SocketThreadPoolManager", "Memory check failed: " + e10.getMessage());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        while (!this.f33121a.isEmpty()) {
            try {
                Runnable runnablePoll = this.f33121a.poll();
                if (runnablePoll != null) {
                    if ((runnablePoll instanceof b) && ((b) runnablePoll).e() != null) {
                        ((b) runnablePoll).e().callStart();
                    }
                    runnablePoll.run();
                }
            } catch (Throwable th2) {
                this.f33123c.set(false);
                if (!this.f33121a.isEmpty()) {
                    d();
                }
                throw th2;
            }
        }
        this.f33123c.set(false);
        if (this.f33121a.isEmpty()) {
            return;
        }
        d();
    }

    private void d() {
        if (this.f33123c.compareAndSet(false, true)) {
            this.f33122b.execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.connect.socket.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33126b.c();
                }
            });
        }
    }

    private c() {
        int iAvailableProcessors = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(iAvailableProcessors, iAvailableProcessors, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(), new ThreadPoolExecutor.DiscardPolicy());
        this.f33122b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f33123c = new AtomicBoolean(false);
    }

    public void a(Runnable runnable, com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        if (runnable == null) {
            return;
        }
        if (b()) {
            if (aVar != null) {
                aVar.a("Memory low");
            }
        } else if (this.f33121a.offer(runnable)) {
            if (aVar != null) {
                aVar.m();
                a(aVar);
            }
            d();
        }
    }

    private void a(com.mbridge.msdk.config.component.nori.monitor.a aVar) {
        ThreadPoolExecutor threadPoolExecutor;
        if (aVar == null || (threadPoolExecutor = this.f33122b) == null) {
            return;
        }
        aVar.a(threadPoolExecutor.getPoolSize(), this.f33122b.getActiveCount(), this.f33122b.getQueue().size());
    }
}
