package com.fyber.inneractive.sdk.util;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f18627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t1 f18629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f18631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18632f;

    public v1(TimeUnit timeUnit, long j10) {
        this.f18630d = false;
        this.f18632f = 0L;
        this.f18628b = j10;
        this.f18627a = timeUnit;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }

    public final void a(long j10) {
        long jUptimeMillis = (SystemClock.uptimeMillis() - j10) + 50 + this.f18632f;
        this.f18632f = jUptimeMillis;
        if (this.f18631e != null && jUptimeMillis > this.f18627a.toMillis(this.f18628b)) {
            this.f18631e.a();
            return;
        }
        t1 t1Var = this.f18629c;
        if (t1Var == null || this.f18631e == null) {
            return;
        }
        t1Var.removeMessages(1932593528);
        this.f18629c.sendEmptyMessageDelayed(1932593528, 50L);
    }

    public v1(TimeUnit timeUnit, long j10, long j11) {
        this.f18630d = false;
        this.f18628b = j10;
        this.f18627a = timeUnit;
        this.f18632f = j11;
        IAlog.a("Visible time counter init - time %d", Long.valueOf(j10));
    }
}
