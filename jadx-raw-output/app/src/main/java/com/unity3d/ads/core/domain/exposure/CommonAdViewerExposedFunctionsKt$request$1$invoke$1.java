package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$request$1", f = "CommonAdViewerExposedFunctions.kt", l = {439}, m = "invoke")
public final class CommonAdViewerExposedFunctionsKt$request$1$invoke$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommonAdViewerExposedFunctionsKt.C39241 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$request$1$invoke$1(CommonAdViewerExposedFunctionsKt.C39241 c39241, c<? super CommonAdViewerExposedFunctionsKt$request$1$invoke$1> cVar) {
        super(cVar);
        this.this$0 = c39241;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (c<Object>) this);
    }
}
