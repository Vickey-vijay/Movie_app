package sg.bigo.ads.core.b.c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.n.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Handler f71187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f71188b = Executors.newFixedThreadPool(1, new c("Callback-Worker"));

    public static class a extends AbstractRunnableC0732b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Future f71190c;

        public a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.b.c.b.AbstractRunnableC0732b
        public final void a() {
            Runnable runnable = this.f71191a;
            if (runnable != null) {
                this.f71190c = b.a(runnable);
            }
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.core.b.c.b$b, reason: collision with other inner class name */
    public static abstract class AbstractRunnableC0732b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f71191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicBoolean f71192b = new AtomicBoolean(false);

        public AbstractRunnableC0732b(Runnable runnable) {
            this.f71191a = runnable;
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f71192b.get()) {
                return;
            }
            a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f71187a = new Handler(handlerThread.getLooper());
    }

    public static Future<?> a(final Runnable runnable) {
        return f71188b.submit(new Runnable() { // from class: sg.bigo.ads.core.b.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e10) {
                    e = e10;
                    sb2 = new StringBuilder("callback thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                } catch (Throwable th2) {
                    e = th2;
                    sb2 = new StringBuilder("callback thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    sg.bigo.ads.core.b.c.a.a(sb2.toString());
                }
            }
        });
    }

    public static AbstractRunnableC0732b a(Runnable runnable, long j10) {
        a aVar = new a(runnable);
        f71187a.postDelayed(aVar, j10);
        return aVar;
    }

    public static void a(AbstractRunnableC0732b abstractRunnableC0732b) {
        if (abstractRunnableC0732b != null) {
            abstractRunnableC0732b.f71192b.set(true);
            if (abstractRunnableC0732b instanceof a) {
                a aVar = (a) abstractRunnableC0732b;
                if (aVar.f71190c != null) {
                    Future future = aVar.f71190c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f71187a.removeCallbacks(abstractRunnableC0732b);
        }
    }
}
