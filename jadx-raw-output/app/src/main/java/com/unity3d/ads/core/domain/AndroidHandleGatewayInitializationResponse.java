package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationKt;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.j;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    private final GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy;
    private final HandleDebugSettings handleDebugSettings;
    private final l0 sdkScope;
    private final SessionRepository sessionRepository;
    private final TransactionEventManager transactionEventManager;
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidHandleGatewayInitializationResponse.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayInitializationResponse$invoke$3", f = "AndroidHandleGatewayInitializationResponse.kt", l = {44}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass3(c<? super AnonymousClass3> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidHandleGatewayInitializationResponse.this.new AnonymousClass3(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass3) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                TriggerInitializationCompletedRequest triggerInitializationCompletedRequest = AndroidHandleGatewayInitializationResponse.this.triggerInitializationCompletedRequest;
                this.label = 1;
                if (triggerInitializationCompletedRequest.invoke(this) == objF) {
                    return objF;
                }
            }
            return r.f64562a;
        }
    }

    public AndroidHandleGatewayInitializationResponse(TransactionEventManager transactionEventManager, TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, SessionRepository sessionRepository, l0 l0Var, HandleDebugSettings handleDebugSettings, GetSafeguardedInitializationPolicy getSafeguardedInitializationPolicy) {
        ck.p.j(transactionEventManager, "transactionEventManager");
        ck.p.j(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(l0Var, "sdkScope");
        ck.p.j(handleDebugSettings, "handleDebugSettings");
        ck.p.j(getSafeguardedInitializationPolicy, "getSafeguardedInitializationPolicy");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = l0Var;
        this.handleDebugSettings = handleDebugSettings;
        this.getSafeguardedInitializationPolicy = getSafeguardedInitializationPolicy;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    public Object invoke(InitializationResponseOuterClass.InitializationResponse initializationResponse, c<? super r> cVar) throws GatewayException {
        boolean z10;
        if (!initializationResponse.hasError()) {
            SessionRepository sessionRepository = this.sessionRepository;
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
            ck.p.i(nativeConfiguration, "response.nativeConfiguration");
            NativeConfigurationKt.Dsl.Companion companion = NativeConfigurationKt.Dsl.Companion;
            NativeConfigurationOuterClass.NativeConfiguration.Builder builder = nativeConfiguration.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            NativeConfigurationKt.Dsl dsl_create = companion._create(builder);
            dsl_create.setInitPolicy(this.getSafeguardedInitializationPolicy.invoke(dsl_create.getInitPolicy()));
            sessionRepository.setNativeConfiguration(dsl_create._build());
            if (initializationResponse.hasUniversalRequestUrl()) {
                String universalRequestUrl = initializationResponse.getUniversalRequestUrl();
                if (universalRequestUrl != null && universalRequestUrl.length() != 0) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (!z10) {
                    SessionRepository sessionRepository2 = this.sessionRepository;
                    String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                    ck.p.i(universalRequestUrl2, "response.universalRequestUrl");
                    sessionRepository2.setGatewayUrl(universalRequestUrl2);
                }
            }
            List<AdFormatOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
            List<AdFormatOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
            ck.p.i(scarEligibleFormatsList, "response.scarEligibleFormatsList");
            scarEligibleFormats.addAll(scarEligibleFormatsList);
            if (initializationResponse.getTriggerInitializationCompletedRequest()) {
                j.d(this.sdkScope, null, null, new AnonymousClass3(null), 3, null);
            }
            if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            if (initializationResponse.getNativeConfiguration().hasDebugSettings()) {
                HandleDebugSettings handleDebugSettings = this.handleDebugSettings;
                NativeConfigurationOuterClass.DebugSettings debugSettings = initializationResponse.getNativeConfiguration().getDebugSettings();
                ck.p.i(debugSettings, "response.nativeConfiguration.debugSettings");
                handleDebugSettings.invoke(debugSettings);
            }
            return r.f64562a;
        }
        String errorText = initializationResponse.getError().getErrorText();
        ck.p.i(errorText, "response.error.errorText");
        throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
    }
}
