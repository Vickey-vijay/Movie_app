package sk;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f71934a = new d0("CLOSED");

    public static final <S extends a0<S>> Object c(S s10, long j10, bk.p<? super Long, ? super S, ? extends S> pVar) {
        while (true) {
            if (s10.f71936d >= j10 && !s10.k()) {
                return b0.a(s10);
            }
            Object objG = s10.g();
            if (objG == f71934a) {
                return b0.a(f71934a);
            }
            S sMo1invoke = (S) ((b) objG);
            if (sMo1invoke == null) {
                sMo1invoke = pVar.mo1invoke(Long.valueOf(s10.f71936d + 1), s10);
                if (s10.o(sMo1invoke)) {
                    if (s10.k()) {
                        s10.n();
                    }
                }
            }
            s10 = (Object) sMo1invoke;
        }
    }

    public static final <N extends b<N>> N b(N n10) {
        while (true) {
            Object objG = n10.g();
            if (objG == f71934a) {
                return n10;
            }
            b bVar = (b) objG;
            if (bVar == null) {
                if (n10.m()) {
                    return n10;
                }
            } else {
                n10 = (N) bVar;
            }
        }
    }
}
