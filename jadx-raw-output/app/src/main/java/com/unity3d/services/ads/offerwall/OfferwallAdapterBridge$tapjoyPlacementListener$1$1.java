package com.unity3d.services.ads.offerwall;

import bk.p;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import java.util.HashMap;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.k;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: OfferwallAdapterBridge.kt */
/* JADX INFO: loaded from: classes5.dex */
@d(c = "com.unity3d.services.ads.offerwall.OfferwallAdapterBridge$tapjoyPlacementListener$1$1", f = "OfferwallAdapterBridge.kt", l = {77, 83}, m = "invokeSuspend")
public final class OfferwallAdapterBridge$tapjoyPlacementListener$1$1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
    public final /* synthetic */ boolean $placementAvailable;
    public final /* synthetic */ String $placementName;
    public int label;
    public final /* synthetic */ OfferwallAdapterBridge this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferwallAdapterBridge$tapjoyPlacementListener$1$1(boolean z10, OfferwallAdapterBridge offerwallAdapterBridge, String str, c<? super OfferwallAdapterBridge$tapjoyPlacementListener$1$1> cVar) {
        super(2, cVar);
        this.$placementAvailable = z10;
        this.this$0 = offerwallAdapterBridge;
        this.$placementName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<r> create(Object obj, c<?> cVar) {
        return new OfferwallAdapterBridge$tapjoyPlacementListener$1$1(this.$placementAvailable, this.this$0, this.$placementName, cVar);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
        return ((OfferwallAdapterBridge$tapjoyPlacementListener$1$1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        Object objF = sj.a.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        } else {
            kotlin.c.b(obj);
            if (this.$placementAvailable) {
                k kVar = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent = OfferwallEvent.REQUEST_SUCCESS;
                String str3 = this.$placementName;
                if (str3 == null) {
                    str2 = "";
                } else {
                    str2 = str3;
                }
                OfferwallEventData offerwallEventData = new OfferwallEventData(offerwallEvent, str2, null, null, 12, null);
                this.label = 1;
                if (kVar.emit(offerwallEventData, this) == objF) {
                    return objF;
                }
            } else {
                HashMap map = this.this$0.placementsMap;
                String str4 = this.$placementName;
                if (str4 == null) {
                    str4 = "";
                }
                map.remove(str4);
                k kVar2 = this.this$0._offerwallEventFlow;
                OfferwallEvent offerwallEvent2 = OfferwallEvent.REQUEST_FAILED;
                String str5 = this.$placementName;
                if (str5 == null) {
                    str = "";
                } else {
                    str = str5;
                }
                OfferwallEventData offerwallEventData2 = new OfferwallEventData(offerwallEvent2, str, null, null, 12, null);
                this.label = 2;
                if (kVar2.emit(offerwallEventData2, this) == objF) {
                    return objF;
                }
            }
        }
        return r.f64562a;
    }
}
