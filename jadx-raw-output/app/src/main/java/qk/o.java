package qk;

import kotlinx.coroutines.flow.AbstractFlow;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class o<T> extends AbstractFlow<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.p<d<? super T>, rj.c<? super mj.r>, Object> f66592b;

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object c(d<? super T> dVar, rj.c<? super mj.r> cVar) {
        Object objMo1invoke = this.f66592b.mo1invoke(dVar, cVar);
        return objMo1invoke == sj.a.f() ? objMo1invoke : mj.r.f64562a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(bk.p<? super d<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        this.f66592b = pVar;
    }
}
