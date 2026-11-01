package z3;

import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f86209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f86210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f86212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f86213e;

    public void d() {
        this.f86210b = false;
        this.f86211c = false;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f86210b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f86212d;
            int length = bArr2.length;
            int i13 = this.f86213e;
            if (length < i13 + i12) {
                this.f86212d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.f86212d, this.f86213e, i12);
            this.f86213e += i12;
        }
    }

    public boolean b(int i10) {
        if (!this.f86210b) {
            return false;
        }
        this.f86213e -= i10;
        this.f86210b = false;
        this.f86211c = true;
        return true;
    }

    public boolean c() {
        return this.f86211c;
    }

    public void e(int i10) {
        g5.a.f(!this.f86210b);
        boolean z10 = i10 == this.f86209a;
        this.f86210b = z10;
        if (z10) {
            this.f86213e = 3;
            this.f86211c = false;
        }
    }

    public t(int i10, int i11) {
        this.f86209a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f86212d = bArr;
        bArr[2] = 1;
    }
}
