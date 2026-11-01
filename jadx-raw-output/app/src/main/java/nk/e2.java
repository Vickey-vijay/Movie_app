package nk;

import kotlin.Result;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class e2 extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final rj.c<mj.r> f64785f;

    @Override // nk.u1
    public boolean u() {
        return false;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        rj.c<mj.r> cVar = this.f64785f;
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m3458constructorimpl(mj.r.f64562a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e2(rj.c<? super mj.r> cVar) {
        this.f64785f = cVar;
    }
}
