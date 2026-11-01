package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends r1<boolean[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean[] f5405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5406b;

    public final void e(boolean z10) {
        r1.c(this, 0, 1, null);
        boolean[] zArr = this.f5405a;
        int iD = d();
        this.f5406b = iD + 1;
        zArr[iD] = z10;
    }

    public g(boolean[] zArr) {
        ck.p.j(zArr, "bufferWithData");
        this.f5405a = zArr;
        this.f5406b = zArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        boolean[] zArr = this.f5405a;
        if (zArr.length < i10) {
            boolean[] zArrCopyOf = Arrays.copyOf(zArr, ik.k.d(i10, zArr.length * 2));
            ck.p.i(zArrCopyOf, "copyOf(this, newSize)");
            this.f5405a = zArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5406b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean[] a() {
        boolean[] zArrCopyOf = Arrays.copyOf(this.f5405a, d());
        ck.p.i(zArrCopyOf, "copyOf(this, newSize)");
        return zArrCopyOf;
    }
}
