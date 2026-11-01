package e5;

import g5.k0;
import java.util.Arrays;

/* JADX INFO: compiled from: DefaultAllocator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f52383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f52384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f52385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a[] f52386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f52387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f52388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f52389g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a[] f52390h;

    public i(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    @Override // e5.b
    public synchronized void a(a aVar) {
        a[] aVarArr = this.f52386d;
        aVarArr[0] = aVar;
        b(aVarArr);
    }

    @Override // e5.b
    public synchronized a allocate() {
        a aVar;
        this.f52388f++;
        int i10 = this.f52389g;
        if (i10 > 0) {
            a[] aVarArr = this.f52390h;
            int i11 = i10 - 1;
            this.f52389g = i11;
            aVar = aVarArr[i11];
            aVarArr[i11] = null;
        } else {
            aVar = new a(new byte[this.f52384b], 0);
        }
        return aVar;
    }

    @Override // e5.b
    public synchronized void b(a[] aVarArr) {
        int i10 = this.f52389g;
        int length = aVarArr.length + i10;
        a[] aVarArr2 = this.f52390h;
        if (length >= aVarArr2.length) {
            this.f52390h = (a[]) Arrays.copyOf(aVarArr2, Math.max(aVarArr2.length * 2, i10 + aVarArr.length));
        }
        for (a aVar : aVarArr) {
            a[] aVarArr3 = this.f52390h;
            int i11 = this.f52389g;
            this.f52389g = i11 + 1;
            aVarArr3[i11] = aVar;
        }
        this.f52388f -= aVarArr.length;
        notifyAll();
    }

    public synchronized int c() {
        return this.f52388f * this.f52384b;
    }

    public synchronized void d() {
        if (this.f52383a) {
            e(0);
        }
    }

    public synchronized void e(int i10) {
        boolean z10 = i10 < this.f52387e;
        this.f52387e = i10;
        if (z10) {
            trim();
        }
    }

    @Override // e5.b
    public synchronized void trim() {
        int i10 = 0;
        int iMax = Math.max(0, k0.k(this.f52387e, this.f52384b) - this.f52388f);
        int i11 = this.f52389g;
        if (iMax >= i11) {
            return;
        }
        if (this.f52385c != null) {
            int i12 = i11 - 1;
            while (i10 <= i12) {
                a[] aVarArr = this.f52390h;
                a aVar = aVarArr[i10];
                byte[] bArr = aVar.f52358a;
                byte[] bArr2 = this.f52385c;
                if (bArr == bArr2) {
                    i10++;
                } else {
                    a aVar2 = aVarArr[i12];
                    if (aVar2.f52358a != bArr2) {
                        i12--;
                    } else {
                        aVarArr[i10] = aVar2;
                        aVarArr[i12] = aVar;
                        i12--;
                        i10++;
                    }
                }
            }
            iMax = Math.max(iMax, i10);
            if (iMax >= this.f52389g) {
                return;
            }
        }
        Arrays.fill(this.f52390h, iMax, this.f52389g, (Object) null);
        this.f52389g = iMax;
    }

    public i(boolean z10, int i10, int i11) {
        g5.a.a(i10 > 0);
        g5.a.a(i11 >= 0);
        this.f52383a = z10;
        this.f52384b = i10;
        this.f52389g = i11;
        this.f52390h = new a[i11 + 100];
        if (i11 > 0) {
            this.f52385c = new byte[i11 * i10];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f52390h[i12] = new a(this.f52385c, i12 * i10);
            }
        } else {
            this.f52385c = null;
        }
        this.f52386d = new a[1];
    }

    @Override // e5.b
    public int getIndividualAllocationLength() {
        return this.f52384b;
    }
}
