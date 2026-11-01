package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.InitializationCompletedEventRequestKt;
import gatewayprotocol.v1.InitializationCompletedEventRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetInitializationCompletedRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidGetInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationCompletedRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetInitializationCompletedRequest", f = "AndroidGetInitializationCompletedRequest.kt", l = {16, 24}, m = "invoke")
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
            return AndroidGetInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidGetInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, DeviceInfoRepository deviceInfoRepository) {
        p.j(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        p.j(deviceInfoRepository, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationCompletedRequest
    public Object invoke(c<? super UniversalRequestOuterClass.UniversalRequest> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        InitializationCompletedEventRequestKt.Dsl dsl_create;
        AndroidGetInitializationCompletedRequest androidGetInitializationCompletedRequest;
        InitializationCompletedEventRequestKt.Dsl dsl;
        InitializationCompletedEventRequestKt.Dsl dsl2;
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
                dsl_create = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationCompletedEventRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationCompletedRequest = (AndroidGetInitializationCompletedRequest) anonymousClass1.L$0;
                kotlin.c.b(objStaticDeviceInfo);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objStaticDeviceInfo);
            }
        }
        kotlin.c.b(objStaticDeviceInfo);
        InitializationCompletedEventRequestKt.Dsl.Companion companion = InitializationCompletedEventRequestKt.Dsl.Companion;
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.Builder builderNewBuilder = InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
        if (objStaticDeviceInfo == objF) {
            return objF;
        }
        androidGetInitializationCompletedRequest = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl_create.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl.setDynamicDeviceInfo(androidGetInitializationCompletedRequest.deviceInfoRepository.getDynamicDeviceInfo());
        InitializationCompletedEventRequestOuterClass.InitializationCompletedEventRequest initializationCompletedEventRequest_build = dsl2._build();
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion2 = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder2 = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        p.i(builderNewBuilder2, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
        dsl_create2.setInitializationCompletedEventRequest(initializationCompletedEventRequest_build);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create2._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = androidGetInitializationCompletedRequest.getUniversalRequestForPayLoad;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objStaticDeviceInfo = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass1);
        return objStaticDeviceInfo == objF ? objF : objStaticDeviceInfo;
    }
}
