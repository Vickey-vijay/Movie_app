package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends r1<long[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f5490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5491b;

    public final void e(long j10) {
        r1.c(this, 0, 1, null);
        long[] jArr = this.f5490a;
        int iD = d();
        this.f5491b = iD + 1;
        jArr[iD] = j10;
    }

    public y0(long[] jArr) {
        ck.p.j(jArr, "bufferWithData");
        this.f5490a = jArr;
        this.f5491b = jArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        long[] jArr = this.f5490a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, ik.k.d(i10, jArr.length * 2));
            ck.p.i(jArrCopyOf, "copyOf(this, newSize)");
            this.f5490a = jArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5491b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public long[] a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f5490a, d());
        ck.p.i(jArrCopyOf, "copyOf(this, newSize)");
        return jArrCopyOf;
    }
}
