package androidx.lifecycle;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import ck.p;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.ArrayDeque;
import java.util.Queue;
import nk.w0;
import nk.y1;

/* JADX INFO: compiled from: DispatchQueue.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DispatchQueue {
    private boolean finished;
    private boolean isDraining;
    private boolean paused = true;
    private final Queue<Runnable> queue = new ArrayDeque();

    @MainThread
    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    @MainThread
    public final void pause() {
        this.paused = true;
    }

    @MainThread
    private final void enqueue(Runnable runnable) {
        if (!this.queue.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        drainQueue();
    }

    @MainThread
    public final boolean canRun() {
        return this.finished || !this.paused;
    }

    @AnyThread
    public final void dispatchAndEnqueue(kotlin.coroutines.d dVar, final Runnable runnable) {
        p.j(dVar, GAMConfig.KEY_CONTEXT);
        p.j(runnable, "runnable");
        y1 y1VarN = w0.c().n();
        if (y1VarN.isDispatchNeeded(dVar) || canRun()) {
            y1VarN.dispatch(dVar, new Runnable() { // from class: androidx.lifecycle.c
                @Override // java.lang.Runnable
                public final void run() {
                    DispatchQueue.dispatchAndEnqueue$lambda$2$lambda$1(this.f3932b, runnable);
                }
            });
        } else {
            enqueue(runnable);
        }
    }

    @MainThread
    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable runnablePoll = this.queue.poll();
                if (runnablePoll != null) {
                    runnablePoll.run();
                }
            }
            this.isDraining = false;
        } catch (Throwable th2) {
            this.isDraining = false;
            throw th2;
        }
    }

    @MainThread
    public final void resume() {
        if (this.paused) {
            if (!(!this.finished)) {
                throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
            }
            this.paused = false;
            drainQueue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchAndEnqueue$lambda$2$lambda$1(DispatchQueue dispatchQueue, Runnable runnable) {
        p.j(dispatchQueue, "this$0");
        p.j(runnable, "$runnable");
        dispatchQueue.enqueue(runnable);
    }
}
