package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class g2 extends r1<mj.j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5410b;

    public g2(byte[] bArr) {
        ck.p.j(bArr, "bufferWithData");
        this.f5409a = bArr;
        this.f5410b = mj.j.p(bArr);
        b(10);
    }

    public /* synthetic */ g2(byte[] bArr, ck.i iVar) {
        this(bArr);
    }

    public final void e(byte b10) {
        r1.c(this, 0, 1, null);
        byte[] bArr = this.f5409a;
        int iD = d();
        this.f5410b = iD + 1;
        mj.j.t(bArr, iD, b10);
    }

    @Override // bl.r1
    public void b(int i10) {
        if (mj.j.p(this.f5409a) < i10) {
            byte[] bArr = this.f5409a;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, ik.k.d(i10, mj.j.p(bArr) * 2));
            ck.p.i(bArrCopyOf, "copyOf(this, newSize)");
            this.f5409a = mj.j.g(bArrCopyOf);
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5410b;
    }

    public byte[] f() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f5409a, d());
        ck.p.i(bArrCopyOf, "copyOf(this, newSize)");
        return mj.j.g(bArrCopyOf);
    }

    @Override // bl.r1
    public /* bridge */ /* synthetic */ mj.j a() {
        return mj.j.e(f());
    }
}
