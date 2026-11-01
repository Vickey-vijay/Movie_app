package com.mbridge.msdk.config.component.common.network.retry;

import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: RequestRetry.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ScheduledFuture<?> f33138d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f33140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.nori.model.a f33141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.network.a f33142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f33143i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.b f33144j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.socket.a f33135a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.connect.okhttp.a f33136b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f33137c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f33139e = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f33145k = new AtomicInteger(0);

    /* JADX INFO: compiled from: RequestRetry.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f33146a = new AtomicInteger(1);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Retry-InstanceScheduler-" + System.currentTimeMillis() + "-" + this.f33146a.getAndIncrement());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: RequestRetry.java */
    public class b implements com.mbridge.msdk.config.component.common.network.retry.a {
        public b() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.common.network.retry.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RequestRetry.java */
    public class C0308c implements com.mbridge.msdk.config.component.common.network.retry.b {
        public C0308c() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: RequestRetry.java */
    public class d implements com.mbridge.msdk.config.component.common.network.retry.a {
        public d() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void a() {
            c.this.a();
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.a
        public void b() {
            c.this.g();
        }
    }

    /* JADX INFO: compiled from: RequestRetry.java */
    public class e implements com.mbridge.msdk.config.component.common.network.retry.b {
        public e() {
        }

        @Override // com.mbridge.msdk.config.component.common.network.retry.b
        public void a() {
            c.this.a();
        }
    }

    /* JADX INFO: compiled from: RequestRetry.java */
    public static class f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final f f33152b = new f();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ThreadPoolExecutor f33153a = new ThreadPoolExecutor(3, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new a(), new ThreadPoolExecutor.DiscardOldestPolicy());

        /* JADX INFO: compiled from: RequestRetry.java */
        public class a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final AtomicInteger f33154a = new AtomicInteger(1);

            public a() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, "Retry-NetworkThread-" + this.f33154a.getAndIncrement());
                thread.setDaemon(true);
                return thread;
            }
        }

        public static f a() {
            return f33152b;
        }

        public ThreadPoolExecutor b() {
            return this.f33153a;
        }

        private f() {
        }
    }

    public void c() {
        if (this.f33137c) {
            q0.c("RequestRetry", "重试任务已被取消，跳过执行");
        } else {
            f.a().b().execute(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33156b.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f33137c) {
            return;
        }
        q0.c("RequestRetry", "取消所有重试任务");
        this.f33137c = true;
        ScheduledFuture<?> scheduledFuture = this.f33138d;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f33138d.cancel(true);
            q0.c("RequestRetry", "已取消当前重试调度任务");
        }
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f33135a;
        if (aVar != null) {
            aVar.a();
            q0.c("RequestRetry", "已取消TCP连接");
        }
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f33136b;
        if (aVar2 != null) {
            aVar2.a();
            q0.c("RequestRetry", "已取消HTTP连接");
        }
        j();
    }

    private void b() {
        try {
            this.f33139e = Executors.newSingleThreadScheduledExecutor(new a());
            q0.c("RequestRetry", "创建独立调度器成功");
        } catch (Exception e10) {
            q0.b("RequestRetry", "创建独立调度器失败: " + e10.getMessage());
        }
    }

    private void d() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar;
        try {
            try {
                this.f33136b = new com.mbridge.msdk.config.component.common.network.connect.okhttp.a(this.f33141g, this.f33143i, this.f33142h);
                h();
                this.f33136b.a(this.f33140f);
                aVar = this.f33136b;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f33143i.c(0);
                this.f33143i.b(0);
                this.f33143i.a(e10.getMessage());
                g();
                aVar = this.f33136b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar2 = this.f33136b;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.f33137c) {
            q0.c("RequestRetry", "重试任务已被取消，停止执行");
            return;
        }
        String strI = this.f33141g.i();
        strI.hashCode();
        if (strI.equals("TCP")) {
            f();
        } else if (strI.equals("HTTP")) {
            d();
        }
    }

    private void f() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar;
        try {
            try {
                this.f33135a = new com.mbridge.msdk.config.component.common.network.connect.socket.a(this.f33141g, this.f33143i, this.f33142h);
                i();
                this.f33135a.a(this.f33140f);
                aVar = this.f33135a;
                if (aVar == null) {
                    return;
                }
            } catch (Exception e10) {
                this.f33143i.c(0);
                this.f33143i.b(0);
                this.f33143i.a(e10.getMessage());
                g();
                aVar = this.f33135a;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a();
        } catch (Throwable th2) {
            com.mbridge.msdk.config.component.common.network.connect.socket.a aVar2 = this.f33135a;
            if (aVar2 != null) {
                aVar2.a();
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f33137c) {
            q0.c("RequestRetry", "重试任务已被取消，停止调度重试");
            return;
        }
        this.f33145k.incrementAndGet();
        if (this.f33145k.get() >= this.f33141g.g()) {
            q0.c("RequestRetry", "重试次数已达上限: " + this.f33145k.get());
            com.mbridge.msdk.config.component.common.network.a aVar = this.f33142h;
            if (aVar != null) {
                aVar.d(this.f33143i);
            }
            a();
            return;
        }
        q0.b("RequestRetry", "重试 次数 " + this.f33145k.get());
        try {
            ScheduledExecutorService scheduledExecutorService = this.f33139e;
            if (scheduledExecutorService != null) {
                this.f33138d = scheduledExecutorService.schedule(new Runnable() { // from class: com.mbridge.msdk.config.component.common.network.retry.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33157b.c();
                    }
                }, this.f33141g.h(), TimeUnit.SECONDS);
                q0.c("RequestRetry", "已调度第 " + this.f33145k.get() + " 次重试");
            }
        } catch (Exception e10) {
            q0.b("RequestRetry", "调度重试任务失败: " + e10.getMessage());
            com.mbridge.msdk.config.component.common.network.a aVar2 = this.f33142h;
            if (aVar2 != null) {
                aVar2.d(this.f33143i);
            }
            a();
        }
    }

    private void h() {
        com.mbridge.msdk.config.component.common.network.connect.okhttp.a aVar = this.f33136b;
        if (aVar != null) {
            aVar.a(new d());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f33144j;
        if (bVar != null) {
            bVar.a(new e());
        }
    }

    private void i() {
        com.mbridge.msdk.config.component.common.network.connect.socket.a aVar = this.f33135a;
        if (aVar != null) {
            aVar.a(new b());
        }
        com.mbridge.msdk.config.component.nori.monitor.b bVar = this.f33144j;
        if (bVar != null) {
            bVar.a(new C0308c());
        }
    }

    private void j() {
        ScheduledExecutorService scheduledExecutorService = this.f33139e;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            return;
        }
        try {
            q0.c("RequestRetry", "正在关闭独立调度器");
            this.f33139e.shutdown();
            if (this.f33139e.awaitTermination(5L, TimeUnit.SECONDS)) {
                q0.c("RequestRetry", "独立调度器已成功关闭");
            } else {
                q0.d("RequestRetry", "独立调度器未能在5秒内关闭，强制关闭");
                this.f33139e.shutdownNow();
            }
        } catch (InterruptedException e10) {
            q0.b("RequestRetry", "关闭独立调度器时被中断: " + e10.getMessage());
            this.f33139e.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }

    public c(String str, com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.a aVar2, com.mbridge.msdk.config.component.common.network.result.a aVar3) {
        this.f33140f = str;
        this.f33141g = aVar;
        this.f33142h = aVar2;
        this.f33143i = aVar3;
        this.f33144j = aVar3.a();
        b();
    }
}
