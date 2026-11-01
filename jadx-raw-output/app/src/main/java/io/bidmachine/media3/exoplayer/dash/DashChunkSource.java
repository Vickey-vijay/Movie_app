package io.bidmachine.media3.exoplayer.dash;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.TransferListener;
import io.bidmachine.media3.exoplayer.LoadingInfo;
import io.bidmachine.media3.exoplayer.SeekParameters;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.dash.manifest.DashManifest;
import io.bidmachine.media3.exoplayer.source.chunk.Chunk;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkHolder;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkSource;
import io.bidmachine.media3.exoplayer.source.chunk.MediaChunk;
import io.bidmachine.media3.exoplayer.trackselection.ExoTrackSelection;
import io.bidmachine.media3.exoplayer.upstream.CmcdConfiguration;
import io.bidmachine.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import io.bidmachine.media3.exoplayer.upstream.LoaderErrorThrower;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface DashChunkSource extends ChunkSource {

    public interface Factory {
        DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i10, int[] iArr, ExoTrackSelection exoTrackSelection, int i11, long j10, boolean z10, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener, PlayerId playerId, @Nullable CmcdConfiguration cmcdConfiguration);

        default Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            return this;
        }

        default Format getOutputTextFormat(Format format) {
            return format;
        }

        default Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            return this;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ long getAdjustedSeekPositionUs(long j10, SeekParameters seekParameters);

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ void getNextChunk(LoadingInfo loadingInfo, long j10, List<? extends MediaChunk> list, ChunkHolder chunkHolder);

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ int getPreferredQueueSize(long j10, List<? extends MediaChunk> list);

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ void maybeThrowError() throws IOException;

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ void onChunkLoadCompleted(Chunk chunk);

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ boolean onChunkLoadError(Chunk chunk, boolean z10, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy);

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ void release();

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkSource
    /* synthetic */ boolean shouldCancelLoad(long j10, Chunk chunk, List<? extends MediaChunk> list);

    void updateManifest(DashManifest dashManifest, int i10);

    void updateTrackSelection(ExoTrackSelection exoTrackSelection);
}
