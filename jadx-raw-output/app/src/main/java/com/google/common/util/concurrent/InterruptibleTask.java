package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import com.ironsource.C3426d4;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.LockSupport;
import q5.l;
import q5.n;

/* JADX INFO: loaded from: classes10.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class InterruptibleTask<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f20687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Runnable f20688c;

    public static final class Blocker extends AbstractOwnableSynchronizer implements Runnable {
        private final InterruptibleTask<?> task;

        @Override // java.lang.Runnable
        public void run() {
        }

        public Blocker(InterruptibleTask<?> interruptibleTask) {
            this.task = interruptibleTask;
        }

        public String toString() {
            return this.task.toString();
        }

        public final void a(Thread thread) {
            super.setExclusiveOwnerThread(thread);
        }

        public Thread getOwner() {
            return super.getExclusiveOwnerThread();
        }
    }

    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public abstract void afterRanInterruptiblyFailure(Throwable th2);

    public abstract void afterRanInterruptiblySuccess(T t10);

    public abstract boolean isDone();

    public abstract T runInterruptibly() throws Exception;

    public abstract String toPendingString();

    static {
        f20687b = new b();
        f20688c = new b();
    }

    public final void a(Thread thread) {
        Runnable runnable = get();
        Blocker blocker = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof Blocker;
            if (!z11 && runnable != f20688c) {
                break;
            }
            if (z11) {
                blocker = (Blocker) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = f20688c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    if (!Thread.interrupted() && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    LockSupport.park(blocker);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    public final void interruptTask() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            Blocker blocker = new Blocker();
            blocker.a(Thread.currentThread());
            if (compareAndSet(runnable, blocker)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (getAndSet(f20687b) == f20688c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objRunInterruptibly = null;
        if (!compareAndSet(null, threadCurrentThread)) {
            return;
        }
        boolean z10 = !isDone();
        if (z10) {
            try {
                objRunInterruptibly = runInterruptibly();
            } catch (Throwable th2) {
                try {
                    n.a(th2);
                    if (!compareAndSet(threadCurrentThread, f20687b)) {
                        a(threadCurrentThread);
                    }
                    if (z10) {
                        afterRanInterruptiblyFailure(th2);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (!compareAndSet(threadCurrentThread, f20687b)) {
                        a(threadCurrentThread);
                    }
                    if (z10) {
                        afterRanInterruptiblySuccess(l.a(null));
                    }
                    throw th3;
                }
            }
        }
        if (!compareAndSet(threadCurrentThread, f20687b)) {
            a(threadCurrentThread);
        }
        if (z10) {
            afterRanInterruptiblySuccess(l.a(objRunInterruptibly));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f20687b) {
            str = "running=[DONE]";
        } else if (runnable instanceof Blocker) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + C3426d4.j.f28588e;
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + toPendingString();
    }
}
