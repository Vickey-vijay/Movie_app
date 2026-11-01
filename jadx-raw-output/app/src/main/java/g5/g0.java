package g5;

/* JADX INFO: compiled from: TimestampAdjuster.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f53083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f53084c = -9223372036854775807L;

    public synchronized void h(long j10) {
        a.f(this.f53084c == -9223372036854775807L);
        this.f53082a = j10;
    }

    public synchronized void j() throws InterruptedException {
        while (this.f53084c == -9223372036854775807L) {
            wait();
        }
    }

    public long c() {
        return this.f53082a;
    }

    public long d() {
        if (this.f53084c != -9223372036854775807L) {
            return this.f53083b + this.f53084c;
        }
        long j10 = this.f53082a;
        if (j10 != Long.MAX_VALUE) {
            return j10;
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (this.f53082a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f53084c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f53083b;
    }

    public g0(long j10) {
        h(j10);
    }

    public static long f(long j10) {
        return (j10 * 1000000) / 90000;
    }

    public static long i(long j10) {
        return (j10 * 90000) / 1000000;
    }

    public long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f53084c != -9223372036854775807L) {
            this.f53084c = j10;
        } else {
            long j11 = this.f53082a;
            if (j11 != Long.MAX_VALUE) {
                this.f53083b = j11 - j10;
            }
            synchronized (this) {
                this.f53084c = j10;
                notifyAll();
            }
        }
        return j10 + this.f53083b;
    }

    public long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f53084c != -9223372036854775807L) {
            long jI = i(this.f53084c);
            long j11 = (4294967296L + jI) / 8589934592L;
            long j12 = ((j11 - 1) * 8589934592L) + j10;
            j10 += j11 * 8589934592L;
            if (Math.abs(j12 - jI) < Math.abs(j10 - jI)) {
                j10 = j12;
            }
        }
        return a(f(j10));
    }

    public void g() {
        this.f53084c = -9223372036854775807L;
    }
}
