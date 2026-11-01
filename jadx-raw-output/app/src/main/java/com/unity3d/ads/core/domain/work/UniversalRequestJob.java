package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bk.a;
import ck.p;
import ck.s;
import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.ads.core.domain.events.UniversalRequestEventSender;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.ads.datastore.UniversalRequestStoreOuterClass;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.g;
import mj.r;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: UniversalRequestJob.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class UniversalRequestJob extends CoroutineWorker implements IServiceComponent {
    private final g logger$delegate;
    public RequestPolicy requestPolicy;
    private final g universalRequestDataSource$delegate;
    private final g universalRequestEventSender$delegate;
    private final WorkerParameters workerParams;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.UniversalRequestJob$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: UniversalRequestJob.kt */
    @d(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", l = {27, 30, 33}, m = "doWork$suspendImpl")
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
            return UniversalRequestJob.doWork$suspendImpl(UniversalRequestJob.this, this);
        }
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(c<? super ListenableWorker.Result> cVar) {
        return doWork$suspendImpl(this, cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(workerParameters, "workerParams");
        this.workerParams = workerParameters;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = "";
        this.universalRequestEventSender$delegate = b.b(lazyThreadSafetyMode, new a<UniversalRequestEventSender>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.events.UniversalRequestEventSender, java.lang.Object] */
            @Override // bk.a
            public final UniversalRequestEventSender invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, s.b(UniversalRequestEventSender.class));
            }
        });
        this.universalRequestDataSource$delegate = b.b(lazyThreadSafetyMode, new a<UniversalRequestDataSource>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource, java.lang.Object] */
            @Override // bk.a
            public final UniversalRequestDataSource invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, s.b(UniversalRequestDataSource.class));
            }
        });
        this.logger$delegate = b.b(lazyThreadSafetyMode, new a<Logger>() { // from class: com.unity3d.ads.core.domain.work.UniversalRequestJob$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.unity3d.ads.core.log.Logger, java.lang.Object] */
            @Override // bk.a
            public final Logger invoke() {
                IServiceComponent iServiceComponent = this;
                return iServiceComponent.getServiceProvider().getRegistry().getService(str, s.b(Logger.class));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.unity3d.ads.core.domain.work.UniversalRequestJob, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v8, types: [com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    public static /* synthetic */ Object doWork$suspendImpl(UniversalRequestJob universalRequestJob, c<? super ListenableWorker.Result> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object objM3458constructorimpl;
        ?? r10;
        ?? r11;
        ?? universalRequestDataSource;
        ?? r12;
        String str;
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
        ?? r13 = anonymousClass1.label;
        try {
            if (r13 != 0) {
                if (r13 == 1) {
                    String str2 = (String) anonymousClass1.L$1;
                    UniversalRequestJob universalRequestJob2 = (UniversalRequestJob) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    r12 = universalRequestJob2;
                    str = str2;
                } else if (r13 == 2) {
                    String str3 = (String) anonymousClass1.L$1;
                    UniversalRequestJob universalRequestJob3 = (UniversalRequestJob) anonymousClass1.L$0;
                    kotlin.c.b(obj);
                    r13 = universalRequestJob3;
                    universalRequestJob = str3;
                    objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
                    r11 = r13;
                    r10 = universalRequestJob;
                    if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
                        ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                        p.i(resultRetry, "{\n            Result.retry()\n        }");
                        return resultRetry;
                    }
                    universalRequestDataSource = r11.getUniversalRequestDataSource();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (universalRequestDataSource.remove(r10, anonymousClass1) == objF) {
                        return objF;
                    }
                } else {
                    if (r13 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.c.b(obj);
                }
                ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
                p.i(resultSuccess, "{\n            universalR…esult.success()\n        }");
                return resultSuccess;
            }
            kotlin.c.b(obj);
            String string = ((UniversalRequestJob) universalRequestJob).workerParams.getInputData().getString(UniversalRequestWorkerData.KEY_UNIVERSAL_REQUEST_ID);
            if (string == null) {
                ListenableWorker.Result resultSuccess2 = ListenableWorker.Result.success();
                p.i(resultSuccess2, "success()");
                return resultSuccess2;
            }
            UniversalRequestDataSource universalRequestDataSource2 = universalRequestJob.getUniversalRequestDataSource();
            anonymousClass1.L$0 = universalRequestJob;
            anonymousClass1.L$1 = string;
            anonymousClass1.label = 1;
            Object obj2 = universalRequestDataSource2.get(anonymousClass1);
            if (obj2 == objF) {
                return objF;
            }
            r12 = universalRequestJob;
            str = string;
            obj = obj2;
            UniversalRequestOuterClass.UniversalRequest from = UniversalRequestOuterClass.UniversalRequest.parseFrom(((UniversalRequestStoreOuterClass.UniversalRequestStore) obj).getUniversalRequestMapOrThrow(str));
            Result.a aVar = Result.Companion;
            UniversalRequestEventSender universalRequestEventSender = r12.getUniversalRequestEventSender();
            p.i(from, "universalRequest");
            RequestPolicy requestPolicy = r12.getRequestPolicy();
            anonymousClass1.L$0 = r12;
            anonymousClass1.L$1 = str;
            anonymousClass1.label = 2;
            r13 = r12;
            universalRequestJob = str;
            if (universalRequestEventSender.invoke(from, requestPolicy, anonymousClass1) == objF) {
                return objF;
            }
            objM3458constructorimpl = Result.m3458constructorimpl(r.f64562a);
            r11 = r13;
            r10 = universalRequestJob;
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
            r11 = r13;
            r10 = universalRequestJob;
        }
        if (Result.m3464isSuccessimpl(objM3458constructorimpl)) {
            ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
            p.i(resultRetry2, "{\n            Result.retry()\n        }");
            return resultRetry2;
        }
        universalRequestDataSource = r11.getUniversalRequestDataSource();
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        if (universalRequestDataSource.remove(r10, anonymousClass1) == objF) {
            return objF;
        }
        ListenableWorker.Result resultSuccess3 = ListenableWorker.Result.success();
        p.i(resultSuccess3, "{\n            universalR…esult.success()\n        }");
        return resultSuccess3;
    }

    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    public final RequestPolicy getRequestPolicy() {
        RequestPolicy requestPolicy = this.requestPolicy;
        if (requestPolicy != null) {
            return requestPolicy;
        }
        p.B("requestPolicy");
        return null;
    }

    public final UniversalRequestDataSource getUniversalRequestDataSource() {
        return (UniversalRequestDataSource) this.universalRequestDataSource$delegate.getValue();
    }

    public final UniversalRequestEventSender getUniversalRequestEventSender() {
        return (UniversalRequestEventSender) this.universalRequestEventSender$delegate.getValue();
    }

    public final WorkerParameters getWorkerParams() {
        return this.workerParams;
    }

    public final void setRequestPolicy(RequestPolicy requestPolicy) {
        p.j(requestPolicy, "<set-?>");
        this.requestPolicy = requestPolicy;
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }
}
