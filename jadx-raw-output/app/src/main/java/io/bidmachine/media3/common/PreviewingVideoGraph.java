package io.bidmachine.media3.common;

import android.content.Context;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public interface PreviewingVideoGraph extends VideoGraph {

    public interface Factory {
        PreviewingVideoGraph create(Context context, ColorInfo colorInfo, DebugViewProvider debugViewProvider, VideoGraph.Listener listener, Executor executor, List<Effect> list, long j10) throws VideoFrameProcessingException;
    }

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ VideoFrameProcessor getProcessor(int i10);

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ boolean hasProducedFrameWithTimestampZero();

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ void initialize() throws VideoFrameProcessingException;

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ void registerInput(@IntRange(from = 0) int i10) throws VideoFrameProcessingException;

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ void release();

    void renderOutputFrame(long j10);

    @Override // io.bidmachine.media3.common.VideoGraph
    /* synthetic */ void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);
}
