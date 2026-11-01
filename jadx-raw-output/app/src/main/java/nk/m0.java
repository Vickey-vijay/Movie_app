package nk;

import kotlin.Result;

/* JADX INFO: compiled from: DebugStrings.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m0 {
    public static final String c(rj.c<?> cVar) {
        Object objM3458constructorimpl;
        if (cVar instanceof sk.g) {
            return ((sk.g) cVar).toString();
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(cVar + '@' + b(cVar));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
        }
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
            objM3458constructorimpl = cVar.getClass().getName() + '@' + b(cVar);
        }
        return (String) objM3458constructorimpl;
    }

    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
