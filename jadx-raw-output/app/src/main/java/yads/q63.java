package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class q63 extends s63 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f81728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p51 f81729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f81730e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f81731f;

    @Override // yads.s63
    public final int a(boolean z10) {
        if (c()) {
            return -1;
        }
        if (z10) {
            return this.f81730e[0];
        }
        return 0;
    }

    @Override // yads.s63
    public final int b(boolean z10) {
        if (c()) {
            return -1;
        }
        return z10 ? this.f81730e[this.f81728c.size() - 1] : this.f81728c.size() - 1;
    }

    public q63(sm2 sm2Var, sm2 sm2Var2, int[] iArr) {
        boolean z10;
        if (sm2Var.size() == iArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ni.a(z10);
        this.f81728c = sm2Var;
        this.f81729d = sm2Var2;
        this.f81730e = iArr;
        this.f81731f = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f81731f[iArr[i10]] = i10;
        }
    }

    @Override // yads.s63
    public final int a(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != b(z10)) {
            return z10 ? this.f81730e[this.f81731f[i10] + 1] : i10 + 1;
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final p63 a(int i10, p63 p63Var, boolean z10) {
        p63 p63Var2 = (p63) this.f81729d.get(i10);
        p63Var.a(p63Var2.f81266b, p63Var2.f81267c, p63Var2.f81268d, p63Var2.f81269e, p63Var2.f81270f, p63Var2.f81272h, p63Var2.f81271g);
        return p63Var;
    }

    @Override // yads.s63
    public final int b(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 != a(z10)) {
            return z10 ? this.f81730e[this.f81731f[i10] - 1] : i10 - 1;
        }
        if (i11 == 2) {
            return b(z10);
        }
        return -1;
    }

    @Override // yads.s63
    public final int a() {
        return this.f81729d.size();
    }

    @Override // yads.s63
    public final r63 a(int i10, r63 r63Var, long j10) {
        r63 r63Var2 = (r63) this.f81728c.get(i10);
        r63Var.a(r63Var2.f82118b, r63Var2.f82120d, r63Var2.f82121e, r63Var2.f82122f, r63Var2.f82123g, r63Var2.f82124h, r63Var2.f82125i, r63Var2.f82126j, r63Var2.f82128l, r63Var2.f82130n, r63Var2.f82131o, r63Var2.f82132p, r63Var2.f82133q, r63Var2.f82134r);
        r63Var.f82129m = r63Var2.f82129m;
        return r63Var;
    }

    @Override // yads.s63
    public final int b() {
        return this.f81728c.size();
    }

    @Override // yads.s63
    public final int a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.s63
    public final Object a(int i10) {
        throw new UnsupportedOperationException();
    }
}
