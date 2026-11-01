package nk;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface l<T> extends rj.c<T> {
    Object D(Throwable th2);

    void K(T t10, bk.l<? super Throwable, mj.r> lVar);

    <R extends T> void M(R r10, bk.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, mj.r> qVar);

    boolean d();

    @Override // rj.c
    /* synthetic */ kotlin.coroutines.d getContext();

    boolean isActive();

    boolean j(Throwable th2);

    void p(bk.l<? super Throwable, mj.r> lVar);

    <R extends T> Object r(R r10, Object obj, bk.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, mj.r> qVar);

    void x(Object obj);

    void z(h0 h0Var, T t10);
}
