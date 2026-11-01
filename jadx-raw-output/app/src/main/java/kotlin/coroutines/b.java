package kotlin.coroutines;

import bk.l;
import ck.p;
import com.ironsource.C3426d4;
import kotlin.coroutines.d.b;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<d.b, E> f62990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d.c<?> f62991c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.d$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [bk.l<? super kotlin.coroutines.d$b, ? extends E extends B>, bk.l<kotlin.coroutines.d$b, E extends B>, java.lang.Object] */
    public b(d.c<B> cVar, l<? super d.b, ? extends E> lVar) {
        p.j(cVar, "baseKey");
        p.j(lVar, "safeCast");
        this.f62990b = lVar;
        this.f62991c = cVar instanceof b ? (d.c<B>) ((b) cVar).f62991c : cVar;
    }

    public final boolean a(d.c<?> cVar) {
        p.j(cVar, C3426d4.i.W);
        return cVar == this || this.f62991c == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lkotlin/coroutines/d$b;)TE; */
    public final d.b b(d.b bVar) {
        p.j(bVar, "element");
        return (d.b) this.f62990b.invoke(bVar);
    }
}
