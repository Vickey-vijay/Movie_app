package com.unity3d.ads.core.data.repository;

import bk.p;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$nativeConfiguration$1", f = "AndroidSessionRepository.kt", l = {178}, m = "invokeSuspend")
public final class AndroidSessionRepository$nativeConfiguration$1 extends SuspendLambda implements p<l0, c<? super NativeConfigurationOuterClass.NativeConfiguration>, Object> {
    public int label;
    public final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSessionRepository$nativeConfiguration$1(AndroidSessionRepository androidSessionRepository, c<? super AndroidSessionRepository$nativeConfiguration$1> cVar) {
        super(2, cVar);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new AndroidSessionRepository$nativeConfiguration$1(this.this$0, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super NativeConfigurationOuterClass.NativeConfiguration> cVar) {
        return ((AndroidSessionRepository$nativeConfiguration$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            qk.c cVar = this.this$0.persistedNativeConfiguration;
            this.label = 1;
            obj = e.r(cVar, this);
            if (obj == objF) {
                return objF;
            }
        }
        return obj;
    }
}
