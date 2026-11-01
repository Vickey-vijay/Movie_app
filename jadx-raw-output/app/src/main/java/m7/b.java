package m7;

import android.os.SystemClock;

/* JADX INFO: compiled from: DownloadSpeedMonitor.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements t, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f64167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f64168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f64169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f64170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f64171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64172f = 1000;

    @Override // m7.t
    public void reset() {
        this.f64171e = 0;
        this.f64167a = 0L;
    }

    @Override // m7.s
    public void c(int i10) {
        this.f64172f = i10;
    }

    @Override // m7.t
    public void e(long j10) {
        if (this.f64170d <= 0) {
            return;
        }
        long j11 = j10 - this.f64169c;
        this.f64167a = 0L;
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f64170d;
        if (jUptimeMillis <= 0) {
            this.f64171e = (int) j11;
        } else {
            this.f64171e = (int) (j11 / jUptimeMillis);
        }
    }

    @Override // m7.t
    public void update(long j10) {
        if (this.f64172f <= 0) {
            return;
        }
        boolean z10 = true;
        if (this.f64167a != 0) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.f64167a;
            if (jUptimeMillis >= this.f64172f || (this.f64171e == 0 && jUptimeMillis > 0)) {
                int i10 = (int) ((j10 - this.f64168b) / jUptimeMillis);
                this.f64171e = i10;
                this.f64171e = Math.max(0, i10);
            } else {
                z10 = false;
            }
        }
        if (z10) {
            this.f64168b = j10;
            this.f64167a = SystemClock.uptimeMillis();
        }
    }

    @Override // m7.t
    public void b(long j10) {
        this.f64170d = SystemClock.uptimeMillis();
        this.f64169c = j10;
    }
}
