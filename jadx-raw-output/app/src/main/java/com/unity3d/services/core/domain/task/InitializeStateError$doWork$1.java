package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", l = {27}, m = "doWork-gIAlu-s")
public final class InitializeStateError$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateError$doWork$1(InitializeStateError initializeStateError, c<? super InitializeStateError$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3188doWorkgIAlus = this.this$0.m3188doWorkgIAlus((InitializeStateError.Params) null, (c<? super Result<r>>) this);
        return objM3188doWorkgIAlus == a.f() ? objM3188doWorkgIAlus : Result.m3457boximpl(objM3188doWorkgIAlus);
    }
}
