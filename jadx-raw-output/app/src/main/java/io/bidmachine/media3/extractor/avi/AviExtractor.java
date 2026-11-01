package io.bidmachine.media3.extractor.avi;

import ah.d;
import ah.e;
import ah.f;
import ah.g;
import androidx.annotation.Nullable;
import com.google.common.collect.r2;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.NoOpExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import io.bidmachine.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class AviExtractor implements Extractor {
    private static final int AVIIF_KEYFRAME = 16;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 1;
    public static final int FOURCC_AVI_ = 541677121;
    public static final int FOURCC_JUNK = 1263424842;
    public static final int FOURCC_LIST = 1414744396;
    public static final int FOURCC_RIFF = 1179011410;
    public static final int FOURCC_auds = 1935963489;
    public static final int FOURCC_avih = 1751742049;
    public static final int FOURCC_hdrl = 1819436136;
    public static final int FOURCC_idx1 = 829973609;
    public static final int FOURCC_movi = 1769369453;
    public static final int FOURCC_strf = 1718776947;
    public static final int FOURCC_strh = 1752331379;
    public static final int FOURCC_strl = 1819440243;
    public static final int FOURCC_strn = 1852994675;
    public static final int FOURCC_txts = 1937012852;
    public static final int FOURCC_vids = 1935960438;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_FINDING_IDX1_HEADER = 4;
    private static final int STATE_FINDING_MOVI_HEADER = 3;
    private static final int STATE_READING_HDRL_BODY = 2;
    private static final int STATE_READING_HDRL_HEADER = 1;
    private static final int STATE_READING_IDX1_BODY = 5;
    private static final int STATE_READING_SAMPLES = 6;
    private static final int STATE_SKIPPING_TO_HDRL = 0;
    private static final String TAG = "AviExtractor";
    private ah.b aviHeader;
    private final c chunkHeaderHolder;
    private d[] chunkReaders;

    @Nullable
    private d currentChunkReader;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int hdrlSize;
    private int idx1BodySize;
    private long moviEnd;
    private long moviStart;
    private final boolean parseSubtitlesDuringExtraction;
    private long pendingReposition;
    private final ParsableByteArray scratch;
    private boolean seekMapHasBeenOutput;
    private int state;
    private final SubtitleParser.Factory subtitleParserFactory;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public class b implements SeekMap {
        private final long durationUs;

        @Override // io.bidmachine.media3.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public b(long j10) {
            this.durationUs = j10;
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public long getDurationUs() {
            return this.durationUs;
        }

        @Override // io.bidmachine.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            SeekMap.SeekPoints seekPoints = AviExtractor.this.chunkReaders[0].getSeekPoints(j10);
            for (int i10 = 1; i10 < AviExtractor.this.chunkReaders.length; i10++) {
                SeekMap.SeekPoints seekPoints2 = AviExtractor.this.chunkReaders[i10].getSeekPoints(j10);
                if (seekPoints2.first.position < seekPoints.first.position) {
                    seekPoints = seekPoints2;
                }
            }
            return seekPoints;
        }
    }

    @Deprecated
    public AviExtractor() {
        this(1, SubtitleParser.Factory.UNSUPPORTED);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.state = 0;
        if (this.parseSubtitlesDuringExtraction) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
        this.pendingReposition = -1L;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
    }

    public static class c {
        public int chunkType;
        public int listType;
        public int size;

        private c() {
        }

        public void populateFrom(ParsableByteArray parsableByteArray) {
            this.chunkType = parsableByteArray.readLittleEndianInt();
            this.size = parsableByteArray.readLittleEndianInt();
            this.listType = 0;
        }

        public void populateWithListHeaderFrom(ParsableByteArray parsableByteArray) throws ParserException {
            populateFrom(parsableByteArray);
            if (this.chunkType == 1414744396) {
                this.listType = parsableByteArray.readLittleEndianInt();
                return;
            }
            throw ParserException.createForMalformedContainer("LIST expected, found: " + this.chunkType, null);
        }
    }

    public AviExtractor(int i10, SubtitleParser.Factory factory) {
        this.subtitleParserFactory = factory;
        this.parseSubtitlesDuringExtraction = (i10 & 1) == 0;
        this.scratch = new ParsableByteArray(12);
        this.chunkHeaderHolder = new c();
        this.extractorOutput = new NoOpExtractorOutput();
        this.chunkReaders = new d[0];
        this.moviStart = -1L;
        this.moviEnd = -1L;
        this.hdrlSize = -1;
        this.durationUs = -9223372036854775807L;
    }

    @Nullable
    private d getChunkReader(int i10) {
        for (d dVar : this.chunkReaders) {
            if (dVar.handlesChunkId(i10)) {
                return dVar;
            }
        }
        return null;
    }

    @Nullable
    private d processStreamList(e eVar, int i10) {
        ah.c cVar = (ah.c) eVar.getChild(ah.c.class);
        f fVar = (f) eVar.getChild(f.class);
        if (cVar == null) {
            Log.w(TAG, "Missing Stream Header");
            return null;
        }
        if (fVar == null) {
            Log.w(TAG, "Missing Stream Format");
            return null;
        }
        long durationUs = cVar.getDurationUs();
        Format format = fVar.format;
        Format.Builder builderBuildUpon = format.buildUpon();
        builderBuildUpon.setId(i10);
        int i11 = cVar.suggestedBufferSize;
        if (i11 != 0) {
            builderBuildUpon.setMaxInputSize(i11);
        }
        g gVar = (g) eVar.getChild(g.class);
        if (gVar != null) {
            builderBuildUpon.setLabel(gVar.name);
        }
        int trackType = MimeTypes.getTrackType(format.sampleMimeType);
        if (trackType != 1 && trackType != 2) {
            return null;
        }
        TrackOutput trackOutputTrack = this.extractorOutput.track(i10, trackType);
        trackOutputTrack.format(builderBuildUpon.build());
        d dVar = new d(i10, trackType, durationUs, cVar.length, trackOutputTrack);
        this.durationUs = durationUs;
        return dVar;
    }

    private boolean resolvePendingReposition(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z10;
        if (this.pendingReposition != -1) {
            long position = extractorInput.getPosition();
            long j10 = this.pendingReposition;
            if (j10 < position || j10 > 262144 + position) {
                positionHolder.position = j10;
                z10 = true;
            } else {
                extractorInput.skipFully((int) (j10 - position));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.pendingReposition = -1L;
        return z10;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        this.pendingReposition = -1L;
        this.currentChunkReader = null;
        for (d dVar : this.chunkReaders) {
            dVar.seekToPosition(j10);
        }
        if (j10 != 0) {
            this.state = 6;
        } else if (this.chunkReaders.length == 0) {
            this.state = 0;
        } else {
            this.state = 3;
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        extractorInput.peekFully(this.scratch.getData(), 0, 12);
        this.scratch.setPosition(0);
        if (this.scratch.readLittleEndianInt() != 1179011410) {
            return false;
        }
        this.scratch.skipBytes(4);
        return this.scratch.readLittleEndianInt() == 541677121;
    }

    private static void alignInputToEvenPosition(ExtractorInput extractorInput) throws IOException {
        if ((extractorInput.getPosition() & 1) == 1) {
            extractorInput.skipFully(1);
        }
    }

    private void parseHdrlBody(ParsableByteArray parsableByteArray) throws IOException {
        e from = e.parseFrom(1819436136, parsableByteArray);
        if (from.getType() == 1819436136) {
            ah.b bVar = (ah.b) from.getChild(ah.b.class);
            if (bVar != null) {
                this.aviHeader = bVar;
                this.durationUs = ((long) bVar.totalFrames) * ((long) bVar.frameDurationUs);
                ArrayList arrayList = new ArrayList();
                r2<ah.a> it = from.children.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    ah.a next = it.next();
                    if (next.getType() == 1819440243) {
                        int i11 = i10 + 1;
                        d dVarProcessStreamList = processStreamList((e) next, i10);
                        if (dVarProcessStreamList != null) {
                            arrayList.add(dVarProcessStreamList);
                        }
                        i10 = i11;
                    }
                }
                this.chunkReaders = (d[]) arrayList.toArray(new d[0]);
                this.extractorOutput.endTracks();
                return;
            }
            throw ParserException.createForMalformedContainer("AviHeader not found", null);
        }
        throw ParserException.createForMalformedContainer("Unexpected header list type " + from.getType(), null);
    }

    private void parseIdx1Body(ParsableByteArray parsableByteArray) {
        long jPeekSeekOffset = peekSeekOffset(parsableByteArray);
        while (parsableByteArray.bytesLeft() >= 16) {
            int littleEndianInt = parsableByteArray.readLittleEndianInt();
            int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
            long littleEndianInt3 = ((long) parsableByteArray.readLittleEndianInt()) + jPeekSeekOffset;
            parsableByteArray.readLittleEndianInt();
            d chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader != null) {
                if ((littleEndianInt2 & 16) == 16) {
                    chunkReader.appendKeyFrameToIndex(littleEndianInt3);
                }
                chunkReader.incrementIndexChunkCount();
            }
        }
        for (d dVar : this.chunkReaders) {
            dVar.compactIndex();
        }
        this.seekMapHasBeenOutput = true;
        this.extractorOutput.seekMap(new b(this.durationUs));
    }

    private long peekSeekOffset(ParsableByteArray parsableByteArray) {
        long j10 = 0;
        if (parsableByteArray.bytesLeft() < 16) {
            return 0L;
        }
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(8);
        long littleEndianInt = parsableByteArray.readLittleEndianInt();
        long j11 = this.moviStart;
        if (littleEndianInt <= j11) {
            j10 = 8 + j11;
        }
        parsableByteArray.setPosition(position);
        return j10;
    }

    private int readMoviChunks(ExtractorInput extractorInput) throws IOException {
        if (extractorInput.getPosition() >= this.moviEnd) {
            return -1;
        }
        d dVar = this.currentChunkReader;
        if (dVar != null) {
            if (dVar.onChunkData(extractorInput)) {
                this.currentChunkReader = null;
            }
        } else {
            alignInputToEvenPosition(extractorInput);
            int i10 = 12;
            extractorInput.peekFully(this.scratch.getData(), 0, 12);
            this.scratch.setPosition(0);
            int littleEndianInt = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1414744396) {
                this.scratch.setPosition(8);
                if (this.scratch.readLittleEndianInt() != 1769369453) {
                    i10 = 8;
                }
                extractorInput.skipFully(i10);
                extractorInput.resetPeekPosition();
                return 0;
            }
            int littleEndianInt2 = this.scratch.readLittleEndianInt();
            if (littleEndianInt == 1263424842) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2) + 8;
                return 0;
            }
            extractorInput.skipFully(8);
            extractorInput.resetPeekPosition();
            d chunkReader = getChunkReader(littleEndianInt);
            if (chunkReader == null) {
                this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt2);
                return 0;
            }
            chunkReader.onChunkStart(littleEndianInt2);
            this.currentChunkReader = chunkReader;
        }
        return 0;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        if (resolvePendingReposition(extractorInput, positionHolder)) {
            return 1;
        }
        switch (this.state) {
            case 0:
                if (sniff(extractorInput)) {
                    extractorInput.skipFully(12);
                    this.state = 1;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("AVI Header List not found", null);
            case 1:
                extractorInput.readFully(this.scratch.getData(), 0, 12);
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateWithListHeaderFrom(this.scratch);
                c cVar = this.chunkHeaderHolder;
                if (cVar.listType == 1819436136) {
                    this.hdrlSize = cVar.size;
                    this.state = 2;
                    return 0;
                }
                throw ParserException.createForMalformedContainer("hdrl expected, found: " + this.chunkHeaderHolder.listType, null);
            case 2:
                int i10 = this.hdrlSize - 4;
                ParsableByteArray parsableByteArray = new ParsableByteArray(i10);
                extractorInput.readFully(parsableByteArray.getData(), 0, i10);
                parseHdrlBody(parsableByteArray);
                this.state = 3;
                return 0;
            case 3:
                if (this.moviStart != -1) {
                    long position = extractorInput.getPosition();
                    long j10 = this.moviStart;
                    if (position != j10) {
                        this.pendingReposition = j10;
                        return 0;
                    }
                }
                extractorInput.peekFully(this.scratch.getData(), 0, 12);
                extractorInput.resetPeekPosition();
                this.scratch.setPosition(0);
                this.chunkHeaderHolder.populateFrom(this.scratch);
                int littleEndianInt = this.scratch.readLittleEndianInt();
                int i11 = this.chunkHeaderHolder.chunkType;
                if (i11 == 1179011410) {
                    extractorInput.skipFully(12);
                    return 0;
                }
                if (i11 == 1414744396 && littleEndianInt == 1769369453) {
                    long position2 = extractorInput.getPosition();
                    this.moviStart = position2;
                    this.moviEnd = position2 + ((long) this.chunkHeaderHolder.size) + 8;
                    if (!this.seekMapHasBeenOutput) {
                        if (((ah.b) Assertions.checkNotNull(this.aviHeader)).hasIndex()) {
                            this.state = 4;
                            this.pendingReposition = this.moviEnd;
                            return 0;
                        }
                        this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                        this.seekMapHasBeenOutput = true;
                    }
                    this.pendingReposition = extractorInput.getPosition() + 12;
                    this.state = 6;
                    return 0;
                }
                this.pendingReposition = extractorInput.getPosition() + ((long) this.chunkHeaderHolder.size) + 8;
                return 0;
            case 4:
                extractorInput.readFully(this.scratch.getData(), 0, 8);
                this.scratch.setPosition(0);
                int littleEndianInt2 = this.scratch.readLittleEndianInt();
                int littleEndianInt3 = this.scratch.readLittleEndianInt();
                if (littleEndianInt2 == 829973609) {
                    this.state = 5;
                    this.idx1BodySize = littleEndianInt3;
                } else {
                    this.pendingReposition = extractorInput.getPosition() + ((long) littleEndianInt3);
                }
                return 0;
            case 5:
                ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.idx1BodySize);
                extractorInput.readFully(parsableByteArray2.getData(), 0, this.idx1BodySize);
                parseIdx1Body(parsableByteArray2);
                this.state = 6;
                this.pendingReposition = this.moviStart;
                return 0;
            case 6:
                return readMoviChunks(extractorInput);
            default:
                throw new AssertionError();
        }
    }
}
