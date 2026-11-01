package yi;

import ii.t;
import ii.u;
import ii.v;
import oi.o;

/* JADX INFO: compiled from: SingleMap.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c<T, R> extends t<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v<? extends T> f85752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o<? super T, ? extends R> f85753b;

    /* JADX INFO: compiled from: SingleMap.java */
    public static final class a<T, R> implements u<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u<? super R> f85754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o<? super T, ? extends R> f85755c;

        @Override // ii.u
        public void onError(Throwable th2) {
            this.f85754b.onError(th2);
        }

        @Override // ii.u
        public void onSubscribe(mi.b bVar) {
            this.f85754b.onSubscribe(bVar);
        }

        @Override // ii.u
        public void onSuccess(T t10) {
            try {
                this.f85754b.onSuccess(qi.a.e(this.f85755c.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                ni.a.b(th2);
                onError(th2);
            }
        }

        public a(u<? super R> uVar, o<? super T, ? extends R> oVar) {
            this.f85754b = uVar;
            this.f85755c = oVar;
        }
    }

    @Override // ii.t
    public void m(u<? super R> uVar) {
        this.f85752a.b(new a(uVar, this.f85753b));
    }

    public c(v<? extends T> vVar, o<? super T, ? extends R> oVar) {
        this.f85752a = vVar;
        this.f85753b = oVar;
    }
}
