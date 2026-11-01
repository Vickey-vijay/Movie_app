package com.unity3d.ads.core.domain.exposure;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonAdViewerExposedFunctions.kt */
/* JADX INFO: loaded from: classes.dex */
@d(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$loadScarAd$1", f = "CommonAdViewerExposedFunctions.kt", l = {398}, m = "invoke")
public final class CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1 extends ContinuationImpl {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ CommonAdViewerExposedFunctionsKt.C39151 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1(CommonAdViewerExposedFunctionsKt.C39151 c39151, c<? super CommonAdViewerExposedFunctionsKt$loadScarAd$1$invoke$1> cVar) {
        super(cVar);
        this.this$0 = c39151;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke2((Object[]) null, (c<? super r>) this);
    }
}
