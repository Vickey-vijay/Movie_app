package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: LimitExecutor.java */
/* JADX INFO: loaded from: classes10.dex */
public class e0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Runnable f35287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f35288b;

    /* JADX INFO: compiled from: LimitExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f35289a;

        public a(Runnable runnable) {
            this.f35289a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f35289a.run();
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("LimitExecutor", e10.getMessage());
                }
            } finally {
                e0.this.a();
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        if (this.f35287a == null) {
            this.f35287a = a(runnable);
            c0.a().execute(this.f35287a);
        } else if (this.f35288b == null) {
            this.f35288b = a(runnable);
        }
    }

    private Runnable a(Runnable runnable) {
        return new a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        Runnable runnable = this.f35288b;
        this.f35287a = runnable;
        this.f35288b = null;
        if (runnable != null) {
            c0.a().execute(this.f35287a);
        }
    }
}
