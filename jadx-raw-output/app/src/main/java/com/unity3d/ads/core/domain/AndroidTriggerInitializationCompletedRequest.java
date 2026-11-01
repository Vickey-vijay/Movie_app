package com.unity3d.ads.core.domain;

import ck.p;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.h;
import mj.r;
import mk.j;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1, reason: invalid class name */
    /* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
    @d(c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", f = "AndroidTriggerInitializationCompletedRequest.kt", l = {32, 34}, m = "invoke")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public long J$0;
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
            return AndroidTriggerInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        p.j(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        p.j(getRequestPolicy, "getRequestPolicy");
        p.j(gatewayClient, "gatewayClient");
        p.j(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c9 A[Catch: Exception -> 0x0134, TRY_LEAVE, TryCatch #5 {Exception -> 0x0134, blocks: (B:36:0x00c1, B:38:0x00c9), top: B:67:0x00c1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    public Object invoke(c<? super r> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        long jB;
        int i10;
        char c10;
        long j10;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        long j11;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3;
        long j12;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
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
                jB = anonymousClass2.J$0;
                androidTriggerInitializationCompletedRequest2 = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    j11 = jB;
                    try {
                        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                        GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest2.gatewayClient;
                        OperationType operationType = OperationType.INITIALIZATION_COMPLETED;
                        anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest2;
                        anonymousClass2.J$0 = j11;
                        anonymousClass2.label = 2;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        j12 = j11;
                        c10 = 2;
                        try {
                            objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, anonymousClass2, 1, null);
                            if (objInvoke == objF) {
                                return objF;
                            }
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                            j10 = j12;
                            universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                            if (!universalResponse.hasError()) {
                                SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, null, null, 60, null);
                                return r.f64562a;
                            }
                            SendDiagnosticEvent sendDiagnosticEvent = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                            Double dB = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
                            Pair[] pairArr = new Pair[3];
                            pairArr[0] = h.a("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                            i10 = 1;
                            pairArr[1] = h.a("reason", "gateway");
                            pairArr[c10] = h.a("reason_debug", universalResponse.getError().getErrorText());
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", dB, kotlin.collections.a.m(pairArr), null, null, null, 56, null);
                            return r.f64562a;
                        } catch (Exception e10) {
                            e = e10;
                            i10 = 1;
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                            j10 = j12;
                        }
                    } catch (Exception e11) {
                        e = e11;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        j12 = j11;
                        i10 = 1;
                        c10 = 2;
                    }
                } catch (Exception e12) {
                    e = e12;
                    j10 = jB;
                    androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                    i10 = 1;
                    c10 = 2;
                }
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = anonymousClass2.J$0;
                androidTriggerInitializationCompletedRequest = (AndroidTriggerInitializationCompletedRequest) anonymousClass2.L$0;
                try {
                    kotlin.c.b(objInvoke);
                    c10 = 2;
                    try {
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (!universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, null, null, 60, null);
                            return r.f64562a;
                        }
                        SendDiagnosticEvent sendDiagnosticEvent2 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                        Double dB2 = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
                        Pair[] pairArr2 = new Pair[3];
                        pairArr2[0] = h.a("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                        i10 = 1;
                        try {
                            pairArr2[1] = h.a("reason", "gateway");
                            pairArr2[c10] = h.a("reason_debug", universalResponse.getError().getErrorText());
                            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_initialization_completed_event_request_failure_time", dB2, kotlin.collections.a.m(pairArr2), null, null, null, 56, null);
                            return r.f64562a;
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (Exception e14) {
                        e = e14;
                        i10 = 1;
                    }
                } catch (Exception e15) {
                    e = e15;
                    i10 = 1;
                    c10 = 2;
                }
            }
            i10 = 1;
            c10 = 2;
        } else {
            kotlin.c.b(objInvoke);
            jB = j.f64572a.b();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_event_request_started", null, null, null, null, null, 62, null);
            try {
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                anonymousClass2.L$0 = this;
                anonymousClass2.J$0 = jB;
                anonymousClass2.label = 1;
                objInvoke = getInitializationCompletedRequest.invoke(anonymousClass2);
                if (objInvoke == objF) {
                    return objF;
                }
                androidTriggerInitializationCompletedRequest2 = this;
                j11 = jB;
                UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                RequestPolicy requestPolicyInvoke2 = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest2.gatewayClient;
                OperationType operationType2 = OperationType.INITIALIZATION_COMPLETED;
                anonymousClass2.L$0 = androidTriggerInitializationCompletedRequest2;
                anonymousClass2.J$0 = j11;
                anonymousClass2.label = 2;
                androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                j12 = j11;
                c10 = 2;
                objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, anonymousClass2, 1, null);
                if (objInvoke == objF) {
                    return objF;
                }
                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                j10 = j12;
                universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                if (!universalResponse.hasError()) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10))), null, null, null, null, 60, null);
                    return r.f64562a;
                }
                SendDiagnosticEvent sendDiagnosticEvent3 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                Double dB3 = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
                Pair[] pairArr3 = new Pair[3];
                pairArr3[0] = h.a("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                i10 = 1;
                pairArr3[1] = h.a("reason", "gateway");
                pairArr3[c10] = h.a("reason_debug", universalResponse.getError().getErrorText());
                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_initialization_completed_event_request_failure_time", dB3, kotlin.collections.a.m(pairArr3), null, null, null, 56, null);
                return r.f64562a;
            } catch (Exception e16) {
                e = e16;
                i10 = 1;
                c10 = 2;
                j10 = jB;
                androidTriggerInitializationCompletedRequest = this;
            }
        }
        SendDiagnosticEvent sendDiagnosticEvent4 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
        Double dB4 = tj.a.b(TimeExtensionsKt.elapsedMillis(j.a.b(j10)));
        Pair[] pairArr4 = new Pair[3];
        pairArr4[0] = h.a("operation", OperationType.INITIALIZATION_COMPLETED.toString());
        pairArr4[i10] = h.a("reason", "uncaught_exception");
        pairArr4[c10] = h.a("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, i10, null));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, "native_initialization_completed_event_request_failure_time", dB4, kotlin.collections.a.m(pairArr4), null, null, null, 56, null);
        return r.f64562a;
    }
}
