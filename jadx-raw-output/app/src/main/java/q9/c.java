package q9;

import ii.t;
import ii.v;
import oi.o;

/* JADX INFO: compiled from: RxUtils.java */
/* JADX INFO: loaded from: classes10.dex */
public class c {

    /* JADX INFO: compiled from: RxUtils.java */
    public static class a<T> implements o<Throwable, t<T>> {
        public a() {
        }

        @Override // oi.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<T> apply(Throwable th2) {
            return t.f(q9.a.a(th2));
        }
    }

    public static <T> t<T> a(t<T> tVar) {
        return tVar.j(new a());
    }

    public static <T> v<T> b(t<T> tVar) {
        return tVar.n(gj.a.b()).i(li.a.a());
    }
}
