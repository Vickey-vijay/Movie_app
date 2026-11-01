package com.bumptech.glide.manager;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public interface Lifecycle {
    void addListener(@NonNull LifecycleListener lifecycleListener);

    void removeListener(@NonNull LifecycleListener lifecycleListener);
}
