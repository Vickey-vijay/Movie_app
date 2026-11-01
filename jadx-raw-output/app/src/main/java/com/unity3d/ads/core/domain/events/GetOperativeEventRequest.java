package com.unity3d.ads.core.domain.events;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.OperativeEventRequestKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: GetOperativeEventRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOperativeEventRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", l = {37}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GetOperativeEventRequest.this.invoke(null, null, null, null, null, null, this);
        }
    }

    public GetOperativeEventRequest(GetByteStringId getByteStringId, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, CampaignRepository campaignRepository) {
        p.j(getByteStringId, "generateByteStringId");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        p.j(sessionRepository, "sessionRepository");
        p.j(campaignRepository, "campaignRepository");
        this.generateByteStringId = getByteStringId;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.campaignRepository = campaignRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, c<? super OperativeEventRequestOuterClass.OperativeEventRequest> cVar) {
        AnonymousClass1 anonymousClass1;
        GetOperativeEventRequest getOperativeEventRequest;
        OperativeEventRequestKt.Dsl dsl;
        OperativeEventRequestKt.Dsl dsl2;
        OperativeEventRequestKt.Dsl dsl3;
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
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(obj);
            OperativeEventRequestKt.Dsl.Companion companion = OperativeEventRequestKt.Dsl.Companion;
            OperativeEventRequestOuterClass.OperativeEventRequest.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventRequest.newBuilder();
            p.i(builderNewBuilder, "newBuilder()");
            OperativeEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            dsl_create.setEventId(this.generateByteStringId.invoke());
            dsl_create.setEventType(operativeEventType);
            dsl_create.setImpressionOpportunityId(byteString2);
            dsl_create.setTrackingToken(byteString);
            dsl_create.setAdditionalData(byteString3);
            if (str != null) {
                dsl_create.setSid(str);
            }
            dsl_create.setDynamicDeviceInfo(this.deviceInfoRepository.getDynamicDeviceInfo());
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = adFormat;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.label = 1;
            Object objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == objF) {
                return objF;
            }
            getOperativeEventRequest = this;
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objStaticDeviceInfo;
            dsl3 = dsl2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (OperativeEventRequestKt.Dsl) anonymousClass1.L$4;
            dsl = (OperativeEventRequestKt.Dsl) anonymousClass1.L$3;
            dsl2 = (OperativeEventRequestKt.Dsl) anonymousClass1.L$2;
            adFormat = (AdFormatOuterClass.AdFormat) anonymousClass1.L$1;
            getOperativeEventRequest = (GetOperativeEventRequest) anonymousClass1.L$0;
            kotlin.c.b(obj);
        }
        dsl3.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) obj);
        dsl.setSessionCounters(getOperativeEventRequest.sessionRepository.getSessionCounters());
        dsl.setCampaignState(getOperativeEventRequest.campaignRepository.getCampaignState());
        if (adFormat != null) {
            dsl.setAdFormat(adFormat);
        }
        return dsl2._build();
    }
}
