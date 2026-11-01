package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends r1<float[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float[] f5394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5395b;

    public final void e(float f10) {
        r1.c(this, 0, 1, null);
        float[] fArr = this.f5394a;
        int iD = d();
        this.f5395b = iD + 1;
        fArr[iD] = f10;
    }

    public d0(float[] fArr) {
        ck.p.j(fArr, "bufferWithData");
        this.f5394a = fArr;
        this.f5395b = fArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        float[] fArr = this.f5394a;
        if (fArr.length < i10) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, ik.k.d(i10, fArr.length * 2));
            ck.p.i(fArrCopyOf, "copyOf(this, newSize)");
            this.f5394a = fArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5395b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public float[] a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f5394a, d());
        ck.p.i(fArrCopyOf, "copyOf(this, newSize)");
        return fArrCopyOf;
    }
}
