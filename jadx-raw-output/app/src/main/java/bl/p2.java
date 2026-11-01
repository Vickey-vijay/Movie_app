package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class p2 extends r1<mj.q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public short[] f5454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5455b;

    public p2(short[] sArr) {
        ck.p.j(sArr, "bufferWithData");
        this.f5454a = sArr;
        this.f5455b = mj.q.p(sArr);
        b(10);
    }

    public /* synthetic */ p2(short[] sArr, ck.i iVar) {
        this(sArr);
    }

    public final void e(short s10) {
        r1.c(this, 0, 1, null);
        short[] sArr = this.f5454a;
        int iD = d();
        this.f5455b = iD + 1;
        mj.q.t(sArr, iD, s10);
    }

    @Override // bl.r1
    public void b(int i10) {
        if (mj.q.p(this.f5454a) < i10) {
            short[] sArr = this.f5454a;
            short[] sArrCopyOf = Arrays.copyOf(sArr, ik.k.d(i10, mj.q.p(sArr) * 2));
            ck.p.i(sArrCopyOf, "copyOf(this, newSize)");
            this.f5454a = mj.q.g(sArrCopyOf);
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5455b;
    }

    public short[] f() {
        short[] sArrCopyOf = Arrays.copyOf(this.f5454a, d());
        ck.p.i(sArrCopyOf, "copyOf(this, newSize)");
        return mj.q.g(sArrCopyOf);
    }

    @Override // bl.r1
    public /* bridge */ /* synthetic */ mj.q a() {
        return mj.q.e(f());
    }
}
