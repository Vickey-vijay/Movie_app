package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
public abstract class as2 implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vy f75613b = new vy();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vy f75614c = new vy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f75615d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f75616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f75617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f75618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f75619h;

    public void a() {
    }

    public abstract Object b();

    @Override // java.util.concurrent.Future
    public final Object get() {
        this.f75614c.a();
        return c();
    }

    public final Object c() throws ExecutionException {
        if (this.f75619h) {
            throw new CancellationException();
        }
        if (this.f75616e == null) {
            return this.f75617f;
        }
        throw new ExecutionException(this.f75616e);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f75615d) {
            if (!this.f75619h && !this.f75614c.c()) {
                this.f75619h = true;
                a();
                Thread thread = this.f75618g;
                if (thread == null) {
                    this.f75613b.d();
                    this.f75614c.d();
                } else if (z10) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f75619h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        vy vyVar = this.f75614c;
        synchronized (vyVar) {
            z10 = vyVar.f84041a;
        }
        return z10;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f75615d) {
            if (this.f75619h) {
                return;
            }
            this.f75618g = Thread.currentThread();
            this.f75613b.d();
            try {
                try {
                    this.f75617f = b();
                    synchronized (this.f75615d) {
                        this.f75614c.d();
                        this.f75618g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e10) {
                    this.f75616e = e10;
                    synchronized (this.f75615d) {
                        this.f75614c.d();
                        this.f75618g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th2) {
                synchronized (this.f75615d) {
                    this.f75614c.d();
                    this.f75618g = null;
                    Thread.interrupted();
                    throw th2;
                }
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws TimeoutException {
        boolean z10;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        vy vyVar = this.f75614c;
        synchronized (vyVar) {
            try {
                if (jConvert <= 0) {
                    z10 = vyVar.f84041a;
                } else {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    long j11 = jConvert + jElapsedRealtime;
                    if (j11 < jElapsedRealtime) {
                        vyVar.a();
                    } else {
                        while (!vyVar.f84041a && jElapsedRealtime < j11) {
                            vyVar.wait(j11 - jElapsedRealtime);
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        }
                    }
                    z10 = vyVar.f84041a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            return c();
        }
        throw new TimeoutException();
    }
}
