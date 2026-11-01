package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4151e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f56617g = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f56618h = "WatchDog-" + Ad.f54959a.incrementAndGet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f56619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f56620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f56621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C4126d f56622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f56623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runnable f56624f;

    public final /* synthetic */ void a() {
        this.f56623e.set(true);
    }

    public final synchronized void b() {
        C4126d c4126d = this.f56622d;
        if (c4126d != null) {
            c4126d.f56545a.set(false);
            this.f56622d = null;
            PublicLogger.getAnonymousInstance().info("Stop ANR monitoring", new Object[0]);
        }
    }

    public final synchronized void a(int i10) {
        AtomicInteger atomicInteger = this.f56620b;
        Integer numValueOf = Integer.valueOf(i10);
        int iIntValue = 5;
        if (numValueOf != null && numValueOf.intValue() >= 5) {
            iIntValue = numValueOf.intValue();
        }
        atomicInteger.set(iIntValue);
        if (this.f56622d == null) {
            C4126d c4126d = new C4126d(this);
            this.f56622d = c4126d;
            try {
                c4126d.setName(f56618h);
            } catch (SecurityException unused) {
            }
            this.f56622d.start();
            PublicLogger.getAnonymousInstance().info("Start ANR monitoring with timeout: %s seconds", Integer.valueOf(i10));
        }
    }

    public C4151e(Eb eb2) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f56619a = copyOnWriteArrayList;
        this.f56620b = new AtomicInteger();
        this.f56621c = new Handler(Looper.getMainLooper());
        this.f56623e = new AtomicBoolean();
        this.f56624f = new Runnable() { // from class: af.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3552b.a();
            }
        };
        copyOnWriteArrayList.add(eb2);
    }
}
