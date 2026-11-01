package com.unity3d.ads.core.domain.scar;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nj.b0;
import nj.q0;
import nk.j;
import nk.l0;
import qk.e;
import qk.k;
import qk.p;
import qk.q;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: CommonScarEventReceiver.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CommonScarEventReceiver implements IEventSender {
    private final k<GmaEventData> _gmaEventFlow;
    private final k<String> _versionFlow;
    private final p<GmaEventData> gmaEventFlow;
    private final l0 scope;
    private final p<String> versionFlow;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonScarEventReceiver.kt */
    @d(c = "com.unity3d.ads.core.domain.scar.CommonScarEventReceiver$sendEvent$1", f = "CommonScarEventReceiver.kt", l = {35, 41, 52, 66, 73}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ Enum<?> $eventId;
        public final /* synthetic */ Object[] $params;
        public int label;
        public final /* synthetic */ CommonScarEventReceiver this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Enum<?> r10, Object[] objArr, CommonScarEventReceiver commonScarEventReceiver, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$eventId = r10;
            this.$params = objArr;
            this.this$0 = commonScarEventReceiver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$eventId, this.$params, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x0104  */
        /* JADX WARN: Code duplicated, block: B:42:0x0133 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            k kVar;
            GmaEventData gmaEventData;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        kotlin.c.b(obj);
                        if (this.$eventId instanceof BannerBridge.BannerEvent) {
                            kVar = this.this$0._gmaEventFlow;
                            GMAEvent gMAEvent = GMAEvent.BANNER;
                            BannerBridge.BannerEvent bannerEvent = (BannerBridge.BannerEvent) this.$eventId;
                            Object obj2 = this.$params[0];
                            ck.p.h(obj2, "null cannot be cast to non-null type kotlin.String");
                            gmaEventData = new GmaEventData(gMAEvent, bannerEvent, (String) obj2, null, null, null, null, 120, null);
                            this.label = 5;
                            if (kVar.emit(gmaEventData, this) == objF) {
                                return objF;
                            }
                        }
                    } else if (i10 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                kotlin.c.b(obj);
            } else {
                kotlin.c.b(obj);
                Enum<?> r10 = this.$eventId;
                if (r10 == GMAEvent.VERSION) {
                    Object[] objArr = this.$params;
                    CommonScarEventReceiver commonScarEventReceiver = this.this$0;
                    String str = (String) objArr[0];
                    k kVar2 = commonScarEventReceiver._versionFlow;
                    if (!(!ck.p.e(str, "0.0.0"))) {
                        str = null;
                    }
                    this.label = 1;
                    if (kVar2.emit(str, this) == objF) {
                        return objF;
                    }
                } else {
                    GMAEvent gMAEvent2 = GMAEvent.AD_LOADED;
                    if (r10 == gMAEvent2) {
                        Object[] objArr2 = this.$params;
                        k kVar3 = this.this$0._gmaEventFlow;
                        Object obj3 = objArr2[0];
                        ck.p.h(obj3, "null cannot be cast to non-null type kotlin.String");
                        GmaEventData gmaEventData2 = new GmaEventData(gMAEvent2, null, null, (String) obj3, null, null, null, 118, null);
                        this.label = 2;
                        if (kVar3.emit(gmaEventData2, this) == objF) {
                            return objF;
                        }
                    } else {
                        GMAEvent gMAEvent3 = GMAEvent.LOAD_ERROR;
                        if (r10 == gMAEvent3) {
                            Object[] objArr3 = this.$params;
                            k kVar4 = this.this$0._gmaEventFlow;
                            Object obj4 = objArr3[0];
                            ck.p.h(obj4, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) obj4;
                            Object obj5 = objArr3[1];
                            ck.p.h(obj5, "null cannot be cast to non-null type kotlin.String");
                            Object obj6 = objArr3[2];
                            ck.p.h(obj6, "null cannot be cast to non-null type kotlin.String");
                            Object obj7 = objArr3[3];
                            ck.p.h(obj7, "null cannot be cast to non-null type kotlin.Int");
                            GmaEventData gmaEventData3 = new GmaEventData(gMAEvent3, null, null, str2, (String) obj5, (String) obj6, (Integer) obj7, 6, null);
                            this.label = 3;
                            if (kVar4.emit(gmaEventData3, this) == objF) {
                                return objF;
                            }
                        } else {
                            if (r10 instanceof GMAEvent) {
                                k kVar5 = this.this$0._gmaEventFlow;
                                GmaEventData gmaEventData4 = new GmaEventData((GMAEvent) this.$eventId, null, null, null, null, null, null, 126, null);
                                this.label = 4;
                                if (kVar5.emit(gmaEventData4, this) == objF) {
                                    return objF;
                                }
                            }
                            if (this.$eventId instanceof BannerBridge.BannerEvent) {
                                kVar = this.this$0._gmaEventFlow;
                                GMAEvent gMAEvent4 = GMAEvent.BANNER;
                                BannerBridge.BannerEvent bannerEvent2 = (BannerBridge.BannerEvent) this.$eventId;
                                Object obj8 = this.$params[0];
                                ck.p.h(obj8, "null cannot be cast to non-null type kotlin.String");
                                gmaEventData = new GmaEventData(gMAEvent4, bannerEvent2, (String) obj8, null, null, null, null, 120, null);
                                this.label = 5;
                                if (kVar.emit(gmaEventData, this) == objF) {
                                    return objF;
                                }
                            }
                        }
                    }
                }
            }
            return r.f64562a;
        }
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean canSend() {
        return true;
    }

    public CommonScarEventReceiver(l0 l0Var) {
        ck.p.j(l0Var, "scope");
        this.scope = l0Var;
        k<String> kVarB = q.b(0, 0, null, 7, null);
        this._versionFlow = kVarB;
        this.versionFlow = e.a(kVarB);
        k<GmaEventData> kVarB2 = q.b(0, 0, null, 7, null);
        this._gmaEventFlow = kVarB2;
        this.gmaEventFlow = e.a(kVarB2);
    }

    public final p<GmaEventData> getGmaEventFlow() {
        return this.gmaEventFlow;
    }

    public final p<String> getVersionFlow() {
        return this.versionFlow;
    }

    @Override // com.unity3d.services.core.webview.bridge.IEventSender
    public boolean sendEvent(Enum<?> r11, Enum<?> r12, Object... objArr) {
        ck.p.j(r11, "eventCategory");
        ck.p.j(r12, "eventId");
        ck.p.j(objArr, "params");
        if (!b0.U(q0.j(WebViewEventCategory.INIT_GMA, WebViewEventCategory.GMA, WebViewEventCategory.BANNER), r11)) {
            return false;
        }
        j.d(this.scope, null, null, new AnonymousClass1(r12, objArr, this, null), 3, null);
        return true;
    }
}
