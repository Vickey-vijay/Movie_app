package com.vungle.ads.internal.executor;

import ck.i;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.Ne;
import com.ironsource.sdk.controller.f;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u0001:\u0002\"#BE\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0010\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u001e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0014\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\f2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ#\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "", "executorName", "Ljava/lang/Runnable;", f.b.f30923g, "Lmj/r;", "execute", C3426d4.g.f28496e, "task", "Ljava/util/concurrent/Future;", "submit", "T", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "submit$vungle_ads_release", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "Ljava/util/concurrent/Callable;", "Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "threadFactory", "Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "getThreadFactory", "()Lcom/vungle/ads/internal/executor/NamedThreadFactory;", "", "corePoolSize", "maximumPoolSize", "", "keepAliveTime", "Ljava/util/concurrent/TimeUnit;", Ne.f27158n1, "Ljava/util/concurrent/BlockingQueue;", "workQueue", "<init>", "(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Lcom/vungle/ads/internal/executor/NamedThreadFactory;)V", VastTagName.COMPANION, "ComparableRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleThreadPoolExecutor extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "VungleThreadPool";
    private final NamedThreadFactory threadFactory;

    /* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J0\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\t2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$Companion;", "", "Ljava/lang/Runnable;", f.b.f30923g, C3426d4.g.f28496e, "Lmj/r;", "wrapRunnableWithFail", "Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "getWrappedRunnableWithFail", "T", "Ljava/util/concurrent/Callable;", "Lkotlin/Function0;", "failFallback", "getWrappedCallableWithFallback", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <T> Callable<T> getWrappedCallableWithFallback(final Callable<T> callable, final bk.a<r> aVar) {
            return new Callable() { // from class: com.vungle.ads.internal.executor.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return VungleThreadPoolExecutor.Companion.m3238getWrappedCallableWithFallback$lambda0(callable, aVar);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: getWrappedCallableWithFallback$lambda-0, reason: not valid java name */
        public static final Object m3238getWrappedCallableWithFallback$lambda0(Callable callable, bk.a aVar) {
            p.j(callable, "$command");
            p.j(aVar, "$failFallback");
            try {
                return callable.call();
            } catch (OutOfMemoryError unused) {
                aVar.invoke();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ComparableRunnable getWrappedRunnableWithFail(final Runnable command, final Runnable fail) {
            return command instanceof PriorityRunnable ? new PriorityRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$1
                @Override // com.vungle.ads.internal.task.PriorityRunnable, java.lang.Comparable
                public int compareTo(Object other) {
                    p.j(other, "other");
                    if (!(other instanceof PriorityRunnable)) {
                        return 0;
                    }
                    return p.l(((PriorityRunnable) other).getPriority(), getPriority());
                }

                @Override // com.vungle.ads.internal.task.PriorityRunnable
                public int getPriority() {
                    return ((PriorityRunnable) command).getPriority();
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                }
            } : new ComparableRunnable() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor$Companion$getWrappedRunnableWithFail$2
                @Override // java.lang.Comparable
                public int compareTo(Object other) {
                    p.j(other, "other");
                    Runnable runnable = command;
                    if (runnable instanceof PriorityRunnable) {
                        return ((PriorityRunnable) runnable).compareTo(other);
                    }
                    return 0;
                }

                @Override // java.lang.Runnable
                public void run() {
                    VungleThreadPoolExecutor.INSTANCE.wrapRunnableWithFail(command, fail);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void wrapRunnableWithFail(Runnable runnable, Runnable runnable2) {
            try {
                runnable.run();
            } catch (OutOfMemoryError unused) {
                runnable2.run();
            }
        }
    }

    /* JADX INFO: compiled from: VungleThreadPoolExecutor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/vungle/ads/internal/executor/VungleThreadPoolExecutor$ComparableRunnable;", "", "", "Ljava/lang/Runnable;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface ComparableRunnable extends Comparable<Object>, Runnable {
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        p.j(runnable, f.b.f30923g);
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(runnable, new Runnable() { // from class: com.vungle.ads.internal.executor.a
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m3235execute$lambda0(this.f45435b);
                }
            }));
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "execute exception", e10);
        } catch (OutOfMemoryError e11) {
            String str = "execute error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable task) {
        p.j(task, "task");
        try {
            Future<?> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.c
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m3236submit$lambda1(this.f45437b);
                }
            }));
            p.i(futureSubmit, "{\n            super.subm…\n            })\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "submit exception", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String executorName() {
        String name;
        NamedThreadFactory namedThreadFactory = this.threadFactory;
        return (namedThreadFactory == null || (name = namedThreadFactory.getName()) == null) ? "VungleThreadPoolExecutor" : name;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final NamedThreadFactory getThreadFactory() {
        return this.threadFactory;
    }

    public final Future<?> submit$vungle_ads_release(Runnable task, Runnable fail) {
        p.j(task, "task");
        p.j(fail, C3426d4.g.f28496e);
        try {
            Future<?> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, fail));
            p.i(futureSubmit, "{\n            super.subm…il(task, fail))\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "submit exception with fail", e10);
            fail.run();
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            fail.run();
            return new FutureResult(null);
        }
    }

    public VungleThreadPoolExecutor(int i10, int i11, long j10, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, NamedThreadFactory namedThreadFactory) {
        super(i10, i11, j10, timeUnit, blockingQueue, namedThreadFactory);
        this.threadFactory = namedThreadFactory;
        allowCoreThreadTimeOut(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: execute$lambda-0, reason: not valid java name */
    public static final void m3235execute$lambda0(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        p.j(vungleThreadPoolExecutor, "this$0");
        new OutOfMemory("execute error in " + vungleThreadPoolExecutor.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-1, reason: not valid java name */
    public static final void m3236submit$lambda1(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        p.j(vungleThreadPoolExecutor, "this$0");
        new OutOfMemory("submit error in " + vungleThreadPoolExecutor.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: submit$lambda-2, reason: not valid java name */
    public static final void m3237submit$lambda2(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        p.j(vungleThreadPoolExecutor, "this$0");
        new OutOfMemory("submit error with result in " + vungleThreadPoolExecutor.executorName()).logErrorNoReturnValue$vungle_ads_release();
    }

    public final void execute(Runnable runnable, Runnable runnable2) {
        p.j(runnable, f.b.f30923g);
        p.j(runnable2, C3426d4.g.f28496e);
        try {
            super.execute(INSTANCE.getWrappedRunnableWithFail(runnable, runnable2));
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "execute exception with fail", e10);
            runnable2.run();
        } catch (OutOfMemoryError e11) {
            String str = "execute error with fail in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            runnable2.run();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable task, T result) {
        p.j(task, "task");
        try {
            Future<T> futureSubmit = super.submit(INSTANCE.getWrappedRunnableWithFail(task, new Runnable() { // from class: com.vungle.ads.internal.executor.b
                @Override // java.lang.Runnable
                public final void run() {
                    VungleThreadPoolExecutor.m3237submit$lambda2(this.f45436b);
                }
            }), result);
            p.i(futureSubmit, "{\n            super.subm…     }, result)\n        }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "submit exception with result", e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error with result in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> task) {
        p.j(task, "task");
        try {
            Future<T> futureSubmit = super.submit(INSTANCE.getWrappedCallableWithFallback(task, new bk.a<r>() { // from class: com.vungle.ads.internal.executor.VungleThreadPoolExecutor.submit.3
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    new OutOfMemory("submit callable error in " + VungleThreadPoolExecutor.this.executorName()).logErrorNoReturnValue$vungle_ads_release();
                }
            }));
            p.i(futureSubmit, "override fun <T> submit(…Future<T>\n        }\n    }");
            return futureSubmit;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "submit exception callable: " + e10);
            return new FutureResult(null);
        } catch (OutOfMemoryError e11) {
            String str = "submit error callable in " + executorName() + ": " + e11.getLocalizedMessage();
            Logger.INSTANCE.e(TAG, str, e11);
            new OutOfMemory(str).logErrorNoReturnValue$vungle_ads_release();
            return new FutureResult(null);
        }
    }
}
