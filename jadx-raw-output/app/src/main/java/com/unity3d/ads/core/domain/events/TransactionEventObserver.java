package com.unity3d.ads.core.domain.events;

import bk.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.TransactionEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.l0;
import qk.e;
import qk.l;
import qk.v;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: TransactionEventObserver.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionEventObserver {
    private final GatewayClient gatewayClient;
    private final GetRequestPolicy getRequestPolicy;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final ByteStringDataSource iapTransactionStore;
    private final l<Boolean> isRunning;
    private final l0 scope;
    private final TransactionEventRepository transactionEventRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: TransactionEventObserver.kt */
    @d(c = "com.unity3d.ads.core.domain.events.TransactionEventObserver$invoke$2", f = "TransactionEventObserver.kt", l = {35, 36, 44}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<TransactionEventRequestOuterClass.TransactionEventRequest, c<? super r>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = TransactionEventObserver.this.new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest, c<? super r> cVar) {
            return ((AnonymousClass2) create(transactionEventRequest, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0085 A[Catch: UnityAdsNetworkException -> 0x00ac, TRY_LEAVE, TryCatch #0 {UnityAdsNetworkException -> 0x00ac, blocks: (B:7:0x0011, B:12:0x0022, B:22:0x007d, B:24:0x0085, B:13:0x0026, B:19:0x0058, B:16:0x0031), top: B:30:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x00ab A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            UniversalRequestOuterClass.UniversalRequest universalRequest;
            ByteStringDataSource byteStringDataSource;
            ByteString byteString;
            Object objF = a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                kotlin.c.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            universalRequest = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                            kotlin.c.b(obj);
                            if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                                byteStringDataSource = TransactionEventObserver.this.iapTransactionStore;
                                byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                                ck.p.i(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                                this.L$0 = null;
                                this.label = 3;
                                if (byteStringDataSource.set(byteString, this) == objF) {
                                    return objF;
                                }
                            }
                        }
                    } else {
                        kotlin.c.b(obj);
                    }
                    return r.f64562a;
                }
                kotlin.c.b(obj);
                TransactionEventRequestOuterClass.TransactionEventRequest transactionEventRequest = (TransactionEventRequestOuterClass.TransactionEventRequest) this.L$0;
                UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                ck.p.i(builderNewBuilder, "newBuilder()");
                UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                dsl_create.setTransactionEventRequest(transactionEventRequest);
                UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = TransactionEventObserver.this.getUniversalRequestForPayLoad;
                this.label = 1;
                obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                if (obj == objF) {
                    return objF;
                }
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
                GatewayClient gatewayClient = TransactionEventObserver.this.gatewayClient;
                RequestPolicy requestPolicyInvoke = TransactionEventObserver.this.getRequestPolicy.invoke();
                OperationType operationType = OperationType.TRANSACTION_EVENT;
                this.L$0 = universalRequest;
                this.label = 2;
                obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, this, 1, null);
                if (obj == objF) {
                    return objF;
                }
                if (((UniversalResponseOuterClass.UniversalResponse) obj).getError() != null) {
                    byteStringDataSource = TransactionEventObserver.this.iapTransactionStore;
                    byteString = universalRequest.getSharedData().getTimestamps().getTimestamp().toByteString();
                    ck.p.i(byteString, "fullRequest.sharedData.t….timestamp.toByteString()");
                    this.L$0 = null;
                    this.label = 3;
                    if (byteStringDataSource.set(byteString, this) == objF) {
                        return objF;
                    }
                }
            } catch (UnityAdsNetworkException unused) {
            }
            return r.f64562a;
        }
    }

    public TransactionEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, l0 l0Var, TransactionEventRepository transactionEventRepository, GatewayClient gatewayClient, GetRequestPolicy getRequestPolicy, ByteStringDataSource byteStringDataSource) {
        ck.p.j(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        ck.p.j(l0Var, "scope");
        ck.p.j(transactionEventRepository, "transactionEventRepository");
        ck.p.j(gatewayClient, "gatewayClient");
        ck.p.j(getRequestPolicy, "getRequestPolicy");
        ck.p.j(byteStringDataSource, "iapTransactionStore");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.scope = l0Var;
        this.transactionEventRepository = transactionEventRepository;
        this.gatewayClient = gatewayClient;
        this.getRequestPolicy = getRequestPolicy;
        this.iapTransactionStore = byteStringDataSource;
        this.isRunning = v.a(Boolean.FALSE);
    }

    public final void invoke() {
        Boolean value;
        Boolean bool;
        l<Boolean> lVar = this.isRunning;
        do {
            value = lVar.getValue();
            bool = value;
            bool.booleanValue();
        } while (!lVar.a(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        e.x(e.A(this.transactionEventRepository.getTransactionEvents(), new AnonymousClass2(null)), this.scope);
    }
}
