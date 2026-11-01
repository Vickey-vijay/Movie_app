package io.bidmachine.media3.exoplayer.source.chunk;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface ChunkExtractor {

    public interface Factory {
        @Nullable
        ChunkExtractor createProgressiveMediaExtractor(int i10, Format format, boolean z10, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId);

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

    public interface TrackOutputProvider {
        TrackOutput track(int i10, int i11);
    }

    @Nullable
    ChunkIndex getChunkIndex();

    @Nullable
    Format[] getSampleFormats();

    void init(@Nullable TrackOutputProvider trackOutputProvider, long j10, long j11);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void release();
}
