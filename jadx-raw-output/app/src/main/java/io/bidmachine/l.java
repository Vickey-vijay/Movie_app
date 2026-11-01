package io.bidmachine;

import androidx.annotation.VisibleForTesting;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AdRequestExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public class l extends ThreadPoolExecutor {
    private static volatile l instance;

    @VisibleForTesting
    public l(int i10) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }

    public static l get() {
        if (instance == null) {
            synchronized (l.class) {
                if (instance == null) {
                    instance = new l(Runtime.getRuntime().availableProcessors() * 2);
                }
            }
        }
        return instance;
    }
}
