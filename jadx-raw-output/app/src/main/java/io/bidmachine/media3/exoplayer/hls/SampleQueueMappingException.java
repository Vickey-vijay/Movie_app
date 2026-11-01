package io.bidmachine.media3.exoplayer.hls;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super("Unable to bind a sample queue to TrackGroup with MIME type " + str + ".");
    }
}
