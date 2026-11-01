package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bk.a;
import ck.p;
import ck.s;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.g;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: DiagnosticEventJob.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class DiagnosticEventJob extends UniversalRequestJob {
    private final g diagnosticEventRequestWorkModifier$delegate;
    private final g getDiagnosticRequestPolicy$delegate;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.DiagnosticEventJob$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: DiagnosticEventJob.kt */
    @d(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {23, 26, 28}, m = "doWork")
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DiagnosticEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(workerParameters, "workerParams");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OTHER_REQ;
        this.getDiagnosticRequestPolicy$delegate = b.b(lazyThreadSafetyMode, new a<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.GetRequestPolicy, java.lang.Object] */
            @Override // bk.a
            public final GetRequestPolicy invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, s.b(GetRequestPolicy.class));
            }
        });
        final String str2 = "";
        this.diagnosticEventRequestWorkModifier$delegate = b.b(lazyThreadSafetyMode, new a<DiagnosticEventRequestWorkModifier>() { // from class: com.unity3d.ads.core.domain.work.DiagnosticEventJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.work.DiagnosticEventRequestWorkModifier, java.lang.Object] */
            @Override // bk.a
            public final DiagnosticEventRequestWorkModifier invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str2, s.b(DiagnosticEventRequestWorkModifier.class));
            }
        });
    }

    private final DiagnosticEventRequestWorkModifier getDiagnosticEventRequestWorkModifier() {
        return (DiagnosticEventRequestWorkModifier) this.diagnosticEventRequestWorkModifier$delegate.getValue();
    }

    private final GetRequestPolicy getGetDiagnosticRequestPolicy() {
        return (GetRequestPolicy) this.getDiagnosticRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(c<? super ListenableWorker.Result> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        DiagnosticEventJob diagnosticEventJob;
        String string;
        DiagnosticEventJob diagnosticEventJob2;
        DiagnosticEventJob diagnosticEventJob3;
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
        Object objDoWork = anonymousClass1.result;
        Object objF = sj.a.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            kotlin.c.b(objDoWork);
            try {
                string = getWorkerParams().getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
                if (string == null) {
                    ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                    p.i(resultSuccess, "success()");
                    return resultSuccess;
                }
                UniversalRequestDataSource universalRequestDataSource = getUniversalRequestDataSource();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = string;
                anonymousClass1.label = 1;
                objDoWork = universalRequestDataSource.get(anonymousClass1);
                if (objDoWork == objF) {
                    return objF;
                }
                diagnosticEventJob2 = this;
            } catch (Throwable th2) {
                th = th2;
                diagnosticEventJob = this;
                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                p.i(resultRetry, "retry()");
                return resultRetry;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    diagnosticEventJob = (DiagnosticEventJob) anonymousClass1.L$0;
                    try {
                        kotlin.c.b(objDoWork);
                        return (ListenableWorker.Result) objDoWork;
                    } catch (Throwable th3) {
                        th = th3;
                        diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                        ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
                        p.i(resultRetry2, "retry()");
                        return resultRetry2;
                    }
                }
                diagnosticEventJob3 = (DiagnosticEventJob) anonymousClass1.L$0;
                try {
                    kotlin.c.b(objDoWork);
                    diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
                    anonymousClass1.L$0 = diagnosticEventJob3;
                    anonymousClass1.label = 3;
                    objDoWork = super.doWork(anonymousClass1);
                    if (objDoWork == objF) {
                        return objF;
                    }
                    diagnosticEventJob = diagnosticEventJob3;
                    return (ListenableWorker.Result) objDoWork;
                } catch (Throwable th4) {
                    th = th4;
                    diagnosticEventJob = diagnosticEventJob3;
                    diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                    ListenableWorker.Result resultRetry3 = ListenableWorker.Result.retry();
                    p.i(resultRetry3, "retry()");
                    return resultRetry3;
                }
            }
            string = (String) anonymousClass1.L$1;
            diagnosticEventJob2 = (DiagnosticEventJob) anonymousClass1.L$0;
            try {
                kotlin.c.b(objDoWork);
            } catch (Throwable th5) {
                th = th5;
                diagnosticEventJob = diagnosticEventJob2;
                diagnosticEventJob.getLogger().trace("DiagnosticEventJob failed to process work", th);
                ListenableWorker.Result resultRetry4 = ListenableWorker.Result.retry();
                p.i(resultRetry4, "retry()");
                return resultRetry4;
            }
        }
        UniversalRequestOuterClass.UniversalRequest from = UniversalRequestOuterClass.UniversalRequest.parseFrom(((UniversalRequestStoreOuterClass.UniversalRequestStore) objDoWork).getUniversalRequestMapOrThrow(string));
        DiagnosticEventRequestWorkModifier diagnosticEventRequestWorkModifier = diagnosticEventJob2.getDiagnosticEventRequestWorkModifier();
        p.i(from, "universalRequest");
        UniversalRequestOuterClass.UniversalRequest universalRequestInvoke = diagnosticEventRequestWorkModifier.invoke(from);
        UniversalRequestDataSource universalRequestDataSource2 = diagnosticEventJob2.getUniversalRequestDataSource();
        ByteString byteString = universalRequestInvoke.toByteString();
        p.i(byteString, "modifiedUniversalRequest.toByteString()");
        anonymousClass1.L$0 = diagnosticEventJob2;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 2;
        if (universalRequestDataSource2.set(string, byteString, anonymousClass1) == objF) {
            return objF;
        }
        diagnosticEventJob3 = diagnosticEventJob2;
        diagnosticEventJob3.setRequestPolicy(diagnosticEventJob3.getGetDiagnosticRequestPolicy().invoke());
        anonymousClass1.L$0 = diagnosticEventJob3;
        anonymousClass1.label = 3;
        objDoWork = super.doWork(anonymousClass1);
        if (objDoWork == objF) {
            return objF;
        }
        diagnosticEventJob = diagnosticEventJob3;
        return (ListenableWorker.Result) objDoWork;
    }
}
