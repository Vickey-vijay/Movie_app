package com.unity3d.services.core.extensions;

import bk.l;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CoroutineExtensions.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$1$1$1", f = "CoroutineExtensions.kt", l = {41}, m = "invokeSuspend")
public final class CoroutineExtensionsKt$memoize$2$deferred$1$1$1<T> extends SuspendLambda implements p<l0, c<? super T>, Object> {
    public final /* synthetic */ l<c<? super T>, Object> $action;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2$deferred$1$1$1(l<? super c<? super T>, ? extends Object> lVar, c<? super CoroutineExtensionsKt$memoize$2$deferred$1$1$1> cVar) {
        super(2, cVar);
        this.$action = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(this.$action, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super T> cVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$1$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke(this);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            l<c<? super T>, Object> lVar = this.$action;
            this.label = 1;
            obj = lVar.invoke(this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
