package wk;

import mj.r;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface a {

    /* JADX INFO: renamed from: wk.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Mutex.kt */
    public static final class C0783a {
        public static /* synthetic */ Object a(a aVar, Object obj, rj.c cVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj, cVar);
        }

        public static /* synthetic */ void b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.b(obj);
        }
    }

    Object a(Object obj, rj.c<? super r> cVar);

    void b(Object obj);
}
