package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.datasource.FIdExistenceDataSource;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import gatewayprotocol.v1.ClientInfoKt;
import gatewayprotocol.v1.ClientInfoOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import lk.a0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetClientInfo.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidGetClientInfo implements GetClientInfo {
    private final FIdExistenceDataSource fIdExistenceDataSource;
    private final MediationRepository mediationRepository;
    private final OfferwallManager offerwallManager;
    private final OmidManager omidManager;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetClientInfo$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetClientInfo.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetClientInfo", f = "AndroidGetClientInfo.kt", l = {42, 45}, m = "invoke")
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
            return AndroidGetClientInfo.this.invoke(this);
        }
    }

    public AndroidGetClientInfo(SessionRepository sessionRepository, MediationRepository mediationRepository, OmidManager omidManager, ScarManager scarManager, OfferwallManager offerwallManager, FIdExistenceDataSource fIdExistenceDataSource) {
        p.j(sessionRepository, "sessionRepository");
        p.j(mediationRepository, "mediationRepository");
        p.j(omidManager, "omidManager");
        p.j(scarManager, "scarManager");
        p.j(offerwallManager, "offerwallManager");
        p.j(fIdExistenceDataSource, "fIdExistenceDataSource");
        this.sessionRepository = sessionRepository;
        this.mediationRepository = mediationRepository;
        this.omidManager = omidManager;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.fIdExistenceDataSource = fIdExistenceDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:46:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetClientInfo
    public Object invoke(c<? super ClientInfoOuterClass.ClientInfo> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AndroidGetClientInfo androidGetClientInfo;
        ClientInfoKt.Dsl dsl;
        ClientInfoKt.Dsl dsl2;
        ClientInfoKt.Dsl dsl3;
        ClientInfoKt.Dsl dsl4;
        AndroidGetClientInfo androidGetClientInfo2;
        String str;
        String str2;
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
        Object version = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                dsl2 = (ClientInfoKt.Dsl) anonymousClass1.L$2;
                dsl = (ClientInfoKt.Dsl) anonymousClass1.L$1;
                androidGetClientInfo = (AndroidGetClientInfo) anonymousClass1.L$0;
                kotlin.c.b(version);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl3 = (ClientInfoKt.Dsl) anonymousClass1.L$2;
                dsl4 = (ClientInfoKt.Dsl) anonymousClass1.L$1;
                androidGetClientInfo2 = (AndroidGetClientInfo) anonymousClass1.L$0;
                kotlin.c.b(version);
            }
            str = (String) version;
            if (str != null) {
                dsl3.setOfferwallVersion(str);
            }
            dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
            dsl3.setOmidPartnerVersion("1");
            if (MadeWithUnityDetector.isMadeWithUnity()) {
                str2 = "Unity";
            } else {
                str2 = "";
            }
            dsl3.setSdkDevelopmentPlatform(str2);
            dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
            return dsl4._build();
        }
        kotlin.c.b(version);
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setSdkVersion(41605);
        dsl_create.setSdkVersionName("4.16.5");
        String gameId = this.sessionRepository.getGameId();
        if (gameId != null) {
            dsl_create.setGameId(gameId);
        }
        dsl_create.setTest(this.sessionRepository.isTestModeEnabled());
        dsl_create.setPlatform(ClientInfoOuterClass.Platform.PLATFORM_ANDROID);
        dsl_create.setMediationProvider(this.mediationRepository.getMediationProvider().invoke());
        String name = this.mediationRepository.getName();
        if (name != null && dsl_create.getMediationProvider() == ClientInfoOuterClass.MediationProvider.MEDIATION_PROVIDER_CUSTOM && (!a0.n0(name))) {
            dsl_create.setCustomMediationName(name);
        }
        String version2 = this.mediationRepository.getVersion();
        if (version2 != null) {
            dsl_create.setMediationVersion(version2);
        }
        ScarManager scarManager = this.scarManager;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.label = 1;
        Object version3 = scarManager.getVersion(anonymousClass1);
        if (version3 == objF) {
            return objF;
        }
        androidGetClientInfo = this;
        dsl = dsl_create;
        version = version3;
        dsl2 = dsl;
        String str3 = (String) version;
        if (str3 != null) {
            dsl2.setScarVersionName(str3);
        }
        OfferwallManager offerwallManager = androidGetClientInfo.offerwallManager;
        anonymousClass1.L$0 = androidGetClientInfo;
        anonymousClass1.L$1 = dsl;
        anonymousClass1.L$2 = dsl2;
        anonymousClass1.label = 2;
        version = offerwallManager.getVersion(anonymousClass1);
        if (version == objF) {
            return objF;
        }
        dsl3 = dsl2;
        dsl4 = dsl;
        androidGetClientInfo2 = androidGetClientInfo;
        str = (String) version;
        if (str != null) {
            dsl3.setOfferwallVersion(str);
        }
        dsl3.setOmidVersion(androidGetClientInfo2.omidManager.getVersion());
        dsl3.setOmidPartnerVersion("1");
        if (MadeWithUnityDetector.isMadeWithUnity()) {
            str2 = "Unity";
        } else {
            str2 = "";
        }
        dsl3.setSdkDevelopmentPlatform(str2);
        dsl3.setIsFidAvailable(androidGetClientInfo2.fIdExistenceDataSource.invoke());
        return dsl4._build();
    }
}
