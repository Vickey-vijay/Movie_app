package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a2 extends r1<short[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f5377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5378b;

    public final void e(short s10) {
        r1.c(this, 0, 1, null);
        short[] sArr = this.f5377a;
        int iD = d();
        this.f5378b = iD + 1;
        sArr[iD] = s10;
    }

    public a2(short[] sArr) {
        ck.p.j(sArr, "bufferWithData");
        this.f5377a = sArr;
        this.f5378b = sArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        short[] sArr = this.f5377a;
        if (sArr.length < i10) {
            short[] sArrCopyOf = Arrays.copyOf(sArr, ik.k.d(i10, sArr.length * 2));
            ck.p.i(sArrCopyOf, "copyOf(this, newSize)");
            this.f5377a = sArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5378b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public short[] a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f5377a, d());
        ck.p.i(sArrCopyOf, "copyOf(this, newSize)");
        return sArrCopyOf;
    }
}
