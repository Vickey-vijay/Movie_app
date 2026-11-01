package kk;

import java.util.Iterator;

/* JADX INFO: compiled from: Sequences.kt */
/* JADX INFO: loaded from: classes10.dex */
public class r extends m {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    public static final class a<T> implements i<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f62867a;

        public a(Iterator it) {
            this.f62867a = it;
        }

        @Override // kk.i
        public Iterator<T> iterator() {
            return this.f62867a;
        }
    }

    public static final Object m(Object obj) {
        return obj;
    }

    public static final Object r(Object obj) {
        return obj;
    }

    public static final <T> i<T> g(Iterator<? extends T> it) {
        ck.p.j(it, "<this>");
        return h(new a(it));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<T> h(i<? extends T> iVar) {
        ck.p.j(iVar, "<this>");
        return iVar instanceof kk.a ? iVar : new kk.a(iVar);
    }

    public static final <T> i<T> i() {
        return d.f62834a;
    }

    public static final <T> i<T> j(i<? extends i<? extends T>> iVar) {
        ck.p.j(iVar, "<this>");
        return k(iVar, new bk.l() { // from class: kk.n
            @Override // bk.l
            public final Object invoke(Object obj) {
                return r.l((i) obj);
            }
        });
    }

    public static final <T, R> i<R> k(i<? extends T> iVar, bk.l<? super T, ? extends Iterator<? extends R>> lVar) {
        return iVar instanceof y ? ((y) iVar).e(lVar) : new f(iVar, new bk.l() { // from class: kk.q
            @Override // bk.l
            public final Object invoke(Object obj) {
                return r.m(obj);
            }
        }, lVar);
    }

    public static final Iterator l(i iVar) {
        ck.p.j(iVar, "it");
        return iVar.iterator();
    }

    public static final <T> i<T> n(final bk.a<? extends T> aVar) {
        ck.p.j(aVar, "nextFunction");
        return h(new g(aVar, new bk.l() { // from class: kk.o
            @Override // bk.l
            public final Object invoke(Object obj) {
                return r.q(aVar, obj);
            }
        }));
    }

    public static final <T> i<T> o(bk.a<? extends T> aVar, bk.l<? super T, ? extends T> lVar) {
        ck.p.j(aVar, "seedFunction");
        ck.p.j(lVar, "nextFunction");
        return new g(aVar, lVar);
    }

    public static final <T> i<T> p(final T t10, bk.l<? super T, ? extends T> lVar) {
        ck.p.j(lVar, "nextFunction");
        return t10 == null ? d.f62834a : new g(new bk.a() { // from class: kk.p
            @Override // bk.a
            public final Object invoke() {
                return r.r(t10);
            }
        }, lVar);
    }

    public static final Object q(bk.a aVar, Object obj) {
        ck.p.j(obj, "it");
        return aVar.invoke();
    }

    public static final <T> i<T> s(T... tArr) {
        ck.p.j(tArr, "elements");
        return nj.n.y(tArr);
    }
}
