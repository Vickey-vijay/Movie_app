package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omStartSession$1", f = "CommonAdViewerExposedFunctions.kt", l = {354}, m = "invoke")
public final class CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommonAdViewerExposedFunctionsKt.C39201 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1(CommonAdViewerExposedFunctionsKt.C39201 c39201, c<? super CommonAdViewerExposedFunctionsKt$omStartSession$1$invoke$1> cVar) {
        super(cVar);
        this.this$0 = c39201;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (c<? super r>) this);
    }
}
