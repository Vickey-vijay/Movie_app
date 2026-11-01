package yads;

import androidx.core.view.InputDeviceCompat;

/* JADX INFO: loaded from: classes9.dex */
public final class sw2 implements m93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rw2 f82789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f82790b = new jb2(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f82791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82794f;

    @Override // yads.m93
    public final void a(int i10, jb2 jb2Var) {
        boolean z10 = (i10 & 1) != 0;
        int iM = z10 ? jb2Var.f78967b + jb2Var.m() : -1;
        if (this.f82794f) {
            if (!z10) {
                return;
            }
            this.f82794f = false;
            jb2Var.e(iM);
            this.f82792d = 0;
        }
        while (true) {
            int i11 = jb2Var.f78968c - jb2Var.f78967b;
            if (i11 <= 0) {
                return;
            }
            int i12 = this.f82792d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iM2 = jb2Var.m();
                    jb2Var.e(jb2Var.f78967b - 1);
                    if (iM2 == 255) {
                        this.f82794f = true;
                        return;
                    }
                }
                int iMin = Math.min(jb2Var.f78968c - jb2Var.f78967b, 3 - this.f82792d);
                jb2Var.a(this.f82790b.f78966a, this.f82792d, iMin);
                int i13 = this.f82792d + iMin;
                this.f82792d = i13;
                if (i13 == 3) {
                    this.f82790b.e(0);
                    this.f82790b.d(3);
                    jb2 jb2Var2 = this.f82790b;
                    jb2Var2.e(jb2Var2.f78967b + 1);
                    int iM3 = this.f82790b.m();
                    int iM4 = this.f82790b.m();
                    this.f82793e = (iM3 & 128) != 0;
                    int i14 = (((iM3 & 15) << 8) | iM4) + 3;
                    this.f82791c = i14;
                    byte[] bArr = this.f82790b.f78966a;
                    if (bArr.length < i14) {
                        this.f82790b.a(Math.min(InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i14, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(i11, this.f82791c - i12);
                jb2Var.a(this.f82790b.f78966a, this.f82792d, iMin2);
                int i15 = this.f82792d + iMin2;
                this.f82792d = i15;
                int i16 = this.f82791c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f82793e) {
                        byte[] bArr2 = this.f82790b.f78966a;
                        int i17 = -1;
                        for (int i18 = 0; i18 < i16; i18++) {
                            i17 = ib3.f78569n[((i17 >>> 24) ^ (bArr2[i18] & 255)) & 255] ^ (i17 << 8);
                        }
                        int i19 = ib3.f78556a;
                        if (i17 != 0) {
                            this.f82794f = true;
                            return;
                        }
                        this.f82790b.d(this.f82791c - 4);
                    } else {
                        this.f82790b.d(i16);
                    }
                    this.f82790b.e(0);
                    this.f82789a.a(this.f82790b);
                    this.f82792d = 0;
                }
            }
        }
    }

    public sw2(rw2 rw2Var) {
        this.f82789a = rw2Var;
    }

    @Override // yads.m93
    public final void a(y63 y63Var, pq0 pq0Var, l93 l93Var) {
        this.f82789a.a(y63Var, pq0Var, l93Var);
        this.f82794f = true;
    }

    @Override // yads.m93
    public final void a() {
        this.f82794f = true;
    }
}
