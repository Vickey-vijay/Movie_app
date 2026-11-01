package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSpec;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public abstract class BaseMediaChunk extends MediaChunk {
    public final long clippedEndTimeUs;
    public final long clippedStartTimeUs;
    private int[] firstSampleIndices;
    private BaseMediaChunkOutput output;

    public BaseMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j14);
        this.clippedStartTimeUs = j12;
        this.clippedEndTimeUs = j13;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void cancelLoad();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public abstract /* synthetic */ void load() throws IOException;

    public final int getFirstSampleIndex(int i10) {
        return ((int[]) Assertions.checkStateNotNull(this.firstSampleIndices))[i10];
    }

    public final BaseMediaChunkOutput getOutput() {
        return (BaseMediaChunkOutput) Assertions.checkStateNotNull(this.output);
    }

    public void init(BaseMediaChunkOutput baseMediaChunkOutput) {
        this.output = baseMediaChunkOutput;
        this.firstSampleIndices = baseMediaChunkOutput.getWriteIndices();
    }
}
