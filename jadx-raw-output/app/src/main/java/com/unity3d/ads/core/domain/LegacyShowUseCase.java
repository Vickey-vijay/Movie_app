package com.unity3d.ads.core.domain;

import bk.q;
import bk.t;
import ck.i;
import ck.p;
import com.google.protobuf.ByteString;
import com.ironsource.C3605n2;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import mj.h;
import mj.r;
import mk.j;
import nj.l0;
import org.json.JSONObject;
import qk.e;
import qk.l;
import qk.v;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: LegacyShowUseCase.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_OBJECT_EXPIRED = "The ad has expired";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_PLACEMENT_NOT_LOADED = "Placement %s must be Loaded before calling Show";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final l<Boolean> hasStarted;
    private final Logger logger;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final l<Boolean> timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {116, 121, 127, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 140, 145, 151, 158, 163, 195}, m = "invoke")
    public static final class C38861 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38861(c<? super C38861> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        Map<String, String> mapO = kotlin.collections.a.o(h.a("operation", OperationType.SHOW.toString()), h.a("reason", str));
        if (num != null) {
            mapO.put("reason_code", String.valueOf(num.intValue()));
        }
        if (str2 != null) {
            mapO.put("reason_debug", str2);
        }
        return mapO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showCompleted(mk.i iVar, final String str, final ShowStatus showStatus, final Listeners listeners, String str2, String str3) {
        this.logger.info("Finished showing ad " + getAdInfoString());
        Map mapD = l0.d();
        if (str2 != null) {
        }
        if (str3 != null) {
            mapD.put("reason_debug", str3);
        }
        Map mapC = l0.c(mapD);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), mapC, null, this.adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showCompleted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Listeners listeners2 = listeners;
                String str4 = str;
                ShowStatus showStatus2 = showStatus;
                NativeConfigurationOuterClass.ShowCompletionState defaultShowCompletionState = this.sessionRepository.getNativeConfiguration().getDefaultShowCompletionState();
                p.i(defaultShowCompletionState, "sessionRepository.native…efaultShowCompletionState");
                listeners2.onComplete(str4, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(showStatus2, defaultShowCompletionState));
            }
        });
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {177, 183, 184}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements bk.p<bk.a<? extends r>, c<? super r>, Object> {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ boolean $isBanner;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public final /* synthetic */ boolean $useTimeout;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z10, AdObject adObject, boolean z11, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar, String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$isBanner = z10;
            this.$adObject = adObject;
            this.$useTimeout = z11;
            this.$reportShowError = tVar;
            this.$placement = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(bk.a<r> aVar, c<? super r> cVar) {
            return ((AnonymousClass2) create(aVar, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo1invoke(bk.a<? extends r> aVar, c<? super r> cVar) {
            return invoke2((bk.a<r>) aVar, cVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            bk.a aVar;
            t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVar;
            UnityAds.UnityAdsShowError unityAdsShowError;
            String str;
            bk.a aVar2;
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            aVar2 = (bk.a) this.L$0;
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        aVar = (bk.a) this.L$0;
                        kotlin.c.b(obj);
                        tVar = this.$reportShowError;
                        unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                        str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                        this.L$0 = aVar;
                        this.label = 3;
                        if (tVar.invoke("timeout", unityAdsShowError, str, null, null, this) == objF) {
                            return objF;
                        }
                        aVar2 = aVar;
                    }
                } else {
                    aVar = (bk.a) this.L$0;
                    kotlin.c.b(obj);
                }
                aVar2.invoke();
                return r.f64562a;
            }
            kotlin.c.b(obj);
            aVar = (bk.a) this.L$0;
            if (!((Boolean) LegacyShowUseCase.this.hasStarted.getValue()).booleanValue() && !((Boolean) LegacyShowUseCase.this.timeoutCancellationRequested.getValue()).booleanValue() && !this.$isBanner) {
                LegacyShowUseCase legacyShowUseCase = LegacyShowUseCase.this;
                OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                AdObject adObject = this.$adObject;
                this.L$0 = aVar;
                this.label = 1;
                if (legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this) == objF) {
                    return objF;
                }
            } else {
                return r.f64562a;
            }
            if (this.$useTimeout) {
                Show show = LegacyShowUseCase.this.show;
                AdObject adObject2 = this.$adObject;
                this.L$0 = aVar;
                this.label = 2;
                if (show.terminate(adObject2, this) == objF) {
                    return objF;
                }
                tVar = this.$reportShowError;
                unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                this.L$0 = aVar;
                this.label = 3;
                if (tVar.invoke("timeout", unityAdsShowError, str, null, null, this) == objF) {
                    return objF;
                }
                aVar2 = aVar;
                aVar2.invoke();
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {190}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements q<qk.d<? super ShowEvent>, Throwable, c<? super r>, Object> {
        public final /* synthetic */ boolean $isBanner;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar, boolean z10, c<? super AnonymousClass3> cVar) {
            super(3, cVar);
            this.$reportShowError = tVar;
            this.$isBanner = z10;
        }

        @Override // bk.q
        public final Object invoke(qk.d<? super ShowEvent> dVar, Throwable th2, c<? super r> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, cVar);
            anonymousClass3.L$0 = th2;
            return anonymousClass3.invokeSuspend(r.f64562a);
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
                Throwable th2 = (Throwable) this.L$0;
                t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVar = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th2, 0, 1, null);
                this.label = 1;
                if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, this) == objF) {
                    return objF;
                }
            }
            if (!this.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C38891 extends SuspendLambda implements t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> {
        public final /* synthetic */ Listeners $listeners;
        public final /* synthetic */ String $opportunityId;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ mk.i $startTime;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public /* synthetic */ Object L$3;
        public /* synthetic */ Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38891(String str, mk.i iVar, Listeners listeners, String str2, c<? super C38891> cVar) {
            super(6, cVar);
            this.$opportunityId = str;
            this.$startTime = iVar;
            this.$listeners = listeners;
            this.$placement = str2;
        }

        @Override // bk.t
        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, c<? super r> cVar) {
            C38891 c38891 = LegacyShowUseCase.this.new C38891(this.$opportunityId, this.$startTime, this.$listeners, this.$placement, cVar);
            c38891.L$0 = str;
            c38891.L$1 = unityAdsShowError;
            c38891.L$2 = str2;
            c38891.L$3 = num;
            c38891.L$4 = str3;
            return c38891.invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            sj.a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                String str = (String) this.L$0;
                final UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
                final String str2 = (String) this.L$2;
                Integer num = (Integer) this.L$3;
                String str3 = (String) this.L$4;
                Logger.DefaultImpls.error$default(LegacyShowUseCase.this.logger, "Failed to show ad " + LegacyShowUseCase.this.getAdInfoString() + ", error: " + str2, null, 2, null);
                AdObject tmpAdObject = LegacyShowUseCase.this.adObject;
                if (tmpAdObject == null) {
                    tmpAdObject = LegacyShowUseCase.this.getTmpAdObject(this.$opportunityId);
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(LegacyShowUseCase.this.sendDiagnosticEvent, "native_show_failure_time", tj.a.b(TimeExtensionsKt.elapsedMillis(this.$startTime)), LegacyShowUseCase.this.getTags(str, num, str3), null, tmpAdObject, null, 40, null);
                SafeCallbackInvoke safeCallbackInvoke = LegacyShowUseCase.this.safeCallbackInvoke;
                final Listeners listeners = this.$listeners;
                final String str4 = this.$placement;
                safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showError.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        listeners.onError(str4, unityAdsShowError, str2);
                    }
                });
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LegacyShowUseCase(Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        p.j(show, C3605n2.f30216v);
        p.j(adRepository, "adRepository");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(getOperativeEventApi, "getOperativeEventApi");
        p.j(getInitializationState, "getInitializationState");
        p.j(sessionRepository, "sessionRepository");
        p.j(safeCallbackInvoke, "safeCallbackInvoke");
        p.j(logger, "logger");
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = v.a(bool);
        this.timeoutCancellationRequested = v.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(mk.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Left app while showing ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.bannerLeftApplication.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onLeftApplication(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(mk.i iVar) {
        this.timeoutCancellationRequested.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAdInfoString() {
        ByteString opportunityId;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("for placement ");
        AdObject adObject = this.adObject;
        UUID uuid = null;
        sb2.append(adObject != null ? adObject.getPlacementId() : null);
        sb2.append(" with instance id ");
        AdObject adObject2 = this.adObject;
        if (adObject2 != null && (opportunityId = adObject2.getOpportunityId()) != null) {
            uuid = ProtobufExtensionsKt.toUUID(opportunityId);
        }
        sb2.append(uuid);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdObject getTmpAdObject(String str) {
        UUID uuidFromString = UUID.fromString(str);
        p.i(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        AdObject ad2 = this.adRepository.getAd(byteString);
        if (ad2 != null) {
            return ad2;
        }
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString byteString2 = ByteString.EMPTY;
        p.i(byteString2, "EMPTY");
        return new AdObject(byteString, str3, byteString2, false, null, null, null, false, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, null, null, 50680, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, c<? super r> cVar) throws Throwable {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        p.i(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, cVar);
        return objInvoke == sj.a.f() ? objInvoke : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showClicked(mk.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Clicked on ad " + getAdInfoString());
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showClicked.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onClick(str);
            }
        });
    }

    private final t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> showError(mk.i iVar, String str, String str2, Listeners listeners) {
        return new C38891(str2, iVar, listeners, str, null);
    }

    private final void showStart(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_started", null, null, null, getTmpAdObject(str), null, 46, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showStarted(mk.i iVar, final String str, final Listeners listeners) {
        this.logger.info("Started showing ad " + getAdInfoString());
        this.hasStarted.setValue(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), null, null, this.adObject, null, 44, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyShowUseCase.showStarted.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                listeners.onStart(str);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0312  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, c<? super r> cVar) throws Throwable {
        C38861 c38861;
        Object objM3458constructorimpl;
        int i10;
        nk.l0 scope;
        ByteString byteString;
        LegacyShowUseCase legacyShowUseCase;
        JSONObject data;
        Object objOpt;
        UUID uuid;
        if (cVar instanceof C38861) {
            c38861 = (C38861) cVar;
            int i11 = c38861.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c38861.label = i11 - Integer.MIN_VALUE;
            } else {
                c38861 = new C38861(cVar);
            }
        } else {
            c38861 = new C38861(cVar);
        }
        C38861 c38862 = c38861;
        Object obj = c38862.result;
        Object objF = sj.a.f();
        switch (c38862.label) {
            case 0:
                kotlin.c.b(obj);
                long jB = j.f64572a.b();
                this.placement = str;
                this.unityAdsShowOptions = unityAdsShowOptions;
                this.logger.debug("Show for placement " + str + " called");
                Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                try {
                    Result.a aVar = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null);
                    break;
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                    ref$BooleanRef.element = true;
                    objM3458constructorimpl = UUID.randomUUID().toString();
                }
                String string = (String) objM3458constructorimpl;
                if (string == null) {
                    if (str != null) {
                        ByteString byteStringPollOpportunityIdForPlacement = this.adRepository.pollOpportunityIdForPlacement(str);
                        string = (byteStringPollOpportunityIdForPlacement == null || (uuid = ProtobufExtensionsKt.toUUID(byteStringPollOpportunityIdForPlacement)) == null) ? null : uuid.toString();
                        if (string == null) {
                            ref$BooleanRef2.element = true;
                            string = UUID.randomUUID().toString();
                        }
                    } else {
                        string = UUID.randomUUID().toString();
                    }
                    p.i(string, "if (placement != null) {….toString()\n            }");
                }
                showStart(string);
                t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVarShowError = showError(j.a.b(jB), str == null ? "" : str, string, listeners);
                if (GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null) != InitializationState.INITIALIZED) {
                    UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                    c38862.label = 1;
                    if (tVarShowError.invoke("not_initialized", unityAdsShowError, LoadResult.MSG_NOT_INITIALIZED, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                if (str == null) {
                    UnityAds.UnityAdsShowError unityAdsShowError2 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c38862.label = 2;
                    if (tVarShowError.invoke("placement_null", unityAdsShowError2, "[UnityAds] Placement ID cannot be null", null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                if (ref$BooleanRef.element) {
                    String string2 = (unityAdsShowOptions == null || (data = unityAdsShowOptions.getData()) == null || (objOpt = data.opt("objectId")) == null) ? null : objOpt.toString();
                    UnityAds.UnityAdsShowError unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c38862.label = 3;
                    if (tVarShowError.invoke("no_opportunity_id", unityAdsShowError3, MESSAGE_OPPORTUNITY_ID, null, string2, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                if (ref$BooleanRef2.element) {
                    UnityAds.UnityAdsShowError unityAdsShowError4 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    String str2 = String.format(MESSAGE_PLACEMENT_NOT_LOADED, Arrays.copyOf(new Object[]{str}, 1));
                    p.i(str2, "format(this, *args)");
                    c38862.label = 4;
                    if (tVarShowError.invoke("placement_not_loaded", unityAdsShowError4, str2, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                UUID uuidFromString = UUID.fromString(string);
                p.i(uuidFromString, "fromString(opportunityId)");
                ByteString byteString2 = ProtobufExtensionsKt.toByteString(uuidFromString);
                AdObject ad2 = this.adRepository.getAd(byteString2);
                this.adObject = ad2;
                if (ad2 == null) {
                    UnityAds.UnityAdsShowError unityAdsShowError5 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    String str3 = MESSAGE_NO_AD_OBJECT + string;
                    c38862.label = 5;
                    if (tVarShowError.invoke("ad_object_not_found", unityAdsShowError5, str3, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                if (ad2.getState().getValue() == AdObjectState.EXPIRED) {
                    UnityAds.UnityAdsShowError unityAdsShowError6 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c38862.L$0 = this;
                    c38862.L$1 = byteString2;
                    c38862.label = 6;
                    if (tVarShowError.invoke("ad_object_expired", unityAdsShowError6, MESSAGE_AD_OBJECT_EXPIRED, null, null, c38862) == objF) {
                        return objF;
                    }
                    byteString = byteString2;
                    legacyShowUseCase = this;
                    legacyShowUseCase.adRepository.removeAd(byteString);
                    return r.f64562a;
                }
                AdPlayer adPlayer = ad2.getAdPlayer();
                if (((adPlayer == null || (scope = adPlayer.getScope()) == null || kotlinx.coroutines.d.g(scope)) ? false : true) == true) {
                    UnityAds.UnityAdsShowError unityAdsShowError7 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c38862.label = 7;
                    if (tVarShowError.invoke("ad_player_scope_not_active", unityAdsShowError7, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                boolean z10 = ad2.getAdPlayer() instanceof EmbeddableAdPlayer;
                if (!z10 && isFullscreenAdShowing) {
                    UnityAds.UnityAdsShowError unityAdsShowError8 = UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                    c38862.label = 8;
                    if (tVarShowError.invoke("already_showing", unityAdsShowError8, MESSAGE_ALREADY_SHOWING, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                if (this.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !p.e(ad2.getPlacementId(), str)) {
                    UnityAds.UnityAdsShowError unityAdsShowError9 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c38862.label = 9;
                    if (tVarShowError.invoke("placement_validation", unityAdsShowError9, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, c38862) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
                long showTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z10) {
                    isFullscreenAdShowing = true;
                }
                qk.c cVarF = e.f(FlowExtensionsKt.timeoutAfter$default(this.show.invoke(ad2, unityAdsShowOptions), showTimeoutMs, false, new AnonymousClass2(z10, ad2, true, tVarShowError, str, null), 2, null), new AnonymousClass3(tVarShowError, z10, null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(jB, str, listeners, ad2, tVarShowError);
                c38862.I$0 = z10 ? 1 : 0;
                c38862.label = 10;
                if (cVarF.collect(anonymousClass4, c38862) == objF) {
                    return objF;
                }
                i10 = z10 ? 1 : 0;
                if (i10 == 0) {
                    isFullscreenAdShowing = false;
                }
                return r.f64562a;
            case 1:
                kotlin.c.b(obj);
                return r.f64562a;
            case 2:
                kotlin.c.b(obj);
                return r.f64562a;
            case 3:
                kotlin.c.b(obj);
                return r.f64562a;
            case 4:
                kotlin.c.b(obj);
                return r.f64562a;
            case 5:
                kotlin.c.b(obj);
                return r.f64562a;
            case 6:
                byteString = (ByteString) c38862.L$1;
                legacyShowUseCase = (LegacyShowUseCase) c38862.L$0;
                kotlin.c.b(obj);
                legacyShowUseCase.adRepository.removeAd(byteString);
                return r.f64562a;
            case 7:
                kotlin.c.b(obj);
                return r.f64562a;
            case 8:
                kotlin.c.b(obj);
                return r.f64562a;
            case 9:
                kotlin.c.b(obj);
                return r.f64562a;
            case 10:
                i10 = c38862.I$0;
                kotlin.c.b(obj);
                if (i10 == 0) {
                    isFullscreenAdShowing = false;
                }
                return r.f64562a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) throws IllegalArgumentException {
        Object objOpt;
        String string;
        JSONObject data = unityAdsShowOptions.getData();
        if (data != null && (objOpt = data.opt("objectId")) != null && (string = objOpt.toString()) != null) {
            return UUID.fromString(string).toString();
        }
        return null;
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyShowUseCase.kt */
    public static final class AnonymousClass4<T> implements qk.d {
        public final /* synthetic */ AdObject $adObject;
        public final /* synthetic */ Listeners $listeners;
        public final /* synthetic */ String $placement;
        public final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> $reportShowError;
        public final /* synthetic */ long $startTime;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(long j10, String str, Listeners listeners, AdObject adObject, t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super c<? super r>, ? extends Object> tVar) {
            this.$startTime = j10;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = tVar;
        }

        /* JADX WARN: Code duplicated, block: B:45:0x013e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x0184 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [int] */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        public final Object emit(ShowEvent showEvent, c<? super r> cVar) throws Throwable {
            LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
            AnonymousClass4<T> anonymousClass4;
            t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVar;
            UnityAds.UnityAdsShowError unityAdsShowError;
            String shortenedStackTrace$default;
            t<String, UnityAds.UnityAdsShowError, String, Integer, String, c<? super r>, Object> tVar2;
            String reason;
            UnityAds.UnityAdsShowError unityAdsShowError2;
            String message;
            Integer numD;
            String message2;
            ShowEvent showEvent2 = showEvent;
            if (cVar instanceof LegacyShowUseCase$invoke$4$emit$1) {
                legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) cVar;
                int i10 = legacyShowUseCase$invoke$4$emit$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    legacyShowUseCase$invoke$4$emit$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, cVar);
                }
            } else {
                legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, cVar);
            }
            Object obj = legacyShowUseCase$invoke$4$emit$1.result;
            Object objF = sj.a.f();
            AnonymousClass4 anonymousClass5 = legacyShowUseCase$invoke$4$emit$1.label;
            if (anonymousClass5 != 0) {
                try {
                    if (anonymousClass5 == 1) {
                        showEvent2 = (ShowEvent) legacyShowUseCase$invoke$4$emit$1.L$1;
                        AnonymousClass4<T> anonymousClass6 = (AnonymousClass4) legacyShowUseCase$invoke$4$emit$1.L$0;
                        kotlin.c.b(obj);
                        anonymousClass4 = anonymousClass6;
                        try {
                            tVar2 = anonymousClass4.$reportShowError;
                            reason = ((ShowEvent.Error) showEvent2).getReason();
                            unityAdsShowError2 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            message = ((ShowEvent.Error) showEvent2).getMessage();
                            numD = tj.a.d(((ShowEvent.Error) showEvent2).getErrorCode());
                            message2 = ((ShowEvent.Error) showEvent2).getMessage();
                            legacyShowUseCase$invoke$4$emit$1.L$0 = anonymousClass4;
                            legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                            legacyShowUseCase$invoke$4$emit$1.label = 2;
                            if (tVar2.invoke(reason, unityAdsShowError2, message, numD, message2, legacyShowUseCase$invoke$4$emit$1) == objF) {
                                return objF;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            anonymousClass5 = anonymousClass4;
                            tVar = anonymousClass5.$reportShowError;
                            unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                            legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                            legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                            legacyShowUseCase$invoke$4$emit$1.label = 3;
                            if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == objF) {
                                return objF;
                            }
                        }
                    } else if (anonymousClass5 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        if (anonymousClass5 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.c.b(obj);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    tVar = anonymousClass5.$reportShowError;
                    unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                    legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                    legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                    legacyShowUseCase$invoke$4$emit$1.label = 3;
                    if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            } else {
                kotlin.c.b(obj);
                try {
                    if (showEvent2 instanceof ShowEvent.Started) {
                        LegacyShowUseCase.this.showStarted(j.a.b(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Clicked) {
                        LegacyShowUseCase.this.showClicked(j.a.b(this.$startTime), this.$placement, this.$listeners);
                    } else if (showEvent2 instanceof ShowEvent.Completed) {
                        LegacyShowUseCase.this.showCompleted(j.a.b(this.$startTime), this.$placement, ((ShowEvent.Completed) showEvent2).getStatus(), this.$listeners, ((ShowEvent.Completed) showEvent2).getReason(), ((ShowEvent.Completed) showEvent2).getReasonDebug());
                    } else if (showEvent2 instanceof ShowEvent.Error) {
                        if (((Boolean) LegacyShowUseCase.this.hasStarted.getValue()).booleanValue()) {
                            LegacyShowUseCase.this.showCompleted(j.a.b(this.$startTime), this.$placement, ShowStatus.ERROR, this.$listeners, ((ShowEvent.Error) showEvent2).getReason(), ((ShowEvent.Error) showEvent2).getMessage());
                        } else {
                            LegacyShowUseCase legacyShowUseCase = LegacyShowUseCase.this;
                            OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                            String message3 = ((ShowEvent.Error) showEvent2).getMessage();
                            AdObject adObject = this.$adObject;
                            legacyShowUseCase$invoke$4$emit$1.L$0 = this;
                            legacyShowUseCase$invoke$4$emit$1.L$1 = showEvent2;
                            legacyShowUseCase$invoke$4$emit$1.label = 1;
                            if (legacyShowUseCase.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$1) == objF) {
                                return objF;
                            }
                            anonymousClass4 = this;
                            tVar2 = anonymousClass4.$reportShowError;
                            reason = ((ShowEvent.Error) showEvent2).getReason();
                            unityAdsShowError2 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                            message = ((ShowEvent.Error) showEvent2).getMessage();
                            numD = tj.a.d(((ShowEvent.Error) showEvent2).getErrorCode());
                            message2 = ((ShowEvent.Error) showEvent2).getMessage();
                            legacyShowUseCase$invoke$4$emit$1.L$0 = anonymousClass4;
                            legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                            legacyShowUseCase$invoke$4$emit$1.label = 2;
                            if (tVar2.invoke(reason, unityAdsShowError2, message, numD, message2, legacyShowUseCase$invoke$4$emit$1) == objF) {
                                return objF;
                            }
                        }
                    } else if (showEvent2 instanceof ShowEvent.CancelTimeout) {
                        LegacyShowUseCase.this.cancelTimeout(j.a.b(this.$startTime));
                    } else if (showEvent2 instanceof ShowEvent.LeftApplication) {
                        LegacyShowUseCase.this.bannerLeftApplication(j.a.b(this.$startTime), this.$placement, this.$listeners);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    anonymousClass5 = this;
                    tVar = anonymousClass5.$reportShowError;
                    unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                    legacyShowUseCase$invoke$4$emit$1.L$0 = null;
                    legacyShowUseCase$invoke$4$emit$1.L$1 = null;
                    legacyShowUseCase$invoke$4$emit$1.label = 3;
                    if (tVar.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, legacyShowUseCase$invoke$4$emit$1) == objF) {
                        return objF;
                    }
                    return r.f64562a;
                }
            }
            return r.f64562a;
        }

        @Override // qk.d
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            return emit((ShowEvent) obj, (c<? super r>) cVar);
        }
    }
}
