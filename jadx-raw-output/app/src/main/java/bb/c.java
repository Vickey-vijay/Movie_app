package bb;

import android.os.Handler;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import ck.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: WeakHandler.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler.Callback f5312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f5313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f5314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f5315d;

    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Lock f5316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Runnable f5317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f5318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f5319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final RunnableC0017c f5320e;

        public a(Lock lock, Runnable runnable) {
            p.j(lock, "lock");
            this.f5316a = lock;
            this.f5317b = runnable;
            this.f5320e = new RunnableC0017c(new WeakReference(runnable), new WeakReference(this));
        }

        public final RunnableC0017c a() {
            return this.f5320e;
        }

        public final void b(a aVar) {
            p.j(aVar, "candidate");
            this.f5316a.lock();
            try {
                a aVar2 = this.f5318c;
                if (aVar2 != null) {
                    p.g(aVar2);
                    aVar2.f5319d = aVar;
                }
                aVar.f5318c = this.f5318c;
                this.f5318c = aVar;
                aVar.f5319d = this;
            } finally {
                this.f5316a.unlock();
            }
        }

        public final RunnableC0017c c() {
            this.f5316a.lock();
            try {
                a aVar = this.f5319d;
                if (aVar != null) {
                    p.g(aVar);
                    aVar.f5318c = this.f5318c;
                }
                a aVar2 = this.f5318c;
                if (aVar2 != null) {
                    p.g(aVar2);
                    aVar2.f5319d = this.f5319d;
                }
                this.f5319d = null;
                this.f5318c = null;
                return this.f5320e;
            } finally {
                this.f5316a.unlock();
            }
        }

        public final RunnableC0017c d(Runnable runnable) {
            p.j(runnable, IconCompat.EXTRA_OBJ);
            this.f5316a.lock();
            try {
                for (a aVar = this.f5318c; aVar != null; aVar = aVar.f5318c) {
                    if (aVar.f5317b == runnable) {
                        return aVar.c();
                    }
                }
                return null;
            } finally {
                this.f5316a.unlock();
            }
        }
    }

    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference<Handler.Callback> f5321a = null;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Handler.Callback callback;
            p.j(message, NotificationCompat.CATEGORY_MESSAGE);
            WeakReference<Handler.Callback> weakReference = this.f5321a;
            if (weakReference == null || (callback = weakReference.get()) == null) {
                return;
            }
            callback.handleMessage(message);
        }
    }

    /* JADX INFO: renamed from: bb.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WeakHandler.kt */
    public static final class RunnableC0017c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Runnable> f5322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WeakReference<a> f5323c;

        public RunnableC0017c(WeakReference<Runnable> weakReference, WeakReference<a> weakReference2) {
            p.j(weakReference, "mDelegate");
            p.j(weakReference2, "mReference");
            this.f5322b = weakReference;
            this.f5323c = weakReference2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = this.f5322b.get();
            a aVar = this.f5323c.get();
            if (aVar != null) {
                aVar.c();
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean a(Runnable runnable, long j10) {
        return this.f5313b.postDelayed(c(runnable), j10);
    }

    public final void b(Runnable runnable) {
        p.j(runnable, "r");
        RunnableC0017c runnableC0017cD = this.f5315d.d(runnable);
        if (runnableC0017cD != null) {
            this.f5313b.removeCallbacks(runnableC0017cD);
        }
    }

    public final RunnableC0017c c(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("Runnable can't be null");
        }
        a aVar = new a(this.f5314c, runnable);
        this.f5315d.b(aVar);
        return aVar.a();
    }

    public c() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f5314c = reentrantLock;
        this.f5315d = new a(reentrantLock, null);
        this.f5312a = null;
        this.f5313b = new b();
    }
}
