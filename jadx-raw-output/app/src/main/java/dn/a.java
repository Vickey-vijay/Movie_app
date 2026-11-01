package dn;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: CounterStatistic.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f52233a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f52234b = new AtomicLong();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicLong f52235c = new AtomicLong();

    public void a(long j10) {
        long jAddAndGet = this.f52234b.addAndGet(j10);
        if (j10 > 0) {
            this.f52235c.addAndGet(j10);
        }
        xm.a.a(this.f52233a, jAddAndGet);
    }

    public void b() {
        a(-1L);
    }

    public void c() {
        a(1L);
    }
}
