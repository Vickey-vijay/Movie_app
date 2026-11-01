package sg.bigo.ads.common.n;

import androidx.annotation.NonNull;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f69759e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f69761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f69762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f69763d;

    public c(String str) {
        this(str, false);
    }

    public c(String str, boolean z10) {
        this.f69760a = "BGAd-".concat(String.valueOf(str));
        this.f69761b = new AtomicInteger(1);
        this.f69762c = Executors.defaultThreadFactory();
        this.f69763d = z10;
    }

    public static void a(a aVar) {
        f69759e = aVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f69762c.newThread(runnable);
        threadNewThread.setName(this.f69760a + "-" + this.f69761b.getAndIncrement());
        if (this.f69763d) {
            threadNewThread.setPriority(10);
        }
        threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th2) {
                if (c.f69759e != null) {
                    c.f69759e.a(th2);
                }
            }
        });
        return threadNewThread;
    }
}
