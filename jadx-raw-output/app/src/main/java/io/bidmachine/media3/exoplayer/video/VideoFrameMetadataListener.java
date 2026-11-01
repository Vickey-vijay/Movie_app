package io.bidmachine.media3.exoplayer.video;

import android.media.MediaFormat;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes3.dex */
@UnstableApi
public interface VideoFrameMetadataListener {
    void onVideoFrameAboutToBeRendered(long j10, long j11, Format format, @Nullable MediaFormat mediaFormat);
}
