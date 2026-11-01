package com.unity3d.ads.core.domain.events;

import ck.p;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gatewayprotocol.v1.TransactionEventRequestKt;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class CommonGetTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.CommonGetTransactionRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: CommonGetTransactionRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.events.CommonGetTransactionRequest", f = "CommonGetTransactionRequest.kt", l = {21}, m = "invoke")
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
            return CommonGetTransactionRequest.this.invoke(null, null, null, this);
        }
    }

    public CommonGetTransactionRequest(DeviceInfoRepository deviceInfoRepository) {
        p.j(deviceInfoRepository, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.events.GetTransactionRequest
    public Object invoke(List<TransactionEventRequestOuterClass.TransactionData> list, String str, TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin, c<? super TransactionEventRequestOuterClass.TransactionEventRequest> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        TransactionEventRequestKt.Dsl dsl_create;
        Object objStaticDeviceInfo;
        CommonGetTransactionRequest commonGetTransactionRequest;
        List<TransactionEventRequestOuterClass.TransactionData> list2;
        String str2;
        TransactionEventRequestKt.Dsl dsl;
        TransactionEventRequestKt.Dsl dsl2;
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
            TransactionEventRequestKt.Dsl.Companion companion = TransactionEventRequestKt.Dsl.Companion;
            TransactionEventRequestOuterClass.TransactionEventRequest.Builder builderNewBuilder = TransactionEventRequestOuterClass.TransactionEventRequest.newBuilder();
            p.i(builderNewBuilder, "newBuilder()");
            dsl_create = companion._create(builderNewBuilder);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = list;
            anonymousClass1.L$2 = str;
            anonymousClass1.L$3 = transactionOrigin;
            anonymousClass1.L$4 = dsl_create;
            anonymousClass1.L$5 = dsl_create;
            anonymousClass1.L$6 = dsl_create;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == objF) {
                return objF;
            }
            commonGetTransactionRequest = this;
            list2 = list;
            str2 = str;
            dsl = dsl_create;
            dsl2 = dsl;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dsl = (TransactionEventRequestKt.Dsl) anonymousClass1.L$6;
            dsl2 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$5;
            TransactionEventRequestKt.Dsl dsl3 = (TransactionEventRequestKt.Dsl) anonymousClass1.L$4;
            TransactionEventRequestOuterClass.TransactionOrigin transactionOrigin2 = (TransactionEventRequestOuterClass.TransactionOrigin) anonymousClass1.L$3;
            str2 = (String) anonymousClass1.L$2;
            list2 = (List) anonymousClass1.L$1;
            CommonGetTransactionRequest commonGetTransactionRequest2 = (CommonGetTransactionRequest) anonymousClass1.L$0;
            kotlin.c.b(obj);
            dsl_create = dsl3;
            transactionOrigin = transactionOrigin2;
            commonGetTransactionRequest = commonGetTransactionRequest2;
            objStaticDeviceInfo = obj;
        }
        dsl.setStaticDeviceInfo((StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo);
        dsl2.setDynamicDeviceInfo(commonGetTransactionRequest.deviceInfoRepository.getDynamicDeviceInfo());
        dsl2.setAppStore(TransactionEventRequestOuterClass.StoreType.STORE_TYPE_GOOGLE_PLAY);
        dsl2.setGooglePlayBillingLibraryVersion(str2);
        dsl2.setOrigin(transactionOrigin);
        dsl2.addAllTransactionData(dsl2.getTransactionData(), list2);
        return dsl_create._build();
    }
}
