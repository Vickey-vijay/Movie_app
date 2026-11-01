package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends r1<int[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5443b;

    public final void e(int i10) {
        r1.c(this, 0, 1, null);
        int[] iArr = this.f5442a;
        int iD = d();
        this.f5443b = iD + 1;
        iArr[iD] = i10;
    }

    public n0(int[] iArr) {
        ck.p.j(iArr, "bufferWithData");
        this.f5442a = iArr;
        this.f5443b = iArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        int[] iArr = this.f5442a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, ik.k.d(i10, iArr.length * 2));
            ck.p.i(iArrCopyOf, "copyOf(this, newSize)");
            this.f5442a = iArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5443b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int[] a() {
        int[] iArrCopyOf = Arrays.copyOf(this.f5442a, d());
        ck.p.i(iArrCopyOf, "copyOf(this, newSize)");
        return iArrCopyOf;
    }
}
