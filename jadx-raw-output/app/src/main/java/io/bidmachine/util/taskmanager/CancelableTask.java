package io.bidmachine.util.taskmanager;

import io.bidmachine.util.Cancelable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: compiled from: CancelableTask.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\u0007\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b¨\u0006\u000e"}, d2 = {"Lio/bidmachine/util/taskmanager/CancelableTask;", "Ljava/lang/Runnable;", "Lio/bidmachine/util/Cancelable;", "Lmj/r;", "run", "runTask", "", "isCanceled", "isCancel", "setCancel", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "<init>", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public abstract class CancelableTask implements Runnable, Cancelable {
    private final AtomicBoolean isCanceled = new AtomicBoolean(false);

    public abstract void runTask();

    @Override // io.bidmachine.util.Cancelable
    public boolean isCanceled() {
        return this.isCanceled.get();
    }

    public void setCancel(boolean z10) {
        this.isCanceled.set(z10);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (isCanceled()) {
            return;
        }
        runTask();
    }
}
