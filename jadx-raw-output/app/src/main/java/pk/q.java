package pk;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface q<E> {

    /* JADX INFO: compiled from: Channel.kt */
    public static final class a {
        public static /* synthetic */ boolean a(q qVar, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
            }
            if ((i10 & 1) != 0) {
                th2 = null;
            }
            return qVar.J(th2);
        }
    }

    void C(bk.l<? super Throwable, mj.r> lVar);

    boolean J(Throwable th2);

    Object n(E e10);

    Object u(E e10, rj.c<? super mj.r> cVar);

    boolean w();
}
