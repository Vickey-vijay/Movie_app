package sk;

import kotlinx.coroutines.internal.UndeliveredElementException;

/* JADX INFO: compiled from: OnUndeliveredElement.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class w {
    public static final <E> void a(bk.l<? super E, mj.r> lVar, E e10, kotlin.coroutines.d dVar) {
        UndeliveredElementException undeliveredElementExceptionB = b(lVar, e10, null);
        if (undeliveredElementExceptionB != null) {
            nk.j0.a(dVar, undeliveredElementExceptionB);
        }
    }

    public static /* synthetic */ UndeliveredElementException c(bk.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return b(lVar, obj, undeliveredElementException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException b(bk.l<? super E, mj.r> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th2) {
            if (undeliveredElementException != null && undeliveredElementException.getCause() != th2) {
                mj.d.a(undeliveredElementException, th2);
            } else {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th2);
            }
        }
        return undeliveredElementException;
    }
}
