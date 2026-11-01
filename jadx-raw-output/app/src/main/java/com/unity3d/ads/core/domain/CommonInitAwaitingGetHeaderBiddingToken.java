package com.unity3d.ads.core.domain;

import bk.p;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.core.log.Logger;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutKt;
import mj.h;
import mj.r;
import mk.j;
import nj.n;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final Logger logger;
    private final SafeCallbackInvoke safeCallbackInvoke;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {75}, m = "fetchToken")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int I$0;
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
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {56, 68}, m = "invoke")
    public static final class C38811 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38811(c<? super C38811> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(0, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {59}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
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
                if (n.D(new InitializationState[]{InitializationState.NOT_INITIALIZED, InitializationState.INITIALIZING}, GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null))) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 1;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == objF) {
                        return objF;
                    }
                }
            }
            return r.f64562a;
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, SafeCallbackInvoke safeCallbackInvoke, Logger logger) {
        ck.p.j(getHeaderBiddingToken, "getHeaderBiddingToken");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        ck.p.j(getInitializationState, "getInitializationState");
        ck.p.j(awaitInitialization, "awaitInitialization");
        ck.p.j(sessionRepository, "sessionRepository");
        ck.p.j(safeCallbackInvoke, "safeCallbackInvoke");
        ck.p.j(logger, "logger");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.safeCallbackInvoke = safeCallbackInvoke;
        this.logger = logger;
        this.startTime = j.f64572a.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchToken(int i10, TokenConfiguration tokenConfiguration, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        String shortenedStackTrace$default;
        String str;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object objInvoke = anonymousClass1.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass1.label;
        String str2 = null;
        if (i12 == 0) {
            kotlin.c.b(objInvoke);
            try {
                GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.I$0 = i10;
                anonymousClass1.label = 1;
                objInvoke = getHeaderBiddingToken.invoke(i10, tokenConfiguration, anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                commonInitAwaitingGetHeaderBiddingToken = this;
            } catch (Exception e10) {
                e = e10;
                commonInitAwaitingGetHeaderBiddingToken = this;
                shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str = "uncaught_exception";
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = anonymousClass1.I$0;
            commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) anonymousClass1.L$0;
            try {
                kotlin.c.b(objInvoke);
            } catch (Exception e11) {
                e = e11;
                shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str = "uncaught_exception";
            }
        }
        str = null;
        str2 = (String) objInvoke;
        shortenedStackTrace$default = null;
        if (str2 == null) {
            commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, str, shortenedStackTrace$default);
        } else {
            commonInitAwaitingGetHeaderBiddingToken.tokenSuccess(i10, str2);
        }
        return r.f64562a;
    }

    private final void tokenFailure(int i10, String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.b(this.startTime)));
        Map mapD = nj.l0.d();
        mapD.put("sync", com.ironsource.mediationsdk.metadata.a.f29886h);
        mapD.put("state", String.valueOf(this.startState));
        mapD.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        mapD.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            mapD.put("reason_debug", str2);
        }
        r rVar = r.f64562a;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, nj.l0.c(mapD), null, null, Integer.valueOf(i10), 24, null);
        Logger.DefaultImpls.error$default(this.logger, "Returned nil token due to: " + str, null, 2, null);
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenFailure.2
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
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(null);
                }
            }
        });
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, str, str2);
    }

    private final void tokenStart(int i10) {
        this.logger.info("Token generation started");
        this.startState = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, kotlin.collections.a.m(h.a("sync", com.ironsource.mediationsdk.metadata.a.f29886h), h.a("state", String.valueOf(this.startState))), null, null, Integer.valueOf(i10), 26, null);
    }

    private final void tokenSuccess(int i10, final String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(j.a.b(this.startTime))), kotlin.collections.a.m(h.a("sync", com.ironsource.mediationsdk.metadata.a.f29886h), h.a("state", String.valueOf(this.startState)), h.a("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), h.a("awaited_init", String.valueOf(this.didAwaitInit))), null, null, Integer.valueOf(i10), 24, null);
        this.logger.info("Generated a valid token.");
        this.safeCallbackInvoke.invoke(new bk.a<r>() { // from class: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess.1
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
                IUnityAdsTokenListener listener = CommonInitAwaitingGetHeaderBiddingToken.this.getListener();
                if (listener != null) {
                    listener.onUnityAdsTokenReady(str);
                }
            }
        });
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final SafeCallbackInvoke getSafeCallbackInvoke() {
        return this.safeCallbackInvoke;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* JADX INFO: renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m3172getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener, c<? super r> cVar) throws Throwable {
        C38811 c38811;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        if (cVar instanceof C38811) {
            c38811 = (C38811) cVar;
            int i11 = c38811.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c38811.label = i11 - Integer.MIN_VALUE;
            } else {
                c38811 = new C38811(cVar);
            }
        } else {
            c38811 = new C38811(cVar);
        }
        Object obj = c38811.result;
        Object objF = sj.a.f();
        int i12 = c38811.label;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = c38811.I$0;
                tokenConfiguration = (TokenConfiguration) c38811.L$1;
                commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) c38811.L$0;
                kotlin.c.b(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        this.listener = iUnityAdsTokenListener;
        tokenStart(i10);
        if (iUnityAdsTokenListener == null) {
            tokenFailure(i10, "listener_null", "IUnityAdsTokenListener is null");
            return r.f64562a;
        }
        if (!this.sessionRepository.getShouldInitialize()) {
            tokenFailure(i10, "gateway", "!sessionRepository.shouldInitialize");
            return r.f64562a;
        }
        long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        c38811.L$0 = this;
        c38811.L$1 = tokenConfiguration;
        c38811.I$0 = i10;
        c38811.label = 1;
        if (TimeoutKt.d(getTokenTimeoutMs, anonymousClass2, c38811) == objF) {
            return objF;
        }
        commonInitAwaitingGetHeaderBiddingToken = this;
        if (!commonInitAwaitingGetHeaderBiddingToken.sessionRepository.getShouldInitialize()) {
            commonInitAwaitingGetHeaderBiddingToken.tokenFailure(i10, "gateway", "!sessionRepository.shouldInitialize");
            return r.f64562a;
        }
        c38811.L$0 = null;
        c38811.L$1 = null;
        c38811.label = 2;
        if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(i10, tokenConfiguration, c38811) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
