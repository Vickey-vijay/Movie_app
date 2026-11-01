package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class j2 extends r1<mj.l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f5427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5428b;

    public j2(int[] iArr) {
        ck.p.j(iArr, "bufferWithData");
        this.f5427a = iArr;
        this.f5428b = mj.l.p(iArr);
        b(10);
    }

    public /* synthetic */ j2(int[] iArr, ck.i iVar) {
        this(iArr);
    }

    public final void e(int i10) {
        r1.c(this, 0, 1, null);
        int[] iArr = this.f5427a;
        int iD = d();
        this.f5428b = iD + 1;
        mj.l.t(iArr, iD, i10);
    }

    @Override // bl.r1
    public void b(int i10) {
        if (mj.l.p(this.f5427a) < i10) {
            int[] iArr = this.f5427a;
            int[] iArrCopyOf = Arrays.copyOf(iArr, ik.k.d(i10, mj.l.p(iArr) * 2));
            ck.p.i(iArrCopyOf, "copyOf(this, newSize)");
            this.f5427a = mj.l.g(iArrCopyOf);
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5428b;
    }

    public int[] f() {
        int[] iArrCopyOf = Arrays.copyOf(this.f5427a, d());
        ck.p.i(iArrCopyOf, "copyOf(this, newSize)");
        return mj.l.g(iArrCopyOf);
    }

    @Override // bl.r1
    public /* bridge */ /* synthetic */ mj.l a() {
        return mj.l.e(f());
    }
}
