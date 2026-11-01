package com.mbridge.msdk.thrid.okhttp;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ConnectionPool.java */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Executor f37494g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp ConnectionPool", true));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f37495h = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f37498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Deque<com.mbridge.msdk.thrid.okhttp.internal.connection.c> f37499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okhttp.internal.connection.d f37500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37501f;

    /* JADX INFO: compiled from: ConnectionPool.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                long jA = i.this.a(System.nanoTime());
                if (jA == -1) {
                    return;
                }
                if (jA > 0) {
                    long j10 = jA / 1000000;
                    long j11 = jA - (1000000 * j10);
                    synchronized (i.this) {
                        try {
                            i.this.wait(j10, (int) j11);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
        }
    }

    public i() {
        this(5, 5L, TimeUnit.MINUTES);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.c a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c0 c0Var) {
        if (!f37495h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f37499d) {
            if (cVar.a(aVar, c0Var)) {
                gVar.a(cVar, true);
                return cVar;
            }
        }
        return null;
    }

    public i(int i10, long j10, TimeUnit timeUnit) {
        this.f37498c = new a();
        this.f37499d = new ArrayDeque();
        this.f37500e = new com.mbridge.msdk.thrid.okhttp.internal.connection.d();
        this.f37496a = i10;
        this.f37497b = timeUnit.toNanos(j10);
        if (j10 > 0) {
            return;
        }
        throw new IllegalArgumentException("keepAliveDuration <= 0: " + j10);
    }

    public void b(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f37495h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!this.f37501f) {
            this.f37501f = true;
            f37494g.execute(this.f37498c);
        }
        this.f37499d.add(cVar);
    }

    public Socket a(com.mbridge.msdk.thrid.okhttp.a aVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar) {
        if (!f37495h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar : this.f37499d) {
            if (cVar.a(aVar, null) && cVar.f() && cVar != gVar.c()) {
                return gVar.b(cVar);
            }
        }
        return null;
    }

    public boolean a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar) {
        if (!f37495h && !Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        if (!cVar.f37554k && this.f37496a != 0) {
            notifyAll();
            return false;
        }
        this.f37499d.remove(cVar);
        return true;
    }

    public long a(long j10) {
        synchronized (this) {
            com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar = null;
            long j11 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            for (com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2 : this.f37499d) {
                if (a(cVar2, j10) > 0) {
                    i11++;
                } else {
                    i10++;
                    long j12 = j10 - cVar2.f37558o;
                    if (j12 > j11) {
                        cVar = cVar2;
                        j11 = j12;
                    }
                }
            }
            long j13 = this.f37497b;
            if (j11 < j13 && i10 <= this.f37496a) {
                if (i10 > 0) {
                    return j13 - j11;
                }
                if (i11 > 0) {
                    return j13;
                }
                this.f37501f = false;
                return -1L;
            }
            this.f37499d.remove(cVar);
            com.mbridge.msdk.thrid.okhttp.internal.c.a(cVar.g());
            return 0L;
        }
    }

    private int a(com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar, long j10) {
        List<Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g>> list = cVar.f37557n;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<com.mbridge.msdk.thrid.okhttp.internal.connection.g> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                com.mbridge.msdk.thrid.okhttp.internal.platform.g.d().a("A connection to " + cVar.c().a().k() + " was leaked. Did you forget to close a response body?", ((com.mbridge.msdk.thrid.okhttp.internal.connection.g.a) reference).f37587a);
                list.remove(i10);
                cVar.f37554k = true;
                if (list.isEmpty()) {
                    cVar.f37558o = j10 - this.f37497b;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
