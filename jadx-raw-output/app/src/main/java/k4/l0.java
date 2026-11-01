package k4;

import androidx.annotation.Nullable;
import k3.v0;

/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends v0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f62562m = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f62566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f62567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f62568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f62570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f62571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final Object f62572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public final Object f62573l;

    public l0(long j10, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(j10, j10, 0L, 0L, z10, z11, z12, obj, obj2);
    }

    @Override // k3.v0
    public v0.b g(int i10, v0.b bVar, boolean z10) {
        g5.a.c(i10, 0, 1);
        return bVar.p(null, z10 ? f62562m : null, 0, this.f62565d, -this.f62567f);
    }

    @Override // k3.v0
    public int i() {
        return 1;
    }

    @Override // k3.v0
    public Object m(int i10) {
        g5.a.c(i10, 0, 1);
        return f62562m;
    }

    @Override // k3.v0
    public int p() {
        return 1;
    }

    public l0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, z12, obj, obj2);
    }

    @Override // k3.v0
    public int b(Object obj) {
        return f62562m.equals(obj) ? 0 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029 A[PHI: r1
  0x0029: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v6 long) binds: [B:3:0x0012, B:5:0x0018, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // k3.v0
    public v0.c o(int i10, v0.c cVar, long j10) {
        long j11;
        g5.a.c(i10, 0, 1);
        long j12 = this.f62568g;
        boolean z10 = this.f62570i;
        if (!z10 || j10 == 0) {
            j11 = j12;
        } else {
            long j13 = this.f62566e;
            if (j13 != -9223372036854775807L) {
                j12 += j10;
                if (j12 <= j13) {
                    j11 = j12;
                }
            }
            j11 = -9223372036854775807L;
        }
        return cVar.e(v0.c.f62332n, this.f62572k, this.f62573l, this.f62563b, this.f62564c, this.f62569h, z10, this.f62571j, j11, this.f62566e, 0, 0, this.f62567f);
    }

    public l0(long j10, long j11, long j12, long j13, long j14, long j15, boolean z10, boolean z11, boolean z12, @Nullable Object obj, @Nullable Object obj2) {
        this.f62563b = j10;
        this.f62564c = j11;
        this.f62565d = j12;
        this.f62566e = j13;
        this.f62567f = j14;
        this.f62568g = j15;
        this.f62569h = z10;
        this.f62570i = z11;
        this.f62571j = z12;
        this.f62573l = obj;
        this.f62572k = obj2;
    }
}
