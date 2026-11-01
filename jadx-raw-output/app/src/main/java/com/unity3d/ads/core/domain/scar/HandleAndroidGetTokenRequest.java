package com.unity3d.ads.core.domain.scar;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: HandleAndroidGetTokenRequest.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HandleAndroidGetTokenRequest implements HandleGetTokenRequest {
    private final GatewayClient gatewayClient;
    private final GetHbTokenEventRequest getHbTokenEventRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: HandleAndroidGetTokenRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.scar.HandleAndroidGetTokenRequest", f = "HandleAndroidGetTokenRequest.kt", l = {20, 24, 26}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
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
            return HandleAndroidGetTokenRequest.this.invoke(null, null, this);
        }
    }

    public HandleAndroidGetTokenRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, GetHbTokenEventRequest getHbTokenEventRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        p.j(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        p.j(getHbTokenEventRequest, "getHbTokenEventRequest");
        p.j(getRequestPolicy, "getRequestPolicy");
        p.j(gatewayClient, "gatewayClient");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.getHbTokenEventRequest = getHbTokenEventRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.scar.HandleGetTokenRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, c<? super UniversalResponseOuterClass.UniversalResponse> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        HandleAndroidGetTokenRequest handleAndroidGetTokenRequest;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        Object objF = a.f();
        int i11 = anonymousClass2.label;
        if (i11 != 0) {
            if (i11 == 1) {
                handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
                kotlin.c.b(objInvoke);
            } else if (i11 == 2) {
                handleAndroidGetTokenRequest = (HandleAndroidGetTokenRequest) anonymousClass2.L$0;
                kotlin.c.b(objInvoke);
                RequestPolicy requestPolicyInvoke = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
                GatewayClient gatewayClient = handleAndroidGetTokenRequest.gatewayClient;
                OperationType operationType = OperationType.GET_TOKEN;
                anonymousClass2.L$0 = null;
                anonymousClass2.label = 3;
                objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
                if (objInvoke == objF) {
                    return objF;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            return objInvoke;
        }
        kotlin.c.b(objInvoke);
        GetHbTokenEventRequest getHbTokenEventRequest = this.getHbTokenEventRequest;
        anonymousClass2.L$0 = this;
        anonymousClass2.label = 1;
        objInvoke = getHbTokenEventRequest.invoke(byteString, biddingSignals, anonymousClass2);
        if (objInvoke == objF) {
            return objF;
        }
        handleAndroidGetTokenRequest = this;
        UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
        UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
        UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setGetTokenEventRequest((GetTokenEventRequestOuterClass.GetTokenEventRequest) objInvoke);
        UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
        GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = handleAndroidGetTokenRequest.getUniversalRequestForPayLoad;
        anonymousClass2.L$0 = handleAndroidGetTokenRequest;
        anonymousClass2.label = 2;
        objInvoke = getUniversalRequestForPayLoad.invoke(payload_build, anonymousClass2);
        if (objInvoke == objF) {
            return objF;
        }
        RequestPolicy requestPolicyInvoke2 = handleAndroidGetTokenRequest.getRequestPolicy.invoke();
        GatewayClient gatewayClient2 = handleAndroidGetTokenRequest.gatewayClient;
        OperationType operationType2 = OperationType.GET_TOKEN;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 3;
        objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
        if (objInvoke == objF) {
            return objF;
        }
        return objInvoke;
    }
}
