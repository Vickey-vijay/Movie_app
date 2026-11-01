package com.ironsource;

import android.os.Handler;
import com.ironsource.environment.thread.IronSourceThreadManager;

/* JADX INFO: renamed from: com.ironsource.s9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C3698s9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f30724a;

    /* JADX INFO: renamed from: com.ironsource.s9$a */
    public static final class a extends AbstractRunnableC3526ie {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f30725b;

        public a(Runnable runnable) {
            this.f30725b = runnable;
        }

        @Override // com.ironsource.AbstractRunnableC3526ie
        public void a() {
            this.f30725b.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3698s9() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final Handler a() {
        return this.f30724a;
    }

    public C3698s9(Handler handler) {
        ck.p.j(handler, "handler");
        this.f30724a = handler;
    }

    public static /* synthetic */ void a(C3698s9 c3698s9, AbstractRunnableC3526ie abstractRunnableC3526ie, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        c3698s9.a(abstractRunnableC3526ie, j10);
    }

    private final void c(Runnable runnable) {
        AbstractRunnableC3526ie aVar = runnable instanceof AbstractRunnableC3526ie ? (AbstractRunnableC3526ie) runnable : new a(runnable);
        if (Thread.currentThread().getId() == this.f30724a.getLooper().getThread().getId()) {
            aVar.run();
        } else {
            a(this, aVar, 0L, 2, null);
        }
    }

    public final void b(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        c(runnable);
    }

    public /* synthetic */ C3698s9(Handler handler, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new Handler(IronSourceThreadManager.INSTANCE.getSharedManagersThread().getLooper()) : handler);
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie, long j10) {
        ck.p.j(abstractRunnableC3526ie, "task");
        this.f30724a.postDelayed(abstractRunnableC3526ie, j10);
    }

    public final void a(AbstractRunnableC3526ie abstractRunnableC3526ie) {
        ck.p.j(abstractRunnableC3526ie, "task");
        this.f30724a.removeCallbacks(abstractRunnableC3526ie);
    }

    public final void a(Runnable runnable) {
        ck.p.j(runnable, "callback");
        c(runnable);
    }
}
