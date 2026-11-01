package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends r1<char[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public char[] f5450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5451b;

    public final void e(char c10) {
        r1.c(this, 0, 1, null);
        char[] cArr = this.f5450a;
        int iD = d();
        this.f5451b = iD + 1;
        cArr[iD] = c10;
    }

    public p(char[] cArr) {
        ck.p.j(cArr, "bufferWithData");
        this.f5450a = cArr;
        this.f5451b = cArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        char[] cArr = this.f5450a;
        if (cArr.length < i10) {
            char[] cArrCopyOf = Arrays.copyOf(cArr, ik.k.d(i10, cArr.length * 2));
            ck.p.i(cArrCopyOf, "copyOf(this, newSize)");
            this.f5450a = cArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5451b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public char[] a() {
        char[] cArrCopyOf = Arrays.copyOf(this.f5450a, d());
        ck.p.i(cArrCopyOf, "copyOf(this, newSize)");
        return cArrCopyOf;
    }
}
