package kotlinx.coroutines.flow;

import bk.q;
import kotlinx.coroutines.flow.internal.CombineKt;
import mj.r;
import qk.c;
import qk.d;

/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__ZipKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    public static final class a<R> implements c<R> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f63125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f63126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q f63127d;

        @Override // qk.c
        public Object collect(d<? super R> dVar, rj.c<? super r> cVar) {
            Object objA = CombineKt.a(dVar, new c[]{this.f63125b, this.f63126c}, FlowKt__ZipKt.c(), new FlowKt__ZipKt$combine$1$1(this.f63127d, null), cVar);
            return objA == sj.a.f() ? objA : r.f64562a;
        }

        public a(c cVar, c cVar2, q qVar) {
            this.f63125b = cVar;
            this.f63126c = cVar2;
            this.f63127d = qVar;
        }
    }

    /* JADX INFO: compiled from: Zip.kt */
    public static final class b implements bk.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f63128b = new b();

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final <T1, T2, R> c<R> b(c<? extends T1> cVar, c<? extends T2> cVar2, q<? super T1, ? super T2, ? super rj.c<? super R>, ? extends Object> qVar) {
        return new a(cVar, cVar2, qVar);
    }

    public static final <T> bk.a<T[]> c() {
        return b.f63128b;
    }
}
