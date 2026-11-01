package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class qa2 extends z33 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f81780o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f81781p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f81782n;

    public static boolean a(jb2 jb2Var, byte[] bArr) {
        int i10 = jb2Var.f78968c;
        int i11 = jb2Var.f78967b;
        if (i10 - i11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        jb2Var.a(bArr2, 0, bArr.length);
        jb2Var.e(i11);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // yads.z33
    public final long a(jb2 jb2Var) {
        int i10;
        byte[] bArr = jb2Var.f78966a;
        byte b10 = bArr[0];
        int i11 = b10 & 255;
        int i12 = b10 & 3;
        int i13 = 2;
        if (i12 == 0) {
            i13 = 1;
        } else if (i12 != 1 && i12 != 2) {
            i13 = bArr[1] & 63;
        }
        int i14 = i11 >> 3;
        int i15 = i14 & 3;
        if (i14 >= 16) {
            i10 = 2500 << i15;
        } else if (i14 >= 12) {
            i10 = 10000 << (i14 & 1);
        } else {
            i10 = i15 == 3 ? 60000 : 10000 << i15;
        }
        return (((long) this.f85203i) * (((long) i13) * ((long) i10))) / 1000000;
    }

    @Override // yads.z33
    public final boolean a(jb2 jb2Var, long j10, x33 x33Var) {
        if (a(jb2Var, f81780o)) {
            byte[] bArrCopyOf = Arrays.copyOf(jb2Var.f78966a, jb2Var.f78968c);
            int i10 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = ra2.a(bArrCopyOf);
            if (x33Var.f84445a != null) {
                return true;
            }
            lx0 lx0Var = new lx0();
            lx0Var.f79967k = "audio/opus";
            lx0Var.f79980x = i10;
            lx0Var.f79981y = 48000;
            lx0Var.f79969m = arrayListA;
            x33Var.f84445a = new mx0(lx0Var);
            return true;
        }
        if (a(jb2Var, f81781p)) {
            if (x33Var.f84445a != null) {
                if (this.f81782n) {
                    return true;
                }
                this.f81782n = true;
                jb2Var.e(jb2Var.f78967b + 8);
                ts1 ts1VarA = dn3.a(p51.b(dn3.a(jb2Var, false, false).f75578a));
                if (ts1VarA == null) {
                    return true;
                }
                mx0 mx0Var = x33Var.f84445a;
                mx0Var.getClass();
                lx0 lx0Var2 = new lx0(mx0Var);
                ts1 ts1Var = x33Var.f84445a.f80427k;
                if (ts1Var != null) {
                    ss1[] ss1VarArr = ts1Var.f83163b;
                    if (ss1VarArr.length != 0) {
                        ts1VarA = new ts1((ss1[]) ib3.a((Object[]) ts1VarA.f83163b, (Object[]) ss1VarArr));
                    }
                }
                lx0Var2.f79965i = ts1VarA;
                x33Var.f84445a = new mx0(lx0Var2);
                return true;
            }
            throw new IllegalStateException();
        }
        if (x33Var.f84445a != null) {
            return false;
        }
        throw new IllegalStateException();
    }

    @Override // yads.z33
    public final void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f81782n = false;
        }
    }
}
