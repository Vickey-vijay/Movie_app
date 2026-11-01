package yads;

import kotlin.Result;

/* JADX INFO: loaded from: classes10.dex */
public final class y10 implements nk.i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rm0 f84784b;

    @Override // kotlin.coroutines.d.b
    public final kotlin.coroutines.d.c getKey() {
        return nk.i0.F8;
    }

    @Override // nk.i0
    public final void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        try {
            Result.a aVar = Result.Companion;
            String message = th2.getMessage();
            if (message == null) {
                message = "Unknown";
            }
            boolean z10 = ad1.f75480a;
            this.f84784b.reportError(message, th2);
            Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th3) {
            Result.a aVar2 = Result.Companion;
            Result.m3458constructorimpl(kotlin.c.a(th3));
        }
    }

    public y10(rm0 rm0Var) {
        this.f84784b = rm0Var;
    }

    @Override // kotlin.coroutines.d
    public final Object fold(Object obj, bk.p pVar) {
        return nk.i0.a.a(this, obj, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public final kotlin.coroutines.d.b get(kotlin.coroutines.d.c cVar) {
        return nk.i0.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(kotlin.coroutines.d.c cVar) {
        return nk.i0.a.c(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return nk.i0.a.d(this, dVar);
    }
}
