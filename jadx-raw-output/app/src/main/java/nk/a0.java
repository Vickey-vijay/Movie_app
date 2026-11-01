package nk;

import kotlin.Result;

/* JADX INFO: compiled from: CompletionState.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class a0 {
    public static final <T> Object a(Object obj, rj.c<? super T> cVar) {
        if (!(obj instanceof z)) {
            return Result.m3458constructorimpl(obj);
        }
        Result.a aVar = Result.Companion;
        return Result.m3458constructorimpl(kotlin.c.a(((z) obj).f64844a));
    }

    public static final <T> Object b(Object obj) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl != null) {
            return new z(thM3461exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }

    public static final <T> Object c(Object obj, l<?> lVar) {
        Throwable thM3461exceptionOrNullimpl = Result.m3461exceptionOrNullimpl(obj);
        if (thM3461exceptionOrNullimpl != null) {
            return new z(thM3461exceptionOrNullimpl, false, 2, null);
        }
        return obj;
    }
}
