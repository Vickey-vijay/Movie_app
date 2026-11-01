package io.bidmachine.ads.networks.gam_dynamic;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public interface TaskExecutor {
    boolean execute(@NonNull Runnable runnable);

    boolean execute(@NonNull Runnable runnable, long j10);
}
