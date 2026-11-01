package yads;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class m21 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f80043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f80044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l21 f80045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f80046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80047e;

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f80043a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f80043a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f80043a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        if (this.f80047e == 0) {
            int i12 = 0;
            if (this.f80043a.read(this.f80046d, 0, 1) != -1) {
                int i13 = (this.f80046d[0] & 255) << 4;
                if (i13 != 0) {
                    byte[] bArr2 = new byte[i13];
                    int i14 = i13;
                    while (i14 > 0) {
                        int i15 = this.f80043a.read(bArr2, i12, i14);
                        if (i15 != -1) {
                            i12 += i15;
                            i14 -= i15;
                        }
                    }
                    while (i13 > 0 && bArr2[i13 - 1] == 0) {
                        i13--;
                    }
                    if (i13 > 0) {
                        l21 l21Var = this.f80045c;
                        jb2 jb2Var = new jb2(i13, bArr2);
                        zj2 zj2Var = (zj2) l21Var;
                        long jMax = !zj2Var.f85454l ? zj2Var.f85451i : Math.max(zj2Var.f85455m.a(true), zj2Var.f85451i);
                        int i16 = jb2Var.f78968c - jb2Var.f78967b;
                        ms2 ms2Var = zj2Var.f85453k;
                        ms2Var.getClass();
                        ms2Var.a(i16, jb2Var);
                        ms2Var.a(jMax, 1, i16, 0, (l73) null);
                        zj2Var.f85454l = true;
                    }
                }
                this.f80047e = this.f80044b;
            }
            return -1;
        }
        int i17 = this.f80043a.read(bArr, i10, Math.min(this.f80047e, i11));
        if (i17 != -1) {
            this.f80047e -= i17;
        }
        return i17;
    }

    public m21(r33 r33Var, int i10, l21 l21Var) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        this.f80043a = r33Var;
        this.f80044b = i10;
        this.f80045c = l21Var;
        this.f80046d = new byte[1];
        this.f80047e = i10;
    }

    @Override // yads.p30
    public final long a(u30 u30Var) {
        throw new UnsupportedOperationException();
    }
}
