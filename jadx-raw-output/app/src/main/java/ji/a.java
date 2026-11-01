package ji;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import mi.b;

/* JADX INFO: compiled from: MainThreadDisposable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements b {
    private final AtomicBoolean unsubscribed = new AtomicBoolean();

    /* JADX INFO: renamed from: ji.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MainThreadDisposable.java */
    public class RunnableC0548a implements Runnable {
        public RunnableC0548a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.onDispose();
        }
    }

    public abstract void onDispose();

    @Override // mi.b
    public final void dispose() {
        if (this.unsubscribed.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                onDispose();
            } else {
                li.a.a().c(new RunnableC0548a());
            }
        }
    }

    @Override // mi.b
    public final boolean isDisposed() {
        return this.unsubscribed.get();
    }

    public static void verifyMainThread() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("Expected to be called on the main thread but was " + Thread.currentThread().getName());
    }
}
