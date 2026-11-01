package mk;

import kotlin.time.DurationUnit;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f64570a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f64571b = System.nanoTime();

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public final long b(long j10, long j11) {
        return g.d(j10, j11, DurationUnit.NANOSECONDS);
    }

    @Override // mk.k
    public /* bridge */ /* synthetic */ a a() {
        return j.a.b(d());
    }

    public final long c(long j10) {
        return g.b(e(), j10, DurationUnit.NANOSECONDS);
    }

    public long d() {
        return j.a.d(e());
    }

    public final long e() {
        return System.nanoTime() - f64571b;
    }
}
