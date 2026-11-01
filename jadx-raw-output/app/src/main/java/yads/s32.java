package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class s32 implements r31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f82516a;

    @Override // yads.r31
    public final boolean a() {
        return this.f82516a;
    }

    public s32(v9 v9Var) {
        boolean z10;
        if (!ck.p.e(v9Var.b(), r32.f82092c.a()) && !ck.p.e(v9Var.b(), r32.f82093d.a())) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f82516a = z10;
    }
}
