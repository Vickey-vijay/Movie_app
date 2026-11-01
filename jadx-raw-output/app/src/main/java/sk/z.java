package sk;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Scopes.kt */
/* JADX INFO: loaded from: classes9.dex */
public class z<T> extends kotlinx.coroutines.a<T> implements tj.c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rj.c<T> f71995e;

    /* JADX WARN: Multi-variable type inference failed */
    public z(kotlin.coroutines.d dVar, rj.c<? super T> cVar) {
        super(dVar, true, true);
        this.f71995e = cVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean A0() {
        return true;
    }

    public void i1() {
    }

    @Override // kotlinx.coroutines.JobSupport
    public void V(Object obj) {
        h.b(IntrinsicsKt__IntrinsicsJvmKt.c(this.f71995e), nk.a0.a(obj, this.f71995e));
    }

    @Override // kotlinx.coroutines.a
    public void e1(Object obj) {
        rj.c<T> cVar = this.f71995e;
        cVar.resumeWith(nk.a0.a(obj, cVar));
    }

    @Override // tj.c
    public final tj.c getCallerFrame() {
        rj.c<T> cVar = this.f71995e;
        if (cVar instanceof tj.c) {
            return (tj.c) cVar;
        }
        return null;
    }
}
