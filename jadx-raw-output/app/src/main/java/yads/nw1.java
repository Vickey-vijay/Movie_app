package yads;

import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class nw1 implements fw1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sw1 f80841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oj1 f80842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ow1 f80843c;

    @Override // yads.fw1
    public final void a() {
        sw1 sw1Var = this.f80841a;
        ow1 ow1Var = this.f80843c;
        if (ow1Var.f81168a && ow1Var.f81169b.isActive()) {
            nk.l lVar = ow1Var.f81169b;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
        }
    }

    @Override // yads.fw1
    public final void b() {
        ow1 ow1Var = this.f80843c;
        if (ow1Var.f81168a && ow1Var.f81169b.isActive()) {
            nk.l lVar = ow1Var.f81169b;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
        }
    }

    public nw1(sw1 sw1Var, oj1 oj1Var, ow1 ow1Var) {
        this.f80841a = sw1Var;
        this.f80842b = oj1Var;
        this.f80843c = ow1Var;
    }
}
