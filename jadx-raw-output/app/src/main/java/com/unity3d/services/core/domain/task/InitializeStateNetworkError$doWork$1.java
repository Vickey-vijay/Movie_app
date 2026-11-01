package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateNetworkError.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", l = {33}, m = "doWork-gIAlu-s")
public final class InitializeStateNetworkError$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, c<? super InitializeStateNetworkError$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateNetworkError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3191doWorkgIAlus = this.this$0.m3191doWorkgIAlus((InitializeStateNetworkError.Params) null, (c<? super Result<r>>) this);
        return objM3191doWorkgIAlus == a.f() ? objM3191doWorkgIAlus : Result.m3457boximpl(objM3191doWorkgIAlus);
    }
}
