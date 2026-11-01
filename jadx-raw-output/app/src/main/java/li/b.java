package li;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Message;
import ii.s;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: HandlerScheduler.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f63574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63575c;

    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class a extends s.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f63576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f63577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f63578d;

        @Override // mi.b
        public void dispose() {
            this.f63578d = true;
            this.f63576b.removeCallbacksAndMessages(this);
        }

        @Override // ii.s.c
        @SuppressLint({"NewApi"})
        public mi.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            }
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.f63578d) {
                return io.reactivex.disposables.a.a();
            }
            RunnableC0576b runnableC0576b = new RunnableC0576b(this.f63576b, ej.a.u(runnable));
            Message messageObtain = Message.obtain(this.f63576b, runnableC0576b);
            messageObtain.obj = this;
            if (this.f63577c) {
                messageObtain.setAsynchronous(true);
            }
            this.f63576b.sendMessageDelayed(messageObtain, timeUnit.toMillis(j10));
            if (!this.f63578d) {
                return runnableC0576b;
            }
            this.f63576b.removeCallbacks(runnableC0576b);
            return io.reactivex.disposables.a.a();
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f63578d;
        }

        public a(Handler handler, boolean z10) {
            this.f63576b = handler;
            this.f63577c = z10;
        }
    }

    /* JADX INFO: renamed from: li.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HandlerScheduler.java */
    public static final class RunnableC0576b implements Runnable, mi.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f63579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Runnable f63580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public volatile boolean f63581d;

        @Override // mi.b
        public void dispose() {
            this.f63579b.removeCallbacks(this);
            this.f63581d = true;
        }

        @Override // mi.b
        public boolean isDisposed() {
            return this.f63581d;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f63580c.run();
            } catch (Throwable th2) {
                ej.a.s(th2);
            }
        }

        public RunnableC0576b(Handler handler, Runnable runnable) {
            this.f63579b = handler;
            this.f63580c = runnable;
        }
    }

    @Override // ii.s
    public s.c a() {
        return new a(this.f63574b, this.f63575c);
    }

    @Override // ii.s
    public mi.b d(Runnable runnable, long j10, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        RunnableC0576b runnableC0576b = new RunnableC0576b(this.f63574b, ej.a.u(runnable));
        this.f63574b.postDelayed(runnableC0576b, timeUnit.toMillis(j10));
        return runnableC0576b;
    }

    public b(Handler handler, boolean z10) {
        this.f63574b = handler;
        this.f63575c = z10;
    }
}
