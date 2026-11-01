package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes4.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
public final class InitializeStateReset$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, c<? super InitializeStateReset$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3192doWorkgIAlus$suspendImpl = InitializeStateReset.m3192doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM3192doWorkgIAlus$suspendImpl == a.f() ? objM3192doWorkgIAlus$suspendImpl : Result.m3457boximpl(objM3192doWorkgIAlus$suspendImpl);
    }
}
