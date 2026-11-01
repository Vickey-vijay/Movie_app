package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import bk.l;
import ck.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.g;
import mj.r;
import q5.i;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\nH\u0096\u0001J\u0018\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u0000H\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ0\u0010\f\u001a\n \u0004*\u0004\u0018\u00018\u00008\u00002\u0006\u0010\u0005\u001a\u00020\u000e2\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0003¢\u0006\u0004\b\f\u0010\u0010J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\t\u0010\u0012\u001a\u00020\nH\u0096\u0001J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/work/JobListenableFuture;", "R", "Lq5/i;", "Ljava/lang/Runnable;", "kotlin.jvm.PlatformType", "p0", "Ljava/util/concurrent/Executor;", "p1", "Lmj/r;", "addListener", "", "cancel", "get", "()Ljava/lang/Object;", "", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isCancelled", "isDone", "result", "complete", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/g;", "job", "Lkotlinx/coroutines/g;", "Landroidx/work/impl/utils/futures/SettableFuture;", "underlying", "Landroidx/work/impl/utils/futures/SettableFuture;", "<init>", "(Lkotlinx/coroutines/g;Landroidx/work/impl/utils/futures/SettableFuture;)V", "work-runtime-ktx_release"}, k = 1, mv = {1, 5, 1})
public final class JobListenableFuture<R> implements i<R> {
    private final g job;
    private final SettableFuture<R> underlying;

    public JobListenableFuture(g gVar, SettableFuture<R> settableFuture) {
        p.j(gVar, "job");
        p.j(settableFuture, "underlying");
        this.job = gVar;
        this.underlying = settableFuture;
        gVar.F(new l<Throwable, r>(this) { // from class: androidx.work.JobListenableFuture.1
            public final /* synthetic */ JobListenableFuture<R> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Throwable th2) {
                invoke2(th2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                if (th2 == null) {
                    if (!((JobListenableFuture) this.this$0).underlying.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    if (th2 instanceof CancellationException) {
                        ((JobListenableFuture) this.this$0).underlying.cancel(true);
                        return;
                    }
                    SettableFuture settableFuture2 = ((JobListenableFuture) this.this$0).underlying;
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    settableFuture2.setException(th2);
                }
            }
        });
    }

    @Override // q5.i
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean p10) {
        return this.underlying.cancel(p10);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public R get(long p10, TimeUnit p11) {
        return this.underlying.get(p10, p11);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    public final void complete(R result) {
        this.underlying.set(result);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ JobListenableFuture(g gVar, SettableFuture settableFuture, int i10, ck.i iVar) {
        if ((i10 & 2) != 0) {
            settableFuture = SettableFuture.create();
            p.i(settableFuture, "create()");
        }
        this(gVar, settableFuture);
    }
}
