package com.yandex.div.core.images;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public interface DivImageLoader {
    @NonNull
    @MainThread
    LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    @NonNull
    @MainThread
    LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback);

    default Boolean hasSvgSupport() {
        return Boolean.FALSE;
    }

    @NonNull
    @MainThread
    default LoadReference loadImage(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return loadImage(str, divImageDownloadCallback);
    }

    @NonNull
    @MainThread
    default LoadReference loadImageBytes(@NonNull String str, @NonNull DivImageDownloadCallback divImageDownloadCallback, int i10) {
        return loadImageBytes(str, divImageDownloadCallback);
    }
}
