package io.bidmachine.media3.exoplayer.source.chunk;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.ironsource.Z7;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.exoplayer.analytics.PlayerId;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.DiscardingTrackOutput;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.jpeg.JpegExtractor;
import io.bidmachine.media3.extractor.mkv.MatroskaExtractor;
import io.bidmachine.media3.extractor.mp4.FragmentedMp4Extractor;
import io.bidmachine.media3.extractor.png.PngExtractor;
import io.bidmachine.media3.extractor.text.DefaultSubtitleParserFactory;
import io.bidmachine.media3.extractor.text.SubtitleExtractor;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import io.bidmachine.media3.extractor.text.SubtitleTranscodingExtractor;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public static final Factory FACTORY = new Factory();
    private static final PositionHolder POSITION_HOLDER = new PositionHolder();
    private final SparseArray<a> bindingTrackOutputs = new SparseArray<>();
    private long endTimeUs;
    private final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;

    @Nullable
    private ChunkExtractor.TrackOutputProvider trackOutputProvider;

    public static final class Factory implements ChunkExtractor.Factory {
        private boolean parseSubtitlesDuringExtraction;
        private SubtitleParser.Factory subtitleParserFactory = new DefaultSubtitleParserFactory();

        @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        @Nullable
        public ChunkExtractor createProgressiveMediaExtractor(int i10, Format format, boolean z10, List<Format> list, @Nullable TrackOutput trackOutput, PlayerId playerId) {
            Extractor fragmentedMp4Extractor;
            String str = format.containerMimeType;
            if (!MimeTypes.isText(str)) {
                if (MimeTypes.isMatroska(str)) {
                    fragmentedMp4Extractor = new MatroskaExtractor(this.subtitleParserFactory, this.parseSubtitlesDuringExtraction ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    fragmentedMp4Extractor = new JpegExtractor(1);
                } else if (Objects.equals(str, "image/png")) {
                    fragmentedMp4Extractor = new PngExtractor();
                } else {
                    int i11 = z10 ? 4 : 0;
                    if (!this.parseSubtitlesDuringExtraction) {
                        i11 |= 32;
                    }
                    fragmentedMp4Extractor = new FragmentedMp4Extractor(this.subtitleParserFactory, i11, null, null, list, trackOutput);
                }
            } else {
                if (!this.parseSubtitlesDuringExtraction) {
                    return null;
                }
                fragmentedMp4Extractor = new SubtitleExtractor(this.subtitleParserFactory.create(format), format);
            }
            if (this.parseSubtitlesDuringExtraction && !MimeTypes.isText(str) && !(fragmentedMp4Extractor.getUnderlyingImplementation() instanceof FragmentedMp4Extractor) && !(fragmentedMp4Extractor.getUnderlyingImplementation() instanceof MatroskaExtractor)) {
                fragmentedMp4Extractor = new SubtitleTranscodingExtractor(fragmentedMp4Extractor, this.subtitleParserFactory);
            }
            return new BundledChunkExtractor(fragmentedMp4Extractor, i10, format);
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory experimentalParseSubtitlesDuringExtraction(boolean z10) {
            this.parseSubtitlesDuringExtraction = z10;
            return this;
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Format getOutputTextFormat(Format format) {
            String str;
            if (!this.parseSubtitlesDuringExtraction || !this.subtitleParserFactory.supportsFormat(format)) {
                return format;
            }
            Format.Builder cueReplacementBehavior = format.buildUpon().setSampleMimeType("application/x-media3-cues").setCueReplacementBehavior(this.subtitleParserFactory.getCueReplacementBehavior(format));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(format.sampleMimeType);
            if (format.codecs != null) {
                str = Z7.f27998r + format.codecs;
            } else {
                str = "";
            }
            sb2.append(str);
            return cueReplacementBehavior.setCodecs(sb2.toString()).setSubsampleOffsetUs(Long.MAX_VALUE).build();
        }

        @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor.Factory
        public Factory setSubtitleParserFactory(SubtitleParser.Factory factory) {
            this.subtitleParserFactory = (SubtitleParser.Factory) Assertions.checkNotNull(factory);
            return this;
        }
    }

    public static final class a implements TrackOutput {
        private long endTimeUs;
        private final DiscardingTrackOutput fakeTrackOutput = new DiscardingTrackOutput();

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f59895id;

        @Nullable
        private final Format manifestFormat;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
            return super.sampleData(dataReader, i10, z10);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
            return ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(dataReader, i10, z10);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public /* bridge */ /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
            super.sampleData(parsableByteArray, i10);
        }

        public void bind(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j10) {
            if (trackOutputProvider == null) {
                this.trackOutput = this.fakeTrackOutput;
                return;
            }
            this.endTimeUs = j10;
            TrackOutput trackOutputTrack = trackOutputProvider.track(this.f59895id, this.type);
            this.trackOutput = trackOutputTrack;
            Format format = this.sampleFormat;
            if (format != null) {
                trackOutputTrack.format(format);
            }
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void format(Format format) {
            Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.withManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            ((TrackOutput) Util.castNonNull(this.trackOutput)).format(this.sampleFormat);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleData(parsableByteArray, i10);
        }

        @Override // io.bidmachine.media3.extractor.TrackOutput
        public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
            long j11 = this.endTimeUs;
            if (j11 != -9223372036854775807L && j10 >= j11) {
                this.trackOutput = this.fakeTrackOutput;
            }
            ((TrackOutput) Util.castNonNull(this.trackOutput)).sampleMetadata(j10, i10, i11, i12, cryptoData);
        }

        public a(int i10, int i11, @Nullable Format format) {
            this.f59895id = i10;
            this.type = i11;
            this.manifestFormat = format;
        }
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i10 = 0; i10 < this.bindingTrackOutputs.size(); i10++) {
            formatArr[i10] = (Format) Assertions.checkStateNotNull(this.bindingTrackOutputs.valueAt(i10).sampleFormat);
        }
        this.sampleFormats = formatArr;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public ChunkIndex getChunkIndex() {
        SeekMap seekMap = this.seekMap;
        if (seekMap instanceof ChunkIndex) {
            return (ChunkIndex) seekMap;
        }
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    @Nullable
    public Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public void init(@Nullable ChunkExtractor.TrackOutputProvider trackOutputProvider, long j10, long j11) {
        this.trackOutputProvider = trackOutputProvider;
        this.endTimeUs = j11;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j10 != -9223372036854775807L) {
                this.extractor.seek(0L, j10);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        extractor.seek(0L, j10);
        for (int i10 = 0; i10 < this.bindingTrackOutputs.size(); i10++) {
            this.bindingTrackOutputs.valueAt(i10).bind(trackOutputProvider, j11);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public boolean read(ExtractorInput extractorInput) throws IOException {
        int i10 = this.extractor.read(extractorInput, POSITION_HOLDER);
        Assertions.checkState(i10 != 1);
        return i10 == 0;
    }

    @Override // io.bidmachine.media3.exoplayer.source.chunk.ChunkExtractor
    public void release() {
        this.extractor.release();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        a aVar = this.bindingTrackOutputs.get(i10);
        if (aVar == null) {
            Assertions.checkState(this.sampleFormats == null);
            aVar = new a(i10, i11, i11 == this.primaryTrackType ? this.primaryTrackManifestFormat : null);
            aVar.bind(this.trackOutputProvider, this.endTimeUs);
            this.bindingTrackOutputs.put(i10, aVar);
        }
        return aVar;
    }

    public BundledChunkExtractor(Extractor extractor, int i10, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i10;
        this.primaryTrackManifestFormat = format;
    }
}
