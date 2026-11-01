package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m2 extends r1<mj.n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f5440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5441b;

    public m2(long[] jArr) {
        ck.p.j(jArr, "bufferWithData");
        this.f5440a = jArr;
        this.f5441b = mj.n.p(jArr);
        b(10);
    }

    public /* synthetic */ m2(long[] jArr, ck.i iVar) {
        this(jArr);
    }

    public final void e(long j10) {
        r1.c(this, 0, 1, null);
        long[] jArr = this.f5440a;
        int iD = d();
        this.f5441b = iD + 1;
        mj.n.t(jArr, iD, j10);
    }

    @Override // bl.r1
    public void b(int i10) {
        if (mj.n.p(this.f5440a) < i10) {
            long[] jArr = this.f5440a;
            long[] jArrCopyOf = Arrays.copyOf(jArr, ik.k.d(i10, mj.n.p(jArr) * 2));
            ck.p.i(jArrCopyOf, "copyOf(this, newSize)");
            this.f5440a = mj.n.g(jArrCopyOf);
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5441b;
    }

    public long[] f() {
        long[] jArrCopyOf = Arrays.copyOf(this.f5440a, d());
        ck.p.i(jArrCopyOf, "copyOf(this, newSize)");
        return mj.n.g(jArrCopyOf);
    }

    @Override // bl.r1
    public /* bridge */ /* synthetic */ mj.n a() {
        return mj.n.e(f());
    }
}
