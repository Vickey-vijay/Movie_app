package com.ironsource.environment.thread;

import android.os.Handler;
import android.os.Looper;
import ck.p;
import com.ironsource.C3543je;
import com.ironsource.C3676r4;
import com.ironsource.V9;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes9.dex */
public final class IronSourceThreadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f28828a;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final mj.g f28829b = kotlin.b.a(g.f28842a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final mj.g f28830c = kotlin.b.a(c.f28838a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final mj.g f28831d = kotlin.b.a(f.f28841a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final mj.g f28832e = kotlin.b.a(d.f28839a);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final mj.g f28833f = kotlin.b.a(a.f28836a);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final mj.g f28834g = kotlin.b.a(e.f28840a);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final mj.g f28835h = kotlin.b.a(b.f28837a);

    public static final class a extends Lambda implements bk.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28836a = new a();

        public a() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("adapterBackground");
            v10.start();
            v10.a();
            return v10;
        }
    }

    public static final class b extends Lambda implements bk.a<C3543je> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28837a = new b();

        public b() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3543je invoke() {
            return new C3543je(0, null, null, 7, null);
        }
    }

    public static final class c extends Lambda implements bk.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28838a = new c();

        public c() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            V9 v10 = new V9("IronSourceInitiatorHandler");
            v10.start();
            v10.a();
            return new Handler(v10.getLooper());
        }
    }

    public static final class d extends Lambda implements bk.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f28839a = new d();

        public d() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("mediationBackground");
            v10.start();
            v10.a();
            return v10;
        }
    }

    public static final class e extends Lambda implements bk.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f28840a = new e();

        public e() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("publisher-callbacks");
            v10.start();
            v10.a();
            return v10;
        }
    }

    public static final class f extends Lambda implements bk.a<V9> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f28841a = new f();

        public f() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final V9 invoke() {
            V9 v10 = new V9("managersThread");
            v10.start();
            v10.a();
            return v10;
        }
    }

    public static final class g extends Lambda implements bk.a<Handler> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f28842a = new g();

        public g() {
            super(0);
        }

        @Override // bk.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    private final V9 a() {
        return (V9) f28833f.getValue();
    }

    private final C3543je b() {
        return (C3543je) f28835h.getValue();
    }

    private final V9 c() {
        return (V9) f28832e.getValue();
    }

    public final void postAdapterBackgroundTask(Runnable runnable) {
        p.j(runnable, "action");
        postAdapterBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable runnable) {
        p.j(runnable, "action");
        postMediationBackgroundTask$default(this, runnable, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable runnable) {
        p.j(runnable, "action");
        postOnUiThreadTask$default(this, runnable, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable runnable) {
        p.j(runnable, "action");
        postPublisherCallback$default(this, runnable, 0L, 2, null);
    }

    private final boolean a(Runnable runnable) {
        return f28828a && b().getQueue().contains(runnable);
    }

    private final V9 d() {
        return (V9) f28834g.getValue();
    }

    private final Handler e() {
        return (Handler) f28829b.getValue();
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j10);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j10);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j10);
    }

    public final void executeTasks(boolean z10, boolean z11, List<? extends Runnable> list) {
        p.j(list, "tasks");
        if (!z10) {
            Iterator<? extends Runnable> it = list.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            return;
        }
        if (!z11) {
            Iterator<? extends Runnable> it2 = list.iterator();
            while (it2.hasNext()) {
                postMediationBackgroundTask$default(INSTANCE, it2.next(), 0L, 2, null);
            }
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(list.size());
        for (final Runnable runnable : list) {
            postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.b
                @Override // java.lang.Runnable
                public final void run() {
                    IronSourceThreadManager.a(runnable, countDownLatch);
                }
            }, 0L, 2, null);
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            C3676r4.d().a(e10);
        }
    }

    public final Handler getInitHandler() {
        return (Handler) f28830c.getValue();
    }

    public final V9 getSharedManagersThread() {
        return (V9) f28831d.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return f28828a;
    }

    public final void postAdapterBackgroundTask(Runnable runnable, long j10) {
        p.j(runnable, "action");
        if (f28828a) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            a().a(runnable, j10);
        }
    }

    public final void postMediationBackgroundTask(Runnable runnable, long j10) {
        p.j(runnable, "action");
        if (f28828a) {
            b().schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } else {
            c().a(runnable, j10);
        }
    }

    public final void postOnUiThreadTask(Runnable runnable, long j10) {
        p.j(runnable, "action");
        e().postDelayed(runnable, j10);
    }

    public final void postPublisherCallback(Runnable runnable, long j10) {
        p.j(runnable, "action");
        d().a(runnable, j10);
    }

    public final void removeAdapterBackgroundTask(Runnable runnable) {
        p.j(runnable, "action");
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            a().b(runnable);
        }
    }

    public final void removeMediationBackgroundTask(Runnable runnable) {
        p.j(runnable, "action");
        if (a(runnable)) {
            b().remove(runnable);
        } else {
            c().b(runnable);
        }
    }

    public final void removeUiThreadTask(Runnable runnable) {
        p.j(runnable, "action");
        e().removeCallbacks(runnable);
    }

    public final void setUseSharedExecutorService(boolean z10) {
        f28828a = z10;
    }

    private IronSourceThreadManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable runnable, final CountDownLatch countDownLatch) {
        p.j(runnable, "$it");
        p.j(countDownLatch, "$latch");
        runnable.run();
        new Runnable() { // from class: com.ironsource.environment.thread.a
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(countDownLatch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch countDownLatch) {
        p.j(countDownLatch, "$latch");
        countDownLatch.countDown();
    }
}
