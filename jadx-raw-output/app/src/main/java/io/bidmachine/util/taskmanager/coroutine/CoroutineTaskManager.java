package io.bidmachine.util.taskmanager.coroutine;

import ck.p;
import io.bidmachine.util.taskmanager.BaseTaskManager;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.g;
import mj.r;
import nk.j;
import nk.l0;
import nk.s0;
import rj.c;
import sj.a;

/* JADX INFO: compiled from: CoroutineTaskManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0018J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lio/bidmachine/util/taskmanager/coroutine/CoroutineTaskManager;", "Lio/bidmachine/util/taskmanager/BaseTaskManager;", "Ljava/lang/Runnable;", "task", "", "delayMs", "Lmj/r;", "scheduleTask", "cancelTask", "", "getScheduledTaskCount", "Lnk/l0;", "coroutineScope", "Lnk/l0;", "getCoroutineScope", "()Lnk/l0;", "", "Lkotlinx/coroutines/g;", "jobMap", "Ljava/util/Map;", "Lkotlin/coroutines/d;", "coroutineContext", "<init>", "(Lkotlin/coroutines/d;)V", "(Lnk/l0;)V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public class CoroutineTaskManager extends BaseTaskManager {
    private final l0 coroutineScope;
    private final Map<Runnable, g> jobMap;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CoroutineTaskManager(d dVar) {
        this(kotlinx.coroutines.d.a(dVar));
        p.j(dVar, "coroutineContext");
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void execute(Runnable runnable) throws Throwable {
        super.execute(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean executeSafely(Runnable runnable) {
        return super.executeSafely(runnable);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(Runnable runnable, long j10, TimeUnit timeUnit) throws Throwable {
        super.schedule(runnable, j10, timeUnit);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10) {
        return super.scheduleSafely(runnable, j10);
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager, io.bidmachine.util.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ boolean scheduleSafely(Runnable runnable, long j10, TimeUnit timeUnit) {
        return super.scheduleSafely(runnable, j10, timeUnit);
    }

    /* JADX INFO: renamed from: io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineTaskManager.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lnk/l0;", "Lmj/r;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @tj.d(c = "io.bidmachine.util.taskmanager.coroutine.CoroutineTaskManager$scheduleTask$1", f = "CoroutineTaskManager.kt", l = {30}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements bk.p<l0, c<? super r>, Object> {
        public final /* synthetic */ long $delayMs;
        public final /* synthetic */ Runnable $task;
        private /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ CoroutineTaskManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j10, CoroutineTaskManager coroutineTaskManager, Runnable runnable, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$delayMs = j10;
            this.this$0 = coroutineTaskManager;
            this.$task = runnable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<r> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMs, this.this$0, this.$task, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // bk.p
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public final Object mo1invoke(l0 l0Var, c<? super r> cVar) {
            return ((AnonymousClass1) create(l0Var, cVar)).invokeSuspend(r.f64562a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = a.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    kotlin.c.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.c.b(obj);
                l0 l0Var = (l0) this.L$0;
                long j10 = this.$delayMs;
                if (j10 > 0) {
                    this.L$0 = l0Var;
                    this.label = 1;
                    if (s0.a(j10, this) == objF) {
                        return objF;
                    }
                }
            }
            try {
                this.$task.run();
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
            this.this$0.cancel(this.$task);
            return r.f64562a;
        }
    }

    public CoroutineTaskManager(l0 l0Var) {
        p.j(l0Var, "coroutineScope");
        this.coroutineScope = l0Var;
        this.jobMap = new ConcurrentHashMap();
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void cancelTask(Runnable runnable) throws Throwable {
        p.j(runnable, "task");
        g gVarRemove = this.jobMap.remove(runnable);
        if (gVarRemove != null) {
            g.a.a(gVarRemove, null, 1, null);
        }
    }

    public final l0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final int getScheduledTaskCount() {
        return this.jobMap.size();
    }

    @Override // io.bidmachine.util.taskmanager.BaseTaskManager
    public void scheduleTask(Runnable runnable, long j10) throws Throwable {
        p.j(runnable, "task");
        g gVarD = j.d(this.coroutineScope, null, CoroutineStart.LAZY, new AnonymousClass1(j10, this, runnable, null), 1, null);
        this.jobMap.put(runnable, gVarD);
        gVarD.start();
    }
}
