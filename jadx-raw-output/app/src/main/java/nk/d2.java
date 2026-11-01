package nk;

import kotlin.Result;

/* JADX INFO: compiled from: JobSupport.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d2<T> extends u1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.c<T> f64784f;

    @Override // nk.u1
    public boolean u() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d2(kotlinx.coroutines.c<? super T> cVar) {
        this.f64784f = cVar;
    }

    @Override // nk.u1
    public void v(Throwable th2) {
        Object objT0 = t().t0();
        if (objT0 instanceof z) {
            kotlinx.coroutines.c<T> cVar = this.f64784f;
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(((z) objT0).f64844a)));
        } else {
            kotlinx.coroutines.c<T> cVar2 = this.f64784f;
            Result.a aVar2 = Result.Companion;
            cVar2.resumeWith(Result.m3458constructorimpl(v1.h(objT0)));
        }
    }
}
