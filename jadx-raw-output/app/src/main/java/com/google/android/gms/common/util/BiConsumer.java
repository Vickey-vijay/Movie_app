package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public interface BiConsumer<T, U> {
    @KeepForSdk
    void accept(@NonNull T t10, @NonNull U u10);
}
