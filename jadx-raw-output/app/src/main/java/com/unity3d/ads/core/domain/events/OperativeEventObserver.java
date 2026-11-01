package com.unity3d.ads.core.domain.events;

import androidx.work.OneTimeWorkRequest;
import bk.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.data.repository.OperativeEventRepository;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad;
import com.unity3d.ads.core.domain.work.BackgroundWorker;
import com.unity3d.ads.core.domain.work.OperativeEventJob;
import com.unity3d.ads.core.domain.work.UniversalRequestWorkerData;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import java.util.UUID;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mj.r;
import nk.h;
import nk.h0;
import nk.i0;
import nk.l0;
import qk.e;
import qk.l;
import qk.v;
import rj.c;
import sj.a;
import tj.d;

/* JADX INFO: compiled from: OperativeEventObserver.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class OperativeEventObserver {
    private final BackgroundWorker backgroundWorker;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final l<Boolean> isRunning;
    private final OperativeEventRepository operativeEventRepository;
    private final GetRequestPolicy operativeRequestPolicy;
    private final l0 scope;
    private final UniversalRequestDataSource universalRequestDataSource;
    private final UniversalRequestEventSender universalRequestEventSender;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2, reason: invalid class name */
    /* JADX INFO: compiled from: OperativeEventObserver.kt */
    @d(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2", f = "OperativeEventObserver.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return OperativeEventObserver.this.new AnonymousClass2(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass2) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: OperativeEventObserver.kt */
        @d(c = "com.unity3d.ads.core.domain.events.OperativeEventObserver$invoke$2$2", f = "OperativeEventObserver.kt", l = {44, 48, 53}, m = "invokeSuspend")
        public static final class C04402 extends SuspendLambda implements p<OperativeEventRequestOuterClass.OperativeEventRequest, c<? super r>, Object> {
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ OperativeEventObserver this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04402(OperativeEventObserver operativeEventObserver, c<? super C04402> cVar) {
                super(2, cVar);
                this.this$0 = operativeEventObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final c<r> create(Object obj, c<?> cVar) {
                C04402 c04402 = new C04402(this.this$0, cVar);
                c04402.L$0 = obj;
                return c04402;
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Object mo1invoke(OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest, c<? super r> cVar) {
                return ((C04402) create(operativeEventRequest, cVar)).invokeSuspend(r.f64562a);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00e1 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                UniversalRequestOuterClass.UniversalRequest universalRequest;
                UniversalRequestOuterClass.UniversalRequest universalRequest2;
                String string;
                UniversalRequestEventSender universalRequestEventSender;
                RequestPolicy requestPolicyInvoke;
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
                                string = (String) this.L$1;
                                universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) this.L$0;
                                try {
                                    kotlin.c.b(obj);
                                    UniversalRequestWorkerData universalRequestWorkerData = new UniversalRequestWorkerData(string);
                                    BackgroundWorker backgroundWorker = this.this$0.backgroundWorker;
                                    OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setInputData(universalRequestWorkerData.invoke()).addTag(BackgroundWorker.TAG).build();
                                    ck.p.i(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                                    backgroundWorker.getWorkManager().enqueue(oneTimeWorkRequestBuild);
                                } catch (Throwable unused) {
                                    universalRequestEventSender = this.this$0.universalRequestEventSender;
                                    requestPolicyInvoke = this.this$0.operativeRequestPolicy.invoke();
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.label = 3;
                                    if (universalRequestEventSender.invoke(universalRequest2, requestPolicyInvoke, this) == objF) {
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
                    OperativeEventRequestOuterClass.OperativeEventRequest operativeEventRequest = (OperativeEventRequestOuterClass.OperativeEventRequest) this.L$0;
                    UniversalRequestKt universalRequestKt = UniversalRequestKt.INSTANCE;
                    UniversalRequestKt.PayloadKt.Dsl.Companion companion = UniversalRequestKt.PayloadKt.Dsl.Companion;
                    UniversalRequestOuterClass.UniversalRequest.Payload.Builder builderNewBuilder = UniversalRequestOuterClass.UniversalRequest.Payload.newBuilder();
                    ck.p.i(builderNewBuilder, "newBuilder()");
                    UniversalRequestKt.PayloadKt.Dsl dsl_create = companion._create(builderNewBuilder);
                    dsl_create.setOperativeEvent(operativeEventRequest);
                    UniversalRequestOuterClass.UniversalRequest.Payload payload_build = dsl_create._build();
                    GetUniversalRequestForPayLoad getUniversalRequestForPayLoad = this.this$0.getUniversalRequestForPayLoad;
                    this.label = 1;
                    obj = getUniversalRequestForPayLoad.invoke(payload_build, this);
                    if (obj == objF) {
                        return objF;
                    }
                    string = UUID.randomUUID().toString();
                    ck.p.i(string, "randomUUID().toString()");
                    UniversalRequestDataSource universalRequestDataSource = this.this$0.universalRequestDataSource;
                    byte[] byteArray = universalRequest.toByteArray();
                    ck.p.i(byteArray, "fullRequest.toByteArray()");
                    ByteString byteString = ByteStringsKt.toByteString(byteArray);
                    this.L$0 = universalRequest;
                    this.L$1 = string;
                    this.label = 2;
                    if (universalRequestDataSource.set(string, byteString, this) == objF) {
                        return objF;
                    }
                    universalRequest2 = universalRequest;
                    UniversalRequestWorkerData universalRequestWorkerData2 = new UniversalRequestWorkerData(string);
                    BackgroundWorker backgroundWorker2 = this.this$0.backgroundWorker;
                    OneTimeWorkRequest oneTimeWorkRequestBuild2 = new OneTimeWorkRequest.Builder(OperativeEventJob.class).setInputData(universalRequestWorkerData2.invoke()).addTag(BackgroundWorker.TAG).build();
                    ck.p.i(oneTimeWorkRequestBuild2, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
                    backgroundWorker2.getWorkManager().enqueue(oneTimeWorkRequestBuild2);
                    return r.f64562a;
                } catch (Throwable unused2) {
                    universalRequest2 = universalRequest;
                    universalRequestEventSender = this.this$0.universalRequestEventSender;
                    requestPolicyInvoke = this.this$0.operativeRequestPolicy.invoke();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 3;
                    if (universalRequestEventSender.invoke(universalRequest2, requestPolicyInvoke, this) == objF) {
                        return objF;
                    }
                }
                universalRequest = (UniversalRequestOuterClass.UniversalRequest) obj;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Boolean bool;
            a.f();
            if (this.label == 0) {
                kotlin.c.b(obj);
                l lVar = OperativeEventObserver.this.isRunning;
                do {
                    value = lVar.getValue();
                    bool = (Boolean) value;
                    bool.booleanValue();
                } while (!lVar.a(value, tj.a.a(true)));
                if (bool.booleanValue()) {
                    return r.f64562a;
                }
                e.x(e.A(OperativeEventObserver.this.operativeEventRepository.getOperativeEvents(), new C04402(OperativeEventObserver.this, null)), OperativeEventObserver.this.scope);
                return r.f64562a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public OperativeEventObserver(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad, h0 h0Var, OperativeEventRepository operativeEventRepository, UniversalRequestDataSource universalRequestDataSource, BackgroundWorker backgroundWorker, UniversalRequestEventSender universalRequestEventSender, GetRequestPolicy getRequestPolicy) {
        ck.p.j(getUniversalRequestForPayLoad, "getUniversalRequestForPayLoad");
        ck.p.j(h0Var, "defaultDispatcher");
        ck.p.j(operativeEventRepository, "operativeEventRepository");
        ck.p.j(universalRequestDataSource, "universalRequestDataSource");
        ck.p.j(backgroundWorker, "backgroundWorker");
        ck.p.j(universalRequestEventSender, "universalRequestEventSender");
        ck.p.j(getRequestPolicy, "operativeRequestPolicy");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad;
        this.operativeEventRepository = operativeEventRepository;
        this.universalRequestDataSource = universalRequestDataSource;
        this.backgroundWorker = backgroundWorker;
        this.universalRequestEventSender = universalRequestEventSender;
        this.operativeRequestPolicy = getRequestPolicy;
        this.isRunning = v.a(Boolean.FALSE);
        this.scope = kotlinx.coroutines.d.a(h0Var.plus(new OperativeEventObserver$special$$inlined$CoroutineExceptionHandler$1(i0.F8)));
    }

    public final Object invoke(c<? super r> cVar) {
        Object objG = h.g(this.scope.getCoroutineContext(), new AnonymousClass2(null), cVar);
        return objG == a.f() ? objG : r.f64562a;
    }
}
