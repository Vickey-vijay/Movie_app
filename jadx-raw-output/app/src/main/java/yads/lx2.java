package yads;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class lx2 extends as2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rr f79983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jx2 f79984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f79985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final bs f79986l;

    @Override // yads.as2
    public final void a() {
        this.f79986l.f75949j = true;
    }

    @Override // yads.as2
    public final Object b() throws IOException {
        float f10;
        float f11;
        this.f79986l.a();
        jx2 jx2Var = this.f79984j;
        if (jx2Var == null) {
            return null;
        }
        int i10 = jx2Var.f79230e + 1;
        jx2Var.f79230e = i10;
        qj0 qj0Var = jx2Var.f79226a;
        long j10 = jx2Var.f79227b;
        long j11 = jx2Var.f79229d;
        if (j10 == -1 || j10 == 0) {
            int i11 = jx2Var.f79228c;
            if (i11 != 0) {
                f11 = (i10 * 100.0f) / i11;
            } else {
                f10 = -1.0f;
            }
            ((lj0) qj0Var).a(j10, j11, f11);
            return null;
        }
        f10 = (j11 * 100.0f) / j10;
        f11 = f10;
        ((lj0) qj0Var).a(j10, j11, f11);
        return null;
    }

    public lx2(kx2 kx2Var, rr rrVar, jx2 jx2Var, byte[] bArr) {
        this.f79983i = rrVar;
        this.f79984j = jx2Var;
        this.f79985k = bArr;
        this.f79986l = new bs(rrVar, kx2Var.f79619c, bArr, jx2Var);
    }
}
