package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public class SerialExecutor implements Executor {
    private volatile Runnable mActive;
    private final Executor mExecutor;
    private final ArrayDeque<Task> mTasks = new ArrayDeque<>();
    private final Object mLock = new Object();

    public static class Task implements Runnable {
        public final Runnable mRunnable;
        public final SerialExecutor mSerialExecutor;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.mRunnable.run();
            } finally {
                this.mSerialExecutor.scheduleNext();
            }
        }

        public Task(@NonNull SerialExecutor serialExecutor, @NonNull Runnable runnable) {
            this.mSerialExecutor = serialExecutor;
            this.mRunnable = runnable;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NonNull Runnable runnable) {
        synchronized (this.mLock) {
            this.mTasks.add(new Task(this, runnable));
            if (this.mActive == null) {
                scheduleNext();
            }
        }
    }

    @NonNull
    @VisibleForTesting
    public Executor getDelegatedExecutor() {
        return this.mExecutor;
    }

    public boolean hasPendingTasks() {
        boolean z10;
        synchronized (this.mLock) {
            z10 = !this.mTasks.isEmpty();
        }
        return z10;
    }

    public void scheduleNext() {
        synchronized (this.mLock) {
            Task taskPoll = this.mTasks.poll();
            this.mActive = taskPoll;
            if (taskPoll != null) {
                this.mExecutor.execute(this.mActive);
            }
        }
    }

    public SerialExecutor(@NonNull Executor executor) {
        this.mExecutor = executor;
    }
}
