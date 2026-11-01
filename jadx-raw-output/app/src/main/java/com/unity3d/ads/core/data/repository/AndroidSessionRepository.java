package com.unity3d.ads.core.data.repository;

import com.explorestack.protobuf.openrtb.LossReason;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.AndroidUnityInfoDataSource;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.properties.SessionIdReader;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.h;
import mj.r;
import nk.h0;
import nk.i;
import nk.j;
import nk.l0;
import qk.c;
import qk.e;
import qk.k;
import qk.l;
import qk.p;
import qk.q;
import qk.v;
import tj.d;

/* JADX INFO: compiled from: AndroidSessionRepository.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidSessionRepository implements SessionRepository {
    private final l<ByteString> _currentState;
    private l<String> _gameId;
    private final l<String> _gatewayUrl;
    private final l<Integer> _headerBiddingTokenCounter;
    private final l<InitializationState> _initializationState;
    private final l<Boolean> _isFirstInitAttempt;
    private final l<Boolean> _isTestModeEnabled;
    private k<SessionChange> _onChange;
    private final l<NativeConfigurationOuterClass.NativeConfiguration> _sdkConfiguration;
    private final l<SessionCountersOuterClass.SessionCounters> _sessionCounters;
    private final l<ByteString> _sessionId;
    private final l<ByteString> _sessionToken;
    private final l<Boolean> _shouldInitialize;
    private final l<TokenCounters> _tokenCounters;
    private final ByteStringDataSource fsmDataSource;
    private final ByteStringDataSource gatewayCacheDataSource;
    private final l<Boolean> isInit;
    private final ByteStringDataSource nativeConfigDataSource;
    private final p<SessionChange> onChange;
    private final c<NativeConfigurationOuterClass.NativeConfiguration> persistedNativeConfiguration;
    private final ByteStringDataSource privacyDataSource;
    private final List<AdFormatOuterClass.AdFormat> scarEligibleFormats;
    private final AndroidUnityInfoDataSource unityInfoDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getGatewayCache$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE}, m = "getGatewayCache")
    public static final class C38741 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C38741(rj.c<? super C38741> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getGatewayCache(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE}, m = "getPrivacy")
    public static final class C38751 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C38751(rj.c<? super C38751> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$getPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE}, m = "getPrivacyFsm")
    public static final class C38761 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public C38761(rj.c<? super C38761> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.getPrivacyFsm(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacy$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "setPrivacy")
    public static final class C38771 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38771(rj.c<? super C38771> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacy(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$setPrivacyFsm$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "setPrivacyFsm")
    public static final class C38781 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C38781(rj.c<? super C38781> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidSessionRepository.this.setPrivacyFsm(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidSessionRepository.kt */
    @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$1", f = "AndroidSessionRepository.kt", l = {45}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, rj.c<? super r>, Object> {
        public final /* synthetic */ SendDiagnosticEvent $sendDiagnosticEvent;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendDiagnosticEvent sendDiagnosticEvent, rj.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$sendDiagnosticEvent = sendDiagnosticEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final rj.c<r> create(Object obj, rj.c<?> cVar) {
            return AndroidSessionRepository.this.new AnonymousClass1(this.$sendDiagnosticEvent, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, rj.c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    ByteStringDataSource byteStringDataSource = AndroidSessionRepository.this.nativeConfigDataSource;
                    this.label = 1;
                    obj = byteStringDataSource.get(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
                if (!data.isEmpty()) {
                    l lVar = AndroidSessionRepository.this._sdkConfiguration;
                    NativeConfigurationOuterClass.NativeConfiguration from = NativeConfigurationOuterClass.NativeConfiguration.parseFrom(data);
                    ck.p.i(from, "parseFrom(data)");
                    lVar.setValue(from);
                }
            } catch (Exception e10) {
                SendDiagnosticEvent sendDiagnosticEvent = this.$sendDiagnosticEvent;
                String message = e10.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialize_missed_native_parsing", null, nj.l0.g(h.a("debugReason", message)), null, null, null, 58, null);
            }
            AndroidSessionRepository.this.isInit.setValue(tj.a.a(true));
            return r.f64562a;
        }
    }

    public AndroidSessionRepository(ByteStringDataSource byteStringDataSource, ByteStringDataSource byteStringDataSource2, ByteStringDataSource byteStringDataSource3, ByteStringDataSource byteStringDataSource4, AndroidUnityInfoDataSource androidUnityInfoDataSource, NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration, h0 h0Var, SendDiagnosticEvent sendDiagnosticEvent) {
        ck.p.j(byteStringDataSource, "gatewayCacheDataSource");
        ck.p.j(byteStringDataSource2, "privacyDataSource");
        ck.p.j(byteStringDataSource3, "fsmDataSource");
        ck.p.j(byteStringDataSource4, "nativeConfigDataSource");
        ck.p.j(androidUnityInfoDataSource, "unityInfoDataSource");
        ck.p.j(nativeConfiguration, "defaultNativeConfiguration");
        ck.p.j(h0Var, "dispatcher");
        ck.p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.gatewayCacheDataSource = byteStringDataSource;
        this.privacyDataSource = byteStringDataSource2;
        this.fsmDataSource = byteStringDataSource3;
        this.nativeConfigDataSource = byteStringDataSource4;
        this.unityInfoDataSource = androidUnityInfoDataSource;
        l<NativeConfigurationOuterClass.NativeConfiguration> lVarA = v.a(nativeConfiguration);
        this._sdkConfiguration = lVarA;
        l<Boolean> lVarA2 = v.a(Boolean.FALSE);
        this.isInit = lVarA2;
        j.d(kotlinx.coroutines.d.a(h0Var), null, null, new AnonymousClass1(sendDiagnosticEvent, null), 3, null);
        final c cVarU = e.u(lVarA, lVarA2, new AndroidSessionRepository$persistedNativeConfiguration$1(null));
        final c<Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> cVar = new c<Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$filter$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public Object L$1;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(rj.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(qk.d dVar) {
                    this.$this_unsafeFlow = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // qk.d
                public final Object emit(Object obj, rj.c cVar) throws Throwable {
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
                        if (((Boolean) ((Pair) obj).getSecond()).booleanValue()) {
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
            public Object collect(qk.d<? super Pair<? extends NativeConfigurationOuterClass.NativeConfiguration, ? extends Boolean>> dVar, rj.c cVar2) {
                Object objCollect = cVarU.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.persistedNativeConfiguration = new c<NativeConfigurationOuterClass.NativeConfiguration>() { // from class: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            public static final class AnonymousClass2<T> implements qk.d {
                public final /* synthetic */ qk.d $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @d(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository$special$$inlined$map$1$2", f = "AndroidSessionRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public AnonymousClass1(rj.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(qk.d dVar) {
                    this.$this_unsafeFlow = dVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // qk.d
                public final Object emit(Object obj, rj.c cVar) throws Throwable {
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
                        Object first = ((Pair) obj).getFirst();
                        anonymousClass1.label = 1;
                        if (dVar.emit(first, anonymousClass1) == objF) {
                            return objF;
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
            public Object collect(qk.d<? super NativeConfigurationOuterClass.NativeConfiguration> dVar, rj.c cVar2) {
                Object objCollect = cVar.collect(new AnonymousClass2(dVar), cVar2);
                return objCollect == sj.a.f() ? objCollect : r.f64562a;
            }
        };
        this.scarEligibleFormats = new ArrayList();
        k<SessionChange> kVarB = q.b(0, 0, null, 7, null);
        this._onChange = kVarB;
        this.onChange = e.a(kVarB);
        String gameId = ClientProperties.getGameId();
        this._gameId = v.a(gameId != null ? gameId : null);
        UUID uuidFromString = UUID.fromString(SessionIdReader.INSTANCE.getSessionId());
        ck.p.i(uuidFromString, "fromString(SessionIdReader.sessionId)");
        this._sessionId = v.a(ProtobufExtensionsKt.toByteString(uuidFromString));
        this._isTestModeEnabled = v.a(Boolean.valueOf(SdkProperties.isTestMode()));
        SessionCountersOuterClass.SessionCounters sessionCountersBuild = SessionCountersOuterClass.SessionCounters.newBuilder().build();
        ck.p.i(sessionCountersBuild, "newBuilder().build()");
        this._sessionCounters = v.a(sessionCountersBuild);
        this._tokenCounters = v.a(new TokenCounters(0, 0, 0));
        ByteString byteString = ByteString.EMPTY;
        ck.p.i(byteString, "EMPTY");
        this._sessionToken = v.a(byteString);
        ck.p.i(byteString, "EMPTY");
        this._currentState = v.a(byteString);
        this._gatewayUrl = v.a(UnityAdsConstants.DefaultUrls.GATEWAY_URL);
        this._initializationState = v.a(InitializationState.NOT_INITIALIZED);
        this._headerBiddingTokenCounter = v.a(0);
        Boolean bool = Boolean.TRUE;
        this._shouldInitialize = v.a(bool);
        this._isFirstInitAttempt = v.a(bool);
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void addTimeToGlobalAdsFocusTime(int i10) {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusTime(dsl_create.getGlobalAdsFocusTime() + i10);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGameId() {
        String value;
        String gameId;
        l<String> lVar = this._gameId;
        do {
            value = lVar.getValue();
            gameId = ClientProperties.getGameId();
            if (gameId == null) {
                gameId = null;
            }
        } while (!lVar.a(value, gameId));
        return gameId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getGatewayCache(rj.c<? super ByteString> cVar) throws Throwable {
        C38741 c38741;
        if (cVar instanceof C38741) {
            c38741 = (C38741) cVar;
            int i10 = c38741.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38741.label = i10 - Integer.MIN_VALUE;
            } else {
                c38741 = new C38741(cVar);
            }
        } else {
            c38741 = new C38741(cVar);
        }
        Object obj = c38741.result;
        Object objF = sj.a.f();
        int i11 = c38741.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            ByteStringDataSource byteStringDataSource = this.gatewayCacheDataSource;
            c38741.label = 1;
            obj = byteStringDataSource.get(c38741);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        ck.p.i(data, "gatewayCacheDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getGatewayState() {
        return this._currentState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getGatewayUrl() {
        return this._gatewayUrl.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public int getHeaderBiddingTokenCounter() {
        Integer value;
        Integer num;
        l<Integer> lVar = this._headerBiddingTokenCounter;
        do {
            value = lVar.getValue();
            num = value;
        } while (!lVar.a(value, Integer.valueOf(num.intValue() + 1)));
        return num.intValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public InitializationState getInitializationState() {
        return this._initializationState.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration() {
        return !this.isInit.getValue().booleanValue() ? (NativeConfigurationOuterClass.NativeConfiguration) i.b(null, new AndroidSessionRepository$nativeConfiguration$1(this, null), 1, null) : this._sdkConfiguration.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public c<InitializationState> getObserveInitializationState() {
        return this._initializationState;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public p<SessionChange> getOnChange() {
        return this.onChange;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacy(rj.c<? super ByteString> cVar) throws Throwable {
        C38751 c38751;
        if (cVar instanceof C38751) {
            c38751 = (C38751) cVar;
            int i10 = c38751.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38751.label = i10 - Integer.MIN_VALUE;
            } else {
                c38751 = new C38751(cVar);
            }
        } else {
            c38751 = new C38751(cVar);
        }
        Object obj = c38751.result;
        Object objF = sj.a.f();
        int i11 = c38751.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            ByteStringDataSource byteStringDataSource = this.privacyDataSource;
            c38751.label = 1;
            obj = byteStringDataSource.get(c38751);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        ck.p.i(data, "privacyDataSource.get().data");
        return data;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object getPrivacyFsm(rj.c<? super ByteString> cVar) throws Throwable {
        C38761 c38761;
        if (cVar instanceof C38761) {
            c38761 = (C38761) cVar;
            int i10 = c38761.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38761.label = i10 - Integer.MIN_VALUE;
            } else {
                c38761 = new C38761(cVar);
            }
        } else {
            c38761 = new C38761(cVar);
        }
        Object obj = c38761.result;
        Object objF = sj.a.f();
        int i11 = c38761.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            ByteStringDataSource byteStringDataSource = this.fsmDataSource;
            c38761.label = 1;
            obj = byteStringDataSource.get(c38761);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(obj);
        }
        ByteString data = ((ByteStringStoreOuterClass.ByteStringStore) obj).getData();
        ck.p.i(data, "fsmDataSource.get().data");
        return data;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public List<AdFormatOuterClass.AdFormat> getScarEligibleFormats() {
        return this.scarEligibleFormats;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public SessionCountersOuterClass.SessionCounters getSessionCounters() {
        return this._sessionCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionId() {
        return this._sessionId.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public ByteString getSessionToken() {
        return this._sessionToken.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean getShouldInitialize() {
        return this._shouldInitialize.getValue().booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public TokenCounters getTokenCounters() {
        return this._tokenCounters.getValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityInstallationId() {
        return this.unityInfoDataSource.getUnityInstallationId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public String getUnityMegaSessionId() {
        return this.unityInfoDataSource.getUnityMegaSessionId();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerImpressionCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerImpressions(dsl_create.getBannerImpressions() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerRequestsAdm(dsl_create.getBannerRequestsAdm() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementBannerLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setBannerLoadRequests(dsl_create.getBannerLoadRequests() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setFocusChangeCount(dsl_create.getFocusChangeCount() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementGlobalAdsFocusChangeCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setGlobalAdsFocusChangeCount(dsl_create.getGlobalAdsFocusChangeCount() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestAdmCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequestsAdm(dsl_create.getLoadRequestsAdm() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementLoadRequestCount() {
        SessionCountersOuterClass.SessionCounters value;
        SessionCountersKt.Dsl dsl_create;
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        do {
            value = lVar.getValue();
            SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
            SessionCountersOuterClass.SessionCounters.Builder builder = value.toBuilder();
            ck.p.i(builder, "this.toBuilder()");
            dsl_create = companion._create(builder);
            dsl_create.setLoadRequests(dsl_create.getLoadRequests() + 1);
        } while (!lVar.a(value, dsl_create._build()));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenSequenceNumber() {
        TokenCounters value;
        TokenCounters tokenCounters;
        l<TokenCounters> lVar = this._tokenCounters;
        do {
            value = lVar.getValue();
            tokenCounters = value;
        } while (!lVar.a(value, TokenCounters.copy$default(tokenCounters, tokenCounters.getSeq() + 1, 0, 0, 6, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenStartsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        l<TokenCounters> lVar = this._tokenCounters;
        do {
            value = lVar.getValue();
            tokenCounters = value;
        } while (!lVar.a(value, TokenCounters.copy$default(tokenCounters, 0, 0, tokenCounters.getStarts() + 1, 3, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void incrementTokenWinsCount() {
        TokenCounters value;
        TokenCounters tokenCounters;
        l<TokenCounters> lVar = this._tokenCounters;
        do {
            value = lVar.getValue();
            tokenCounters = value;
        } while (!lVar.a(value, TokenCounters.copy$default(tokenCounters, 0, tokenCounters.getWins() + 1, 0, 5, null)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isFirstInitAttempt() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this._isFirstInitAttempt;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.a(value, Boolean.FALSE));
        return bool.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isTestModeEnabled() {
        Boolean value;
        Boolean boolValueOf;
        l<Boolean> lVar = this._isTestModeEnabled;
        do {
            value = lVar.getValue();
            value.booleanValue();
            boolValueOf = Boolean.valueOf(SdkProperties.isTestMode());
        } while (!lVar.a(value, boolValueOf));
        return boolValueOf.booleanValue();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object persistNativeConfiguration(rj.c<? super r> cVar) {
        ByteStringDataSource byteStringDataSource = this.nativeConfigDataSource;
        ByteString byteString = getNativeConfiguration().toByteString();
        ck.p.i(byteString, "nativeConfiguration.toByteString()");
        Object obj = byteStringDataSource.set(byteString, cVar);
        return obj == sj.a.f() ? obj : r.f64562a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void resetTokenCounters() {
        l<TokenCounters> lVar = this._tokenCounters;
        while (!lVar.a(lVar.getValue(), new TokenCounters(0, 0, 0))) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGameId(String str) {
        String value;
        l<String> lVar = this._gameId;
        do {
            value = lVar.getValue();
            ClientProperties.setGameId(str);
        } while (!lVar.a(value, str));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setGatewayCache(ByteString byteString, rj.c<? super r> cVar) {
        Object obj = this.gatewayCacheDataSource.set(byteString, cVar);
        return obj == sj.a.f() ? obj : r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setPrivacy(ByteString byteString, rj.c<? super r> cVar) throws Throwable {
        C38771 c38771;
        AndroidSessionRepository androidSessionRepository;
        if (cVar instanceof C38771) {
            c38771 = (C38771) cVar;
            int i10 = c38771.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38771.label = i10 - Integer.MIN_VALUE;
            } else {
                c38771 = new C38771(cVar);
            }
        } else {
            c38771 = new C38771(cVar);
        }
        Object obj = c38771.result;
        Object objF = sj.a.f();
        int i11 = c38771.label;
        if (i11 != 0) {
            if (i11 == 1) {
                byteString = (ByteString) c38771.L$1;
                androidSessionRepository = (AndroidSessionRepository) c38771.L$0;
                kotlin.c.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        ByteStringDataSource byteStringDataSource = this.privacyDataSource;
        c38771.L$0 = this;
        c38771.L$1 = byteString;
        c38771.label = 1;
        if (byteStringDataSource.set(byteString, c38771) == objF) {
            return objF;
        }
        androidSessionRepository = this;
        k<SessionChange> kVar = androidSessionRepository._onChange;
        SessionChange.UserConsentChange userConsentChange = new SessionChange.UserConsentChange(byteString);
        c38771.L$0 = null;
        c38771.L$1 = null;
        c38771.label = 2;
        if (kVar.emit(userConsentChange, c38771) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public Object setPrivacyFsm(ByteString byteString, rj.c<? super r> cVar) throws Throwable {
        C38781 c38781;
        AndroidSessionRepository androidSessionRepository;
        if (cVar instanceof C38781) {
            c38781 = (C38781) cVar;
            int i10 = c38781.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c38781.label = i10 - Integer.MIN_VALUE;
            } else {
                c38781 = new C38781(cVar);
            }
        } else {
            c38781 = new C38781(cVar);
        }
        Object obj = c38781.result;
        Object objF = sj.a.f();
        int i11 = c38781.label;
        if (i11 != 0) {
            if (i11 == 1) {
                byteString = (ByteString) c38781.L$1;
                androidSessionRepository = (AndroidSessionRepository) c38781.L$0;
                kotlin.c.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(obj);
            }
            return r.f64562a;
        }
        kotlin.c.b(obj);
        ByteStringDataSource byteStringDataSource = this.fsmDataSource;
        c38781.L$0 = this;
        c38781.L$1 = byteString;
        c38781.label = 1;
        if (byteStringDataSource.set(byteString, c38781) == objF) {
            return objF;
        }
        androidSessionRepository = this;
        k<SessionChange> kVar = androidSessionRepository._onChange;
        SessionChange.PrivacyFsmChange privacyFsmChange = new SessionChange.PrivacyFsmChange(byteString);
        c38781.L$0 = null;
        c38781.L$1 = null;
        c38781.label = 2;
        if (kVar.emit(privacyFsmChange, c38781) == objF) {
            return objF;
        }
        return r.f64562a;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setShouldInitialize(boolean z10) {
        Boolean value;
        l<Boolean> lVar = this._shouldInitialize;
        do {
            value = lVar.getValue();
            value.booleanValue();
        } while (!lVar.a(value, Boolean.valueOf(z10)));
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public NativeConfigurationOuterClass.FeatureFlags getFeatureFlags() {
        NativeConfigurationOuterClass.FeatureFlags featureFlags = getNativeConfiguration().getFeatureFlags();
        ck.p.i(featureFlags, "nativeConfiguration.featureFlags");
        return featureFlags;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isDiagnosticsEnabled() {
        return getNativeConfiguration().getDiagnosticEvents().getEnabled();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isOmEnabled() {
        return getNativeConfiguration().getEnableOm();
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public boolean isSdkInitialized() {
        if (getInitializationState() == InitializationState.INITIALIZED) {
            return true;
        }
        return false;
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayState(ByteString byteString) {
        ck.p.j(byteString, "value");
        l<ByteString> lVar = this._currentState;
        while (!lVar.a(lVar.getValue(), byteString)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setGatewayUrl(String str) {
        ck.p.j(str, "value");
        l<String> lVar = this._gatewayUrl;
        while (!lVar.a(lVar.getValue(), str)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setInitializationState(InitializationState initializationState) {
        ck.p.j(initializationState, "value");
        l<InitializationState> lVar = this._initializationState;
        while (!lVar.a(lVar.getValue(), initializationState)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration) {
        ck.p.j(nativeConfiguration, "value");
        l<NativeConfigurationOuterClass.NativeConfiguration> lVar = this._sdkConfiguration;
        while (!lVar.a(lVar.getValue(), nativeConfiguration)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters) {
        ck.p.j(sessionCounters, "value");
        l<SessionCountersOuterClass.SessionCounters> lVar = this._sessionCounters;
        while (!lVar.a(lVar.getValue(), sessionCounters)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setSessionToken(ByteString byteString) {
        ck.p.j(byteString, "value");
        l<ByteString> lVar = this._sessionToken;
        while (!lVar.a(lVar.getValue(), byteString)) {
        }
    }

    @Override // com.unity3d.ads.core.data.repository.SessionRepository
    public void setTokenCounters(TokenCounters tokenCounters) {
        ck.p.j(tokenCounters, "value");
        l<TokenCounters> lVar = this._tokenCounters;
        while (!lVar.a(lVar.getValue(), tokenCounters)) {
        }
    }
}
