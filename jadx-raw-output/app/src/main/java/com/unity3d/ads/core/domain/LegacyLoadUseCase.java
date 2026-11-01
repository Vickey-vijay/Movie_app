package com.unity3d.ads.core.domain;

import android.content.Context;
import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import java.util.Map;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.TimeoutKt;
import lk.a0;
import mj.h;
import mj.r;
import mk.i;
import mk.j;
import org.json.JSONObject;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: LegacyLoadUseCase.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private final Logger logger;
    private ByteString opportunity;
    private String placement;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private i startTime;

    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyLoadUseCase.kt */
    @d(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", l = {101}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || a0.n0(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    private final Map<String, String> getTags(String str, String str2) {
        Map<String, String> mapO = kotlin.collections.a.o(h.a("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), h.a("operation", OperationType.LOAD.toString()));
        if (!(str == null || str.length() == 0)) {
            mapO.put("reason", str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            mapO.put("reason_debug", str2);
        }
        return mapO;
    }

    public LegacyLoadUseCase(Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository, SafeCallbackInvoke safeCallbackInvoke, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires, Logger logger) {
        p.j(load, "load");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        p.j(getInitializationState, "getInitializationState");
        p.j(awaitInitialization, "awaitInitialization");
        p.j(sessionRepository, "sessionRepository");
        p.j(adRepository, "adRepository");
        p.j(safeCallbackInvoke, "safeCallbackInvoke");
        p.j(cleanUpWhenOpportunityExpires, "cleanUpWhenOpportunityExpires");
        p.j(logger, "logger");
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.cleanUpWhenOpportunityExpires = cleanUpWhenOpportunityExpires;
        this.logger = logger;
    }

    private final String getAdInfoString(String str) {
        return "for placement " + this.placement + " with instance id " + str;
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(unityBannerSize.getWidth());
        dsl_create.setHeight(unityBannerSize.getHeight());
        return dsl_create._build();
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(String str, boolean z10) {
        UUID uuidFromString = UUID.fromString(str);
        p.i(uuidFromString, "fromString(opportunityId)");
        ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        String str2 = this.placement;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        ByteString byteString2 = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            p.B(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            unityAdsLoadOptions = null;
        }
        UnityAdsLoadOptions unityAdsLoadOptions2 = unityAdsLoadOptions;
        boolean z11 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        p.i(byteString2, "EMPTY");
        return new AdObject(byteString, str3, byteString2, z10, null, null, null, false, null, null, null, unityAdsLoadOptions2, z11, adType, null, null, 50672, null);
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return legacyLoadUseCase.getTmpAdObject(str, z10);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, c cVar, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, cVar);
    }

    private final void loadFailure(String str, final LoadResult.Failure failure) {
        Logger.DefaultImpls.error$default(this.logger, "Failed to load ad " + getAdInfoString(str) + ", error: " + failure.getError() + " :: " + failure.getMessage(), null, 2, null);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", iVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(str, failure.isScarAd()), null, 40, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase.loadFailure.1
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
                IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
                if (iUnityAdsLoadListener != null) {
                    iUnityAdsLoadListener.onUnityAdsFailedToLoad(LegacyLoadUseCase.this.placement, failure.getError(), failure.getMessage());
                }
            }
        });
    }

    private final i loadStart(String str) {
        long jB = j.f64572a.b();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, str, false, 2, null), null, 42, null);
        return j.a.b(jB);
    }

    private final void loadSuccess(AdObject adObject) {
        this.logger.info("Successfully loaded ad " + getAdInfoString(ProtobufExtensionsKt.toUUID(adObject.getOpportunityId()).toString()));
        adObject.getState().setValue(AdObjectState.LOADED);
        this.cleanUpWhenOpportunityExpires.invoke(adObject);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        i iVar = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", iVar != null ? Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)) : null, getTags$default(this, null, null, 3, null), null, adObject, null, 40, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.LegacyLoadUseCase.loadSuccess.1
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
                IUnityAdsLoadListener iUnityAdsLoadListener = LegacyLoadUseCase.this.listener;
                if (iUnityAdsLoadListener != null) {
                    iUnityAdsLoadListener.onUnityAdsAdLoaded(LegacyLoadUseCase.this.placement);
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:37:0x00e9, B:39:0x00ed, B:40:0x0113, B:42:0x0117, B:43:0x0121, B:45:0x0125), top: B:52:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0117 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:37:0x00e9, B:39:0x00ed, B:40:0x0113, B:42:0x0117, B:43:0x0121, B:45:0x0125), top: B:52:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0121 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:37:0x00e9, B:39:0x00ed, B:40:0x0113, B:42:0x0117, B:43:0x0121, B:45:0x0125), top: B:52:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0125 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:12:0x003e, B:37:0x00e9, B:39:0x00ed, B:40:0x0113, B:42:0x0117, B:43:0x0121, B:45:0x0125), top: B:52:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00ed, please report this as an issue */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        LegacyLoadUseCase legacyLoadUseCase;
        String str2;
        Object failure;
        String str3 = str;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objD = anonymousClass2.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass2.label;
        if (i11 == 0) {
            kotlin.c.b(objD);
            String opportunityId = getOpportunityId(unityAdsLoadOptions);
            if (opportunityId == null) {
                opportunityId = UUID.randomUUID().toString();
                p.i(opportunityId, "randomUUID().toString()");
            }
            String str4 = opportunityId;
            this.logger.info("Load invoked for placement: " + str3 + " with instance id: " + str4);
            long loadTimeoutMs = (long) this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
            AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize);
            this.loadOptions = unityAdsLoadOptions;
            String adMarkup = getAdMarkup(unityAdsLoadOptions);
            this.adMarkup = adMarkup;
            this.isHeaderBidding = !(adMarkup == null || a0.n0(adMarkup));
            this.isBanner = unityBannerSize != null;
            this.listener = iUnityAdsLoadListener;
            this.placement = str3;
            this.startTime = loadStart(str4);
            try {
                LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(str, str4, this, context, bannerSize, unityAdsLoadOptions, null);
                anonymousClass2.L$0 = this;
                anonymousClass2.L$1 = str3;
                anonymousClass2.L$2 = str4;
                anonymousClass2.label = 1;
                objD = TimeoutKt.d(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, anonymousClass2);
                if (objD == objF) {
                    return objF;
                }
                legacyLoadUseCase = this;
                str2 = str4;
                failure = (LoadResult) objD;
                if (failure == null) {
                    failure = new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + str3, null, "timeout", null, false, 52, null);
                }
                if (failure instanceof LoadResult.Success) {
                    legacyLoadUseCase.loadSuccess(((LoadResult.Success) failure).getAdObject());
                } else if (failure instanceof LoadResult.Failure) {
                    legacyLoadUseCase.loadFailure(str2, (LoadResult.Failure) failure);
                }
            } catch (Throwable th2) {
                th = th2;
                legacyLoadUseCase = this;
                str2 = str4;
                legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) anonymousClass2.L$2;
            str3 = (String) anonymousClass2.L$1;
            legacyLoadUseCase = (LegacyLoadUseCase) anonymousClass2.L$0;
            try {
                kotlin.c.b(objD);
                failure = (LoadResult) objD;
                if (failure == null) {
                    failure = new LoadResult.Failure(UnityAds.UnityAdsLoadError.TIMEOUT, LoadResult.MSG_TIMEOUT + str3, null, "timeout", null, false, 52, null);
                }
                if (failure instanceof LoadResult.Success) {
                    legacyLoadUseCase.loadSuccess(((LoadResult.Success) failure).getAdObject());
                } else if (failure instanceof LoadResult.Failure) {
                    legacyLoadUseCase.loadFailure(str2, (LoadResult.Failure) failure);
                }
            } catch (Throwable th3) {
                th = th3;
                legacyLoadUseCase.loadFailure(str2, new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null), false, 32, null));
            }
        }
        return r.f64562a;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (objOpt = data.opt("adMarkup")) != null) {
            return objOpt.toString();
        }
        return null;
    }

    private final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data != null && (objOpt = data.opt("objectId")) != null) {
            return objOpt.toString();
        }
        return null;
    }
}
