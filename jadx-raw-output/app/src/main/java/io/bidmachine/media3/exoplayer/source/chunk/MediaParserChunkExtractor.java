package io.bidmachine.media3.exoplayer.source.chunk;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor;
import io.bidmachine.media3.exoplayer.source.chunk.MediaParserChunkExtractor;
import io.bidmachine.media3.exoplayer.source.mediaparser.InputReaderAdapterV30;
import io.bidmachine.media3.exoplayer.source.mediaparser.MediaParserUtil;
import io.bidmachine.media3.exoplayer.source.mediaparser.OutputConsumerAdapterV30;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.DiscardingTrackOutput;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(30)
@UnstableApi
public final class MediaParserChunkExtractor implements ChunkExtractor {
    public static final ChunkExtractor.Factory FACTORY = new ChunkExtractor.Factory() { // from class: qg.a
        @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public final ChunkExtractor createProgressiveMediaExtractor(int i10, Format format, boolean z10, List list, TrackOutput trackOutput, PlayerId playerId) {
            return MediaParserChunkExtractor.lambda$static$0(i10, format, z10, list, trackOutput, playerId);
        }
    };
    private static final String TAG = "MediaPrsrChunkExtractor";
    private final DiscardingTrackOutput discardingTrackOutput;
    private final InputReaderAdapterV30 inputReaderAdapter;
    private final MediaParser mediaParser;
    private final OutputConsumerAdapterV30 outputConsumerAdapter;
    private long pendingSeekUs;

    @Nullable
    private Format[] sampleFormats;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;
    private final b trackOutputProviderAdapter;

    public class b implements ExtractorOutput {
        private b() {
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void endTracks() {
            MediaParserChunkExtractor mediaParserChunkExtractor = MediaParserChunkExtractor.this;
            mediaParserChunkExtractor.sampleFormats = mediaParserChunkExtractor.outputConsumerAdapter.getSampleFormats();
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public TrackOutput track(int i10, int i11) {
            return MediaParserChunkExtractor.this.trackOutputProvider != null ? MediaParserChunkExtractor.this.trackOutputProvider.track(i10, i11) : MediaParserChunkExtractor.this.discardingTrackOutput;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ ChunkExtractor lambda$static$0(int i10, Format format, boolean z10, List list, TrackOutput trackOutput, PlayerId playerId) {
        if (MimeTypes.isText(format.containerMimeType)) {
            return null;
        }
        return new MediaParserChunkExtractor(i10, format, list, playerId);
    }

    private void maybeExecutePendingSeek() {
        MediaParser.SeekMap dummySeekMap = this.outputConsumerAdapter.getDummySeekMap();
        long j10 = this.pendingSeekUs;
        if (j10 == -9223372036854775807L || dummySeekMap == null) {
            return;
        }
        this.mediaParser.seek((MediaParser.SeekPoint) dummySeekMap.getSeekPoints(j10).first);
        this.pendingSeekUs = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        return this.outputConsumerAdapter.getChunkIndex();
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j10, long j11) {
        this.trackOutputProvider = trackOutputProvider;
        this.outputConsumerAdapter.setSampleTimestampUpperLimitFilterUs(j11);
        this.outputConsumerAdapter.setExtractorOutput(this.trackOutputProviderAdapter);
        this.pendingSeekUs = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.mediaParser.release();
    }

    @SuppressLint({"WrongConstant"})
    public MediaParserChunkExtractor(int i10, Format format, List<Format> list, PlayerId playerId) {
        String str;
        OutputConsumerAdapterV30 outputConsumerAdapterV30 = new OutputConsumerAdapterV30(format, i10, true);
        this.outputConsumerAdapter = outputConsumerAdapterV30;
        this.inputReaderAdapter = new InputReaderAdapterV30();
        if (MimeTypes.isMatroska((String) Assertions.checkNotNull(format.containerMimeType))) {
            str = "android.media.mediaparser.MatroskaParser";
        } else {
            str = "android.media.mediaparser.FragmentedMp4Parser";
        }
        outputConsumerAdapterV30.setSelectedParserName(str);
        MediaParser mediaParserCreateByName = MediaParser.createByName(str, outputConsumerAdapterV30);
        this.mediaParser = mediaParserCreateByName;
        Boolean bool = Boolean.TRUE;
        mediaParserCreateByName.setParameter("android.media.mediaparser.matroska.disableCuesSeeking", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.inBandCryptoInfo", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.includeSupplementalData", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.eagerlyExposeTrackType", bool);
        mediaParserCreateByName.setParameter("android.media.mediaparser.exposeDummySeekMap", bool);
        mediaParserCreateByName.setParameter("android.media.mediaParser.exposeChunkIndexAsMediaFormat", bool);
        mediaParserCreateByName.setParameter("android.media.mediaParser.overrideInBandCaptionDeclarations", bool);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(MediaParserUtil.toCaptionsMediaFormat(list.get(i11)));
        }
        this.mediaParser.setParameter("android.media.mediaParser.exposeCaptionFormats", arrayList);
        if (Util.SDK_INT >= 31) {
            MediaParserUtil.setLogSessionIdOnMediaParser(this.mediaParser, playerId);
        }
        this.outputConsumerAdapter.setMuxedCaptionFormats(list);
        this.trackOutputProviderAdapter = new b();
        this.discardingTrackOutput = new DiscardingTrackOutput();
        this.pendingSeekUs = -9223372036854775807L;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        maybeExecutePendingSeek();
        this.inputReaderAdapter.setDataReader(extractorInput, extractorInput.getLength());
        return this.mediaParser.advance(this.inputReaderAdapter);
    }
}
