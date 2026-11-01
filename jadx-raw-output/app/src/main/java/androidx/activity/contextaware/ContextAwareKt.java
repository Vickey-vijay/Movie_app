package androidx.activity.contextaware;

import android.content.Context;
import bk.l;
import ck.n;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import mj.r;
import rj.c;
import sj.a;
import tj.f;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, l<Context, R> lVar, c<R> cVar) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cVar2, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cVar2.p(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object objB = cVar2.B();
        if (objB == a.f()) {
            f.c(cVar);
        }
        return objB;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, l<Context, R> lVar, c<R> cVar) {
        Context contextPeekAvailableContext = contextAware.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        n.c(0);
        kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
        cVar2.J();
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(cVar2, lVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        cVar2.p(new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        r rVar = r.f64562a;
        Object objB = cVar2.B();
        if (objB == a.f()) {
            f.c(cVar);
        }
        n.c(1);
        return objB;
    }
}
