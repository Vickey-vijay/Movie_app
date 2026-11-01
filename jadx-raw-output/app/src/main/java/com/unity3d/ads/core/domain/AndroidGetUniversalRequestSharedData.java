package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.TimestampExtensionsKt;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetUniversalRequestSharedData.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidGetUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetUniversalRequestSharedData.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestSharedData", f = "AndroidGetUniversalRequestSharedData.kt", l = {24}, m = "invoke")
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
            return AndroidGetUniversalRequestSharedData.this.invoke(this);
        }
    }

    public AndroidGetUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, GetLimitedSessionToken getLimitedSessionToken, DeveloperConsentRepository developerConsentRepository) {
        p.j(getSharedDataTimestamps, "getSharedDataTimestamps");
        p.j(sessionRepository, "sessionRepository");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(getLimitedSessionToken, "getLimitedSessionToken");
        p.j(developerConsentRepository, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.getLimitedSessionToken = getLimitedSessionToken;
        this.developerConsentRepository = developerConsentRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestSharedData
    public Object invoke(c<? super UniversalRequestOuterClass.UniversalRequest.SharedData> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        UniversalRequestKt.SharedDataKt.Dsl dsl_create;
        UniversalRequestKt.SharedDataKt.Dsl dsl;
        UniversalRequestKt.SharedDataKt.Dsl dsl2;
        UniversalRequestKt.SharedDataKt.Dsl dsl3;
        AndroidGetUniversalRequestSharedData androidGetUniversalRequestSharedData;
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
        if (i11 == 0) {
            kotlin.c.b(obj);
            UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
            UniversalRequestKt.SharedDataKt.Dsl.Companion companion = UniversalRequestKt.SharedDataKt.Dsl.Companion;
            UniversalRequestOuterClass.UniversalRequest.SharedData.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.SharedData.newBuilder();
            p.i(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            ByteString sessionToken = this.sessionRepository.getSessionToken();
            if (sessionToken.isEmpty()) {
                GetLimitedSessionToken getLimitedSessionToken = this.getLimitedSessionToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                Object objInvoke = getLimitedSessionToken.invoke(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl = dsl_create;
                dsl2 = dsl;
                dsl3 = dsl2;
                obj = objInvoke;
                androidGetUniversalRequestSharedData = this;
            } else {
                dsl_create.setSessionToken(sessionToken);
                androidGetUniversalRequestSharedData = this;
                dsl3 = dsl_create;
            }
            dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
            dsl_create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
            dsl_create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
            dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
            dsl_create.setPii(androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData());
            return dsl3._build();
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dsl = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$3;
        dsl2 = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$2;
        dsl3 = (UniversalRequestKt.SharedDataKt.Dsl) anonymousClass1.L$1;
        androidGetUniversalRequestSharedData = (AndroidGetUniversalRequestSharedData) anonymousClass1.L$0;
        kotlin.c.b(obj);
        dsl.setLimitedSessionToken((UniversalRequestOuterClass.LimitedSessionToken) obj);
        dsl_create = dsl2;
        dsl_create.setTimestamps(androidGetUniversalRequestSharedData.getSharedDataTimestamps.invoke());
        dsl_create.setSdkStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getInitializationTimeEpoch()));
        dsl_create.setAppStartTime(TimestampExtensionsKt.fromMillis(SdkProperties.getAppInitializationTimeSinceEpoch()));
        dsl_create.setDeveloperConsent(androidGetUniversalRequestSharedData.developerConsentRepository.getDeveloperConsent());
        dsl_create.setPii(androidGetUniversalRequestSharedData.deviceInfoRepository.getPiiData());
        return dsl3._build();
    }
}
