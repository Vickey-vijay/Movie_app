package bl;

import java.util.Arrays;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends r1<byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f5423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5424b;

    public final void e(byte b10) {
        r1.c(this, 0, 1, null);
        byte[] bArr = this.f5423a;
        int iD = d();
        this.f5424b = iD + 1;
        bArr[iD] = b10;
    }

    public j(byte[] bArr) {
        ck.p.j(bArr, "bufferWithData");
        this.f5423a = bArr;
        this.f5424b = bArr.length;
        b(10);
    }

    @Override // bl.r1
    public void b(int i10) {
        byte[] bArr = this.f5423a;
        if (bArr.length < i10) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, ik.k.d(i10, bArr.length * 2));
            ck.p.i(bArrCopyOf, "copyOf(this, newSize)");
            this.f5423a = bArrCopyOf;
        }
    }

    @Override // bl.r1
    public int d() {
        return this.f5424b;
    }

    @Override // bl.r1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f5423a, d());
        ck.p.i(bArrCopyOf, "copyOf(this, newSize)");
        return bArrCopyOf;
    }
}
