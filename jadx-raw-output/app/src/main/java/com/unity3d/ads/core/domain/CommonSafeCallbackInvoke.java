package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.services.core.misc.Utilities;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h0;
import nk.j;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonSafeCallbackInvoke.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonSafeCallbackInvoke implements SafeCallbackInvoke {
    private final h0 mainDispatcher;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonSafeCallbackInvoke.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonSafeCallbackInvoke$invoke$1", f = "CommonSafeCallbackInvoke.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ bk.a<r> $block;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(bk.a<r> aVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$block = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$block, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                final bk.a<r> aVar = this.$block;
                Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.core.domain.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        aVar.invoke();
                    }
                });
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public CommonSafeCallbackInvoke(h0 h0Var) {
        ck.p.j(h0Var, "mainDispatcher");
        this.mainDispatcher = h0Var;
    }

    @Override // com.unity3d.ads.core.domain.SafeCallbackInvoke
    public void invoke(bk.a<r> aVar) {
        ck.p.j(aVar, "block");
        j.d(kotlinx.coroutines.d.a(this.mainDispatcher), null, null, new AnonymousClass1(aVar, null), 3, null);
    }
}
