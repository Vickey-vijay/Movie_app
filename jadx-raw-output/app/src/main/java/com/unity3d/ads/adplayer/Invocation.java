package com.unity3d.ads.adplayer;

import bk.l;
import bk.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import nk.p0;
import nk.u;
import nk.w;
import tj.d;

/* JADX INFO: compiled from: Invocation.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class Invocation {
    private final u<r> _isHandled;
    private final u<Object> completableDeferred;
    private final String location;
    private final Object[] parameters;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$2, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @d(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements l<rj.c<? super r>, Object> {
        public int label;

        public AnonymousClass2(rj.c<? super AnonymousClass2> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(rj.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // bk.l
        public final Object invoke(rj.c<? super r> cVar) {
            return ((AnonymousClass2) create(cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.Invocation$handle$3, reason: invalid class name */
    /* JADX INFO: compiled from: Invocation.kt */
    @d(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ l<rj.c<Object>, Object> $handler;
        public int label;
        public final /* synthetic */ Invocation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(l<? super rj.c<Object>, ? extends Object> lVar, Invocation invocation, rj.c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$handler = lVar;
            this.this$0 = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return new AnonymousClass3(this.$handler, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    l<rj.c<Object>, Object> lVar = this.$handler;
                    this.label = 1;
                    obj = lVar.invoke(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                this.this$0.completableDeferred.i(obj);
            } catch (Throwable th2) {
                this.this$0.completableDeferred.g(th2);
            }
            return r.f64562a;
        }
    }

    public Invocation(String str, Object[] objArr) {
        ck.p.j(str, "location");
        ck.p.j(objArr, "parameters");
        this.location = str;
        this.parameters = objArr;
        this._isHandled = w.c(null, 1, null);
        this.completableDeferred = w.c(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object handle$default(Invocation invocation, l lVar, rj.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new AnonymousClass2(null);
        }
        return invocation.handle(lVar, cVar);
    }

    public final String getLocation() {
        return this.location;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }

    public final Object getResult(rj.c<Object> cVar) {
        return this.completableDeferred.y(cVar);
    }

    public final Object handle(l<? super rj.c<Object>, ? extends Object> lVar, rj.c<? super r> cVar) {
        u<r> uVar = this._isHandled;
        r rVar = r.f64562a;
        uVar.i(rVar);
        j.d(kotlinx.coroutines.d.a(cVar.getContext()), null, null, new AnonymousClass3(lVar, this, null), 3, null);
        return rVar;
    }

    public final p0<r> isHandled() {
        return this._isHandled;
    }
}
