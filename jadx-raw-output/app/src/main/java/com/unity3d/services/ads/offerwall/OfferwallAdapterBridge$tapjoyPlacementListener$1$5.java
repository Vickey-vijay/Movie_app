package com.unity3d.services.ads.offerwall;

import bk.p;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.k;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: OfferwallAdapterBridge.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$5", f = "OfferwallAdapterBridge.kt", l = {140}, m = "invokeSuspend")
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$5 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ String $placementName;
    public int label;
    public final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$5(OfferwallAdapterBridge offerwallAdapterBridge, String str, c<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$5> cVar) {
        super(2, cVar);
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$5(this.this$0, this.$placementName, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$5) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                kotlin.c.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.c.b(obj);
            k kVar = this.this$0._offerwallEventFlow;
            OfferwallEvent offerwallEvent = OfferwallEvent.ON_CONTENT_DISMISS;
            String str = this.$placementName;
            if (str == null) {
                str = "";
            }
            OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str, null, null, 12, null);
            this.label = 1;
            if (kVar.emit(offerwallEventData, this) == objF) {
                return objF;
            }
        }
        return r.f64562a;
    }
}
