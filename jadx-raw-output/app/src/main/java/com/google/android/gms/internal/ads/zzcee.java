package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzcee extends ScheduledThreadPoolExecutor {
    public zzcee(int i10, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
