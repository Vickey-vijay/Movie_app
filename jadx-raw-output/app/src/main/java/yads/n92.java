package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class n92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o92 f80607a = new o92();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f80608b = new jb2(0, new byte[65025]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80609c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80611e;

    public final boolean a(ld0 ld0Var) throws InterruptedIOException {
        int i10;
        int i11;
        int i12;
        if (this.f80611e) {
            this.f80611e = false;
            this.f80608b.c(0);
        }
        while (true) {
            if (this.f80611e) {
                return true;
            }
            if (this.f80609c < 0) {
                if (this.f80607a.a(ld0Var, -1L) && this.f80607a.a(ld0Var, true)) {
                    o92 o92Var = this.f80607a;
                    int i13 = o92Var.f80979d;
                    if ((o92Var.f80976a & 1) == 1 && this.f80608b.f78968c == 0) {
                        this.f80610d = 0;
                        int i14 = 0;
                        do {
                            int i15 = this.f80610d;
                            o92 o92Var2 = this.f80607a;
                            if (i15 >= o92Var2.f80978c) {
                                break;
                            }
                            int[] iArr = o92Var2.f80981f;
                            this.f80610d = i15 + 1;
                            i12 = iArr[i15];
                            i14 += i12;
                        } while (i12 == 255);
                        i13 += i14;
                        i11 = this.f80610d;
                    } else {
                        i11 = 0;
                    }
                    try {
                        ld0Var.a(i13);
                        this.f80609c = i11;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int i16 = this.f80609c;
            this.f80610d = 0;
            int i17 = 0;
            do {
                int i18 = this.f80610d;
                int i19 = i16 + i18;
                o92 o92Var3 = this.f80607a;
                if (i19 >= o92Var3.f80978c) {
                    break;
                }
                int[] iArr2 = o92Var3.f80981f;
                this.f80610d = i18 + 1;
                i10 = iArr2[i19];
                i17 += i10;
            } while (i10 == 255);
            int i20 = this.f80609c + this.f80610d;
            if (i17 > 0) {
                jb2 jb2Var = this.f80608b;
                jb2Var.a(jb2Var.f78968c + i17);
                jb2 jb2Var2 = this.f80608b;
                try {
                    ld0Var.a(jb2Var2.f78966a, jb2Var2.f78968c, i17, false);
                    jb2 jb2Var3 = this.f80608b;
                    jb2Var3.d(jb2Var3.f78968c + i17);
                    this.f80611e = this.f80607a.f80981f[i20 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i20 == this.f80607a.f80978c) {
                i20 = -1;
            }
            this.f80609c = i20;
        }
    }

    public final void a() {
        jb2 jb2Var = this.f80608b;
        byte[] bArr = jb2Var.f78966a;
        if (bArr.length == 65025) {
            return;
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, Math.max(65025, jb2Var.f78968c));
        int i10 = this.f80608b.f78968c;
        jb2Var.f78966a = bArrCopyOf;
        jb2Var.f78968c = i10;
        jb2Var.f78967b = 0;
    }
}
