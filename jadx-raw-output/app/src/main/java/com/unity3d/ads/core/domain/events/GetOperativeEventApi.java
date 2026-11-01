package com.unity3d.ads.core.domain.events;

import ck.p;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.r;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: GetOperativeEventApi.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class GetOperativeEventApi {
    private final OperativeEventRepository operativeEventRepository;
    private final GetOperativeEventRequest operativeEventRequest;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.GetOperativeEventApi$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: GetOperativeEventApi.kt */
    @d(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {21}, m = "invoke")
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
            return GetOperativeEventApi.this.invoke(null, null, null, null, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, ByteString byteString, ByteString byteString2, ByteString byteString3, String str, AdFormatOuterClass.AdFormat adFormat, c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        GetOperativeEventApi getOperativeEventApi;
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
        if (i11 == 0) {
            kotlin.c.b(objInvoke);
            GetOperativeEventRequest getOperativeEventRequest = this.operativeEventRequest;
            anonymousClass2.L$0 = this;
            anonymousClass2.label = 1;
            objInvoke = getOperativeEventRequest.invoke(operativeEventType, byteString2, byteString, byteString3, str, adFormat, anonymousClass2);
            if (objInvoke == objF) {
                return objF;
            }
            getOperativeEventApi = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            getOperativeEventApi = (GetOperativeEventApi) anonymousClass2.L$0;
            kotlin.c.b(objInvoke);
        }
        getOperativeEventApi.operativeEventRepository.addOperativeEvent((OperativeEventRequestOuterClass.OperativeEventRequest) objInvoke);
        return r.f64562a;
    }

    public GetOperativeEventApi(OperativeEventRepository operativeEventRepository, GetOperativeEventRequest getOperativeEventRequest) {
        p.j(operativeEventRepository, "operativeEventRepository");
        p.j(getOperativeEventRequest, "operativeEventRequest");
        this.operativeEventRepository = operativeEventRepository;
        this.operativeEventRequest = getOperativeEventRequest;
    }

    public final Object invoke(OperativeEventRequestOuterClass.OperativeEventType operativeEventType, AdObject adObject, ByteString byteString, c<? super r> cVar) throws Throwable {
        Object objInvoke = invoke(operativeEventType, adObject.getOpportunityId(), adObject.getTrackingToken(), byteString, adObject.getPlayerServerId(), (adObject.getAdType() == DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER ? this : null) != null ? AdFormatOuterClass.AdFormat.AD_FORMAT_BANNER : null, cVar);
        return objInvoke == a.f() ? objInvoke : r.f64562a;
    }
}
