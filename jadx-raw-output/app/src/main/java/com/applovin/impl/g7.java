package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f7548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f7549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f7550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f7551d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f7552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f7554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f7555h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f7556i = new Object();

    public class a extends TimerTask {
        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.f7554g.run();
                synchronized (g7.this.f7556i) {
                    if (g7.this.f7553f) {
                        g7.this.f7550c = System.currentTimeMillis();
                        g7 g7Var = g7.this;
                        g7Var.f7551d = g7Var.f7552e;
                    } else {
                        g7.this.f7549b = null;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (g7.this.f7548a != null) {
                        g7.this.f7548a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.f7548a.O().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        g7.this.f7548a.D().a("Timer", "executingTimedTask", th2);
                    }
                } finally {
                    synchronized (g7.this.f7556i) {
                        if (g7.this.f7553f) {
                            g7.this.f7550c = System.currentTimeMillis();
                            g7 g7Var2 = g7.this;
                            g7Var2.f7551d = g7Var2.f7552e;
                        } else {
                            g7.this.f7549b = null;
                        }
                    }
                }
            }
        }

        public a() {
        }
    }

    public long c() {
        if (this.f7549b == null) {
            return this.f7551d - this.f7555h;
        }
        return this.f7551d - (System.currentTimeMillis() - this.f7550c);
    }

    public void d() {
        synchronized (this.f7556i) {
            Timer timer = this.f7549b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f7555h = Math.max(1L, System.currentTimeMillis() - this.f7550c);
                    this.f7549b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f7548a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7548a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7548a.O().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f7549b = null;
                    } catch (Throwable th3) {
                        this.f7549b = null;
                        throw th3;
                    }
                }
            }
        }
    }

    public void e() {
        synchronized (this.f7556i) {
            long j10 = this.f7555h;
            if (j10 > 0) {
                try {
                    long j11 = this.f7551d - j10;
                    this.f7551d = j11;
                    if (j11 < 0) {
                        this.f7551d = 0L;
                    }
                    this.f7549b = new Timer();
                    a(b(), this.f7551d, this.f7553f, this.f7552e);
                    this.f7550c = System.currentTimeMillis();
                    this.f7555h = 0L;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f7548a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7548a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7548a.O().a("Timer", "Encountered error while resuming timer", th2);
                                }
                            }
                        }
                        this.f7555h = 0L;
                    } catch (Throwable th3) {
                        this.f7555h = 0L;
                        throw th3;
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f7548a = kVar;
        this.f7554g = runnable;
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g7 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(kVar, runnable);
            g7Var.f7550c = System.currentTimeMillis();
            g7Var.f7551d = j10;
            g7Var.f7553f = z10;
            g7Var.f7552e = j10;
            try {
                g7Var.f7549b = new Timer();
                g7Var.a(g7Var.b(), j10, z10, g7Var.f7552e);
            } catch (OutOfMemoryError e10) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e10);
                }
            }
            return g7Var;
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f7556i) {
            Timer timer = this.f7549b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f7549b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f7548a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7548a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f7548a.O().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f7549b = null;
                    } catch (Throwable th3) {
                        this.f7549b = null;
                        this.f7555h = 0L;
                        throw th3;
                    }
                }
                this.f7555h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f7549b.schedule(timerTask, j10, j11);
        } else {
            this.f7549b.schedule(timerTask, j10);
        }
    }
}
