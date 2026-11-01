package x;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Handler f74240a = new Handler(Looper.getMainLooper());

    public static final void a(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        if (ck.p.e(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            runnable.run();
        } else {
            f74240a.post(runnable);
        }
    }
}
