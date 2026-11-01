package yads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class os1 extends px0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f81137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f81138e;

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f81642c.a(i10, p63Var, z10);
        p63Var.f81269e = this.f81137d[i10];
        return p63Var;
    }

    public os1(s63 s63Var, HashMap map) {
        super(s63Var);
        int iB = s63Var.b();
        this.f81138e = new long[s63Var.b()];
        r63 r63Var = new r63();
        for (int i10 = 0; i10 < iB; i10++) {
            this.f81138e[i10] = s63Var.a(i10, r63Var).f82131o;
        }
        int iA = s63Var.a();
        this.f81137d = new long[iA];
        p63 p63Var = new p63();
        for (int i11 = 0; i11 < iA; i11++) {
            s63Var.a(i11, p63Var, true);
            long jLongValue = ((Long) ni.a((Long) map.get(p63Var.f81267c))).longValue();
            long[] jArr = this.f81137d;
            jLongValue = jLongValue == Long.MIN_VALUE ? p63Var.f81269e : jLongValue;
            jArr[i11] = jLongValue;
            long j10 = p63Var.f81269e;
            if (j10 != -9223372036854775807L) {
                long[] jArr2 = this.f81138e;
                int i12 = p63Var.f81268d;
                jArr2[i12] = jArr2[i12] - (j10 - jLongValue);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        long jMin;
        super.a(i10, r63Var, j10);
        long j11 = this.f81138e[i10];
        r63Var.f82131o = j11;
        if (j11 != -9223372036854775807L) {
            long j12 = r63Var.f82130n;
            if (j12 != -9223372036854775807L) {
                jMin = Math.min(j12, j11);
            } else {
                jMin = r63Var.f82130n;
            }
        } else {
            jMin = r63Var.f82130n;
        }
        r63Var.f82130n = jMin;
        return r63Var;
    }
}
