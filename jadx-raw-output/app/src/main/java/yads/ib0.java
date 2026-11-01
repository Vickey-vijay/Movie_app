package yads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class ib0 implements qe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f78547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f78548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public pe[] f78551g;

    public ib0() {
        this(0);
    }

    public final synchronized pe a() {
        pe peVar;
        int i10 = this.f78549e + 1;
        this.f78549e = i10;
        int i11 = this.f78550f;
        if (i11 > 0) {
            pe[] peVarArr = this.f78551g;
            int i12 = i11 - 1;
            this.f78550f = i12;
            peVar = peVarArr[i12];
            peVar.getClass();
            this.f78551g[this.f78550f] = null;
        } else {
            pe peVar2 = new pe(0, new byte[this.f78546b]);
            pe[] peVarArr2 = this.f78551g;
            if (i10 > peVarArr2.length) {
                this.f78551g = (pe[]) Arrays.copyOf(peVarArr2, peVarArr2.length * 2);
            }
            peVar = peVar2;
        }
        return peVar;
    }

    public final synchronized void c() {
        int i10 = this.f78548d;
        int i11 = this.f78546b;
        int i12 = ib3.f78556a;
        int i13 = (((i10 + i11) - 1) / i11) - this.f78549e;
        int i14 = 0;
        int iMax = Math.max(0, i13);
        int i15 = this.f78550f;
        if (iMax >= i15) {
            return;
        }
        if (this.f78547c != null) {
            int i16 = i15 - 1;
            while (i14 <= i16) {
                pe peVar = this.f78551g[i14];
                peVar.getClass();
                if (peVar.f81379a == this.f78547c) {
                    i14++;
                } else {
                    pe peVar2 = this.f78551g[i16];
                    peVar2.getClass();
                    if (peVar2.f81379a != this.f78547c) {
                        i16--;
                    } else {
                        pe[] peVarArr = this.f78551g;
                        peVarArr[i14] = peVar2;
                        peVarArr[i16] = peVar;
                        i16--;
                        i14++;
                    }
                }
            }
            iMax = Math.max(iMax, i14);
            if (iMax >= this.f78550f) {
                return;
            }
        }
        Arrays.fill(this.f78551g, iMax, this.f78550f, (Object) null);
        this.f78550f = iMax;
    }

    public ib0(int i10) {
        this.f78545a = true;
        this.f78546b = 65536;
        this.f78550f = 0;
        this.f78551g = new pe[100];
        this.f78547c = null;
    }

    public final int b() {
        return this.f78546b;
    }

    public final synchronized void a(int i10) {
        boolean z10 = i10 < this.f78548d;
        this.f78548d = i10;
        if (z10) {
            c();
        }
    }
}
