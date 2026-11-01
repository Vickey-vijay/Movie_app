package qk;

import kotlinx.coroutines.flow.CallbackFlowBuilder;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<T> implements c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f66585b;

        public a(Object obj) {
            this.f66585b = obj;
        }

        @Override // qk.c
        public Object collect(d<? super T> dVar, rj.c<? super mj.r> cVar) {
            Object objEmit = dVar.emit((Object) this.f66585b, cVar);
            return objEmit == sj.a.f() ? objEmit : mj.r.f64562a;
        }
    }

    public static final <T> c<T> a(bk.p<? super pk.n<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> c<T> b(bk.p<? super pk.n<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return new b(pVar, null, 0, null, 14, null);
    }

    public static final <T> c<T> c(bk.p<? super d<? super T>, ? super rj.c<? super mj.r>, ? extends Object> pVar) {
        return new o(pVar);
    }

    public static final <T> c<T> d(T t10) {
        return new a(t10);
    }
}
