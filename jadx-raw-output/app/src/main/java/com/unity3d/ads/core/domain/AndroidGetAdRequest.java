package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.data.repository.TcfRepository;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gatewayprotocol.v1.AdRequestKt;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetAdRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AndroidGetAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final TcfRepository tcfRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetAdRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetAdRequest", f = "AndroidGetAdRequest.kt", l = {33, 40, 55}, m = "invoke")
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
            return AndroidGetAdRequest.this.invoke(null, null, null, this);
        }
    }

    public AndroidGetAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, CampaignRepository campaignRepository, WebviewConfigurationDataSource webviewConfigurationDataSource, TcfRepository tcfRepository) {
        p.j(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        p.j(sessionRepository, "sessionRepository");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(campaignRepository, "campaignRepository");
        p.j(webviewConfigurationDataSource, "webViewConfigurationDataSource");
        p.j(tcfRepository, "tcfRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.campaignRepository = campaignRepository;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource;
        this.tcfRepository = tcfRepository;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0102  */
    /* JADX WARN: Code duplicated, block: B:29:0x0108  */
    /* JADX WARN: Code duplicated, block: B:32:0x0118  */
    /* JADX WARN: Code duplicated, block: B:35:0x014d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.GetAdRequest
    public Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, c<? super UniversalRequestOuterClass.UniversalRequest> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AdRequestKt.Dsl dsl_create;
        ByteString byteString2;
        AdRequestOuterClass.BannerSize bannerSize2;
        AndroidGetAdRequest androidGetAdRequest;
        AdRequestKt.Dsl dsl;
        String str2;
        AdRequestKt.Dsl dsl2;
        AdRequestKt.Dsl dsl3;
        AdRequestKt.Dsl dsl4;
        AdRequestOuterClass.BannerSize bannerSize3;
        AdRequestKt.Dsl dsl5;
        AndroidGetAdRequest androidGetAdRequest2;
        String tcfString;
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
                dsl_create = (AdRequestKt.Dsl) anonymousClass1.L$6;
                dsl2 = (AdRequestKt.Dsl) anonymousClass1.L$5;
                AdRequestKt.Dsl dsl6 = (AdRequestKt.Dsl) anonymousClass1.L$4;
                bannerSize2 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$3;
                ByteString byteString3 = (ByteString) anonymousClass1.L$2;
                str2 = (String) anonymousClass1.L$1;
                androidGetAdRequest = (AndroidGetAdRequest) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
                dsl = dsl6;
                byteString2 = byteString3;
            } else if (i11 == 2) {
                dsl3 = (AdRequestKt.Dsl) anonymousClass1.L$4;
                dsl4 = (AdRequestKt.Dsl) anonymousClass1.L$3;
                dsl5 = (AdRequestKt.Dsl) anonymousClass1.L$2;
                bannerSize3 = (AdRequestOuterClass.BannerSize) anonymousClass1.L$1;
                androidGetAdRequest2 = (AndroidGetAdRequest) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
                dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
                dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
                if (bannerSize3 == null) {
                    dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
                } else {
                    dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
                    dsl4.setBannerSize(bannerSize3);
                }
                tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
                if (tcfString != null) {
                    dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
                }
                AdRequestOuterClass.AdRequest adRequest_build = dsl5._build();
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                p.i(builderNewBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion._create(builderNewBuilder);
                dsl_create2.setAdRequest(adRequest_build);
                UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetAdRequest2.getUniversalRequestForPayLoad;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
                if (objStaticDeviceInfo == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objStaticDeviceInfo);
            }
            return objStaticDeviceInfo;
        }
        kotlin.c.b(objStaticDeviceInfo);
        AdRequestKt.Dsl.Companion companion2 = AdRequestKt.Dsl.Companion;
        AdRequestOuterClass.AdRequest.Builder builderNewBuilder2 = AdRequestOuterClass.AdRequest.newBuilder();
        p.i(builderNewBuilder2, "newBuilder()");
        dsl_create = companion2._create(builderNewBuilder2);
        dsl_create.setSessionCounters(this.sessionRepository.getSessionCounters());
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = str;
        byteString2 = byteString;
        anonymousClass1.L$2 = byteString2;
        bannerSize2 = bannerSize;
        anonymousClass1.L$3 = bannerSize2;
        anonymousClass1.L$4 = dsl_create;
        anonymousClass1.L$5 = dsl_create;
        anonymousClass1.L$6 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        androidGetAdRequest = this;
        dsl = dsl_create;
        str2 = str;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(androidGetAdRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setImpressionOpportunityId(byteString2);
        dsl2.setPlacementId(str2);
        dsl2.setRequestImpressionConfiguration(true);
        WebviewConfigurationDataSource webviewConfigurationDataSource = androidGetAdRequest.webViewConfigurationDataSource;
        anonymousClass1.L$0 = androidGetAdRequest;
        anonymousClass1.L$1 = bannerSize2;
        anonymousClass1.L$2 = dsl;
        anonymousClass1.L$3 = dsl2;
        anonymousClass1.L$4 = dsl2;
        anonymousClass1.L$5 = null;
        anonymousClass1.L$6 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = webviewConfigurationDataSource.get(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        dsl3 = dsl2;
        dsl4 = dsl3;
        bannerSize3 = bannerSize2;
        dsl5 = dsl;
        androidGetAdRequest2 = androidGetAdRequest;
        dsl3.setWebviewVersion(((WebviewConfigurationStore.WebViewConfigurationStore) objStaticDeviceInfo).getVersion());
        dsl4.setCampaignState(androidGetAdRequest2.campaignRepository.getCampaignState());
        if (bannerSize3 == null) {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_FULLSCREEN);
        } else {
            dsl4.setAdRequestType(AdRequestOuterClass.AdRequestType.AD_REQUEST_TYPE_BANNER);
            dsl4.setBannerSize(bannerSize3);
        }
        tcfString = androidGetAdRequest2.tcfRepository.getTcfString();
        if (tcfString != null) {
            dsl4.setTcf(ByteStringsKt.toByteStringUtf8(tcfString));
        }
        AdRequestOuterClass.AdRequest adRequest_build2 = dsl5._build();
        UniversalRequestKt universalRequestKt2 = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion3 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder3 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        p.i(builderNewBuilder3, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create3 = companion3._create(builderNewBuilder3);
        dsl_create3.setAdRequest(adRequest_build2);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build2 = dsl_create3._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2 = androidGetAdRequest2.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.L$4 = null;
        anonymousClass1.label = 3;
        objStaticDeviceInfo = getUniversalRequestForPayLoad2.invoke(payload_build2, anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        return objStaticDeviceInfo;
    }
}
