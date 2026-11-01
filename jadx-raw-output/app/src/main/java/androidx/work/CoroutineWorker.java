package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.futures.SettableFuture;
import bk.p;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.d;
import kotlinx.coroutines.g;
import mj.r;
import nk.h0;
import nk.j;
import nk.l0;
import nk.w0;
import nk.x;
import q5.i;
import rj.c;
import sj.a;
import tj.f;

/* JADX INFO: compiled from: CoroutineWorker.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0013\u0010\u0005\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u001b\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002J\u0006\u0010\u0012\u001a\u00020\u000bR\u001a\u0010\u0014\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u001e\u001a\u00020\u001d8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/work/CoroutineWorker;", "Landroidx/work/ListenableWorker;", "Lq5/i;", "Landroidx/work/ListenableWorker$Result;", "startWork", "doWork", "(Lrj/c;)Ljava/lang/Object;", "Landroidx/work/ForegroundInfo;", "getForegroundInfo", "Landroidx/work/Data;", "data", "Lmj/r;", "setProgress", "(Landroidx/work/Data;Lrj/c;)Ljava/lang/Object;", "foregroundInfo", "setForeground", "(Landroidx/work/ForegroundInfo;Lrj/c;)Ljava/lang/Object;", "getForegroundInfoAsync", "onStopped", "Lnk/x;", "job", "Lnk/x;", "getJob$work_runtime_ktx_release", "()Lnk/x;", "Landroidx/work/impl/utils/futures/SettableFuture;", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "getFuture$work_runtime_ktx_release", "()Landroidx/work/impl/utils/futures/SettableFuture;", "Lnk/h0;", "coroutineContext", "Lnk/h0;", "getCoroutineContext", "()Lnk/h0;", "getCoroutineContext$annotations", "()V", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public abstract class CoroutineWorker extends ListenableWorker {
    private final h0 coroutineContext;
    private final SettableFuture<ListenableWorker.Result> future;
    private final x job;

    public static /* synthetic */ void getCoroutineContext$annotations() {
    }

    public abstract Object doWork(c<? super ListenableWorker.Result> cVar);

    public Object getForegroundInfo(c<? super ForegroundInfo> cVar) {
        return getForegroundInfo$suspendImpl(this, cVar);
    }

    @Override // androidx.work.ListenableWorker
    public final i<ForegroundInfo> getForegroundInfoAsync() {
        x xVarB = JobKt__JobKt.b(null, 1, null);
        l0 l0VarA = d.a(getCoroutineContext().plus(xVarB));
        JobListenableFuture jobListenableFuture = new JobListenableFuture(xVarB, null, 2, null);
        j.d(l0VarA, null, null, new C08541(jobListenableFuture, this, null), 3, null);
        return jobListenableFuture;
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$getForegroundInfoAsync$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @tj.d(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class C08541 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
        public Object L$0;
        public int label;
        public final /* synthetic */ CoroutineWorker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08541(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, c<? super C08541> cVar) {
            super(2, cVar);
            this.$jobFuture = jobListenableFuture;
            this.this$0 = coroutineWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return new C08541(this.$jobFuture, this.this$0, cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((C08541) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            JobListenableFuture jobListenableFuture;
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    jobListenableFuture = (JobListenableFuture) this.L$0;
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
                CoroutineWorker coroutineWorker = this.this$0;
                this.L$0 = jobListenableFuture2;
                this.label = 1;
                Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
                if (foregroundInfo == objF) {
                    return objF;
                }
                jobListenableFuture = jobListenableFuture2;
                obj = foregroundInfo;
            }
            jobListenableFuture.complete(obj);
            return r.f64562a;
        }
    }

    /* JADX INFO: renamed from: androidx.work.CoroutineWorker$startWork$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: CoroutineWorker.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @tj.d(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class C08551 extends SuspendLambda implements p<l0, c<? super r>, Object> {
        public int label;

        public C08551(c<? super C08551> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            return CoroutineWorker.this.new C08551(cVar);
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((C08551) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = a.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        kotlin.c.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    kotlin.c.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.label = 1;
                    obj = coroutineWorker.doWork(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().set((ListenableWorker.Result) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.getFuture$work_runtime_ktx_release().setException(th2);
            }
            return r.f64562a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ck.p.j(context, "appContext");
        ck.p.j(workerParameters, "params");
        this.job = JobKt__JobKt.b(null, 1, null);
        SettableFuture<ListenableWorker.Result> settableFutureCreate = SettableFuture.create();
        ck.p.i(settableFutureCreate, "create()");
        this.future = settableFutureCreate;
        settableFutureCreate.addListener(new Runnable() { // from class: androidx.work.CoroutineWorker.1
            @Override // java.lang.Runnable
            public final void run() {
                if (CoroutineWorker.this.getFuture$work_runtime_ktx_release().isCancelled()) {
                    g.a.a(CoroutineWorker.this.getJob(), null, 1, null);
                }
            }
        }, getTaskExecutor().getBackgroundExecutor());
        this.coroutineContext = w0.a();
    }

    public static /* synthetic */ Object getForegroundInfo$suspendImpl(CoroutineWorker coroutineWorker, c cVar) {
        throw new IllegalStateException("Not implemented");
    }

    public h0 getCoroutineContext() {
        return this.coroutineContext;
    }

    public final SettableFuture<ListenableWorker.Result> getFuture$work_runtime_ktx_release() {
        return this.future;
    }

    /* JADX INFO: renamed from: getJob$work_runtime_ktx_release, reason: from getter */
    public final x getJob() {
        return this.job;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        this.future.cancel(false);
    }

    public final Object setForeground(ForegroundInfo foregroundInfo, c<? super r> cVar) throws Throwable {
        Object objB;
        i<Void> foregroundAsync = setForegroundAsync(foregroundInfo);
        ck.p.i(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (foregroundAsync.isDone()) {
            try {
                objB = foregroundAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            foregroundAsync.addListener(new ListenableFutureKt$await$2$1(cVar2, foregroundAsync), DirectExecutor.INSTANCE);
            objB = cVar2.B();
            if (objB == a.f()) {
                f.c(cVar);
            }
        }
        if (objB == a.f()) {
            return objB;
        }
        return r.f64562a;
    }

    public final Object setProgress(Data data, c<? super r> cVar) throws Throwable {
        Object objB;
        i<Void> progressAsync = setProgressAsync(data);
        ck.p.i(progressAsync, "setProgressAsync(data)");
        if (progressAsync.isDone()) {
            try {
                objB = progressAsync.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        } else {
            kotlinx.coroutines.c cVar2 = new kotlinx.coroutines.c(IntrinsicsKt__IntrinsicsJvmKt.c(cVar), 1);
            cVar2.J();
            progressAsync.addListener(new ListenableFutureKt$await$2$1(cVar2, progressAsync), DirectExecutor.INSTANCE);
            objB = cVar2.B();
            if (objB == a.f()) {
                f.c(cVar);
            }
        }
        if (objB == a.f()) {
            return objB;
        }
        return r.f64562a;
    }

    @Override // androidx.work.ListenableWorker
    public final i<ListenableWorker.Result> startWork() {
        j.d(d.a(getCoroutineContext().plus(this.job)), null, null, new C08551(null), 3, null);
        return this.future;
    }
}
