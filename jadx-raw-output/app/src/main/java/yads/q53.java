package yads;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class q53 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p30 f81716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n30 f81717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f81719d;

    @Override // yads.p30
    public final void a(r83 r83Var) {
        r83Var.getClass();
        this.f81716a.a(r83Var);
    }

    @Override // yads.p30
    public final void close() throws or {
        try {
            this.f81716a.close();
            if (this.f81718c) {
                this.f81718c = false;
                pr prVar = (pr) this.f81717b;
                if (prVar.f81546d == null) {
                    return;
                }
                try {
                    prVar.a();
                } catch (IOException e10) {
                    throw new or(e10);
                }
            }
        } catch (Throwable th2) {
            if (this.f81718c) {
                this.f81718c = false;
                pr prVar2 = (pr) this.f81717b;
                if (prVar2.f81546d != null) {
                    try {
                        prVar2.a();
                    } catch (IOException e11) {
                        throw new or(e11);
                    }
                }
            }
            throw th2;
        }
    }

    @Override // yads.p30
    public final Map getResponseHeaders() {
        return this.f81716a.getResponseHeaders();
    }

    @Override // yads.p30
    public final Uri getUri() {
        return this.f81716a.getUri();
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) throws or {
        if (this.f81719d == 0) {
            return -1;
        }
        int i12 = this.f81716a.read(bArr, i10, i11);
        if (i12 > 0) {
            pr prVar = (pr) this.f81717b;
            u30 u30Var = prVar.f81546d;
            if (u30Var != null) {
                int i13 = 0;
                while (i13 < i12) {
                    try {
                        if (prVar.f81550h == prVar.f81547e) {
                            prVar.a();
                            prVar.a(u30Var);
                        }
                        int iMin = (int) Math.min(i12 - i13, prVar.f81547e - prVar.f81550h);
                        OutputStream outputStream = prVar.f81549g;
                        int i14 = ib3.f78556a;
                        outputStream.write(bArr, i10 + i13, iMin);
                        i13 += iMin;
                        long j10 = iMin;
                        prVar.f81550h += j10;
                        prVar.f81551i += j10;
                    } catch (IOException e10) {
                        throw new or(e10);
                    }
                }
            }
            long j11 = this.f81719d;
            if (j11 != -1) {
                this.f81719d = j11 - ((long) i12);
            }
        }
        return i12;
    }

    public q53(p30 p30Var, pr prVar) {
        this.f81716a = (p30) ni.a(p30Var);
        this.f81717b = (n30) ni.a(prVar);
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws or {
        long jA = this.f81716a.a(u30Var);
        this.f81719d = jA;
        if (jA == 0) {
            return 0L;
        }
        if (u30Var.f83347g == -1 && jA != -1) {
            u30Var = u30Var.a(0L, jA);
        }
        this.f81718c = true;
        pr prVar = (pr) this.f81717b;
        prVar.getClass();
        u30Var.f83348h.getClass();
        if (u30Var.f83347g == -1 && (u30Var.f83349i & 2) == 2) {
            prVar.f81546d = null;
        } else {
            prVar.f81546d = u30Var;
            prVar.f81547e = (u30Var.f83349i & 4) == 4 ? prVar.f81544b : Long.MAX_VALUE;
            prVar.f81551i = 0L;
            try {
                prVar.a(u30Var);
            } catch (IOException e10) {
                throw new or(e10);
            }
        }
        return this.f81719d;
    }
}
