package com.unity3d.ads.core.domain;

import ck.p;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AndroidGetUniversalRequestForPayLoad implements GetUniversalRequestForPayLoad {
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetUniversalRequestForPayLoad.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetUniversalRequestForPayLoad", f = "AndroidGetUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
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
            return AndroidGetUniversalRequestForPayLoad.this.invoke(null, this);
        }
    }

    public AndroidGetUniversalRequestForPayLoad(GetUniversalRequestSharedData getUniversalRequestSharedData) {
        p.j(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad
    public Object invoke(UniversalRequestOuterClass.UniversalRequest.Payload payload, c<? super UniversalRequestOuterClass.UniversalRequest> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        UniversalRequestKt.Dsl dsl;
        UniversalRequestKt.Dsl dsl2;
        UniversalRequestOuterClass.UniversalRequest.Payload payload2;
        UniversalRequestKt.Dsl dsl3;
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
            UniversalRequestKt.Dsl.Companion companion = UniversalRequestKt.Dsl.Companion;
            UniversalRequestOuterClass.UniversalRequest.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.newBuilder();
            p.i(builderNewBuilder, "newBuilder()");
            UniversalRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
            GetUniversalRequestSharedData getUniversalRequestSharedData = this.getUniversalRequestSharedData;
            anonymousClass1.L$0 = payload;
            anonymousClass1.L$1 = dsl_create;
            anonymousClass1.L$2 = dsl_create;
            anonymousClass1.L$3 = dsl_create;
            anonymousClass1.label = 1;
            Object objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
            if (objInvoke == objF) {
                return objF;
            }
            dsl = dsl_create;
            dsl2 = dsl;
            obj = objInvoke;
            payload2 = payload;
            dsl3 = dsl2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl3 = (UniversalRequestKt.Dsl) anonymousClass1.L$3;
            dsl = (UniversalRequestKt.Dsl) anonymousClass1.L$2;
            dsl2 = (UniversalRequestKt.Dsl) anonymousClass1.L$1;
            payload2 = (UniversalRequestOuterClass.UniversalRequest.Payload) anonymousClass1.L$0;
            kotlin.c.b(obj);
        }
        dsl3.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) obj);
        dsl.setPayload(payload2);
        return dsl2._build();
    }
}
