package yads;

import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes6.dex */
public final class o92 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f80977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f80979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f80981f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f80982g = new jb2(255);

    public final boolean a(ld0 ld0Var, boolean z10) throws ob2, EOFException {
        this.f80976a = 0;
        this.f80977b = 0L;
        this.f80978c = 0;
        this.f80979d = 0;
        this.f80980e = 0;
        this.f80982g.c(27);
        try {
            if (ld0Var.b(this.f80982g.f78966a, 0, 27, z10) && this.f80982g.n() == 1332176723) {
                if (this.f80982g.m() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw ob2.b("unsupported bit stream revision");
                }
                this.f80976a = this.f80982g.m();
                this.f80977b = this.f80982g.e();
                this.f80982g.g();
                this.f80982g.g();
                this.f80982g.g();
                int iM = this.f80982g.m();
                this.f80978c = iM;
                this.f80979d = iM + 27;
                this.f80982g.c(iM);
                try {
                    if (ld0Var.b(this.f80982g.f78966a, 0, this.f80978c, z10)) {
                        for (int i10 = 0; i10 < this.f80978c; i10++) {
                            this.f80981f[i10] = this.f80982g.m();
                            this.f80980e += this.f80981f[i10];
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z10) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean a(ld0 ld0Var, long j10) throws EOFException, InterruptedIOException {
        long j11 = ld0Var.f79757d;
        if (j11 == ((long) ld0Var.f79759f) + j11) {
            this.f80982g.c(4);
            while (true) {
                if (j10 != -1 && ld0Var.f79757d + 4 >= j10) {
                    break;
                }
                try {
                    if (!ld0Var.b(this.f80982g.f78966a, 0, 4, true)) {
                        break;
                    }
                    this.f80982g.e(0);
                    if (this.f80982g.n() == 1332176723) {
                        ld0Var.f79759f = 0;
                        return true;
                    }
                    ld0Var.a(1);
                } catch (EOFException unused) {
                }
            }
            do {
                if (j10 != -1 && ld0Var.f79757d >= j10) {
                    break;
                }
            } while (ld0Var.c(1) != -1);
            return false;
        }
        throw new IllegalArgumentException();
    }
}
