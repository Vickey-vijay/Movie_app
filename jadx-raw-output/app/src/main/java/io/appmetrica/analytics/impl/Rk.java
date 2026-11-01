package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes5.dex */
public final class Rk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo f55829a;

    public final long a() {
        long jOptLong;
        yo yoVar = this.f55829a;
        synchronized (yoVar) {
            jOptLong = yoVar.f58037a.a().optLong("session_id", -1L);
        }
        long j10 = jOptLong >= 10000000000L ? 1 + jOptLong : 10000000000L;
        this.f55829a.b(j10);
        return j10;
    }

    public Rk(yo yoVar) {
        this.f55829a = yoVar;
    }
}
