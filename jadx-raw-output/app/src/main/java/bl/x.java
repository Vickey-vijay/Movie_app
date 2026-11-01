package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends r1<double[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double[] f5482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5483b;

    public final void e(double d10) {
        r1.c(this, 0, 1, null);
        double[] dArr = this.f5482a;
        int iD = d();
        this.f5483b = iD + 1;
        dArr[iD] = d10;
    }

    public x(double[] dArr) {
        ck.p.j(dArr, "bufferWithData");
        this.f5482a = dArr;
        this.f5483b = dArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        double[] dArr = this.f5482a;
        if (dArr.length < i10) {
            double[] dArrCopyOf = Arrays.copyOf(dArr, ik.k.d(i10, dArr.length * 2));
            ck.p.i(dArrCopyOf, "copyOf(this, newSize)");
            this.f5482a = dArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5483b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public double[] a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f5482a, d());
        ck.p.i(dArrCopyOf, "copyOf(this, newSize)");
        return dArrCopyOf;
    }
}
