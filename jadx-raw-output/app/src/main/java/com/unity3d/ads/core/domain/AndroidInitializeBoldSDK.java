package com.unity3d.ads.core.domain;

import bk.p;
import ck.i;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.manager.SDKPropertiesManager;
import com.unity3d.ads.core.data.manager.StorageManager;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.EventObservers;
import com.unity3d.ads.core.domain.om.InitializeOMSDK;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.configuration.ConfigurationReader;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import java.util.Map;
import kotlin.KotlinVersion;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import mj.h;
import mj.r;
import mk.j;
import nk.h0;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidInitializeBoldSDK implements InitializeBoldSDK {
    public static final Companion Companion = new Companion(null);
    public static final String MSG_GATEWAY_DENIED = "Gateway communication failure";
    public static final String MSG_NETWORK = "Network";
    public static final String MSG_TIMEOUT = "Timeout";
    public static final String MSG_UNKNOWN = "Initialization failure";
    private final CleanAssets cleanAssets;
    private final h0 defaultDispatcher;
    private final DiagnosticEventRepository diagnosticEventRepository;
    private final EventObservers eventObservers;
    private final GatewayClient gatewayClient;
    private final GetGameId getGameId;
    private final GetInitializationRequest getInitializeRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final AndroidHandleFocusCounters handleFocusCounters;
    private final HandleGatewayInitializationResponse handleGatewayInitializationResponse;
    private final InitializeOMSDK initializeOM;
    private final ConfigurationReader legacyConfigurationReader;
    private final Logger logger;
    private final SDKPropertiesManager sdkPropertiesManager;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final StorageManager storageManager;
    private final TriggerInitializeListener triggerInitializeListener;

    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$initializationSuccess$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK", f = "AndroidInitializeBoldSDK.kt", l = {135, 136, 139}, m = "initializationSuccess")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidInitializeBoldSDK.this.initializationSuccess(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2", f = "AndroidInitializeBoldSDK.kt", l = {68, 85}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ String $source;
        public int I$0;
        public long J$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$source = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidInitializeBoldSDK.this.new AnonymousClass2(this.$source, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: AndroidInitializeBoldSDK.kt */
        @d(c = "com.unity3d.ads.core.domain.AndroidInitializeBoldSDK$invoke$2$1", f = "AndroidInitializeBoldSDK.kt", l = {69, 71, 73, 74}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements p<l0, c<? super r>, Object> {
            public final /* synthetic */ boolean $isRetry;
            public final /* synthetic */ String $source;
            public int label;
            public final /* synthetic */ AndroidInitializeBoldSDK this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidInitializeBoldSDK androidInitializeBoldSDK, String str, boolean z10, c<? super AnonymousClass1> cVar) {
                super(2, cVar);
                this.this$0 = androidInitializeBoldSDK;
                this.$source = str;
                this.$isRetry = z10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                return new AnonymousClass1(this.this$0, this.$source, this.$isRetry, cVar);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
                return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
            }

            /* JADX WARN: Code duplicated, block: B:22:0x0073 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:25:0x0080 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AndroidInitializeBoldSDK androidInitializeBoldSDK;
                Object objF = sj.a.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    kotlin.c.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                kotlin.c.b(obj);
                                androidInitializeBoldSDK = this.this$0;
                                this.label = 4;
                                if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == objF) {
                                    return objF;
                                }
                            }
                        } else {
                            kotlin.c.b(obj);
                            RequestPolicy requestPolicyInvoke = this.this$0.getRequestPolicy.invoke();
                            GatewayClient gatewayClient = this.this$0.gatewayClient;
                            OperationType operationType = OperationType.INITIALIZATION;
                            this.label = 3;
                            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke, operationType, this, 1, null);
                            if (obj == objF) {
                                return objF;
                            }
                            androidInitializeBoldSDK = this.this$0;
                            this.label = 4;
                            if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        kotlin.c.b(obj);
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
                AndroidInitializeBoldSDK androidInitializeBoldSDK2 = this.this$0;
                String str = this.$source;
                boolean z10 = this.$isRetry;
                this.label = 1;
                if (androidInitializeBoldSDK2.initializationStart(str, z10, this) == objF) {
                    return objF;
                }
                this.this$0.checkCanInitialize();
                GetInitializationRequest getInitializationRequest = this.this$0.getInitializeRequest;
                this.label = 2;
                obj = getInitializationRequest.invoke(this);
                if (obj == objF) {
                    return objF;
                }
                RequestPolicy requestPolicyInvoke2 = this.this$0.getRequestPolicy.invoke();
                GatewayClient gatewayClient2 = this.this$0.gatewayClient;
                OperationType operationType2 = OperationType.INITIALIZATION;
                this.label = 3;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke2, operationType2, this, 1, null);
                if (obj == objF) {
                    return objF;
                }
                androidInitializeBoldSDK = this.this$0;
                this.label = 4;
                if (androidInitializeBoldSDK.handleResponse((UniversalResponseOuterClass.UniversalResponse) obj, this) == objF) {
                    return objF;
                }
                return r.f64562a;
            }
        }

        /* JADX WARN: Type inference failed for: r5v4, types: [long, mk.i, mk.j$a] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long jB;
            boolean z10;
            ?? B;
            Object objF = sj.a.f();
            int i10 = this.label;
            boolean z11 = false;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            kotlin.c.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i10 = this.I$0;
                        jB = this.J$0;
                        kotlin.c.b(obj);
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
                jB = j.f64572a.b();
                i10 = !AndroidInitializeBoldSDK.this.sessionRepository.isFirstInitAttempt() ? 1 : 0;
                AndroidInitializeBoldSDK androidInitializeBoldSDK = AndroidInitializeBoldSDK.this;
                String str = this.$source;
                if (i10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(androidInitializeBoldSDK, str, z10, null);
                this.J$0 = jB;
                this.I$0 = i10;
                this.label = 1;
                if (TimeoutKt.c(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS, anonymousClass1, this) == objF) {
                    return objF;
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK2 = AndroidInitializeBoldSDK.this;
                B = j.a.b(jB);
                String str2 = this.$source;
                if (i10 != 0) {
                    z11 = true;
                }
                this.label = 2;
                if (androidInitializeBoldSDK2.initializationSuccess(B, str2, z11, this) == objF) {
                    return objF;
                }
                return r.f64562a;
            } catch (Exception e10) {
                InitializationException from = InitializationException.Companion.parseFrom(e10);
                if (e10 instanceof GatewayException) {
                    AndroidInitializeBoldSDK.this.sessionRepository.setShouldInitialize(false);
                }
                AndroidInitializeBoldSDK androidInitializeBoldSDK3 = AndroidInitializeBoldSDK.this;
                j.a aVarB = j.a.b(B);
                String str3 = this.$source;
                if (i10 != 0) {
                    z11 = true;
                }
                androidInitializeBoldSDK3.initializationFailure(aVarB, from, str3, z11);
                return r.f64562a;
            }
        }
    }

    public AndroidInitializeBoldSDK(h0 h0Var, InitializeOMSDK initializeOMSDK, GetInitializationRequest getInitializationRequest, GetRequestPolicy getRequestPolicy, CleanAssets cleanAssets, HandleGatewayInitializationResponse handleGatewayInitializationResponse, GatewayClient gatewayClient, SessionRepository sessionRepository, EventObservers eventObservers, TriggerInitializeListener triggerInitializeListener, SendDiagnosticEvent sendDiagnosticEvent, DiagnosticEventRepository diagnosticEventRepository, StorageManager storageManager, ConfigurationReader configurationReader, SDKPropertiesManager sDKPropertiesManager, GetGameId getGameId, Logger logger, AndroidHandleFocusCounters androidHandleFocusCounters) {
        ck.p.j(h0Var, "defaultDispatcher");
        ck.p.j(initializeOMSDK, "initializeOM");
        ck.p.j(getInitializationRequest, "getInitializeRequest");
        ck.p.j(getRequestPolicy, "getRequestPolicy");
        ck.p.j(cleanAssets, "cleanAssets");
        ck.p.j(handleGatewayInitializationResponse, "handleGatewayInitializationResponse");
        ck.p.j(gatewayClient, "gatewayClient");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(eventObservers, "eventObservers");
        ck.p.j(triggerInitializeListener, "triggerInitializeListener");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(diagnosticEventRepository, "diagnosticEventRepository");
        ck.p.j(storageManager, "storageManager");
        ck.p.j(configurationReader, "legacyConfigurationReader");
        ck.p.j(sDKPropertiesManager, "sdkPropertiesManager");
        ck.p.j(getGameId, "getGameId");
        ck.p.j(logger, "logger");
        ck.p.j(androidHandleFocusCounters, "handleFocusCounters");
        this.defaultDispatcher = h0Var;
        this.initializeOM = initializeOMSDK;
        this.getInitializeRequest = getInitializationRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.cleanAssets = cleanAssets;
        this.handleGatewayInitializationResponse = handleGatewayInitializationResponse;
        this.gatewayClient = gatewayClient;
        this.sessionRepository = sessionRepository;
        this.eventObservers = eventObservers;
        this.triggerInitializeListener = triggerInitializeListener;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.diagnosticEventRepository = diagnosticEventRepository;
        this.storageManager = storageManager;
        this.legacyConfigurationReader = configurationReader;
        this.sdkPropertiesManager = sDKPropertiesManager;
        this.getGameId = getGameId;
        this.logger = logger;
        this.handleFocusCounters = androidHandleFocusCounters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCanInitialize() throws InitializationException {
        if (!this.sessionRepository.getShouldInitialize()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "!sessionRepository.shouldInitialize", 2, null);
        }
        if (this.getGameId.invoke() == null) {
            throw new InitializationException("gameId is null.", null, "invalid_game_id", "null", 2, null);
        }
    }

    private final String getInitLog() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Initializing SDK 4.16.5 41605 with game id ");
        sb2.append(this.getGameId.invoke());
        sb2.append(" in ");
        sb2.append(this.sessionRepository.isTestModeEnabled() ? "test" : "production");
        sb2.append(" mode, session ");
        sb2.append(ProtobufExtensionsKt.toUUID(this.sessionRepository.getSessionId()));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleResponse(UniversalResponseOuterClass.UniversalResponse universalResponse, c<? super r> cVar) throws InitializationException {
        if (universalResponse.hasError()) {
            this.sessionRepository.setShouldInitialize(false);
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", universalResponse.getError().getErrorText(), 2, null);
        }
        if (!universalResponse.hasPayload()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No payload", 2, null);
        }
        if (!universalResponse.getPayload().hasInitializationResponse()) {
            throw new InitializationException(MSG_GATEWAY_DENIED, null, "gateway", "No initialization response", 2, null);
        }
        HandleGatewayInitializationResponse handleGatewayInitializationResponse = this.handleGatewayInitializationResponse;
        InitializationResponseOuterClass.InitializationResponse initializationResponse = universalResponse.getPayload().getInitializationResponse();
        ck.p.i(initializationResponse, "response.payload.initializationResponse");
        Object objInvoke = handleGatewayInitializationResponse.invoke(initializationResponse, cVar);
        return objInvoke == sj.a.f() ? objInvoke : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(mk.i iVar, InitializationException initializationException, String str, boolean z10) {
        this.logger.error("Initialization failed: " + initializationException.getMessage(), initializationException);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), getTags(initializationException, str, z10), null, null, null, 56, null);
        this.sessionRepository.setInitializationState(InitializationState.FAILED);
        this.sdkPropertiesManager.setInitialized(false);
        this.triggerInitializeListener.error(UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, initializationException.getMessage());
        setupDiagnosticEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initializationStart(String str, boolean z10, c<? super r> cVar) throws Throwable {
        this.logger.info(getInitLog());
        this.sdkPropertiesManager.setInitializationTime();
        this.sdkPropertiesManager.setInitializationTimeSinceEpoch();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_started", null, kotlin.collections.a.m(h.a("source", str), h.a("is_retry", String.valueOf(z10)), h.a("kotlin_version", KotlinVersion.CURRENT.toString())), null, null, null, 58, null);
        this.sessionRepository.setInitializationState(InitializationState.INITIALIZING);
        Object objInvoke = this.eventObservers.invoke(cVar);
        return objInvoke == sj.a.f() ? objInvoke : r.f64562a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object initializationSuccess(mk.i iVar, String str, boolean z10, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidInitializeBoldSDK androidInitializeBoldSDK;
        SessionRepository sessionRepository;
        AndroidInitializeBoldSDK androidInitializeBoldSDK2;
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
        Object obj = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                androidInitializeBoldSDK = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.c.b(obj);
            } else if (i11 == 2) {
                androidInitializeBoldSDK = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.c.b(obj);
                androidInitializeBoldSDK.handleFocusCounters.invoke();
                sessionRepository = androidInitializeBoldSDK.sessionRepository;
                anonymousClass1.L$0 = androidInitializeBoldSDK;
                anonymousClass1.label = 3;
                if (sessionRepository.persistNativeConfiguration(anonymousClass1) == objF) {
                    return objF;
                }
                androidInitializeBoldSDK2 = androidInitializeBoldSDK;
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                androidInitializeBoldSDK2 = (AndroidInitializeBoldSDK) anonymousClass1.L$0;
                kotlin.c.b(obj);
            }
            androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
            androidInitializeBoldSDK2.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
            androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
            androidInitializeBoldSDK2.triggerInitializeListener.success();
            androidInitializeBoldSDK2.setupDiagnosticEvents();
            return r.f64562a;
        }
        kotlin.c.b(obj);
        this.logger.info("Initialized successfully");
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialize_task_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(iVar)), kotlin.collections.a.m(h.a("source", str), h.a("is_retry", String.valueOf(z10))), null, null, null, 56, null);
        this.storageManager.hasInitialized();
        InitializeOMSDK initializeOMSDK = this.initializeOM;
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (initializeOMSDK.invoke(anonymousClass1) == objF) {
            return objF;
        }
        androidInitializeBoldSDK = this;
        CleanAssets cleanAssets = androidInitializeBoldSDK.cleanAssets;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 2;
        if (cleanAssets.invoke(anonymousClass1) == objF) {
            return objF;
        }
        androidInitializeBoldSDK.handleFocusCounters.invoke();
        sessionRepository = androidInitializeBoldSDK.sessionRepository;
        anonymousClass1.L$0 = androidInitializeBoldSDK;
        anonymousClass1.label = 3;
        if (sessionRepository.persistNativeConfiguration(anonymousClass1) == objF) {
            return objF;
        }
        androidInitializeBoldSDK2 = androidInitializeBoldSDK;
        androidInitializeBoldSDK2.legacyConfigurationReader.getCurrentConfiguration().deleteFromDisk();
        androidInitializeBoldSDK2.sessionRepository.setInitializationState(InitializationState.INITIALIZED);
        androidInitializeBoldSDK2.sdkPropertiesManager.setInitialized(true);
        androidInitializeBoldSDK2.triggerInitializeListener.success();
        androidInitializeBoldSDK2.setupDiagnosticEvents();
        return r.f64562a;
    }

    private final void setupDiagnosticEvents() {
        NativeConfigurationOuterClass.DiagnosticEventsConfiguration diagnosticEvents = this.sessionRepository.getNativeConfiguration().getDiagnosticEvents();
        DiagnosticEventRepository diagnosticEventRepository = this.diagnosticEventRepository;
        ck.p.i(diagnosticEvents, "config");
        diagnosticEventRepository.configure(diagnosticEvents);
    }

    @Override // com.unity3d.ads.core.domain.InitializeBoldSDK
    public Object invoke(String str, c<? super r> cVar) {
        Object objG = nk.h.g(this.defaultDispatcher, new AnonymousClass2(str, null), cVar);
        return objG == sj.a.f() ? objG : r.f64562a;
    }

    private final Map<String, String> getTags(InitializationException initializationException, String str, boolean z10) {
        Map mapD = nj.l0.d();
        mapD.put("operation", OperationType.INITIALIZATION.toString());
        mapD.put("reason", initializationException.getReason());
        mapD.put("source", str);
        mapD.put("is_retry", String.valueOf(z10));
        if (initializationException.getReasonDebug() != null) {
            mapD.put("reason_debug", initializationException.getReasonDebug());
        }
        return nj.l0.c(mapD);
    }
}
