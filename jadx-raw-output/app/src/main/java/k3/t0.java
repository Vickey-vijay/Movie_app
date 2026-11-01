package k3;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t0 f62280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t0 f62281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f62282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t0 f62283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t0 f62284g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f62285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62286b;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f62285a == t0Var.f62285a && this.f62286b == t0Var.f62286b;
    }

    static {
        t0 t0Var = new t0(0L, 0L);
        f62280c = t0Var;
        f62281d = new t0(Long.MAX_VALUE, Long.MAX_VALUE);
        f62282e = new t0(Long.MAX_VALUE, 0L);
        f62283f = new t0(0L, Long.MAX_VALUE);
        f62284g = t0Var;
    }

    public int hashCode() {
        return (((int) this.f62285a) * 31) + ((int) this.f62286b);
    }

    public t0(long j10, long j11) {
        boolean z10;
        if (j10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        g5.a.a(j11 >= 0);
        this.f62285a = j10;
        this.f62286b = j11;
    }
}
