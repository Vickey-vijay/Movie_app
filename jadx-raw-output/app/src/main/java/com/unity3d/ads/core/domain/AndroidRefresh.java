package com.unity3d.ads.core.domain;

import bk.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.h0;
import nk.l0;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidRefresh.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class AndroidRefresh implements Refresh {
    private final h0 defaultDispatcher;
    private final GatewayClient gatewayClient;
    private final GetAdDataRefreshRequest getAdDataRefreshRequest;
    private final GetRequestPolicy getRequestPolicy;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", l = {25}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidRefresh.this.invoke(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidRefresh$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidRefresh.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse>, Object> {
        public final /* synthetic */ ByteString $adDataRefreshToken;
        public final /* synthetic */ ByteString $opportunityId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ByteString byteString, ByteString byteString2, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$adDataRefreshToken = byteString;
            this.$opportunityId = byteString2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return AndroidRefresh.this.new AnonymousClass2(this.$adDataRefreshToken, this.$opportunityId, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = sj.a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                }
                return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
            }
            kotlin.c.b(obj);
            GetAdDataRefreshRequest getAdDataRefreshRequest = AndroidRefresh.this.getAdDataRefreshRequest;
            ByteString byteString = this.$adDataRefreshToken;
            ByteString byteString2 = this.$opportunityId;
            this.label = 1;
            obj = getAdDataRefreshRequest.invoke(byteString, byteString2, this);
            if (obj == objF) {
                return objF;
            }
            RequestPolicy requestPolicyInvoke = AndroidRefresh.this.getRequestPolicy.invoke();
            GatewayClient gatewayClient = AndroidRefresh.this.gatewayClient;
            OperationType operationType = OperationType.REFRESH;
            this.label = 2;
            obj = GatewayClient.DefaultImpls.request$default(gatewayClient, null, (UniversalRequestOuterClass.UniversalRequest) obj, requestPolicyInvoke, operationType, this, 1, null);
            if (obj == objF) {
                return objF;
            }
            return ((UniversalResponseOuterClass.UniversalResponse) obj).getPayload().getAdDataRefreshResponse();
        }
    }

    public AndroidRefresh(h0 h0Var, GetAdDataRefreshRequest getAdDataRefreshRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient) {
        ck.p.j(h0Var, "defaultDispatcher");
        ck.p.j(getAdDataRefreshRequest, "getAdDataRefreshRequest");
        ck.p.j(getRequestPolicy, "getRequestPolicy");
        ck.p.j(gatewayClient, "gatewayClient");
        this.defaultDispatcher = h0Var;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.Refresh
    public Object invoke(ByteString byteString, ByteString byteString2, c<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
        Object objG = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objG);
            h0 h0Var = this.defaultDispatcher;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(byteString2, byteString, null);
            anonymousClass1.label = 1;
            objG = h.g(h0Var, anonymousClass2, anonymousClass1);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.c.b(objG);
        }
        ck.p.i(objG, "override suspend fun inv…RefreshResponse\n        }");
        return objG;
    }
}
