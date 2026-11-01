package com.unity3d.ads.core.domain;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.PrivacyUpdateResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: SendPrivacyUpdateRequest.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SendPrivacyUpdateRequest {
    private final GatewayClient gatewayClient;
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: SendPrivacyUpdateRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", l = {21, 23}, m = "invoke")
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
            return SendPrivacyUpdateRequest.this.invoke(0, null, this);
        }
    }

    public SendPrivacyUpdateRequest(GetPrivacyUpdateRequest getPrivacyUpdateRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        p.j(getPrivacyUpdateRequest, "getPrivacyUpdateRequest");
        p.j(getRequestPolicy, "getRequestPolicy");
        p.j(gatewayClient, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(int i10, ByteString byteString, c<? super PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SendPrivacyUpdateRequest sendPrivacyUpdateRequest;
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
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objInvoke = anonymousClass2.result;
        Object objF = sj.a.f();
        int i12 = anonymousClass2.label;
        if (i12 != 0) {
            if (i12 == 1) {
                sendPrivacyUpdateRequest = (SendPrivacyUpdateRequest) anonymousClass2.L$0;
                kotlin.c.b(objInvoke);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objInvoke);
            }
            PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse = ((UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
            p.i(privacyUpdateResponse, "response.payload.privacyUpdateResponse");
            return privacyUpdateResponse;
        }
        kotlin.c.b(objInvoke);
        GetPrivacyUpdateRequest getPrivacyUpdateRequest = this.getPrivacyUpdateRequest;
        anonymousClass2.L$0 = this;
        anonymousClass2.label = 1;
        objInvoke = getPrivacyUpdateRequest.invoke(i10, byteString, anonymousClass2);
        if (objInvoke == objF) {
            return objF;
        }
        sendPrivacyUpdateRequest = this;
        RequestPolicy requestPolicyInvoke = sendPrivacyUpdateRequest.getRequestPolicy.invoke();
        GatewayClient gatewayClient = sendPrivacyUpdateRequest.gatewayClient;
        OperationType operationType = OperationType.PRIVACY_UPDATE;
        anonymousClass2.L$0 = null;
        anonymousClass2.label = 2;
        objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) objInvoke, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
        if (objInvoke == objF) {
            return objF;
        }
        PrivacyUpdateResponseOuterClass.PrivacyUpdateResponse privacyUpdateResponse2 = ((UniversalResponseOuterClass.UniversalResponse) objInvoke).getPayload().getPrivacyUpdateResponse();
        p.i(privacyUpdateResponse2, "response.payload.privacyUpdateResponse");
        return privacyUpdateResponse2;
    }
}
