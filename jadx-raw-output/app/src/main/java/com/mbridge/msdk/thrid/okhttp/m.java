package com.mbridge.msdk.thrid.okhttp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Dispatcher.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f37891h = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f37894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ExecutorService f37895d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37892a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f37893b = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Deque<x.b> f37896e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Deque<x.b> f37897f = new ArrayDeque();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Deque<x> f37898g = new ArrayDeque();

    public m(ExecutorService executorService) {
        this.f37895d = executorService;
    }

    private int c(x.b bVar) {
        int i10 = 0;
        for (x.b bVar2 : this.f37897f) {
            if (!bVar2.c().f38002f && bVar2.d().equals(bVar.d())) {
                i10++;
            }
        }
        return i10;
    }

    public synchronized ExecutorService a() {
        if (this.f37895d == null) {
            this.f37895d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false));
        }
        return this.f37895d;
    }

    public void b(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f37893b = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    public synchronized int c() {
        return this.f37897f.size() + this.f37898g.size();
    }

    public void a(int i10) {
        if (i10 >= 1) {
            synchronized (this) {
                this.f37892a = i10;
            }
            b();
        } else {
            throw new IllegalArgumentException("max < 1: " + i10);
        }
    }

    private boolean b() {
        int i10;
        boolean z10;
        if (!f37891h && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<x.b> it = this.f37896e.iterator();
            while (it.hasNext()) {
                x.b next = it.next();
                if (this.f37897f.size() >= this.f37892a) {
                    break;
                }
                if (c(next) < this.f37893b) {
                    it.remove();
                    arrayList.add(next);
                    this.f37897f.add(next);
                }
            }
            z10 = c() > 0;
        }
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((x.b) arrayList.get(i10)).a(a());
        }
        return z10;
    }

    public m() {
    }

    public void a(x.b bVar) {
        synchronized (this) {
            this.f37896e.add(bVar);
        }
        b();
    }

    public synchronized void a(x xVar) {
        this.f37898g.add(xVar);
    }

    private <T> void a(Deque<T> deque, T t10) {
        Runnable runnable;
        synchronized (this) {
            if (deque.remove(t10)) {
                runnable = this.f37894c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void b(x.b bVar) {
        a(this.f37897f, bVar);
    }

    public void b(x xVar) {
        a(this.f37898g, xVar);
    }
}
