package com.unity3d.ads.core.domain;

import ck.p;
import gatewayprotocol.v1.InitializationDataKt;
import gatewayprotocol.v1.InitializationDataOuterClass;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidGetInitializationData.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class AndroidGetInitializationData implements GetInitializationData {
    private final GetInitializationRequestPayload getInitializeRequestPayload;
    private final GetUniversalRequestSharedData getUniversalRequestSharedData;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationData$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidGetInitializationData.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidGetInitializationData", f = "AndroidGetInitializationData.kt", l = {10, 11}, m = "invoke")
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
            return AndroidGetInitializationData.this.invoke(this);
        }
    }

    public AndroidGetInitializationData(GetInitializationRequestPayload getInitializationRequestPayload, GetUniversalRequestSharedData getUniversalRequestSharedData) {
        p.j(getInitializationRequestPayload, "getInitializeRequestPayload");
        p.j(getUniversalRequestSharedData, "getUniversalRequestSharedData");
        this.getInitializeRequestPayload = getInitializationRequestPayload;
        this.getUniversalRequestSharedData = getUniversalRequestSharedData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetInitializationData
    public Object invoke(c<? super InitializationDataOuterClass.InitializationData> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        InitializationDataKt.Dsl dsl_create;
        AndroidGetInitializationData androidGetInitializationData;
        InitializationDataKt.Dsl dsl;
        InitializationDataKt.Dsl dsl2;
        InitializationDataKt.Dsl dsl3;
        InitializationDataKt.Dsl dsl4;
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
        int i11 = anonymousClass1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                InitializationDataKt.Dsl dsl5 = (InitializationDataKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationDataKt.Dsl) anonymousClass1.L$2;
                InitializationDataKt.Dsl dsl6 = (InitializationDataKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationData = (AndroidGetInitializationData) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
                dsl2 = dsl5;
                dsl_create = dsl6;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                dsl4 = (InitializationDataKt.Dsl) anonymousClass1.L$1;
                dsl3 = (InitializationDataKt.Dsl) anonymousClass1.L$0;
                kotlin.c.b(objInvoke);
            }
            dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
            return dsl3._build();
        }
        kotlin.c.b(objInvoke);
        InitializationDataKt.Dsl.Companion companion = InitializationDataKt.Dsl.Companion;
        InitializationDataOuterClass.InitializationData.Builder builderNewBuilder = InitializationDataOuterClass.InitializationData.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        dsl_create = companion._create(builderNewBuilder);
        GetInitializationRequestPayload getInitializationRequestPayload = this.getInitializeRequestPayload;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = dsl_create;
        anonymousClass1.L$2 = dsl_create;
        anonymousClass1.L$3 = dsl_create;
        anonymousClass1.label = 1;
        objInvoke = getInitializationRequestPayload.invoke(anonymousClass1);
        if (objInvoke == objF) {
            return objF;
        }
        androidGetInitializationData = this;
        dsl = dsl_create;
        dsl2 = dsl;
        dsl2.setInitializationRequest((InitializationRequestOuterClass.InitializationRequest) objInvoke);
        GetUniversalRequestSharedData getUniversalRequestSharedData = androidGetInitializationData.getUniversalRequestSharedData;
        anonymousClass1.L$0 = dsl_create;
        anonymousClass1.L$1 = dsl;
        anonymousClass1.L$2 = null;
        anonymousClass1.L$3 = null;
        anonymousClass1.label = 2;
        objInvoke = getUniversalRequestSharedData.invoke(anonymousClass1);
        if (objInvoke == objF) {
            return objF;
        }
        dsl3 = dsl_create;
        dsl4 = dsl;
        dsl4.setSharedData((UniversalRequestOuterClass.UniversalRequest.SharedData) objInvoke);
        return dsl3._build();
    }
}
