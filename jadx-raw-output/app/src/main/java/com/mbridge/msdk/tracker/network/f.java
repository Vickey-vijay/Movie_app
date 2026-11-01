package com.mbridge.msdk.tracker.network;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: ExecutorDelivery.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f38175a;

    /* JADX INFO: compiled from: ExecutorDelivery.java */
    public class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Handler f38176a;

        public a(Handler handler) {
            this.f38176a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f38176a.post(runnable);
        }
    }

    /* JADX INFO: compiled from: ExecutorDelivery.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final t f38178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final v f38179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f38180c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f38178a.v()) {
                this.f38178a.c("canceled-at-delivery");
                return;
            }
            if (this.f38179b.a()) {
                this.f38178a.a(this.f38179b.f38296a);
            } else {
                this.f38178a.b(this.f38179b.f38298c);
            }
            if (this.f38179b.f38299d) {
                this.f38178a.a("intermediate-response");
            } else {
                this.f38178a.c("done");
            }
            Runnable runnable = this.f38180c;
            if (runnable != null) {
                runnable.run();
            }
        }

        public b(t tVar, v vVar, Runnable runnable) {
            this.f38178a = tVar;
            this.f38179b = vVar;
            this.f38180c = runnable;
        }
    }

    public f(Handler handler) {
        this.f38175a = new a(handler);
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, v<?> vVar) {
        a(tVar, vVar, null);
    }

    public void a(t<?> tVar, v<?> vVar, Runnable runnable) {
        tVar.w();
        tVar.a("post-response");
        this.f38175a.execute(new b(tVar, vVar, runnable));
    }

    public f(Executor executor) {
        this.f38175a = executor;
    }

    @Override // com.mbridge.msdk.tracker.network.w
    public void a(t<?> tVar, b0 b0Var) {
        tVar.a("post-error");
        this.f38175a.execute(new b(tVar, v.a(b0Var), null));
    }
}
