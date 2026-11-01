package kotlinx.serialization.internal;

import ak.a;
import bk.l;
import bl.d1;
import bl.m;
import bl.s;
import bl.z1;
import ck.p;
import com.ironsource.C3426d4;
import jk.c;
import xk.b;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class ClassValueCache<T> implements z1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<c<?>, b<T>> f63250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s<m<T>> f63251b;

    /* JADX WARN: Multi-variable type inference failed */
    public ClassValueCache(l<? super c<?>, ? extends b<T>> lVar) {
        p.j(lVar, "compute");
        this.f63250a = lVar;
        this.f63251b = new s<>();
    }

    @Override // bl.z1
    public b<T> a(final c<Object> cVar) {
        p.j(cVar, C3426d4.i.W);
        m<T> mVar = this.f63251b.get(a.a(cVar));
        p.i(mVar, "get(key)");
        d1 d1Var = (d1) mVar;
        T t10 = d1Var.f5396a.get();
        if (t10 == null) {
            t10 = (T) d1Var.a(new bk.a<T>() { // from class: kotlinx.serialization.internal.ClassValueCache$get$$inlined$getOrSet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final T invoke() {
                    return (T) new m(this.this$0.b().invoke(cVar));
                }
            });
        }
        return t10.f5438a;
    }

    public final l<c<?>, b<T>> b() {
        return this.f63250a;
    }
}
