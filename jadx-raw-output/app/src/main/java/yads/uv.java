package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class uv extends px0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f83667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f83668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f83669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f83670g;

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        this.f81642c.a(0, p63Var, z10);
        long j10 = p63Var.f81270f - this.f83667d;
        long j11 = this.f83669f;
        return p63Var.a(p63Var.f81266b, p63Var.f81267c, 0, j11 == -9223372036854775807L ? -9223372036854775807L : j11 - j10, j10, e6.f76925h, false);
    }

    public uv(s63 s63Var, long j10, long j11) throws vv {
        long jMax;
        super(s63Var);
        boolean z10 = false;
        if (s63Var.a() == 1) {
            r63 r63VarA = s63Var.a(0, new r63());
            long jMax2 = Math.max(0L, j10);
            if (!r63VarA.f82129m && jMax2 != 0 && !r63VarA.f82125i) {
                throw new vv(1);
            }
            if (j11 == Long.MIN_VALUE) {
                jMax = r63VarA.f82131o;
            } else {
                jMax = Math.max(0L, j11);
            }
            long j12 = r63VarA.f82131o;
            if (j12 != -9223372036854775807L) {
                jMax = jMax > j12 ? j12 : jMax;
                if (jMax2 > jMax) {
                    throw new vv(2);
                }
            }
            this.f83667d = jMax2;
            this.f83668e = jMax;
            this.f83669f = jMax != -9223372036854775807L ? jMax - jMax2 : -9223372036854775807L;
            if (r63VarA.f82126j && (jMax == -9223372036854775807L || (j12 != -9223372036854775807L && jMax == j12))) {
                z10 = true;
            }
            this.f83670g = z10;
            return;
        }
        throw new vv(0);
    }

    @Override // yads.px0, yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        this.f81642c.a(0, r63Var, 0L);
        long j11 = r63Var.f82134r;
        long j12 = this.f83667d;
        r63Var.f82134r = j11 + j12;
        r63Var.f82131o = this.f83669f;
        r63Var.f82126j = this.f83670g;
        long j13 = r63Var.f82130n;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            r63Var.f82130n = jMax;
            long j14 = this.f83668e;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            r63Var.f82130n = jMax - this.f83667d;
        }
        long jB = ib3.b(this.f83667d);
        long j15 = r63Var.f82122f;
        if (j15 != -9223372036854775807L) {
            r63Var.f82122f = j15 + jB;
        }
        long j16 = r63Var.f82123g;
        if (j16 != -9223372036854775807L) {
            r63Var.f82123g = j16 + jB;
        }
        return r63Var;
    }
}
