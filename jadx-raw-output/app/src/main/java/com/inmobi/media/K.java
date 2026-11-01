package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadPoolExecutor f22970a;

    static {
        String simpleName = K.class.getSimpleName();
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        AdConfig adConfig = (AdConfig) Y3.f23815a.a(AdConfig.class);
        int maxPoolSize = adConfig.getMaxPoolSize();
        int maxPoolSize2 = adConfig.getMaxPoolSize();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        String str = simpleName + "-AD";
        ck.p.j(str, "name");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(maxPoolSize, maxPoolSize2, 5L, timeUnit, linkedBlockingQueue, new B9(str, false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f22970a = threadPoolExecutor;
    }
}
