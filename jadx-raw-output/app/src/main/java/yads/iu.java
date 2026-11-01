package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class iu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m73 f78804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f78807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f78813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f78814k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f78815l;

    public final void a(long j10) {
        if (this.f78813j == this.f78815l.length) {
            long[] jArr = this.f78814k;
            this.f78814k = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
            int[] iArr = this.f78815l;
            this.f78815l = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
        }
        long[] jArr2 = this.f78814k;
        int i10 = this.f78813j;
        jArr2[i10] = j10;
        this.f78815l[i10] = this.f78812i;
        this.f78813j = i10 + 1;
    }

    public final tw2 b(long j10) {
        long j11 = 1;
        int i10 = (int) (j10 / ((this.f78807d * j11) / ((long) this.f78808e)));
        int iA = ib3.a(this.f78815l, i10, true, true);
        int[] iArr = this.f78815l;
        int i11 = iArr[iA];
        if (i11 == i10) {
            xw2 xw2Var = new xw2(((this.f78807d * j11) / ((long) this.f78808e)) * ((long) i11), this.f78814k[iA]);
            return new tw2(xw2Var, xw2Var);
        }
        long j12 = i11;
        long j13 = (this.f78807d * j11) / ((long) this.f78808e);
        long[] jArr = this.f78814k;
        xw2 xw2Var2 = new xw2(j12 * j13, jArr[iA]);
        int i12 = iA + 1;
        return i12 < jArr.length ? new tw2(xw2Var2, new xw2(j13 * ((long) iArr[i12]), jArr[i12])) : new tw2(xw2Var2, xw2Var2);
    }

    public iu(int i10, int i11, long j10, int i12, m73 m73Var) {
        int i13;
        int iA;
        boolean z10 = true;
        if (i11 != 1 && i11 != 2) {
            z10 = false;
        }
        ni.a(z10);
        this.f78807d = j10;
        this.f78808e = i12;
        this.f78804a = m73Var;
        if (i11 == 2) {
            i13 = 1667497984;
        } else {
            i13 = 1651965952;
        }
        this.f78805b = a(i10, i13);
        if (i11 == 2) {
            iA = a(i10, 1650720768);
        } else {
            iA = -1;
        }
        this.f78806c = iA;
        this.f78814k = new long[512];
        this.f78815l = new int[512];
    }

    public final void a() {
        this.f78814k = Arrays.copyOf(this.f78814k, this.f78813j);
        this.f78815l = Arrays.copyOf(this.f78815l, this.f78813j);
    }

    public static int a(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }
}
