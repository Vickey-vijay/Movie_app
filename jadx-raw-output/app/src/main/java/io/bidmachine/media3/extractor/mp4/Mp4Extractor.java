package io.bidmachine.media3.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import ih.i;
import ih.j;
import ih.l;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.NalUnitUtil;
import io.bidmachine.media3.extractor.Ac4Util;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.GaplessInfoHolder;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.SniffFailure;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.TrueHdSampleRechunker;
import io.bidmachine.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import io.bidmachine.media3.extractor.mp4.Mp4Extractor;
import io.bidmachine.media3.extractor.mp4.Track;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import io.bidmachine.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import m5.e;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public final class Mp4Extractor implements Extractor, SeekMap {

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: ih.g
        @Override // io.bidmachine.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return Mp4Extractor.lambda$static$1();
        }
    };
    private static final int FILE_TYPE_HEIC = 2;
    private static final int FILE_TYPE_MP4 = 0;
    private static final int FILE_TYPE_QUICKTIME = 1;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 16;
    public static final int FLAG_MARK_FIRST_VIDEO_TRACK_WITH_MAIN_ROLE = 8;
    public static final int FLAG_READ_MOTION_PHOTO_METADATA = 2;
    public static final int FLAG_READ_SEF_DATA = 4;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private static final int STATE_READING_SEF = 3;
    private long[][] accumulatedSampleSizes;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<io.bidmachine.media3.extractor.mp4.a.C0509a> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int fileType;
    private int firstVideoTrackIndex;
    private final int flags;
    private ImmutableList<SniffFailure> lastSniffFailures;

    @Nullable
    private MotionPhotoMetadata motionPhotoMetadata;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private final ParsableByteArray scratch;
    private boolean seenFtypAtom;
    private final i sefReader;
    private final List<Metadata.Entry> slowMotionMetadataEntries;
    private final SubtitleParser.Factory subtitleParserFactory;
    private a[] tracks;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Deprecated
    public Mp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 16);
    }

    private static int brandToFileType(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] calculateAccumulatedSampleSizes(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            jArr[i10] = new long[aVarArr[i10].sampleTable.sampleCount];
            jArr2[i10] = aVarArr[i10].sampleTable.timestampsUs[0];
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < aVarArr.length) {
            long j11 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < aVarArr.length; i13++) {
                if (!zArr[i13]) {
                    long j12 = jArr2[i13];
                    if (j12 <= j11) {
                        i12 = i13;
                        j11 = j12;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j10;
            l lVar = aVarArr[i12].sampleTable;
            j10 += (long) lVar.sizes[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = lVar.timestampsUs[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new Mp4Extractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Track lambda$processMoovAtom$2(Track track) {
        return track;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new Mp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 16)};
    }

    private static boolean shouldParseContainerAtom(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473;
    }

    private static boolean shouldParseLeafAtom(int i10) {
        return i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124;
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        return getSeekPoints(j10, -1);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
    }

    public static final class a {
        public int sampleIndex;
        public final l sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        @Nullable
        public final TrueHdSampleRechunker trueHdSampleRechunker;

        public a(Track track, l lVar, TrackOutput trackOutput) {
            TrueHdSampleRechunker trueHdSampleRechunker;
            this.track = track;
            this.sampleTable = lVar;
            this.trackOutput = trackOutput;
            if ("audio/true-hd".equals(track.format.sampleMimeType)) {
                trueHdSampleRechunker = new TrueHdSampleRechunker();
            } else {
                trueHdSampleRechunker = null;
            }
            this.trueHdSampleRechunker = trueHdSampleRechunker;
        }
    }

    public Mp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0);
    }

    private int getTrackIndexOfNextReadSample(long j10) {
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j11 = Long.MAX_VALUE;
        boolean z10 = true;
        long j12 = Long.MAX_VALUE;
        boolean z11 = true;
        long j13 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.tracks;
            if (i12 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i12];
            int i13 = aVar.sampleIndex;
            l lVar = aVar.sampleTable;
            if (i13 != lVar.sampleCount) {
                long j14 = lVar.offsets[i13];
                long j15 = ((long[][]) Util.castNonNull(this.accumulatedSampleSizes))[i12][i13];
                long j16 = j14 - j10;
                boolean z12 = j16 < 0 || j16 >= 262144;
                if ((!z12 && z11) || (z12 == z11 && j16 < j13)) {
                    z11 = z12;
                    j13 = j16;
                    i11 = i12;
                    j12 = j15;
                }
                if (j15 < j11) {
                    z10 = z12;
                    i10 = i12;
                    j11 = j15;
                }
            }
            i12++;
        }
        return (j11 == Long.MAX_VALUE || !z10 || j12 < j11 + MAXIMUM_READ_AHEAD_BYTES_STREAM) ? i11 : i10;
    }

    private void maybeSkipRemainingMetaAtomHeaderBytes(ExtractorInput extractorInput) throws IOException {
        this.scratch.reset(8);
        extractorInput.peekFully(this.scratch.getData(), 0, 8);
        b.maybeSkipRemainingMetaAtomHeaderBytes(this.scratch);
        extractorInput.skipFully(this.scratch.getPosition());
        extractorInput.resetPeekPosition();
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: ih.h
            @Override // io.bidmachine.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return Mp4Extractor.lambda$newFactory$0(factory);
            }
        };
    }

    private void processAtomEnded(long j10) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j10) {
            io.bidmachine.media3.extractor.mp4.a.C0509a c0509aPop = this.containerAtoms.pop();
            if (c0509aPop.type == 1836019574) {
                processMoovAtom(c0509aPop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(c0509aPop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private void processEndOfStreamReadingAtomHeader() {
        if (this.fileType != 2 || (this.flags & 2) == 0) {
            return;
        }
        this.extractorOutput.track(0, 4).format(new Format.Builder().setMetadata(this.motionPhotoMetadata == null ? null : new Metadata(this.motionPhotoMetadata)).build());
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    private static int processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int iBrandToFileType = brandToFileType(parsableByteArray.readInt());
        if (iBrandToFileType != 0) {
            return iBrandToFileType;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            int iBrandToFileType2 = brandToFileType(parsableByteArray.readInt());
            if (iBrandToFileType2 != 0) {
                return iBrandToFileType2;
            }
        }
        return 0;
    }

    private void processMoovAtom(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) throws ParserException {
        Metadata metadata;
        int i10;
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.fileType == 1;
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a.getLeafAtomOfType(1969517665);
        if (leafAtomOfType != null) {
            Metadata udta = b.parseUdta(leafAtomOfType);
            gaplessInfoHolder.setFromMetadata(udta);
            metadata = udta;
        } else {
            metadata = null;
        }
        io.bidmachine.media3.extractor.mp4.a.C0509a containerAtomOfType = c0509a.getContainerAtomOfType(1835365473);
        Metadata mdtaFromMeta = containerAtomOfType != null ? b.parseMdtaFromMeta(containerAtomOfType) : null;
        Metadata metadata2 = new Metadata(b.parseMvhd(((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1836476516))).data));
        List<l> traks = b.parseTraks(c0509a, gaplessInfoHolder, -9223372036854775807L, null, (this.flags & 1) != 0, z10, new e() { // from class: ih.f
            @Override // m5.e
            public final Object apply(Object obj) {
                return Mp4Extractor.lambda$processMoovAtom$2((Track) obj);
            }
        });
        long j10 = -9223372036854775807L;
        long jMax = -9223372036854775807L;
        int i11 = 0;
        int i12 = 0;
        int size = -1;
        while (i11 < traks.size()) {
            l lVar = traks.get(i11);
            if (lVar.sampleCount != 0) {
                Track track = lVar.track;
                long j11 = track.durationUs;
                if (j11 == j10) {
                    j11 = lVar.durationUs;
                }
                jMax = Math.max(jMax, j11);
                int i13 = i12 + 1;
                a aVar = new a(track, lVar, this.extractorOutput.track(i12, track.type));
                int i14 = "audio/true-hd".equals(track.format.sampleMimeType) ? lVar.maximumSize * 16 : lVar.maximumSize + 30;
                Format.Builder builderBuildUpon = track.format.buildUpon();
                builderBuildUpon.setMaxInputSize(i14);
                if (track.type == 2) {
                    if ((this.flags & 8) != 0) {
                        builderBuildUpon.setRoleFlags(track.format.roleFlags | (size == -1 ? 1 : 2));
                    }
                    if (j11 > 0 && (i10 = lVar.sampleCount) > 0) {
                        builderBuildUpon.setFrameRate(i10 / (j11 / 1000000.0f));
                    }
                }
                ih.e.setFormatGaplessInfo(track.type, gaplessInfoHolder, builderBuildUpon);
                int i15 = track.type;
                Metadata[] metadataArr = new Metadata[3];
                metadataArr[0] = this.slowMotionMetadataEntries.isEmpty() ? null : new Metadata(this.slowMotionMetadataEntries);
                metadataArr[1] = metadata;
                metadataArr[2] = metadata2;
                ih.e.setFormatMetadata(i15, mdtaFromMeta, builderBuildUpon, metadataArr);
                aVar.trackOutput.format(builderBuildUpon.build());
                if (track.type == 2 && size == -1) {
                    size = arrayList.size();
                }
                arrayList.add(aVar);
                i12 = i13;
            }
            i11++;
            traks = traks;
            j10 = -9223372036854775807L;
        }
        this.firstVideoTrackIndex = size;
        this.durationUs = jMax;
        a[] aVarArr = (a[]) arrayList.toArray(new a[0]);
        this.tracks = aVarArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(aVarArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private void processUnparsedAtom(long j10) {
        if (this.atomType == 1836086884) {
            int i10 = this.atomHeaderBytesRead;
            this.motionPhotoMetadata = new MotionPhotoMetadata(0L, j10, -9223372036854775807L, j10 + ((long) i10), this.atomSize - ((long) i10));
        }
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        io.bidmachine.media3.extractor.mp4.a.C0509a c0509aPeek;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
                processEndOfStreamReadingAtomHeader();
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j10 = this.atomSize;
        if (j10 == 1) {
            extractorInput.readFully(this.atomHeader.getData(), 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j10 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && (c0509aPeek = this.containerAtoms.peek()) != null) {
                length = c0509aPeek.endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        if (shouldParseContainerAtom(this.atomType)) {
            long position = extractorInput.getPosition();
            long j11 = this.atomSize;
            int i10 = this.atomHeaderBytesRead;
            long j12 = (position + j11) - ((long) i10);
            if (j11 != i10 && this.atomType == 1835365473) {
                maybeSkipRemainingMetaAtomHeaderBytes(extractorInput);
            }
            this.containerAtoms.push(new io.bidmachine.media3.extractor.mp4.a.C0509a(this.atomType, j12));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(j12);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            Assertions.checkState(this.atomHeaderBytesRead == 8);
            Assertions.checkState(this.atomSize <= 2147483647L);
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            processUnparsedAtom(extractorInput.getPosition() - ((long) this.atomHeaderBytesRead));
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        boolean z10;
        long j10 = this.atomSize - ((long) this.atomHeaderBytesRead);
        long position = extractorInput.getPosition() + j10;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray == null) {
            if (!this.seenFtypAtom && this.atomType == 1835295092) {
                this.fileType = 1;
            }
            if (j10 < 262144) {
                extractorInput.skipFully((int) j10);
            } else {
                positionHolder.position = extractorInput.getPosition() + j10;
                z10 = true;
            }
            processAtomEnded(position);
            return z10 && this.parserState != 2;
        }
        extractorInput.readFully(parsableByteArray.getData(), this.atomHeaderBytesRead, (int) j10);
        if (this.atomType == 1718909296) {
            this.seenFtypAtom = true;
            this.fileType = processFtypAtom(parsableByteArray);
        } else if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(new io.bidmachine.media3.extractor.mp4.a.b(this.atomType, parsableByteArray));
        }
        z10 = false;
        processAtomEnded(position);
        if (z10) {
            return false;
        }
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        a aVar = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = aVar.trackOutput;
        int i10 = aVar.sampleIndex;
        l lVar = aVar.sampleTable;
        long j10 = lVar.offsets[i10];
        int i11 = lVar.sizes[i10];
        TrueHdSampleRechunker trueHdSampleRechunker = aVar.trueHdSampleRechunker;
        long j11 = (j10 - position) + ((long) this.sampleBytesRead);
        if (j11 < 0 || j11 >= 262144) {
            positionHolder.position = j10;
            return 1;
        }
        if (aVar.track.sampleTransformation == 1) {
            j11 += 8;
            i11 -= 8;
        }
        extractorInput.skipFully((int) j11);
        Track track = aVar.track;
        if (track.nalUnitLengthFieldLength == 0) {
            if ("audio/ac4".equals(track.format.sampleMimeType)) {
                if (this.sampleBytesWritten == 0) {
                    Ac4Util.getAc4SampleHeader(i11, this.scratch);
                    trackOutput.sampleData(this.scratch, 7);
                    this.sampleBytesWritten += 7;
                }
                i11 += 7;
            } else if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i12 = this.sampleBytesWritten;
                if (i12 >= i11) {
                    break;
                }
                int iSampleData = trackOutput.sampleData((DataReader) extractorInput, i11 - i12, false);
                this.sampleBytesRead += iSampleData;
                this.sampleBytesWritten += iSampleData;
                this.sampleCurrentNalBytesRemaining -= iSampleData;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i13 = aVar.track.nalUnitLengthFieldLength;
            int i14 = 4 - i13;
            while (this.sampleBytesWritten < i11) {
                int i15 = this.sampleCurrentNalBytesRemaining;
                if (i15 == 0) {
                    extractorInput.readFully(data, i14, i13);
                    this.sampleBytesRead += i13;
                    this.nalLength.setPosition(0);
                    int i16 = this.nalLength.readInt();
                    if (i16 < 0) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", null);
                    }
                    this.sampleCurrentNalBytesRemaining = i16;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                    i11 += i14;
                } else {
                    int iSampleData2 = trackOutput.sampleData((DataReader) extractorInput, i15, false);
                    this.sampleBytesRead += iSampleData2;
                    this.sampleBytesWritten += iSampleData2;
                    this.sampleCurrentNalBytesRemaining -= iSampleData2;
                }
            }
        }
        int i17 = i11;
        l lVar2 = aVar.sampleTable;
        long j12 = lVar2.timestampsUs[i10];
        int i18 = lVar2.flags[i10];
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(trackOutput, j12, i18, i17, 0, null);
            if (i10 + 1 == aVar.sampleTable.sampleCount) {
                trueHdSampleRechunker.outputPendingSampleMetadata(trackOutput, null);
            }
        } else {
            trackOutput.sampleMetadata(j12, i18, i17, 0, null);
        }
        aVar.sampleIndex++;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        return 0;
    }

    private int readSefData(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int i10 = this.sefReader.read(extractorInput, positionHolder, this.slowMotionMetadataEntries);
        if (i10 == 1 && positionHolder.position == 0) {
            enterReadingAtomHeaderState();
        }
        return i10;
    }

    private void updateSampleIndex(a aVar, long j10) {
        l lVar = aVar.sampleTable;
        int indexOfEarlierOrEqualSynchronizationSample = lVar.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            indexOfEarlierOrEqualSynchronizationSample = lVar.getIndexOfLaterOrEqualSynchronizationSample(j10);
        }
        aVar.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x0088  */
    /* JADX WARN: Code duplicated, block: B:40:0x008e  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f A[EDGE_INSN: B:42:0x007f->B:36:0x007f BREAK  A[LOOP:0: B:28:0x0063->B:35:0x007c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x007c A[SYNTHETIC] */
    public SeekMap.SeekPoints getSeekPoints(long j10, int i10) {
        long jMaybeAdjustSeekOffset;
        long j11;
        long jMaybeAdjustSeekOffset2;
        long j12;
        int i11;
        a[] aVarArr;
        l lVar;
        int indexOfLaterOrEqualSynchronizationSample;
        a[] aVarArr2 = this.tracks;
        if (aVarArr2.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i12 = i10 != -1 ? i10 : this.firstVideoTrackIndex;
        if (i12 != -1) {
            l lVar2 = aVarArr2[i12].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(lVar2, j10);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            j11 = lVar2.timestampsUs[synchronizationSampleIndex];
            jMaybeAdjustSeekOffset = lVar2.offsets[synchronizationSampleIndex];
            if (j11 < j10 && synchronizationSampleIndex < lVar2.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = lVar2.getIndexOfLaterOrEqualSynchronizationSample(j10)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j12 = lVar2.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                jMaybeAdjustSeekOffset2 = lVar2.offsets[indexOfLaterOrEqualSynchronizationSample];
            }
            if (i10 == -1) {
                i11 = 0;
                while (true) {
                    aVarArr = this.tracks;
                    if (i11 < aVarArr.length) {
                        break;
                    }
                    if (i11 != this.firstVideoTrackIndex) {
                        lVar = aVarArr[i11].sampleTable;
                        jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(lVar, j11, jMaybeAdjustSeekOffset);
                        if (j12 != -9223372036854775807L) {
                            jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(lVar, j12, jMaybeAdjustSeekOffset2);
                        }
                    }
                    i11++;
                }
            }
            SeekPoint seekPoint = new SeekPoint(j11, jMaybeAdjustSeekOffset);
            return j12 == -9223372036854775807L ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j12, jMaybeAdjustSeekOffset2));
        }
        jMaybeAdjustSeekOffset = Long.MAX_VALUE;
        j11 = j10;
        jMaybeAdjustSeekOffset2 = -1;
        j12 = -9223372036854775807L;
        if (i10 == -1) {
            i11 = 0;
            while (true) {
                aVarArr = this.tracks;
                if (i11 < aVarArr.length) {
                    break;
                    break;
                }
                if (i11 != this.firstVideoTrackIndex) {
                    lVar = aVarArr[i11].sampleTable;
                    jMaybeAdjustSeekOffset = maybeAdjustSeekOffset(lVar, j11, jMaybeAdjustSeekOffset);
                    if (j12 != -9223372036854775807L) {
                        jMaybeAdjustSeekOffset2 = maybeAdjustSeekOffset(lVar, j12, jMaybeAdjustSeekOffset2);
                    }
                }
                i11++;
            }
        }
        SeekPoint seekPoint2 = new SeekPoint(j11, jMaybeAdjustSeekOffset);
        if (j12 == -9223372036854775807L) {
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        if ((this.flags & 16) == 0) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory);
        }
        this.extractorOutput = extractorOutput;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    if (i10 == 3) {
                        return readSefData(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j10 == 0) {
            if (this.parserState != 3) {
                enterReadingAtomHeaderState();
                return;
            } else {
                this.sefReader.reset();
                this.slowMotionMetadataEntries.clear();
                return;
            }
        }
        for (a aVar : this.tracks) {
            updateSampleIndex(aVar, j11);
            TrueHdSampleRechunker trueHdSampleRechunker = aVar.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        SniffFailure sniffFailureSniffUnfragmented = j.sniffUnfragmented(extractorInput, (this.flags & 2) != 0);
        this.lastSniffFailures = sniffFailureSniffUnfragmented != null ? ImmutableList.of(sniffFailureSniffUnfragmented) : ImmutableList.of();
        return sniffFailureSniffUnfragmented == null;
    }

    @Deprecated
    public Mp4Extractor(int i10) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10);
    }

    private static int getSynchronizationSampleIndex(l lVar, long j10) {
        int indexOfEarlierOrEqualSynchronizationSample = lVar.getIndexOfEarlierOrEqualSynchronizationSample(j10);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            return lVar.getIndexOfLaterOrEqualSynchronizationSample(j10);
        }
        return indexOfEarlierOrEqualSynchronizationSample;
    }

    private static long maybeAdjustSeekOffset(l lVar, long j10, long j11) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(lVar, j10);
        if (synchronizationSampleIndex == -1) {
            return j11;
        }
        return Math.min(lVar.offsets[synchronizationSampleIndex], j11);
    }

    public Mp4Extractor(SubtitleParser.Factory factory, int i10) {
        this.subtitleParserFactory = factory;
        this.flags = i10;
        this.lastSniffFailures = ImmutableList.of();
        this.parserState = (i10 & 4) != 0 ? 3 : 0;
        this.sefReader = new i();
        this.slowMotionMetadataEntries = new ArrayList();
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.scratch = new ParsableByteArray();
        this.sampleTrackIndex = -1;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.tracks = new a[0];
    }
}
