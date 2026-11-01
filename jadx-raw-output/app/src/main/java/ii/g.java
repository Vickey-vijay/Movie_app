package ii;

import io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe;

/* JADX INFO: compiled from: Maybe.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class g<T> implements i<T> {
    public abstract void d(h<? super T> hVar);

    @Override // ii.i
    public final void b(h<? super T> hVar) {
        qi.a.e(hVar, "observer is null");
        h<? super T> hVarW = ej.a.w(this, hVar);
        qi.a.e(hVarW, "The RxJavaPlugins.onSubscribe hook returned a null MaybeObserver. Please check the handler provided to RxJavaPlugins.setOnMaybeSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
        try {
            d(hVarW);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th2) {
            ni.a.b(th2);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th2);
            throw nullPointerException;
        }
    }

    public final T c() {
        si.f fVar = new si.f();
        b(fVar);
        return (T) fVar.a();
    }

    public final <U> g<T> e(i<U> iVar) {
        qi.a.e(iVar, "other is null");
        return ej.a.n(new MaybeTakeUntilMaybe(this, iVar));
    }
}
