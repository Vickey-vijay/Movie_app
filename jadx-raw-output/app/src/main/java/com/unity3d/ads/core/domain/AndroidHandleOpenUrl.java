package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import ck.p;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import qk.e;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;
    private final IntentCreation intentCreation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleOpenUrl.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", l = {52}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHandleOpenUrl.this.invoke(null, null, null, null, null, false, this);
        }
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, "com.unity3d.ads");
        p10.startActivity(p11);
    }

    public AndroidHandleOpenUrl(Context context, IntentCreation intentCreation) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(intentCreation, "intentCreation");
        this.context = context;
        this.intentCreation = intentCreation;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public Object invoke(final AdObject adObject, String str, String str2, String str3, Map<String, ? extends Object> map, boolean z10, c<? super Boolean> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM3458constructorimpl;
        boolean zM3464isSuccessimpl;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objR = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objR);
            Intent intentInvoke = this.intentCreation.invoke(str, str2, str3, map);
            if (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER) {
                intentInvoke.setFlags(268435456);
                try {
                    Result.a aVar = Result.Companion;
                    safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(this.context, intentInvoke);
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                zM3464isSuccessimpl = Result.m3464isSuccessimpl(objM3458constructorimpl);
            } else {
                final qk.p pVarC = e.C(AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages(), new AndroidHandleOpenUrl$invoke$result$1(adObject, intentInvoke, z10, null));
                qk.c<DisplayMessage> cVar2 = new qk.c<DisplayMessage>() { // from class: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1

                    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2, reason: invalid class name */
                    /* JADX INFO: compiled from: Emitters.kt */
                    public static final class AnonymousClass2<T> implements qk.d {
                        public final /* synthetic */ AdObject $adObject$inlined;
                        public final /* synthetic */ qk.d $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2$1, reason: invalid class name */
                        /* JADX INFO: compiled from: Emitters.kt */
                        @d(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl$invoke$$inlined$filter$1$2", f = "AndroidHandleOpenUrl.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            public Object L$0;
                            public Object L$1;
                            public int label;
                            public /* synthetic */ Object result;

                            public AnonymousClass1(c cVar) {
                                super(cVar);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(qk.d dVar, AdObject adObject) {
                            this.$this_unsafeFlow = dVar;
                            this.$adObject$inlined = adObject;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // qk.d
                        public final Object emit(Object obj, c cVar) throws Throwable {
                            AnonymousClass1 anonymousClass1;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i10 = anonymousClass1.label;
                                if ((i10 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i10 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(cVar);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(cVar);
                            }
                            Object obj2 = anonymousClass1.result;
                            Object objF = sj.a.f();
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                kotlin.c.b(obj2);
                                qk.d dVar = this.$this_unsafeFlow;
                                DisplayMessage displayMessage = (DisplayMessage) obj;
                                if ((displayMessage instanceof DisplayMessage.OpenUrlResult) && p.e(displayMessage.getOpportunityId(), ProtobufExtensionsKt.toUUID(this.$adObject$inlined.getOpportunityId()).toString())) {
                                    anonymousClass1.label = 1;
                                    if (dVar.emit(obj, anonymousClass1) == objF) {
                                        return objF;
                                    }
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.c.b(obj2);
                            }
                            return r.f64562a;
                        }
                    }

                    @Override // qk.c
                    public Object collect(qk.d<? super DisplayMessage> dVar, c cVar3) {
                        Object objCollect = pVarC.collect(new AnonymousClass2(dVar, adObject), cVar3);
                        return objCollect == sj.a.f() ? objCollect : r.f64562a;
                    }
                };
                anonymousClass1.label = 1;
                objR = e.r(cVar2, anonymousClass1);
                if (objR == objF) {
                    return objF;
                }
            }
            return tj.a.a(zM3464isSuccessimpl);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.c.b(objR);
        p.h(objR, "null cannot be cast to non-null type com.unity3d.ads.adplayer.DisplayMessage.OpenUrlResult");
        zM3464isSuccessimpl = ((DisplayMessage.OpenUrlResult) objR).getSuccess();
        return tj.a.a(zM3464isSuccessimpl);
    }
}
