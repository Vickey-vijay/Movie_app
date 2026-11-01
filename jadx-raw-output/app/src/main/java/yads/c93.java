package yads;

/* JADX INFO: loaded from: classes9.dex */
public final class c93 implements sp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63 f76216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jb2 f76217b = new jb2();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f76218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f76219d;

    @Override // yads.sp
    public final void a() {
        this.f76217b.a(ib3.f78561f);
    }

    @Override // yads.sp
    public final rp a(ld0 ld0Var, long j10) {
        rp rpVar;
        long j11 = ld0Var.f79757d;
        int iMin = (int) Math.min(this.f76219d, ld0Var.f79756c - j11);
        this.f76217b.c(iMin);
        ld0Var.b(this.f76217b.f78966a, 0, iMin, false);
        jb2 jb2Var = this.f76217b;
        int i10 = jb2Var.f78968c;
        long j12 = -1;
        long j13 = -1;
        long j14 = -9223372036854775807L;
        while (true) {
            int i11 = jb2Var.f78968c;
            int i12 = jb2Var.f78967b;
            if (i11 - i12 < 188) {
                break;
            }
            byte[] bArr = jb2Var.f78966a;
            while (i12 < i10 && bArr[i12] != 71) {
                i12++;
            }
            int i13 = i12 + 188;
            if (i13 > i10) {
                break;
            }
            long jA = n93.a(i12, this.f76218c, jb2Var);
            if (jA != -9223372036854775807L) {
                long jB = this.f76216a.b(jA);
                if (jB > j10) {
                    if (j14 == -9223372036854775807L) {
                        return new rp(-1, jB, j11);
                    }
                    rpVar = new rp(0, -9223372036854775807L, j11 + j13);
                } else {
                    if (100000 + jB > j10) {
                        return new rp(0, -9223372036854775807L, j11 + ((long) i12));
                    }
                    j14 = jB;
                    j13 = i12;
                }
            }
            jb2Var.e(i13);
            j12 = i13;
            return rpVar;
        }
        if (j14 == -9223372036854775807L) {
            return rp.f82370d;
        }
        rpVar = new rp(-2, j14, j11 + j12);
        return rpVar;
    }

    public c93(int i10, y63 y63Var, int i11) {
        this.f76218c = i10;
        this.f76216a = y63Var;
        this.f76219d = i11;
    }
}
