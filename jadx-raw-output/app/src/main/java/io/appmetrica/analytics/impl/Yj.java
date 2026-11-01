package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class Yj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile long f56254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C4064af f56255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeProvider f56256c;

    public final synchronized long a() {
        return (System.currentTimeMillis() / 1000) + this.f56254a;
    }

    public final synchronized void b() {
        this.f56255b.d(false);
        this.f56255b.b();
    }

    public final synchronized long d() {
        return this.f56254a;
    }

    public final synchronized void e() {
        a(C4418oa.I.y(), new SystemTimeProvider());
    }

    public final synchronized boolean f() {
        return this.f56255b.b(true);
    }

    public static Yj c() {
        return Xj.f56166a;
    }

    public final synchronized void a(long j10, @Nullable Long l10) {
        this.f56254a = (j10 - this.f56256c.currentTimeMillis()) / 1000;
        boolean z10 = true;
        if (this.f56255b.b(true)) {
            if (l10 != null) {
                long jAbs = Math.abs(j10 - this.f56256c.currentTimeMillis());
                C4064af c4064af = this.f56255b;
                if (jAbs <= TimeUnit.SECONDS.toMillis(l10.longValue())) {
                    z10 = false;
                }
                c4064af.d(z10);
            } else {
                this.f56255b.d(false);
            }
        }
        this.f56255b.d(this.f56254a);
        this.f56255b.b();
    }

    @VisibleForTesting
    public final void a(C4064af c4064af, TimeProvider timeProvider) {
        this.f56255b = c4064af;
        this.f56254a = c4064af.a(0);
        this.f56256c = timeProvider;
    }
}
