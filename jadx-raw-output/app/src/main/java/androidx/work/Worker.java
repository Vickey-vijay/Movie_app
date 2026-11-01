package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.impl.utils.futures.SettableFuture;
import q5.i;

/* JADX INFO: loaded from: classes10.dex */
public abstract class Worker extends ListenableWorker {
    public SettableFuture<ListenableWorker.Result> mFuture;

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.Result doWork();

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final i<ListenableWorker.Result> startWork() {
        this.mFuture = SettableFuture.create();
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.Worker.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Worker.this.mFuture.set(Worker.this.doWork());
                } catch (Throwable th2) {
                    Worker.this.mFuture.setException(th2);
                }
            }
        });
        return this.mFuture;
    }
}
