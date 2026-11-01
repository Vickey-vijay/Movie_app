package bl;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f5379e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f5380f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.p<kotlinx.serialization.descriptors.a, Integer, Boolean> f5382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f5384d;

    /* JADX INFO: compiled from: ElementMarker.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b0(kotlinx.serialization.descriptors.a aVar, bk.p<? super kotlinx.serialization.descriptors.a, ? super Integer, Boolean> pVar) {
        ck.p.j(aVar, "descriptor");
        ck.p.j(pVar, "readIfAbsent");
        this.f5381a = aVar;
        this.f5382b = pVar;
        int iE = aVar.e();
        if (iE <= 64) {
            this.f5383c = iE != 64 ? (-1) << iE : 0L;
            this.f5384d = f5380f;
        } else {
            this.f5383c = 0L;
            this.f5384d = e(iE);
        }
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f5383c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f5384d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    public final int c() {
        int length = this.f5384d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f5384d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f5382b.mo1invoke(this.f5381a, Integer.valueOf(i13)).booleanValue()) {
                    this.f5384d[i10] = j10;
                    return i13;
                }
            }
            this.f5384d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iE = this.f5381a.e();
        do {
            long j10 = this.f5383c;
            if (j10 == -1) {
                if (iE > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f5383c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f5382b.mo1invoke(this.f5381a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[nj.n.P(jArr)] = (-1) << i10;
        }
        return jArr;
    }
}
