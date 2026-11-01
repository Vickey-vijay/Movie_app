package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.HeaderBiddingTokenKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TestDataOuterClass;
import gatewayprotocol.v1.TokenCountersKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidBuildHeaderBiddingToken implements BuildHeaderBiddingToken {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetInitializationData getInitializationData;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getTimestamps;
    private final OfferwallManager offerwallManager;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final AndroidTestDataInfo testDataInfo;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidBuildHeaderBiddingToken.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidBuildHeaderBiddingToken", f = "AndroidBuildHeaderBiddingToken.kt", l = {40, 52, 57, 60, 62}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidBuildHeaderBiddingToken.this.invoke(0, null, false, this);
        }
    }

    public AndroidBuildHeaderBiddingToken(GetByteStringId getByteStringId, GetClientInfo getClientInfo, GetSharedDataTimestamps getSharedDataTimestamps, GetLimitedSessionToken getLimitedSessionToken, GetInitializationData getInitializationData, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository, TcfRepository tcfRepository, AndroidTestDataInfo androidTestDataInfo, OfferwallManager offerwallManager) {
        p.j(getByteStringId, "generateId");
        p.j(getClientInfo, "getClientInfo");
        p.j(getSharedDataTimestamps, "getTimestamps");
        p.j(getLimitedSessionToken, "getLimitedSessionToken");
        p.j(getInitializationData, "getInitializationData");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(sessionRepository, "sessionRepository");
        p.j(campaignRepository, "campaignRepository");
        p.j(tcfRepository, "tcfRepository");
        p.j(androidTestDataInfo, "testDataInfo");
        p.j(offerwallManager, "offerwallManager");
        this.generateId = getByteStringId;
        this.getClientInfo = getClientInfo;
        this.getTimestamps = getSharedDataTimestamps;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.getInitializationData = getInitializationData;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
        this.tcfRepository = tcfRepository;
        this.testDataInfo = androidTestDataInfo;
        this.offerwallManager = offerwallManager;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x01d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01de  */
    /* JADX WARN: Code duplicated, block: B:56:0x01f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:61:0x0214 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0215  */
    /* JADX WARN: Code duplicated, block: B:64:0x0223  */
    /* JADX WARN: Code duplicated, block: B:67:0x023d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.BuildHeaderBiddingToken
    public Object invoke(int i10, TokenConfiguration tokenConfiguration, boolean z10, c<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        TokenCounters tokenCounters;
        HeaderBiddingTokenKt.Dsl dsl_create;
        TokenConfiguration tokenConfiguration2;
        ByteString byteString;
        boolean z11;
        HeaderBiddingTokenKt.Dsl dsl;
        HeaderBiddingTokenKt.Dsl dsl2;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken;
        TokenCounters tokenCounters2;
        HeaderBiddingTokenKt.Dsl dsl3;
        ByteString byteString2;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken2;
        HeaderBiddingTokenKt.Dsl dsl4;
        String gameId;
        boolean z12;
        HeaderBiddingTokenKt.Dsl dsl5;
        HeaderBiddingTokenKt.Dsl dsl6;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken3;
        HeaderBiddingTokenKt.Dsl dsl7;
        boolean z13;
        HeaderBiddingTokenKt.Dsl dsl8;
        HeaderBiddingTokenKt.Dsl dsl9;
        HeaderBiddingTokenKt.Dsl dsl10;
        TokenCounters tokenCounters3;
        AndroidBuildHeaderBiddingToken androidBuildHeaderBiddingToken4;
        TestDataOuterClass.TestData testDataInvoke;
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
        Object objIsConnected = anonymousClass1.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                z11 = anonymousClass1.Z$0;
                HeaderBiddingTokenKt.Dsl dsl11 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$6;
                HeaderBiddingTokenKt.Dsl dsl12 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$5;
                dsl2 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                byteString = (ByteString) anonymousClass1.L$3;
                tokenCounters = (TokenCounters) anonymousClass1.L$2;
                tokenConfiguration2 = (TokenConfiguration) anonymousClass1.L$1;
                androidBuildHeaderBiddingToken = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                kotlin.c.b(objIsConnected);
                dsl = dsl11;
                dsl_create = dsl12;
            } else {
                if (i12 == 2) {
                    dsl3 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$5;
                    HeaderBiddingTokenKt.Dsl dsl13 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                    HeaderBiddingTokenKt.Dsl dsl14 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                    byteString2 = (ByteString) anonymousClass1.L$2;
                    TokenCounters tokenCounters4 = (TokenCounters) anonymousClass1.L$1;
                    androidBuildHeaderBiddingToken2 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                    kotlin.c.b(objIsConnected);
                    dsl4 = dsl14;
                    dsl_create = dsl13;
                    tokenCounters2 = tokenCounters4;
                    dsl3.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
                    if (byteString2.isEmpty()) {
                        gameId = androidBuildHeaderBiddingToken2.sessionRepository.getGameId();
                        if (gameId == null) {
                            if (gameId.length() > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            z12 = z13;
                        }
                        if (z12) {
                            GetInitializationData getInitializationData = androidBuildHeaderBiddingToken2.getInitializationData;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                            anonymousClass1.L$1 = tokenCounters2;
                            anonymousClass1.L$2 = dsl4;
                            anonymousClass1.L$3 = dsl_create;
                            anonymousClass1.L$4 = dsl_create;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 3;
                            objIsConnected = getInitializationData.invoke(anonymousClass1);
                            if (objIsConnected == objF) {
                                return objF;
                            }
                            dsl7 = dsl_create;
                            dsl6 = dsl7;
                            androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            dsl7.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                            dsl8 = dsl4;
                            DeviceInfoRepository deviceInfoRepository = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                            anonymousClass1.L$1 = tokenCounters2;
                            anonymousClass1.L$2 = dsl8;
                            anonymousClass1.L$3 = dsl6;
                            anonymousClass1.L$4 = dsl6;
                            anonymousClass1.label = 5;
                            objIsConnected = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                            if (objIsConnected == objF) {
                                return objF;
                            }
                            dsl9 = dsl6;
                            dsl10 = dsl9;
                            tokenCounters3 = tokenCounters2;
                            androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                        } else {
                            GetLimitedSessionToken getLimitedSessionToken = androidBuildHeaderBiddingToken2.getLimitedSessionToken;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                            anonymousClass1.L$1 = tokenCounters2;
                            anonymousClass1.L$2 = dsl4;
                            anonymousClass1.L$3 = dsl_create;
                            anonymousClass1.L$4 = dsl_create;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 4;
                            objIsConnected = getLimitedSessionToken.invoke(anonymousClass1);
                            if (objIsConnected == objF) {
                                return objF;
                            }
                            dsl5 = dsl_create;
                            dsl6 = dsl5;
                            androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                            dsl5.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                            dsl8 = dsl4;
                            DeviceInfoRepository deviceInfoRepository2 = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                            anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                            anonymousClass1.L$1 = tokenCounters2;
                            anonymousClass1.L$2 = dsl8;
                            anonymousClass1.L$3 = dsl6;
                            anonymousClass1.L$4 = dsl6;
                            anonymousClass1.label = 5;
                            objIsConnected = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                            if (objIsConnected == objF) {
                                return objF;
                            }
                            dsl9 = dsl6;
                            dsl10 = dsl9;
                            tokenCounters3 = tokenCounters2;
                            androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                        }
                    } else {
                        dsl_create.setSessionToken(androidBuildHeaderBiddingToken2.sessionRepository.getSessionToken());
                        dsl_create.setStaticDeviceInfo(androidBuildHeaderBiddingToken2.deviceInfoRepository.cachedStaticDeviceInfo());
                    }
                    testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
                    if (testDataInvoke != null) {
                        dsl_create.setTestData(testDataInvoke);
                    }
                    TokenCountersKt.Dsl.Companion companion = TokenCountersKt.Dsl.Companion;
                    HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
                    p.i(builderNewBuilder, "newBuilder()");
                    TokenCountersKt.Dsl dsl_create2 = companion._create(builderNewBuilder);
                    dsl_create2.setSeq(tokenCounters2.getSeq());
                    dsl_create2.setWins(tokenCounters2.getWins());
                    dsl_create2.setStarts(tokenCounters2.getStarts());
                    dsl_create.setTokenCounters(dsl_create2._build());
                    return dsl4._build();
                }
                if (i12 == 3) {
                    dsl7 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                    dsl6 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                    dsl4 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                    tokenCounters2 = (TokenCounters) anonymousClass1.L$1;
                    androidBuildHeaderBiddingToken3 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                    kotlin.c.b(objIsConnected);
                    dsl7.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                    dsl8 = dsl4;
                    DeviceInfoRepository deviceInfoRepository3 = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                    anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                    anonymousClass1.L$1 = tokenCounters2;
                    anonymousClass1.L$2 = dsl8;
                    anonymousClass1.L$3 = dsl6;
                    anonymousClass1.L$4 = dsl6;
                    anonymousClass1.label = 5;
                    objIsConnected = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                    if (objIsConnected == objF) {
                        return objF;
                    }
                    dsl9 = dsl6;
                    dsl10 = dsl9;
                    tokenCounters3 = tokenCounters2;
                    androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                } else if (i12 == 4) {
                    dsl5 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                    dsl6 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                    dsl4 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                    tokenCounters2 = (TokenCounters) anonymousClass1.L$1;
                    androidBuildHeaderBiddingToken3 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                    kotlin.c.b(objIsConnected);
                    dsl5.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                    dsl8 = dsl4;
                    DeviceInfoRepository deviceInfoRepository4 = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                    anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                    anonymousClass1.L$1 = tokenCounters2;
                    anonymousClass1.L$2 = dsl8;
                    anonymousClass1.L$3 = dsl6;
                    anonymousClass1.L$4 = dsl6;
                    anonymousClass1.label = 5;
                    objIsConnected = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
                    if (objIsConnected == objF) {
                        return objF;
                    }
                    dsl9 = dsl6;
                    dsl10 = dsl9;
                    tokenCounters3 = tokenCounters2;
                    androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                } else {
                    if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dsl9 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$4;
                    dsl10 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$3;
                    dsl8 = (HeaderBiddingTokenKt.Dsl) anonymousClass1.L$2;
                    tokenCounters3 = (TokenCounters) anonymousClass1.L$1;
                    androidBuildHeaderBiddingToken4 = (AndroidBuildHeaderBiddingToken) anonymousClass1.L$0;
                    kotlin.c.b(objIsConnected);
                }
            }
            dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
            androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken4;
            dsl_create = dsl10;
            dsl4 = dsl8;
            tokenCounters2 = tokenCounters3;
            testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
            if (testDataInvoke != null) {
                dsl_create.setTestData(testDataInvoke);
            }
            TokenCountersKt.Dsl.Companion companion2 = TokenCountersKt.Dsl.Companion;
            HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder2 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
            p.i(builderNewBuilder2, "newBuilder()");
            TokenCountersKt.Dsl dsl_create3 = companion2._create(builderNewBuilder2);
            dsl_create3.setSeq(tokenCounters2.getSeq());
            dsl_create3.setWins(tokenCounters2.getWins());
            dsl_create3.setStarts(tokenCounters2.getStarts());
            dsl_create.setTokenCounters(dsl_create3._build());
            return dsl4._build();
        }
        kotlin.c.b(objIsConnected);
        tokenCounters = this.sessionRepository.getTokenCounters();
        ByteString sessionToken = this.sessionRepository.getSessionToken();
        this.sessionRepository.incrementTokenSequenceNumber();
        HeaderBiddingTokenKt.Dsl.Companion companion3 = HeaderBiddingTokenKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken.Builder builderNewBuilder3 = HeaderBiddingTokenOuterClass.HeaderBiddingToken.newBuilder();
        p.i(builderNewBuilder3, "newBuilder()");
        dsl_create = companion3._create(builderNewBuilder3);
        dsl_create.setTokenId(this.generateId.invoke());
        dsl_create.setTokenNumber(i10);
        GetClientInfo getClientInfo = this.getClientInfo;
        anonymousClass1.L$0 = this;
        tokenConfiguration2 = tokenConfiguration;
        anonymousClass1.L$1 = tokenConfiguration2;
        anonymousClass1.L$2 = tokenCounters;
        anonymousClass1.L$3 = sessionToken;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = dsl_create;
        anonymousClass1.Z$0 = z10;
        anonymousClass1.label = 1;
        Object objInvoke = getClientInfo.invoke(anonymousClass1);
        if (objInvoke == objF) {
            return objF;
        }
        byteString = sessionToken;
        objIsConnected = objInvoke;
        z11 = z10;
        dsl = dsl_create;
        dsl2 = dsl;
        androidBuildHeaderBiddingToken = this;
        dsl.setClientInfo((ClientInfoOuterClass.ClientInfo) objIsConnected);
        dsl_create.setTimestamps(androidBuildHeaderBiddingToken.getTimestamps.invoke());
        if (tokenConfiguration2 != null) {
            dsl_create.setAdFormat(AdFormatExtensions.toProtoAdFormat(tokenConfiguration2.getAdFormat()));
        }
        dsl_create.setSessionCounters(androidBuildHeaderBiddingToken.sessionRepository.getSessionCounters());
        dsl_create.setDynamicDeviceInfo(androidBuildHeaderBiddingToken.deviceInfoRepository.getDynamicDeviceInfo());
        dsl_create.setPii(androidBuildHeaderBiddingToken.deviceInfoRepository.getPiiData());
        dsl_create.setCampaignState(androidBuildHeaderBiddingToken.campaignRepository.getCampaignState());
        String tcfString = androidBuildHeaderBiddingToken.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl_create.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        dsl_create.setScarSignalsCollected(z11);
        OfferwallManager offerwallManager = androidBuildHeaderBiddingToken.offerwallManager;
        anonymousClass1.L$0 = androidBuildHeaderBiddingToken;
        anonymousClass1.L$1 = tokenCounters;
        anonymousClass1.L$2 = byteString;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = null;
        anonymousClass1.label = 2;
        objIsConnected = offerwallManager.isConnected(anonymousClass1);
        if (objIsConnected == objF) {
            return objF;
        }
        tokenCounters2 = tokenCounters;
        dsl3 = dsl_create;
        byteString2 = byteString;
        androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken;
        dsl4 = dsl2;
        dsl3.setOfferwallEnabled(((Boolean) objIsConnected).booleanValue());
        if (byteString2.isEmpty()) {
            gameId = androidBuildHeaderBiddingToken2.sessionRepository.getGameId();
            if (gameId == null) {
                if (gameId.length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                }
            }
            if (z12) {
                GetInitializationData getInitializationData2 = androidBuildHeaderBiddingToken2.getInitializationData;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl4;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.L$4 = dsl_create;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 3;
                objIsConnected = getInitializationData2.invoke(anonymousClass1);
                if (objIsConnected == objF) {
                    return objF;
                }
                dsl7 = dsl_create;
                dsl6 = dsl7;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                dsl7.setInitializationData((InitializationDataOuterClass.InitializationData) objIsConnected);
                dsl8 = dsl4;
                DeviceInfoRepository deviceInfoRepository5 = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl6;
                anonymousClass1.label = 5;
                objIsConnected = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
                if (objIsConnected == objF) {
                    return objF;
                }
                dsl9 = dsl6;
                dsl10 = dsl9;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken4;
                dsl_create = dsl10;
                dsl4 = dsl8;
                tokenCounters2 = tokenCounters3;
            } else {
                GetLimitedSessionToken getLimitedSessionToken2 = androidBuildHeaderBiddingToken2.getLimitedSessionToken;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken2;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl4;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.L$4 = dsl_create;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 4;
                objIsConnected = getLimitedSessionToken2.invoke(anonymousClass1);
                if (objIsConnected == objF) {
                    return objF;
                }
                dsl5 = dsl_create;
                dsl6 = dsl5;
                androidBuildHeaderBiddingToken3 = androidBuildHeaderBiddingToken2;
                dsl5.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) objIsConnected);
                dsl8 = dsl4;
                DeviceInfoRepository deviceInfoRepository6 = androidBuildHeaderBiddingToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidBuildHeaderBiddingToken3;
                anonymousClass1.L$1 = tokenCounters2;
                anonymousClass1.L$2 = dsl8;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl6;
                anonymousClass1.label = 5;
                objIsConnected = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
                if (objIsConnected == objF) {
                    return objF;
                }
                dsl9 = dsl6;
                dsl10 = dsl9;
                tokenCounters3 = tokenCounters2;
                androidBuildHeaderBiddingToken4 = androidBuildHeaderBiddingToken3;
                dsl9.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objIsConnected);
                androidBuildHeaderBiddingToken2 = androidBuildHeaderBiddingToken4;
                dsl_create = dsl10;
                dsl4 = dsl8;
                tokenCounters2 = tokenCounters3;
            }
        } else {
            dsl_create.setSessionToken(androidBuildHeaderBiddingToken2.sessionRepository.getSessionToken());
            dsl_create.setStaticDeviceInfo(androidBuildHeaderBiddingToken2.deviceInfoRepository.cachedStaticDeviceInfo());
        }
        testDataInvoke = androidBuildHeaderBiddingToken2.testDataInfo.invoke();
        if (testDataInvoke != null) {
            dsl_create.setTestData(testDataInvoke);
        }
        TokenCountersKt.Dsl.Companion companion4 = TokenCountersKt.Dsl.Companion;
        HeaderBiddingTokenOuterClass.TokenCounters.Builder builderNewBuilder4 = HeaderBiddingTokenOuterClass.TokenCounters.newBuilder();
        p.i(builderNewBuilder4, "newBuilder()");
        TokenCountersKt.Dsl dsl_create4 = companion4._create(builderNewBuilder4);
        dsl_create4.setSeq(tokenCounters2.getSeq());
        dsl_create4.setWins(tokenCounters2.getWins());
        dsl_create4.setStarts(tokenCounters2.getStarts());
        dsl_create.setTokenCounters(dsl_create4._build());
        return dsl4._build();
    }
}
