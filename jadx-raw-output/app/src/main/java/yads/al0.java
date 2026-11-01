package yads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes10.dex */
public final class al0 implements m73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f75549a = new byte[4096];

    @Override // yads.m73
    public final int a(l30 l30Var, int i10, boolean z10) throws EOFException {
        int i11 = l30Var.read(this.f75549a, 0, Math.min(this.f75549a.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.m73
    public final void a(long j10, int i10, int i11, int i12, l73 l73Var) {
    }

    @Override // yads.m73
    public final void a(mx0 mx0Var) {
    }

    @Override // yads.m73
    public final void a(int i10, jb2 jb2Var) {
        jb2Var.e(jb2Var.f78967b + i10);
    }
}
