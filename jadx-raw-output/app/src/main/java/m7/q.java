package m7;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
/* JADX INFO: loaded from: classes8.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f64240a = new b();

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f64241a = new q();

        static {
            s7.c.a().c(new b0());
        }
    }

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ThreadPoolExecutor f64242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LinkedBlockingQueue<Runnable> f64243b;

        public void a(y.b bVar) {
            this.f64242a.execute(new c(bVar));
        }

        public final void b() {
            LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
            this.f64243b = linkedBlockingQueue;
            this.f64242a = w7.b.b(3, linkedBlockingQueue, "LauncherTask");
        }

        public b() {
            b();
        }
    }

    /* JADX INFO: compiled from: FileDownloadTaskLauncher.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final y.b f64244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f64245c = false;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f64245c) {
                return;
            }
            this.f64244b.start();
        }

        public c(y.b bVar) {
            this.f64244b = bVar;
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj) && obj != this.f64244b) {
                return false;
            }
            return true;
        }
    }

    public synchronized void b(y.b bVar) {
        this.f64240a.a(bVar);
    }

    public static q a() {
        return a.f64241a;
    }
}
