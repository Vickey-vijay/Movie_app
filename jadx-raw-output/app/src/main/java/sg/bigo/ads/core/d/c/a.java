package sg.bigo.ads.core.d.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f71259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ExecutorService f71260b = Executors.newFixedThreadPool(1, new c("Stat-Worker"));

    /* JADX INFO: renamed from: sg.bigo.ads.core.d.c.a$a, reason: collision with other inner class name */
    public static class C0735a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f71262c;

        public C0735a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.d.c.a.b
        public final void a() {
            Runnable runnable = this.f71263a;
            if (runnable != null) {
                this.f71262c = a.a(runnable);
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f71263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f71264b = new AtomicBoolean(false);

        public b(Runnable runnable) {
            this.f71263a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f71264b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f71259a = new Handler(handlerThread.getLooper());
    }

    public static Future a(final Runnable runnable) {
        return f71260b.submit(new Runnable() { // from class: sg.bigo.ads.core.d.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("stat thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("stat thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.common.t.a.a(0, "Stats", sb2.toString());
                }
            }
        });
    }

    public static b a(Runnable runnable, long j10) {
        C0735a c0735a = new C0735a(runnable);
        f71259a.postDelayed(c0735a, j10);
        return c0735a;
    }

    public static void a(b bVar) {
        if (bVar != null) {
            bVar.f71264b.set(true);
            if (bVar instanceof C0735a) {
                C0735a c0735a = (C0735a) bVar;
                if (c0735a.f71262c != null) {
                    Future future = c0735a.f71262c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f71259a.removeCallbacks(bVar);
        }
    }
}
