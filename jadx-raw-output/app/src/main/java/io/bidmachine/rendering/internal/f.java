package io.bidmachine.rendering.internal;

import android.content.Context;
import io.bidmachine.rendering.utils.DailyCleanStrategy;
import io.bidmachine.rendering.utils.FileUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f60402a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f60403b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60404c = new Object();

    private static void a(Context context) {
        new DailyCleanStrategy().clean(FileUtils.getExternalDir(context));
    }

    public static void b(Context context) {
        AtomicBoolean atomicBoolean = f60403b;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (f60404c) {
            if (f60402a.compareAndSet(false, true)) {
                a(context);
                c(context);
                atomicBoolean.set(true);
            }
        }
    }

    private static void c(Context context) {
        FileUtils.clearTempFiles(context);
    }
}
