package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omGetData$1", f = "CommonAdViewerExposedFunctions.kt", l = {367}, m = "invoke")
public final class CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommonAdViewerExposedFunctionsKt.C39181 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1(CommonAdViewerExposedFunctionsKt.C39181 c39181, c<? super CommonAdViewerExposedFunctionsKt$omGetData$1$invoke$1> cVar) {
        super(cVar);
        this.this$0 = c39181;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (c<Object>) this);
    }
}
