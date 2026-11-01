package com.unity3d.ads.core.domain.events;

import ck.p;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: UniversalRequestEventSender.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;
    private final UniversalRequestTtlValidator universalRequestTtlValidator;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestEventSender.kt */
    @d(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {21, 35}, m = "invoke")
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
            return UniversalRequestEventSender.this.invoke(null, null, this);
        }
    }

    public UniversalRequestEventSender(GatewayClient gatewayClient, HandleGatewayEventResponse handleGatewayEventResponse, UniversalRequestTtlValidator universalRequestTtlValidator) {
        p.j(gatewayClient, "gatewayClient");
        p.j(handleGatewayEventResponse, "handleGatewayEventResponse");
        p.j(universalRequestTtlValidator, "universalRequestTtlValidator");
        this.gatewayClient = gatewayClient;
        this.handleGatewayEventResponse = handleGatewayEventResponse;
        this.universalRequestTtlValidator = universalRequestTtlValidator;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        UniversalRequestEventSender universalRequestEventSender;
        Object objM3458constructorimpl;
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
        Object objRequest$default = anonymousClass1.result;
        Object objF = a.f();
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                universalRequestEventSender = (UniversalRequestEventSender) anonymousClass1.L$0;
                try {
                    kotlin.c.b(objRequest$default);
                } catch (Throwable th2) {
                    th = th2;
                    Result.a aVar = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.c.b(objRequest$default);
            }
            return r.f64562a;
        }
        kotlin.c.b(objRequest$default);
        if (!this.universalRequestTtlValidator.invoke(universalRequest, requestPolicy)) {
            return r.f64562a;
        }
        try {
            Result.a aVar2 = Result.Companion;
            GatewayClient gatewayClient = this.gatewayClient;
            OperationType operationType = OperationType.UNIVERSAL_EVENT;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objRequest$default = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicy, operationType, anonymousClass1, 1, null);
            if (objRequest$default == objF) {
                return objF;
            }
            universalRequestEventSender = this;
        } catch (Throwable th3) {
            th = th3;
            universalRequestEventSender = this;
            Result.a aVar3 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th));
        }
        objM3458constructorimpl = Result.m3458constructorimpl((UniversalResponseOuterClass.UniversalResponse) objRequest$default);
        if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) instanceof GatewayException) {
            return r.f64562a;
        }
        HandleGatewayEventResponse handleGatewayEventResponse = universalRequestEventSender.handleGatewayEventResponse;
        kotlin.c.b(objM3458constructorimpl);
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (handleGatewayEventResponse.invoke((UniversalResponseOuterClass.UniversalResponse) objM3458constructorimpl, anonymousClass1) == objF) {
            return objF;
        }
        return r.f64562a;
    }
}
