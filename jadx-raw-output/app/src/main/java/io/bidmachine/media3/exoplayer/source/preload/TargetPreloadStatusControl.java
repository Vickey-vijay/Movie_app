package io.bidmachine.media3.exoplayer.source.preload;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface TargetPreloadStatusControl<T> {

    public interface PreloadStatus {
        int getStage();

        long getValue();
    }

    @Nullable
    PreloadStatus getTargetPreloadStatus(T t10);
}
