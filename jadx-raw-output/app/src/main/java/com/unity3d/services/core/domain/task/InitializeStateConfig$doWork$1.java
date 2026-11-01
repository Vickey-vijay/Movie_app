package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
@d(c = "com.unity3d.services.core.domain.task.InitializeStateConfig", f = "InitializeStateConfig.kt", l = {24}, m = "doWork-gIAlu-s")
public final class InitializeStateConfig$doWork$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, c<? super InitializeStateConfig$doWork$1> cVar) {
        super(cVar);
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM3184doWorkgIAlus = this.this$0.m3184doWorkgIAlus((InitializeStateConfig.Params) null, (c<? super Result<? extends Configuration>>) this);
        return objM3184doWorkgIAlus == a.f() ? objM3184doWorkgIAlus : Result.m3457boximpl(objM3184doWorkgIAlus);
    }
}
