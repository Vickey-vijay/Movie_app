package com.ironsource;

import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.analytics.events.CrashEvent;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.ironsource.je, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3543je extends ScheduledThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bk.l<Throwable, mj.r> f29283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bk.l<String, mj.r> f29284b;

    /* JADX INFO: renamed from: com.ironsource.je$a */
    public static final class a extends Lambda implements bk.l<Throwable, mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29285a = new a();

        public a() {
            super(1);
        }

        public final void a(Throwable th2) {
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(Throwable th2) {
            a(th2);
            return mj.r.f64562a;
        }
    }

    /* JADX INFO: renamed from: com.ironsource.je$b */
    public static final class b extends Lambda implements bk.l<String, mj.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29286a = new b();

        public b() {
            super(1);
        }

        public final void a(String str) {
            ck.p.j(str, "it");
        }

        @Override // bk.l
        public /* bridge */ /* synthetic */ mj.r invoke(String str) {
            a(str);
            return mj.r.f64562a;
        }
    }

    public C3543je() {
        this(0, null, null, 7, null);
    }

    public /* synthetic */ C3543je(int i10, bk.l lVar, bk.l lVar2, int i11, ck.i iVar) {
        this((i11 & 1) != 0 ? C3561ke.f29374a : i10, (i11 & 2) != 0 ? a.f29285a : lVar, (i11 & 4) != 0 ? b.f29286a : lVar2);
    }

    private final String a(String str) {
        return C3543je.class.getName() + " RuntimeException caught: " + str;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th2) {
        super.afterExecute(runnable, th2);
        if (th2 != null) {
            this.f29284b.invoke(a(th2.toString()));
            this.f29283a.invoke(th2);
            return;
        }
        if ((runnable instanceof Future) && ((Future) runnable).isDone()) {
            try {
                ((Future) runnable).get();
            } catch (InterruptedException e10) {
                C3676r4.d().a(e10);
                this.f29284b.invoke(a(e10.toString()));
                Thread.currentThread().interrupt();
            } catch (CancellationException e11) {
                C3676r4.d().a(e11);
                this.f29284b.invoke(a(e11.toString()));
                this.f29283a.invoke(e11);
            } catch (ExecutionException e12) {
                C3676r4.d().a(e12);
                this.f29284b.invoke(a(e12.toString()));
                this.f29283a.invoke(e12.getCause());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3543je(int i10, bk.l<? super Throwable, mj.r> lVar, bk.l<? super String, mj.r> lVar2) {
        super(i10, new ThreadFactoryC3522ia());
        ck.p.j(lVar, CrashEvent.f44624e);
        ck.p.j(lVar2, CreativeInfo.f44317an);
        this.f29283a = lVar;
        this.f29284b = lVar2;
    }
}
