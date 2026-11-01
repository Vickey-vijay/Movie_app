package com.unity3d.services.core.domain.task;

import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", l = {32}, m = "doWork-gIAlu-s")
public final class InitializeStateLoadCache$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, c<? super InitializeStateLoadCache$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateLoadCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3189doWorkgIAlus = this.this$0.m3189doWorkgIAlus((InitializeStateLoadCache.Params) null, (c<? super Result<InitializeStateLoadCache.LoadCacheResult>>) this);
        return objM3189doWorkgIAlus == a.f() ? objM3189doWorkgIAlus : Result.m3457boximpl(objM3189doWorkgIAlus);
    }
}
