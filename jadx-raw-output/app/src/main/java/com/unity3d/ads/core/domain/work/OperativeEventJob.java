package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import bk.a;
import ck.p;
import ck.s;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.ServiceProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import mj.g;
import rj.c;
import tj.d;

/* JADX INFO: compiled from: OperativeEventJob.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class OperativeEventJob extends UniversalRequestJob {
    private final g getOperativeRequestPolicy$delegate;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.work.OperativeEventJob$doWork$1, reason: invalid class name */
    /* JADX INFO: compiled from: OperativeEventJob.kt */
    @d(c = "com.unity3d.ads.core.domain.work.OperativeEventJob", f = "OperativeEventJob.kt", l = {20}, m = "doWork")
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
            return OperativeEventJob.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperativeEventJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(workerParameters, "workerParams");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final String str = ServiceProvider.NAMED_OPERATIVE_REQ;
        this.getOperativeRequestPolicy$delegate = b.b(lazyThreadSafetyMode, new a<GetRequestPolicy>() { // from class: com.unity3d.ads.core.domain.work.OperativeEventJob$special$$inlined$inject$default$1
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
    }

    private final GetRequestPolicy getGetOperativeRequestPolicy() {
        return (GetRequestPolicy) this.getOperativeRequestPolicy$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.work.UniversalRequestJob, androidx.work.CoroutineWorker
    public Object doWork(c<? super ListenableWorker.Result> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        OperativeEventJob operativeEventJob;
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
                setRequestPolicy(getGetOperativeRequestPolicy().invoke());
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objDoWork = super.doWork(anonymousClass1);
                if (objDoWork == objF) {
                    return objF;
                }
                operativeEventJob = this;
            } catch (Throwable th2) {
                th = th2;
                operativeEventJob = this;
                operativeEventJob.getLogger().trace("OperativeEventJob failed to process work", th);
                ListenableWorker.Result resultRetry = ListenableWorker.Result.retry();
                p.i(resultRetry, "retry()");
                return resultRetry;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            operativeEventJob = (OperativeEventJob) anonymousClass1.L$0;
            try {
                kotlin.c.b(objDoWork);
            } catch (Throwable th3) {
                th = th3;
                operativeEventJob.getLogger().trace("OperativeEventJob failed to process work", th);
                ListenableWorker.Result resultRetry2 = ListenableWorker.Result.retry();
                p.i(resultRetry2, "retry()");
                return resultRetry2;
            }
        }
        return (ListenableWorker.Result) objDoWork;
    }
}
