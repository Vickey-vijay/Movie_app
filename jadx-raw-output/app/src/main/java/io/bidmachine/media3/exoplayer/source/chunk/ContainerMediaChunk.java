package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.DataSourceUtil;
import io.bidmachine.media3.datasource.DataSpec;
import io.bidmachine.media3.datasource.StatsDataSource;
import io.bidmachine.media3.extractor.DefaultExtractorInput;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public class ContainerMediaChunk extends BaseMediaChunk {
    private final int chunkCount;
    private final ChunkExtractor chunkExtractor;
    private volatile boolean loadCanceled;
    private boolean loadCompleted;
    private long nextLoadPosition;
    private final long sampleOffsetUs;

    public ContainerMediaChunk(DataSource dataSource, DataSpec dataSpec, Format format, int i10, @Nullable Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, ChunkExtractor chunkExtractor) {
        super(dataSource, dataSpec, format, i10, obj, j10, j11, j12, j13, j14);
        this.chunkCount = i11;
        this.sampleOffsetUs = j15;
        this.chunkExtractor = chunkExtractor;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunk, io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public final void cancelLoad() {
        this.loadCanceled = true;
    }

    public ChunkExtractor.TrackOutputProvider getTrackOutputProvider(BaseMediaChunkOutput baseMediaChunkOutput) {
        return baseMediaChunkOutput;
    }

    private void maybeWriteEmptySamples(BaseMediaChunkOutput baseMediaChunkOutput) {
        if (MimeTypes.isImage(this.trackFormat.containerMimeType)) {
            Format format = this.trackFormat;
            int i10 = format.tileCountHorizontal;
            if ((i10 <= 1 && format.tileCountVertical <= 1) || i10 == -1 || format.tileCountVertical == -1) {
                return;
            }
            TrackOutput trackOutputTrack = baseMediaChunkOutput.track(0, 4);
            Format format2 = this.trackFormat;
            int i11 = format2.tileCountVertical * format2.tileCountHorizontal;
            long j10 = (this.endTimeUs - this.startTimeUs) / ((long) i11);
            for (int i12 = 1; i12 < i11; i12++) {
                trackOutputTrack.sampleData(new ParsableByteArray(), 0);
                trackOutputTrack.sampleMetadata(((long) i12) * j10, 0, 0, 0, null);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk
    public long getNextChunkIndex() {
        return this.chunkIndex + ((long) this.chunkCount);
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.MediaChunk
    public boolean isLoadCompleted() {
        return this.loadCompleted;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.BaseMediaChunk, io.bidmachine.media3.exoplayer.source.chunk.MediaChunk, io.bidmachine.media3.exoplayer.source.chunk.Chunk, io.bidmachine.media3.exoplayer.upstream.Loader.Loadable
    public final void load() throws IOException {
        long j10;
        long j11;
        BaseMediaChunkOutput output = getOutput();
        if (this.nextLoadPosition == 0) {
            output.setSampleOffsetUs(this.sampleOffsetUs);
            ChunkExtractor chunkExtractor = this.chunkExtractor;
            ChunkExtractor.TrackOutputProvider trackOutputProvider = getTrackOutputProvider(output);
            long j12 = this.clippedStartTimeUs;
            if (j12 == -9223372036854775807L) {
                j10 = -9223372036854775807L;
            } else {
                j10 = j12 - this.sampleOffsetUs;
            }
            long j13 = this.clippedEndTimeUs;
            if (j13 == -9223372036854775807L) {
                j11 = -9223372036854775807L;
            } else {
                j11 = j13 - this.sampleOffsetUs;
            }
            chunkExtractor.init(trackOutputProvider, j10, j11);
        }
        try {
            DataSpec dataSpecSubrange = this.dataSpec.subrange(this.nextLoadPosition);
            StatsDataSource statsDataSource = this.dataSource;
            DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(statsDataSource, dataSpecSubrange.position, statsDataSource.open(dataSpecSubrange));
            do {
                try {
                    if (this.loadCanceled) {
                        break;
                    }
                } catch (Throwable th2) {
                    this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
                    throw th2;
                }
            } while (this.chunkExtractor.read(defaultExtractorInput));
            maybeWriteEmptySamples(output);
            this.nextLoadPosition = defaultExtractorInput.getPosition() - this.dataSpec.position;
            DataSourceUtil.closeQuietly(this.dataSource);
            this.loadCompleted = !this.loadCanceled;
        } catch (Throwable th3) {
            DataSourceUtil.closeQuietly(this.dataSource);
            throw th3;
        }
    }
}
