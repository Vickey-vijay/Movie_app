package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateComplete.kt */
/* JADX INFO: loaded from: classes6.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", l = {21}, m = "doWork-gIAlu-s")
public final class InitializeStateComplete$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateComplete this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, c<? super InitializeStateComplete$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateComplete;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3183doWorkgIAlus = this.this$0.m3183doWorkgIAlus((InitializeStateComplete.Params) null, (c<? super Result<r>>) this);
        return objM3183doWorkgIAlus == a.f() ? objM3183doWorkgIAlus : Result.m3457boximpl(objM3183doWorkgIAlus);
    }
}
