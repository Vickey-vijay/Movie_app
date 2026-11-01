package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.environment.workerthread.WorkerManager;
import com.ironsource.environment.workerthread.WorkerResult;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public class A3 {

    public class a implements WorkerManager.WorkEndedListener<B3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f25926a;

        public a(b bVar) {
            this.f25926a = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkCompleted(List<WorkerResult<B3>> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (WorkerResult<B3> workerResult : list) {
                if (workerResult instanceof WorkerResult.Completed) {
                    arrayList2.add((B3) ((WorkerResult.Completed) workerResult).data);
                } else if (workerResult instanceof WorkerResult.Canceled) {
                    arrayList.add(((CallableC3777x3) ((WorkerResult.Canceled) workerResult).callable).c());
                } else if (workerResult instanceof WorkerResult.Failed) {
                    WorkerResult.Failed failed = (WorkerResult.Failed) workerResult;
                    CallableC3777x3 callableC3777x3 = (CallableC3777x3) failed.callable;
                    arrayList2.add(new B3(callableC3777x3.d(), callableC3777x3.c(), null, 0L, failed.exception.getMessage()));
                }
            }
            A3.this.a(arrayList2, arrayList, j10);
            this.f25926a.a(arrayList2, j10, arrayList);
        }

        @Override // com.ironsource.environment.workerthread.WorkerManager.WorkEndedListener
        public void onWorkFailed(String str) {
            String str2 = "failed to collect bidding data, error= " + str;
            IronLog.INTERNAL.verbose(str2);
            this.f25926a.onFailure(str2);
        }
    }

    public interface b {
        void a(List<B3> list, long j10, List<String> list2);

        void onFailure(String str);
    }

    public void a(List<CallableC3777x3> list, b bVar, long j10, TimeUnit timeUnit) {
        try {
            if (list.isEmpty()) {
                IronLog.INTERNAL.verbose("BiddingDataCallable list is empty");
                return;
            }
            WorkerManager workerManager = new WorkerManager(IronSourceThreadManager.INSTANCE.getThreadPoolExecutor());
            Iterator<CallableC3777x3> it = list.iterator();
            while (it.hasNext()) {
                workerManager.addCallable(it.next());
            }
            IronLog.INTERNAL.verbose("instances=" + list.size() + ", timeout=" + j10 + " millis");
            workerManager.startWork(new a(bVar), j10, timeUnit);
        } catch (Throwable th2) {
            C3676r4.d().a(th2);
            String str = "Exception - failed to collect bidding data, error= " + th2.getMessage();
            IronLog.INTERNAL.error(str);
            bVar.onFailure(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<B3> list, List<String> list2, long j10) {
        IronLog.INTERNAL.verbose("tokens received=" + list.size() + ", reached timeout=" + list2.size() + ", total duration=" + j10 + " millis");
        for (B3 b10 : list) {
            if (b10.a() != null) {
                IronLog.INTERNAL.verbose(b10.c() + " - success (" + b10.e() + " millis)");
            } else {
                IronLog.INTERNAL.verbose(b10.c() + " - failed (" + b10.e() + " millis) error: " + b10.b());
            }
        }
        for (String str : list2) {
            IronLog.INTERNAL.verbose(str + " reached timeout");
        }
    }
}
