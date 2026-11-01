package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {40}, m = "doWork-gIAlu-s")
public final class InitializeSDK$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$1(InitializeSDK initializeSDK, c<? super InitializeSDK$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3182doWorkgIAlus = this.this$0.m3182doWorkgIAlus((EmptyParams) null, (c<? super Result<r>>) this);
        return objM3182doWorkgIAlus == a.f() ? objM3182doWorkgIAlus : Result.m3457boximpl(objM3182doWorkgIAlus);
    }
}
