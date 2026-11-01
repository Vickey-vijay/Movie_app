package tk;

import bk.p;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.DispatchException;
import mj.r;
import rj.c;
import sk.h;

/* JADX INFO: compiled from: Cancellable.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static final void a(c<?> cVar, Throwable th2) throws Throwable {
        if (th2 instanceof DispatchException) {
            th2 = ((DispatchException) th2).getCause();
        }
        Result.a aVar = Result.Companion;
        cVar.resumeWith(Result.m3458constructorimpl(kotlin.c.a(th2)));
        throw th2;
    }

    public static final <R, T> void b(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, c<? super T> cVar) {
        try {
            c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(IntrinsicsKt__IntrinsicsJvmKt.a(pVar, r10, cVar));
            Result.a aVar = Result.Companion;
            h.b(cVarC, Result.m3458constructorimpl(r.f64562a));
        } catch (Throwable th2) {
            a(cVar, th2);
        }
    }

    public static final void c(c<? super r> cVar, c<?> cVar2) throws Throwable {
        try {
            c cVarC = IntrinsicsKt__IntrinsicsJvmKt.c(cVar);
            Result.a aVar = Result.Companion;
            h.b(cVarC, Result.m3458constructorimpl(r.f64562a));
        } catch (Throwable th2) {
            a(cVar2, th2);
        }
    }
}
