package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class ju implements ns2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lu f79181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms2 f79182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f79183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu f79185f;

    @Override // yads.ns2
    public final int a(nx0 nx0Var, sa0 sa0Var, int i10) {
        if (this.f79185f.c()) {
            return -3;
        }
        jo joVar = this.f79185f.f79932w;
        if (joVar != null) {
            int iA = joVar.a(this.f79183d + 1);
            ms2 ms2Var = this.f79182c;
            if (iA <= ms2Var.f80366q + ms2Var.f80368s) {
                return -3;
            }
        }
        if (!this.f79184e) {
            lu luVar = this.f79185f;
            bn1 bn1Var = luVar.f79917h;
            int[] iArr = luVar.f79912c;
            int i11 = this.f79183d;
            bn1Var.a(new hm1(1, iArr[i11], luVar.f79913d[i11], 0, null, bn1Var.a(luVar.f79930u), -9223372036854775807L));
            this.f79184e = true;
        }
        return this.f79182c.a(nx0Var, sa0Var, i10, this.f79185f.f79933x);
    }

    @Override // yads.ns2
    public final void a() {
    }

    public ju(lu luVar, lu luVar2, ms2 ms2Var, int i10) {
        this.f79185f = luVar;
        this.f79181b = luVar2;
        this.f79182c = ms2Var;
        this.f79183d = i10;
    }

    @Override // yads.ns2
    public final boolean isReady() {
        return !this.f79185f.c() && this.f79182c.a(this.f79185f.f79933x);
    }

    @Override // yads.ns2
    public final int a(long j10) {
        if (this.f79185f.c()) {
            return 0;
        }
        int iA = this.f79182c.a(j10, this.f79185f.f79933x);
        jo joVar = this.f79185f.f79932w;
        if (joVar != null) {
            int iA2 = joVar.a(this.f79183d + 1);
            ms2 ms2Var = this.f79182c;
            iA = Math.min(iA, iA2 - (ms2Var.f80366q + ms2Var.f80368s));
        }
        ms2 ms2Var2 = this.f79182c;
        synchronized (ms2Var2) {
            if (iA >= 0) {
                int i10 = ms2Var2.f80368s + iA;
                if (i10 <= ms2Var2.f80365p) {
                    ms2Var2.f80368s = i10;
                }
            }
            throw new IllegalArgumentException();
        }
        if (iA > 0 && !this.f79184e) {
            lu luVar = this.f79185f;
            bn1 bn1Var = luVar.f79917h;
            int[] iArr = luVar.f79912c;
            int i11 = this.f79183d;
            bn1Var.a(new hm1(1, iArr[i11], luVar.f79913d[i11], 0, null, bn1Var.a(luVar.f79930u), -9223372036854775807L));
            this.f79184e = true;
        }
        return iA;
    }
}
