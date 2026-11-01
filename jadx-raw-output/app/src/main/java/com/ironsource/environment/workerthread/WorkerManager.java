package com.ironsource.environment.workerthread;

import com.ironsource.C3676r4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class WorkerManager<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<Callable<T>> f28846a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f28847b;

    public interface WorkEndedListener<T> {
        void onWorkCompleted(List<WorkerResult<T>> list, long j10);

        void onWorkFailed(String str);
    }

    public void addCallable(Callable<T> callable) {
        this.f28846a.add(callable);
    }

    public void startWork(WorkEndedListener<T> workEndedListener, long j10, TimeUnit timeUnit) {
        if (this.f28847b.isShutdown()) {
            workEndedListener.onWorkFailed("can not start work, executor has been shut down");
            return;
        }
        if (this.f28846a.isEmpty()) {
            workEndedListener.onWorkFailed("can not start work, callable list is empty");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<Future<T>> listInvokeAll = this.f28847b.invokeAll(this.f28846a, j10, timeUnit);
            for (int i10 = 0; i10 < listInvokeAll.size(); i10++) {
                Future<T> future = listInvokeAll.get(i10);
                if (!future.isDone() || future.isCancelled()) {
                    arrayList.add(new WorkerResult.Canceled(this.f28846a.get(i10)));
                } else {
                    try {
                        arrayList.add(new WorkerResult.Completed(future.get()));
                    } catch (InterruptedException e10) {
                        e = e10;
                        C3676r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f28846a.get(i10), e));
                    } catch (CancellationException e11) {
                        C3676r4.d().a(e11);
                        arrayList.add(new WorkerResult.Canceled(this.f28846a.get(i10)));
                    } catch (ExecutionException e12) {
                        e = e12;
                        C3676r4.d().a(e);
                        arrayList.add(new WorkerResult.Failed(this.f28846a.get(i10), e));
                    }
                }
            }
            workEndedListener.onWorkCompleted(arrayList, System.currentTimeMillis() - jCurrentTimeMillis);
            this.f28847b.shutdownNow();
        } catch (Exception e13) {
            C3676r4.d().a(e13);
            IronLog.INTERNAL.error(e13.toString());
            workEndedListener.onWorkFailed("failed to invoke callables, error= " + e13.getMessage());
            this.f28847b.shutdownNow();
        }
    }

    public WorkerManager(ExecutorService executorService) {
        this.f28847b = executorService;
    }
}
