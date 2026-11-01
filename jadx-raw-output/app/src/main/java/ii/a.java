package ii;

/* JADX INFO: compiled from: Completable.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements c {
    public abstract void f(b bVar);

    public static a c(c... cVarArr) {
        qi.a.e(cVarArr, "sources is null");
        if (cVarArr.length == 0) {
            return d();
        }
        return cVarArr.length == 1 ? h(cVarArr[0]) : ej.a.l(new ti.a(cVarArr, null));
    }

    public static a d() {
        return ej.a.l(ti.b.f72417a);
    }

    public static a e(Throwable th2) {
        qi.a.e(th2, "error is null");
        return ej.a.l(new ti.c(th2));
    }

    public static NullPointerException g(Throwable th2) {
        NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
        nullPointerException.initCause(th2);
        return nullPointerException;
    }

    public static a h(c cVar) {
        qi.a.e(cVar, "source is null");
        return cVar instanceof a ? ej.a.l((a) cVar) : ej.a.l(new ti.d(cVar));
    }

    @Override // ii.c
    public final void b(b bVar) {
        qi.a.e(bVar, "s is null");
        try {
            b bVarV = ej.a.v(this, bVar);
            qi.a.e(bVarV, "The RxJavaPlugins.onSubscribe hook returned a null CompletableObserver. Please check the handler provided to RxJavaPlugins.setOnCompletableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            f(bVarV);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            ej.a.s(th2);
            throw g(th2);
        }
    }
}
