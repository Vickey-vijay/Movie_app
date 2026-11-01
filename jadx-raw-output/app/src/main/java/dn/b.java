package dn;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: SampleStatistic.java */
/* JADX INFO: loaded from: classes9.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f52236a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f52237b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f52238c = new AtomicLong();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f52239d = new AtomicLong();

    public void a(long j10) {
        long jAddAndGet = this.f52237b.addAndGet(j10);
        long jIncrementAndGet = this.f52238c.incrementAndGet();
        if (jIncrementAndGet > 1) {
            long j11 = (10 * j10) - ((jAddAndGet * 10) / jIncrementAndGet);
            this.f52239d.addAndGet(j11 * j11);
        }
        xm.a.a(this.f52236a, j10);
    }
}
