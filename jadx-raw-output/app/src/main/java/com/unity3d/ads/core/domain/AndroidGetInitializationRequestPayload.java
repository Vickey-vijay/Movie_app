package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.configuration.MediationInitBlobMetadataReader;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import nj.b0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final MediationInitBlobMetadataReader mediationInitBlobMetadataReader;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationRequestPayload.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", l = {24, 25, 33, 34, 45, 50, 55, 60, 78}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository, MediationInitBlobMetadataReader mediationInitBlobMetadataReader) {
        p.j(getClientInfo, "getClientInfo");
        p.j(sessionRepository, "sessionRepository");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(legacyUserConsentRepository, "legacyUserConsentRepository");
        p.j(mediationInitBlobMetadataReader, "mediationInitBlobMetadataReader");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
        this.mediationInitBlobMetadataReader = mediationInitBlobMetadataReader;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0331  */
    /* JADX WARN: Code duplicated, block: B:103:0x0340  */
    /* JADX WARN: Code duplicated, block: B:106:0x0359 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x035a  */
    /* JADX WARN: Code duplicated, block: B:110:0x0361  */
    /* JADX WARN: Code duplicated, block: B:112:0x0367  */
    /* JADX WARN: Code duplicated, block: B:115:0x036c  */
    /* JADX WARN: Code duplicated, block: B:118:0x0371  */
    /* JADX WARN: Code duplicated, block: B:33:0x0127  */
    /* JADX WARN: Code duplicated, block: B:40:0x015a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x015b  */
    /* JADX WARN: Code duplicated, block: B:44:0x016b  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:55:0x028a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x028b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0292  */
    /* JADX WARN: Code duplicated, block: B:62:0x02a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x02cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0305  */
    /* JADX WARN: Code duplicated, block: B:89:0x030f  */
    /* JADX WARN: Code duplicated, block: B:91:0x0312  */
    /* JADX WARN: Code duplicated, block: B:94:0x0317  */
    /* JADX WARN: Code duplicated, block: B:97:0x0326  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    public Object invoke(c<? super InitializationRequestOuterClass.InitializationRequest> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        InitializationRequestKt.Dsl dsl_create;
        boolean z10;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        InitializationRequestKt.Dsl dsl4;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl dsl_create2;
        InitializationDeviceInfoKt.Dsl dsl5;
        InitializationDeviceInfoKt.Dsl dsl6;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        InitializationRequestKt.Dsl dsl7;
        InitializationDeviceInfoKt.Dsl dsl8;
        InitializationRequestKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        ByteString byteString;
        String str;
        boolean z11;
        ByteString byteString2;
        ByteString byteString3;
        Object obj;
        String str2;
        String legacyFlowUserConsent;
        String unityInstallationId;
        String unityMegaSessionId;
        InitializationRequestKt.Dsl dsl11;
        InitializationRequestKt.Dsl dsl12;
        String str3;
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
        Object objInvoke = anonymousClass1.result;
        Object objF = sj.a.f();
        switch (anonymousClass1.label) {
            case 0:
                kotlin.c.b(objInvoke);
                InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                p.i(builderNewBuilder, "newBuilder()");
                dsl_create = companion._create(builderNewBuilder);
                Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                if (storage.readStorage()) {
                    Object obj2 = storage.get("configuration.hasInitialized");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    if (bool != null ? bool.booleanValue() : false) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                dsl_create.setIsFirstInit(!z10);
                GetClientInfo getClientInfo = this.getClientInfo;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                objInvoke = getClientInfo.invoke(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                androidGetInitializationRequestPayload = this;
                dsl = dsl_create;
                dsl2 = dsl;
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl;
                anonymousClass1.label = 2;
                objInvoke = deviceInfoRepository.getIdfi(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl3 = dsl;
                dsl4 = dsl2;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                p.i(builderNewBuilder2, "newBuilder()");
                dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl5 = dsl_create2;
                dsl6 = dsl5;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl5;
                anonymousClass1.L$6 = dsl5;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl8 = dsl5;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                p.i(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl5.setNetworkOperator(networkOperator);
                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                p.i(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl5.setLanguage(language);
                dsl5.setLocalList(b0.p0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository4.getAuidByteString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository5.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null || str.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository2 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository2.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader.getJsonStorage().get(mediationInitBlobMetadataReader.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository6.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str4 = (String) objInvoke;
                str3 = (String) ((str4 != null || str4.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 1:
                dsl_create = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl;
                anonymousClass1.label = 2;
                objInvoke = deviceInfoRepository7.getIdfi(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl3 = dsl;
                dsl4 = dsl2;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion3 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder3 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                p.i(builderNewBuilder3, "newBuilder()");
                dsl_create2 = companion3._create(builderNewBuilder3);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository8 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository8.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl5 = dsl_create2;
                dsl6 = dsl5;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository9 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl5;
                anonymousClass1.L$6 = dsl5;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository9.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl8 = dsl5;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                p.i(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl5.setNetworkOperator(networkOperator2);
                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                p.i(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl5.setLanguage(language2);
                dsl5.setLocalList(b0.p0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository10 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository10.getAuidByteString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository11 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository11.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository3 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository3.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository4 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository4.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader2 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader2.getJsonStorage().get(mediationInitBlobMetadataReader2.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository12 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository12.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str5 = (String) objInvoke;
                str3 = (String) ((str5 != null || str5.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 2:
                dsl3 = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                dsl4 = dsl2;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion4 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder4 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                p.i(builderNewBuilder4, "newBuilder()");
                dsl_create2 = companion4._create(builderNewBuilder4);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository13 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository13.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl5 = dsl_create2;
                dsl6 = dsl5;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository14 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl5;
                anonymousClass1.L$6 = dsl5;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository14.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl8 = dsl5;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                p.i(networkOperator3, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl5.setNetworkOperator(networkOperator3);
                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                p.i(language3, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl5.setLanguage(language3);
                dsl5.setLocalList(b0.p0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository15 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository15.getAuidByteString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository16 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository16.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository5 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository5.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository6 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository6.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader3 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader3.getJsonStorage().get(mediationInitBlobMetadataReader3.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository17 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository17.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str6 = (String) objInvoke;
                str3 = (String) ((str6 != null || str6.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 3:
                dsl_create2 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl5 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl6 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl7 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl4 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository18 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl5;
                anonymousClass1.L$6 = dsl5;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository18.staticDeviceInfo(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl8 = dsl5;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                p.i(networkOperator4, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl5.setNetworkOperator(networkOperator4);
                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                p.i(language4, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl5.setLanguage(language4);
                dsl5.setLocalList(b0.p0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository19 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository19.getAuidByteString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository110 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository110.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository7 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository7.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository8 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository8.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader4 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader4.getJsonStorage().get(mediationInitBlobMetadataReader4.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository111 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository111.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str7 = (String) objInvoke;
                str3 = (String) ((str7 != null || str7.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 4:
                dsl8 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl5 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl6 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl7 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl4 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl5.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                p.i(networkOperator5, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl5.setNetworkOperator(networkOperator5);
                dsl5.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl5.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl5.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                p.i(language5, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl5.setLanguage(language5);
                dsl5.setLocalList(b0.p0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), StringUtils.COMMA, null, null, 0, null, null, 62, null));
                dsl5.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository112 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl4;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository112.getAuidByteString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl9 = dsl7;
                dsl10 = dsl4;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository113 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository113.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository9 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository9.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository10 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository10.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader5 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader5.getJsonStorage().get(mediationInitBlobMetadataReader5.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository114 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository114.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str8 = (String) objInvoke;
                str3 = (String) ((str8 != null || str8.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 5:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository115 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository115.getAuidString(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository11 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository11.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository12 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository12.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader6 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader6.getJsonStorage().get(mediationInitBlobMetadataReader6.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository116 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository116.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str9 = (String) objInvoke;
                str3 = (String) ((str9 != null || str9.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 6:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                str = (String) objInvoke;
                if (str != null) {
                    z11 = true;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository13 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository13.getPrivacy(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository14 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository14.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader7 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader7.getJsonStorage().get(mediationInitBlobMetadataReader7.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository117 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository117.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str10 = (String) objInvoke;
                str3 = (String) ((str10 != null || str10.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 7:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository15 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository15.getGatewayCache(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader8 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader8.getJsonStorage().get(mediationInitBlobMetadataReader8.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository118 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository118.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str11 = (String) objInvoke;
                str3 = (String) ((str11 != null || str11.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 8:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl9.setCache(byteString3);
                }
                MediationInitBlobMetadataReader mediationInitBlobMetadataReader9 = androidGetInitializationRequestPayload3.mediationInitBlobMetadataReader;
                obj = mediationInitBlobMetadataReader9.getJsonStorage().get(mediationInitBlobMetadataReader9.getKey());
                if (obj != null) {
                    p.i(obj, "get(key)");
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    if (obj == null) {
                        obj = null;
                    }
                } else {
                    obj = null;
                }
                str2 = (String) obj;
                if (str2 != null) {
                    dsl9.setUadsInitBlob(ByteStringsKt.toByteStringUtf8(str2));
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload3.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl9.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                unityInstallationId = androidGetInitializationRequestPayload3.sessionRepository.getUnityInstallationId();
                if (unityInstallationId != null) {
                    dsl9.setUnityInstallationId(ByteStringsKt.toByteStringUtf8(unityInstallationId));
                }
                unityMegaSessionId = androidGetInitializationRequestPayload3.sessionRepository.getUnityMegaSessionId();
                if (unityMegaSessionId != null) {
                    dsl9.setUnityMegaSessionId(ByteStringsKt.toByteStringUtf8(unityMegaSessionId));
                }
                DeviceInfoRepository deviceInfoRepository119 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = dsl10;
                anonymousClass1.L$1 = dsl9;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 9;
                objInvoke = deviceInfoRepository119.getUnityBuildGuid(anonymousClass1);
                if (objInvoke == objF) {
                    return objF;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                String str12 = (String) objInvoke;
                str3 = (String) ((str12 != null || str12.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            case 9:
                dsl11 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                dsl12 = (InitializationRequestKt.Dsl) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                String str13 = (String) objInvoke;
                str3 = (String) ((str13 != null || str13.length() == 0) ^ true ? objInvoke : null);
                if (str3 != null) {
                    dsl11.setUnityBuildGuid(str3);
                }
                return dsl12._build();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
