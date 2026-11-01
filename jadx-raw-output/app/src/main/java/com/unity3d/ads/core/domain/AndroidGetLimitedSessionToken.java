package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AndroidGetLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetLimitedSessionToken.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetLimitedSessionToken", f = "AndroidGetLimitedSessionToken.kt", l = {19, 20, 21, 22}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetLimitedSessionToken.this.invoke(this);
        }
    }

    public AndroidGetLimitedSessionToken(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, MediationRepository mediationRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(sessionRepository, "sessionRepository");
        p.j(mediationRepository, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:34:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0124  */
    /* JADX WARN: Code duplicated, block: B:38:0x0140  */
    /* JADX WARN: Code duplicated, block: B:46:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetLimitedSessionToken
    public Object invoke(c<? super UniversalRequestOuterClass.LimitedSessionToken> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        LimitedSessionTokenKt.Dsl dsl_create;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken;
        LimitedSessionTokenKt.Dsl dsl;
        LimitedSessionTokenKt.Dsl dsl2;
        LimitedSessionTokenKt.Dsl dsl3;
        LimitedSessionTokenKt.Dsl dsl4;
        LimitedSessionTokenKt.Dsl dsl5;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken2;
        LimitedSessionTokenKt.Dsl dsl6;
        LimitedSessionTokenKt.Dsl dsl7;
        LimitedSessionTokenKt.Dsl dsl8;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken3;
        LimitedSessionTokenKt.Dsl dsl9;
        LimitedSessionTokenKt.Dsl dsl10;
        LimitedSessionTokenKt.Dsl dsl11;
        AndroidGetLimitedSessionToken androidGetLimitedSessionToken4;
        String gameId;
        String name;
        String version;
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
        Object objStaticDeviceInfo = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                dsl_create = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl2 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
            } else if (i11 == 2) {
                dsl3 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl4 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl5 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken2 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
                String deviceModel = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
                p.i(deviceModel, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
                dsl3.setDeviceModel(deviceModel);
                DeviceInfoRepository deviceInfoRepository = androidGetLimitedSessionToken2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl4;
                anonymousClass1.L$3 = dsl4;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
                if (objStaticDeviceInfo == objF) {
                    return objF;
                }
                dsl6 = dsl4;
                dsl7 = dsl6;
                dsl8 = dsl5;
                androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
                String osVersion = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                p.i(osVersion, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion);
                DeviceInfoRepository deviceInfoRepository2 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository2.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else if (i11 == 3) {
                dsl6 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl7 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl8 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken3 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
                String osVersion2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
                p.i(osVersion2, "deviceInfoRepository.staticDeviceInfo().osVersion");
                dsl6.setOsVersion(osVersion2);
                DeviceInfoRepository deviceInfoRepository3 = androidGetLimitedSessionToken3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetLimitedSessionToken3;
                anonymousClass1.L$1 = dsl8;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl7;
                anonymousClass1.label = 4;
                objStaticDeviceInfo = deviceInfoRepository3.getIdfi(anonymousClass1);
                if (objStaticDeviceInfo == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl9;
                dsl11 = dsl8;
                androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl9 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$3;
                dsl10 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$2;
                dsl11 = (LimitedSessionTokenKt.Dsl) anonymousClass1.L$1;
                androidGetLimitedSessionToken4 = (AndroidGetLimitedSessionToken) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
            }
            dsl9.setIdfi((String) objStaticDeviceInfo);
            dsl10.setSdkVersion(41605);
            dsl10.setSdkVersionName("4.16.5");
            gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
            if (gameId != null) {
                dsl10.setGameId(gameId);
            }
            dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
            dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
            name = androidGetLimitedSessionToken4.mediationRepository.getName();
            if (name != null && dsl10.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM) {
                dsl10.setCustomMediationName(name);
            }
            version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
            if (version != null) {
                dsl10.setMediationVersion(version);
            }
            return dsl11._build();
        }
        kotlin.c.b(objStaticDeviceInfo);
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder builderNewBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSessionId(this.sessionRepository.getSessionId());
        DeviceInfoRepository deviceInfoRepository4 = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository4.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        androidGetLimitedSessionToken = this;
        dsl = dsl_create;
        dsl2 = dsl;
        String deviceMake = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceMake();
        p.i(deviceMake, "deviceInfoRepository.staticDeviceInfo().deviceMake");
        dsl_create.setDeviceMake(deviceMake);
        DeviceInfoRepository deviceInfoRepository5 = androidGetLimitedSessionToken.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken;
        anonymousClass1.L$1 = dsl2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = deviceInfoRepository5.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        dsl3 = dsl;
        dsl4 = dsl3;
        dsl5 = dsl2;
        androidGetLimitedSessionToken2 = androidGetLimitedSessionToken;
        String deviceModel2 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getDeviceModel();
        p.i(deviceModel2, "deviceInfoRepository.sta…cDeviceInfo().deviceModel");
        dsl3.setDeviceModel(deviceModel2);
        DeviceInfoRepository deviceInfoRepository6 = androidGetLimitedSessionToken2.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken2;
        anonymousClass1.L$1 = dsl5;
        anonymousClass1.L$2 = dsl4;
        anonymousClass1.L$3 = dsl4;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = deviceInfoRepository6.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        dsl6 = dsl4;
        dsl7 = dsl6;
        dsl8 = dsl5;
        androidGetLimitedSessionToken3 = androidGetLimitedSessionToken2;
        String osVersion3 = ((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo).getOsVersion();
        p.i(osVersion3, "deviceInfoRepository.staticDeviceInfo().osVersion");
        dsl6.setOsVersion(osVersion3);
        DeviceInfoRepository deviceInfoRepository7 = androidGetLimitedSessionToken3.deviceInfoRepository;
        anonymousClass1.L$0 = androidGetLimitedSessionToken3;
        anonymousClass1.L$1 = dsl8;
        anonymousClass1.L$2 = dsl7;
        anonymousClass1.L$3 = dsl7;
        anonymousClass1.label = 4;
        objStaticDeviceInfo = deviceInfoRepository7.getIdfi(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        dsl9 = dsl7;
        dsl10 = dsl9;
        dsl11 = dsl8;
        androidGetLimitedSessionToken4 = androidGetLimitedSessionToken3;
        dsl9.setIdfi((String) objStaticDeviceInfo);
        dsl10.setSdkVersion(41605);
        dsl10.setSdkVersionName("4.16.5");
        gameId = androidGetLimitedSessionToken4.sessionRepository.getGameId();
        if (gameId != null) {
            dsl10.setGameId(gameId);
        }
        dsl10.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl10.setMediationProvider(androidGetLimitedSessionToken4.mediationRepository.getMediationProvider().invoke());
        name = androidGetLimitedSessionToken4.mediationRepository.getName();
        if (name != null) {
            dsl10.setCustomMediationName(name);
        }
        version = androidGetLimitedSessionToken4.mediationRepository.getVersion();
        if (version != null) {
            dsl10.setMediationVersion(version);
        }
        return dsl11._build();
    }
}
