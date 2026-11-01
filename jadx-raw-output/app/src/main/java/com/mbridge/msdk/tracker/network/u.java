package com.mbridge.msdk.tracker.network;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: RequestQueue.java */
/* JADX INFO: loaded from: classes6.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile ThreadPoolExecutor f38284a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f38288e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.mbridge.msdk.tracker.network.b f38289f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final m f38290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w f38291h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f38285b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<t<?>> f38286c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<t<?>> f38287d = new PriorityBlockingQueue<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<c> f38292i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38293j = false;

    /* JADX INFO: compiled from: RequestQueue.java */
    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "NetworkDispatcher");
        }
    }

    /* JADX INFO: compiled from: RequestQueue.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new n(u.this.f38287d, u.this.f38290g, u.this.f38289f, u.this.f38291h).run();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: compiled from: RequestQueue.java */
    public interface c {
        void a(t<?> tVar, int i10);
    }

    private void a(int i10) {
        if (this.f38284a != null) {
            return;
        }
        try {
            b(i10);
        } catch (Throwable unused) {
            try {
                b(5);
            } catch (Exception unused2) {
                this.f38284a = null;
            }
        }
    }

    public void b() {
        if (!this.f38293j || this.f38284a == null) {
            a(this.f38288e);
            this.f38293j = true;
        }
    }

    public <T> void c(t<T> tVar) {
        synchronized (this.f38286c) {
            this.f38286c.remove(tVar);
        }
        a(tVar, 5);
    }

    public <T> void d(t<T> tVar) {
        this.f38287d.add(tVar);
    }

    public u(m mVar, w wVar, int i10, com.mbridge.msdk.tracker.network.b bVar) {
        this.f38288e = i10;
        this.f38289f = bVar;
        this.f38290g = mVar;
        this.f38291h = wVar;
    }

    private void b(int i10) {
        this.f38284a = new ThreadPoolExecutor(i10, i10, 100L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public int a() {
        return this.f38285b.incrementAndGet();
    }

    public <T> void b(t<T> tVar) {
        d(tVar);
    }

    public <T> t<T> a(t<T> tVar) {
        tVar.a(this);
        synchronized (this.f38286c) {
            this.f38286c.add(tVar);
        }
        tVar.b(a());
        tVar.a("add-to-queue");
        a(tVar, 0);
        b(tVar);
        if (this.f38284a == null) {
            a(this.f38288e);
        }
        if (!this.f38284a.isShutdown()) {
            this.f38284a.execute(new b());
        }
        return tVar;
    }

    public void a(t<?> tVar, int i10) {
        synchronized (this.f38292i) {
            Iterator<c> it = this.f38292i.iterator();
            while (it.hasNext()) {
                it.next().a(tVar, i10);
            }
        }
    }
}
