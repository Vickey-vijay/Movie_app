package sg.bigo.ads.common.g.a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.n.e;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList<Runnable> f69627a = new LinkedList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f69628b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f69629c;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f69633a = new CountDownLatch(1);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Runnable f69634b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    a.this.f69633a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f69635c;

        public a(Runnable runnable) {
            this.f69635c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f69635c.run();
            this.f69633a.countDown();
        }
    }

    public c() {
        e eVar = new e("Waitable", 1, 1);
        this.f69629c = eVar;
        eVar.allowCoreThreadTimeOut(true);
    }
}
