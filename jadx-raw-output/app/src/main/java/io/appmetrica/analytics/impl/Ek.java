package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes5.dex */
public final class Ek {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y4 f55190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Vk f55191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hk f55192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f55194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicLong f55195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f55196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile Tk f55197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f55198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f55199j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f55200k;

    public final void a() {
        Hk hk2 = this.f55192c;
        long jElapsedRealtime = this.f55200k.elapsedRealtime();
        Long l10 = hk2.f55317c;
        if (l10 != null) {
            jElapsedRealtime = l10.longValue();
        }
        this.f55194e = jElapsedRealtime;
        Long l11 = this.f55192c.f55316b;
        this.f55193d = l11 != null ? l11.longValue() : -1L;
        Long l12 = this.f55192c.f55319e;
        this.f55195f = new AtomicLong(l12 == null ? 0L : l12.longValue());
        Boolean bool = this.f55192c.f55320f;
        this.f55196g = bool != null ? bool.booleanValue() : true;
        Long l13 = this.f55192c.f55321g;
        long jLongValue = l13 != null ? l13.longValue() : 0L;
        this.f55198i = jLongValue;
        Hk hk3 = this.f55192c;
        long jLongValue2 = jLongValue - this.f55194e;
        Long l14 = hk3.f55322h;
        if (l14 != null) {
            jLongValue2 = l14.longValue();
        }
        this.f55199j = jLongValue2;
    }

    public final String toString() {
        return "Session{id=" + this.f55193d + ", creationTime=" + this.f55194e + ", currentReportId=" + this.f55195f + ", sessionRequestParams=" + this.f55197h + ", sleepStart=" + this.f55198i + '}';
    }

    public Ek(Y4 y10, Vk vk2, Hk hk2, SystemTimeProvider systemTimeProvider) {
        this.f55190a = y10;
        this.f55191b = vk2;
        this.f55192c = hk2;
        this.f55200k = systemTimeProvider;
        a();
    }
}
