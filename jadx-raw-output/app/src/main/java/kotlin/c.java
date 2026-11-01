package kotlin;

import ck.p;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class c {
    public static final Object a(Throwable th2) {
        p.j(th2, "exception");
        return new Result.Failure(th2);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }
}
