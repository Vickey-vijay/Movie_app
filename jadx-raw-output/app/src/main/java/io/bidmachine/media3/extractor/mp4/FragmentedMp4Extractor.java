package io.bidmachine.media3.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import ih.j;
import ih.k;
import ih.l;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.TimestampAdjuster;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.NalUnitUtil;
import io.bidmachine.media3.extractor.Ac4Util;
import io.bidmachine.media3.extractor.CeaUtil;
import io.bidmachine.media3.extractor.ChunkIndex;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.GaplessInfoHolder;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SniffFailure;
import io.bidmachine.media3.extractor.TrackOutput;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessage;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessageEncoder;
import io.bidmachine.media3.extractor.mp4.FragmentedMp4Extractor;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import m5.e;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public class FragmentedMp4Extractor implements Extractor {
    private static final int EXTRA_TRACKS_BASE_ID = 100;
    public static final int FLAG_EMIT_RAW_SUBTITLE_DATA = 32;
    public static final int FLAG_ENABLE_EMSG_TRACK = 4;
    public static final int FLAG_WORKAROUND_EVERY_VIDEO_FRAME_IS_SYNC_FRAME = 1;
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 16;
    public static final int FLAG_WORKAROUND_IGNORE_TFDT_BOX = 2;
    private static final int SAMPLE_GROUP_TYPE_seig = 1936025959;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_ENCRYPTION_DATA = 2;
    private static final int STATE_READING_SAMPLE_CONTINUE = 4;
    private static final int STATE_READING_SAMPLE_START = 3;
    private static final String TAG = "FragmentedMp4Extractor";

    @Nullable
    private final TrackOutput additionalEmsgTrackOutput;

    @Nullable
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private TrackOutput[] ceaTrackOutputs;
    private final List<Format> closedCaptionFormats;
    private final ArrayDeque<io.bidmachine.media3.extractor.mp4.a.C0509a> containerAtoms;

    @Nullable
    private b currentTrackBundle;
    private long durationUs;
    private TrackOutput[] emsgTrackOutputs;
    private long endOfMdatPosition;
    private final EventMessageEncoder eventMessageEncoder;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private boolean haveOutputSeekMap;
    private ImmutableList<SniffFailure> lastSniffFailures;
    private final ParsableByteArray nalBuffer;
    private final ParsableByteArray nalPrefix;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int pendingMetadataSampleBytes;
    private final ArrayDeque<a> pendingMetadataSampleInfos;
    private long pendingSeekTimeUs;
    private boolean processSeiNalUnitPayload;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleSize;
    private final ParsableByteArray scratch;
    private final byte[] scratchBytes;
    private long segmentIndexEarliestPresentationTimeUs;

    @Nullable
    private final Track sideloadedTrack;
    private final SubtitleParser.Factory subtitleParserFactory;

    @Nullable
    private final TimestampAdjuster timestampAdjuster;
    private final SparseArray<b> trackBundles;

    @Deprecated
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: ih.b
        @Override // io.bidmachine.media3.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return FragmentedMp4Extractor.lambda$static$1();
        }
    };
    private static final byte[] PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format EMSG_FORMAT = new Format.Builder().setSampleMimeType("application/x-emsg").build();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class b {
        private static final int SINGLE_SUBSAMPLE_ENCRYPTION_DATA_LENGTH = 8;
        public int currentSampleInTrackRun;
        public int currentSampleIndex;
        public int currentTrackRunIndex;
        private boolean currentlyInFragment;
        public ih.a defaultSampleValues;
        public int firstSampleToOutputIndex;
        public l moovSampleTable;
        public final TrackOutput output;
        public final k fragment = new k();
        public final ParsableByteArray scratch = new ParsableByteArray();
        private final ParsableByteArray encryptionSignalByte = new ParsableByteArray(1);
        private final ParsableByteArray defaultInitializationVector = new ParsableByteArray();

        public int getCurrentSampleFlags() {
            int i10;
            if (this.currentlyInFragment) {
                i10 = this.fragment.sampleIsSyncFrameTable[this.currentSampleIndex] ? 1 : 0;
            } else {
                i10 = this.moovSampleTable.flags[this.currentSampleIndex];
            }
            return getEncryptionBoxIfEncrypted() != null ? i10 | 1073741824 : i10;
        }

        public long getCurrentSampleOffset() {
            return !this.currentlyInFragment ? this.moovSampleTable.offsets[this.currentSampleIndex] : this.fragment.trunDataPosition[this.currentTrackRunIndex];
        }

        public long getCurrentSamplePresentationTimeUs() {
            return !this.currentlyInFragment ? this.moovSampleTable.timestampsUs[this.currentSampleIndex] : this.fragment.getSamplePresentationTimeUs(this.currentSampleIndex);
        }

        public int getCurrentSampleSize() {
            return !this.currentlyInFragment ? this.moovSampleTable.sizes[this.currentSampleIndex] : this.fragment.sampleSizeTable[this.currentSampleIndex];
        }

        @Nullable
        public TrackEncryptionBox getEncryptionBoxIfEncrypted() {
            if (!this.currentlyInFragment) {
                return null;
            }
            int i10 = ((ih.a) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex;
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.fragment.trackEncryptionBox;
            if (sampleDescriptionEncryptionBox == null) {
                sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(i10);
            }
            if (sampleDescriptionEncryptionBox == null || !sampleDescriptionEncryptionBox.isEncrypted) {
                return null;
            }
            return sampleDescriptionEncryptionBox;
        }

        public boolean next() {
            this.currentSampleIndex++;
            if (!this.currentlyInFragment) {
                return false;
            }
            int i10 = this.currentSampleInTrackRun + 1;
            this.currentSampleInTrackRun = i10;
            int[] iArr = this.fragment.trunLength;
            int i11 = this.currentTrackRunIndex;
            if (i10 != iArr[i11]) {
                return true;
            }
            this.currentTrackRunIndex = i11 + 1;
            this.currentSampleInTrackRun = 0;
            return false;
        }

        public void reset(l lVar, ih.a aVar) {
            this.moovSampleTable = lVar;
            this.defaultSampleValues = aVar;
            this.output.format(lVar.track.format);
            resetFragmentInfo();
        }

        public void resetFragmentInfo() {
            this.fragment.reset();
            this.currentSampleIndex = 0;
            this.currentTrackRunIndex = 0;
            this.currentSampleInTrackRun = 0;
            this.firstSampleToOutputIndex = 0;
            this.currentlyInFragment = false;
        }

        public void seek(long j10) {
            int i10 = this.currentSampleIndex;
            while (true) {
                k kVar = this.fragment;
                if (i10 >= kVar.sampleCount || kVar.getSamplePresentationTimeUs(i10) > j10) {
                    return;
                }
                if (this.fragment.sampleIsSyncFrameTable[i10]) {
                    this.firstSampleToOutputIndex = i10;
                }
                i10++;
            }
        }

        public void updateDrmInitData(DrmInitData drmInitData) {
            TrackEncryptionBox sampleDescriptionEncryptionBox = this.moovSampleTable.track.getSampleDescriptionEncryptionBox(((ih.a) Util.castNonNull(this.fragment.header)).sampleDescriptionIndex);
            this.output.format(this.moovSampleTable.track.format.buildUpon().setDrmInitData(drmInitData.copyWithSchemeType(sampleDescriptionEncryptionBox != null ? sampleDescriptionEncryptionBox.schemeType : null)).build());
        }

        public b(TrackOutput trackOutput, l lVar, ih.a aVar) {
            this.output = trackOutput;
            this.moovSampleTable = lVar;
            this.defaultSampleValues = aVar;
            reset(lVar, aVar);
        }

        public int outputSampleEncryptionData(int i10, int i11) {
            ParsableByteArray parsableByteArray;
            boolean z10;
            int i12;
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return 0;
            }
            int length = encryptionBoxIfEncrypted.perSampleIvSize;
            if (length != 0) {
                parsableByteArray = this.fragment.sampleEncryptionData;
            } else {
                byte[] bArr = (byte[]) Util.castNonNull(encryptionBoxIfEncrypted.defaultInitializationVector);
                this.defaultInitializationVector.reset(bArr, bArr.length);
                ParsableByteArray parsableByteArray2 = this.defaultInitializationVector;
                length = bArr.length;
                parsableByteArray = parsableByteArray2;
            }
            boolean zSampleHasSubsampleEncryptionTable = this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex);
            if (!zSampleHasSubsampleEncryptionTable && i11 == 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            byte[] data = this.encryptionSignalByte.getData();
            if (z10) {
                i12 = 128;
            } else {
                i12 = 0;
            }
            data[0] = (byte) (i12 | length);
            this.encryptionSignalByte.setPosition(0);
            this.output.sampleData(this.encryptionSignalByte, 1, 1);
            this.output.sampleData(parsableByteArray, length, 1);
            if (!z10) {
                return length + 1;
            }
            if (!zSampleHasSubsampleEncryptionTable) {
                this.scratch.reset(8);
                byte[] data2 = this.scratch.getData();
                data2[0] = 0;
                data2[1] = 1;
                data2[2] = (byte) ((i11 >> 8) & 255);
                data2[3] = (byte) (i11 & 255);
                data2[4] = (byte) ((i10 >> 24) & 255);
                data2[5] = (byte) ((i10 >> 16) & 255);
                data2[6] = (byte) ((i10 >> 8) & 255);
                data2[7] = (byte) (i10 & 255);
                this.output.sampleData(this.scratch, 8, 1);
                return length + 1 + 8;
            }
            ParsableByteArray parsableByteArray3 = this.fragment.sampleEncryptionData;
            int unsignedShort = parsableByteArray3.readUnsignedShort();
            parsableByteArray3.skipBytes(-2);
            int i13 = (unsignedShort * 6) + 2;
            if (i11 != 0) {
                this.scratch.reset(i13);
                byte[] data3 = this.scratch.getData();
                parsableByteArray3.readBytes(data3, 0, i13);
                int i14 = (((data3[2] & 255) << 8) | (data3[3] & 255)) + i11;
                data3[2] = (byte) ((i14 >> 8) & 255);
                data3[3] = (byte) (i14 & 255);
                parsableByteArray3 = this.scratch;
            }
            this.output.sampleData(parsableByteArray3, i13, 1);
            return length + 1 + i13;
        }

        public void skipSampleEncryptionData() {
            TrackEncryptionBox encryptionBoxIfEncrypted = getEncryptionBoxIfEncrypted();
            if (encryptionBoxIfEncrypted == null) {
                return;
            }
            ParsableByteArray parsableByteArray = this.fragment.sampleEncryptionData;
            int i10 = encryptionBoxIfEncrypted.perSampleIvSize;
            if (i10 != 0) {
                parsableByteArray.skipBytes(i10);
            }
            if (this.fragment.sampleHasSubsampleEncryptionTable(this.currentSampleIndex)) {
                parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() * 6);
            }
        }
    }

    @Deprecated
    public FragmentedMp4Extractor() {
        this(SubtitleParser.Factory.UNSUPPORTED, 32, null, null, ImmutableList.of(), null);
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private void initExtraTracks() {
        int i10;
        TrackOutput[] trackOutputArr = new TrackOutput[2];
        this.emsgTrackOutputs = trackOutputArr;
        TrackOutput trackOutput = this.additionalEmsgTrackOutput;
        int i11 = 0;
        if (trackOutput != null) {
            trackOutputArr[0] = trackOutput;
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i12 = 100;
        if ((this.flags & 4) != 0) {
            trackOutputArr[i10] = this.extractorOutput.track(100, 5);
            i10++;
            i12 = 101;
        }
        TrackOutput[] trackOutputArr2 = (TrackOutput[]) Util.nullSafeArrayCopy(this.emsgTrackOutputs, i10);
        this.emsgTrackOutputs = trackOutputArr2;
        for (TrackOutput trackOutput2 : trackOutputArr2) {
            trackOutput2.format(EMSG_FORMAT);
        }
        this.ceaTrackOutputs = new TrackOutput[this.closedCaptionFormats.size()];
        while (i11 < this.ceaTrackOutputs.length) {
            TrackOutput trackOutputTrack = this.extractorOutput.track(i12, 3);
            trackOutputTrack.format(this.closedCaptionFormats.get(i11));
            this.ceaTrackOutputs[i11] = trackOutputTrack;
            i11++;
            i12++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$newFactory$0(SubtitleParser.Factory factory) {
        return new Extractor[]{new FragmentedMp4Extractor(factory)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Extractor[] lambda$static$1() {
        return new Extractor[]{new FragmentedMp4Extractor(SubtitleParser.Factory.UNSUPPORTED, 32)};
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, k kVar) throws ParserException {
        parseSenc(parsableByteArray, 0, kVar);
    }

    private static boolean shouldParseContainerAtom(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    private static boolean shouldParseLeafAtom(int i10) {
        return i10 == 1751411826 || i10 == 1835296868 || i10 == 1836476516 || i10 == 1936286840 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1668576371 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1937011571 || i10 == 1952867444 || i10 == 1952868452 || i10 == 1953196132 || i10 == 1953654136 || i10 == 1953658222 || i10 == 1886614376 || i10 == 1935763834 || i10 == 1935763823 || i10 == 1936027235 || i10 == 1970628964 || i10 == 1935828848 || i10 == 1936158820 || i10 == 1701606260 || i10 == 1835362404 || i10 == 1701671783;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    @Nullable
    public Track modifyTrack(@Nullable Track track) {
        return track;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
    }

    public static final class a {
        public final boolean sampleTimeIsRelative;
        public final long sampleTimeUs;
        public final int size;

        public a(long j10, boolean z10, int i10) {
            this.sampleTimeUs = j10;
            this.sampleTimeIsRelative = z10;
            this.size = i10;
        }
    }

    private static int checkNonNegative(int i10) throws ParserException {
        if (i10 >= 0) {
            return i10;
        }
        throw ParserException.createForMalformedContainer("Unexpected negative value: " + i10, null);
    }

    private static boolean isEdtsListDurationForEntireMediaTimeline(Track track) {
        long[] jArr;
        long[] jArr2 = track.editListDurations;
        if (jArr2 == null || jArr2.length != 1 || (jArr = track.editListMediaTimes) == null) {
            return false;
        }
        long j10 = jArr2[0];
        return j10 == 0 || Util.scaleLargeTimestamp(j10 + jArr[0], 1000000L, track.movieTimescale) >= track.durationUs;
    }

    public static ExtractorsFactory newFactory(final SubtitleParser.Factory factory) {
        return new ExtractorsFactory() { // from class: ih.d
            @Override // io.bidmachine.media3.extractor.ExtractorsFactory
            public final Extractor[] createExtractors() {
                return FragmentedMp4Extractor.lambda$newFactory$0(factory);
            }
        };
    }

    private void onContainerAtomRead(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) throws ParserException {
        int i10 = c0509a.type;
        if (i10 == 1836019574) {
            onMoovContainerAtomRead(c0509a);
        } else if (i10 == 1836019558) {
            onMoofContainerAtomRead(c0509a);
        } else {
            if (this.containerAtoms.isEmpty()) {
                return;
            }
            this.containerAtoms.peek().add(c0509a);
        }
    }

    private void onEmsgLeafAtomRead(ParsableByteArray parsableByteArray) {
        long jScaleLargeTimestamp;
        String str;
        long jScaleLargeTimestamp2;
        String str2;
        long unsignedInt;
        long jAdjustSampleTimestamp;
        if (this.emsgTrackOutputs.length == 0) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        if (fullAtomVersion == 0) {
            String str3 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            String str4 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000000L, unsignedInt2);
            long j10 = this.segmentIndexEarliestPresentationTimeUs;
            long j11 = j10 != -9223372036854775807L ? j10 + jScaleLargeTimestamp : -9223372036854775807L;
            str = str3;
            jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt2);
            str2 = str4;
            unsignedInt = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = j11;
        } else {
            if (fullAtomVersion != 1) {
                Log.w(TAG, "Skipping unsupported emsg version: " + fullAtomVersion);
                return;
            }
            long unsignedInt3 = parsableByteArray.readUnsignedInt();
            jAdjustSampleTimestamp = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedLongToLong(), 1000000L, unsignedInt3);
            long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(parsableByteArray.readUnsignedInt(), 1000L, unsignedInt3);
            long unsignedInt4 = parsableByteArray.readUnsignedInt();
            str = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp2 = jScaleLargeTimestamp3;
            unsignedInt = unsignedInt4;
            str2 = (String) Assertions.checkNotNull(parsableByteArray.readNullTerminatedString());
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        byte[] bArr = new byte[parsableByteArray.bytesLeft()];
        parsableByteArray.readBytes(bArr, 0, parsableByteArray.bytesLeft());
        ParsableByteArray parsableByteArray2 = new ParsableByteArray(this.eventMessageEncoder.encode(new EventMessage(str, str2, jScaleLargeTimestamp2, unsignedInt, bArr)));
        int iBytesLeft = parsableByteArray2.bytesLeft();
        for (TrackOutput trackOutput : this.emsgTrackOutputs) {
            parsableByteArray2.setPosition(0);
            trackOutput.sampleData(parsableByteArray2, iBytesLeft);
        }
        if (jAdjustSampleTimestamp == -9223372036854775807L) {
            this.pendingMetadataSampleInfos.addLast(new a(jScaleLargeTimestamp, true, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        if (!this.pendingMetadataSampleInfos.isEmpty()) {
            this.pendingMetadataSampleInfos.addLast(new a(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null && !timestampAdjuster.isInitialized()) {
            this.pendingMetadataSampleInfos.addLast(new a(jAdjustSampleTimestamp, false, iBytesLeft));
            this.pendingMetadataSampleBytes += iBytesLeft;
            return;
        }
        TimestampAdjuster timestampAdjuster2 = this.timestampAdjuster;
        if (timestampAdjuster2 != null) {
            jAdjustSampleTimestamp = timestampAdjuster2.adjustSampleTimestamp(jAdjustSampleTimestamp);
        }
        for (TrackOutput trackOutput2 : this.emsgTrackOutputs) {
            trackOutput2.sampleMetadata(jAdjustSampleTimestamp, 1, iBytesLeft, 0, null);
        }
    }

    private void onLeafAtomRead(io.bidmachine.media3.extractor.mp4.a.b bVar, long j10) throws ParserException {
        if (!this.containerAtoms.isEmpty()) {
            this.containerAtoms.peek().add(bVar);
            return;
        }
        int i10 = bVar.type;
        if (i10 != 1936286840) {
            if (i10 == 1701671783) {
                onEmsgLeafAtomRead(bVar.data);
            }
        } else {
            Pair<Long, ChunkIndex> sidx = parseSidx(bVar.data, j10);
            this.segmentIndexEarliestPresentationTimeUs = ((Long) sidx.first).longValue();
            this.extractorOutput.seekMap((SeekMap) sidx.second);
            this.haveOutputSeekMap = true;
        }
    }

    private void onMoofContainerAtomRead(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) throws ParserException {
        parseMoof(c0509a, this.trackBundles, this.sideloadedTrack != null, this.flags, this.scratchBytes);
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c0509a.leafChildren);
        if (drmInitDataFromAtoms != null) {
            int size = this.trackBundles.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.trackBundles.valueAt(i10).updateDrmInitData(drmInitDataFromAtoms);
            }
        }
        if (this.pendingSeekTimeUs != -9223372036854775807L) {
            int size2 = this.trackBundles.size();
            for (int i11 = 0; i11 < size2; i11++) {
                this.trackBundles.valueAt(i11).seek(this.pendingSeekTimeUs);
            }
            this.pendingSeekTimeUs = -9223372036854775807L;
        }
    }

    private void onMoovContainerAtomRead(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) throws ParserException {
        int i10 = 0;
        Assertions.checkState(this.sideloadedTrack == null, "Unexpected moov box.");
        DrmInitData drmInitDataFromAtoms = getDrmInitDataFromAtoms(c0509a.leafChildren);
        io.bidmachine.media3.extractor.mp4.a.C0509a c0509a2 = (io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(c0509a.getContainerAtomOfType(1836475768));
        SparseArray<ih.a> sparseArray = new SparseArray<>();
        int size = c0509a2.leafChildren.size();
        long mehd = -9223372036854775807L;
        for (int i11 = 0; i11 < size; i11++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar = c0509a2.leafChildren.get(i11);
            int i12 = bVar.type;
            if (i12 == 1953654136) {
                Pair<Integer, ih.a> trex = parseTrex(bVar.data);
                sparseArray.put(((Integer) trex.first).intValue(), (ih.a) trex.second);
            } else if (i12 == 1835362404) {
                mehd = parseMehd(bVar.data);
            }
        }
        List<l> traks = io.bidmachine.media3.extractor.mp4.b.parseTraks(c0509a, new GaplessInfoHolder(), mehd, drmInitDataFromAtoms, (this.flags & 16) != 0, false, new e() { // from class: ih.c
            @Override // m5.e
            public final Object apply(Object obj) {
                return this.f54173b.modifyTrack((Track) obj);
            }
        });
        int size2 = traks.size();
        if (this.trackBundles.size() != 0) {
            Assertions.checkState(this.trackBundles.size() == size2);
            while (i10 < size2) {
                l lVar = traks.get(i10);
                Track track = lVar.track;
                this.trackBundles.get(track.f59898id).reset(lVar, getDefaultSampleValues(sparseArray, track.f59898id));
                i10++;
            }
            return;
        }
        while (i10 < size2) {
            l lVar2 = traks.get(i10);
            Track track2 = lVar2.track;
            this.trackBundles.put(track2.f59898id, new b(this.extractorOutput.track(i10, track2.type), lVar2, getDefaultSampleValues(sparseArray, track2.f59898id)));
            this.durationUs = Math.max(this.durationUs, track2.durationUs);
            i10++;
        }
        this.extractorOutput.endTracks();
    }

    private void outputPendingMetadataSamples(long j10) {
        while (!this.pendingMetadataSampleInfos.isEmpty()) {
            a aVarRemoveFirst = this.pendingMetadataSampleInfos.removeFirst();
            this.pendingMetadataSampleBytes -= aVarRemoveFirst.size;
            long jAdjustSampleTimestamp = aVarRemoveFirst.sampleTimeUs;
            if (aVarRemoveFirst.sampleTimeIsRelative) {
                jAdjustSampleTimestamp += j10;
            }
            TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
            if (timestampAdjuster != null) {
                jAdjustSampleTimestamp = timestampAdjuster.adjustSampleTimestamp(jAdjustSampleTimestamp);
            }
            for (TrackOutput trackOutput : this.emsgTrackOutputs) {
                trackOutput.sampleMetadata(jAdjustSampleTimestamp, 1, aVarRemoveFirst.size, this.pendingMetadataSampleBytes, null);
            }
        }
    }

    private static long parseMehd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt()) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
    }

    private static void parseMoof(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        int size = c0509a.containerChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            io.bidmachine.media3.extractor.mp4.a.C0509a c0509a2 = c0509a.containerChildren.get(i11);
            if (c0509a2.type == 1953653094) {
                parseTraf(c0509a2, sparseArray, z10, i10, bArr);
            }
        }
    }

    private static void parseSaio(ParsableByteArray parsableByteArray, k kVar) throws ParserException {
        parsableByteArray.setPosition(8);
        int i10 = parsableByteArray.readInt();
        if ((io.bidmachine.media3.extractor.mp4.a.parseFullAtomFlags(i10) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 1) {
            kVar.auxiliaryDataPosition += io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(i10) == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
        } else {
            throw ParserException.createForMalformedContainer("Unexpected saio entry count: " + unsignedIntToInt, null);
        }
    }

    private static void parseSaiz(TrackEncryptionBox trackEncryptionBox, ParsableByteArray parsableByteArray, k kVar) throws ParserException {
        int i10;
        int i11 = trackEncryptionBox.perSampleIvSize;
        parsableByteArray.setPosition(8);
        if ((io.bidmachine.media3.extractor.mp4.a.parseFullAtomFlags(parsableByteArray.readInt()) & 1) == 1) {
            parsableByteArray.skipBytes(8);
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt > kVar.sampleCount) {
            throw ParserException.createForMalformedContainer("Saiz sample count " + unsignedIntToInt + " is greater than fragment sample count" + kVar.sampleCount, null);
        }
        if (unsignedByte == 0) {
            boolean[] zArr = kVar.sampleHasSubsampleEncryptionTable;
            i10 = 0;
            for (int i12 = 0; i12 < unsignedIntToInt; i12++) {
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                i10 += unsignedByte2;
                zArr[i12] = unsignedByte2 > i11;
            }
        } else {
            i10 = (unsignedByte * unsignedIntToInt) + 0;
            Arrays.fill(kVar.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, unsignedByte > i11);
        }
        Arrays.fill(kVar.sampleHasSubsampleEncryptionTable, unsignedIntToInt, kVar.sampleCount, false);
        if (i10 > 0) {
            kVar.initEncryptionData(i10);
        }
    }

    private static void parseSampleGroups(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, @Nullable String str, k kVar) throws ParserException {
        byte[] bArr = null;
        ParsableByteArray parsableByteArray = null;
        ParsableByteArray parsableByteArray2 = null;
        for (int i10 = 0; i10 < c0509a.leafChildren.size(); i10++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar = c0509a.leafChildren.get(i10);
            ParsableByteArray parsableByteArray3 = bVar.data;
            int i11 = bVar.type;
            if (i11 == 1935828848) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray = parsableByteArray3;
                }
            } else if (i11 == 1936158820) {
                parsableByteArray3.setPosition(12);
                if (parsableByteArray3.readInt() == SAMPLE_GROUP_TYPE_seig) {
                    parsableByteArray2 = parsableByteArray3;
                }
            }
        }
        if (parsableByteArray == null || parsableByteArray2 == null) {
            return;
        }
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        if (fullAtomVersion == 1) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.readInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
        }
        parsableByteArray2.setPosition(8);
        int fullAtomVersion2 = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray2.readInt());
        parsableByteArray2.skipBytes(4);
        if (fullAtomVersion2 == 1) {
            if (parsableByteArray2.readUnsignedInt() == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
            }
        } else if (fullAtomVersion2 >= 2) {
            parsableByteArray2.skipBytes(4);
        }
        if (parsableByteArray2.readUnsignedInt() != 1) {
            throw ParserException.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
        }
        parsableByteArray2.skipBytes(1);
        int unsignedByte = parsableByteArray2.readUnsignedByte();
        int i12 = (unsignedByte & 240) >> 4;
        int i13 = unsignedByte & 15;
        boolean z10 = parsableByteArray2.readUnsignedByte() == 1;
        if (z10) {
            int unsignedByte2 = parsableByteArray2.readUnsignedByte();
            byte[] bArr2 = new byte[16];
            parsableByteArray2.readBytes(bArr2, 0, 16);
            if (unsignedByte2 == 0) {
                int unsignedByte3 = parsableByteArray2.readUnsignedByte();
                bArr = new byte[unsignedByte3];
                parsableByteArray2.readBytes(bArr, 0, unsignedByte3);
            }
            kVar.definesEncryptionData = true;
            kVar.trackEncryptionBox = new TrackEncryptionBox(z10, str, unsignedByte2, bArr2, i12, i13, bArr);
        }
    }

    private static void parseSenc(ParsableByteArray parsableByteArray, int i10, k kVar) throws ParserException {
        parsableByteArray.setPosition(i10 + 8);
        int fullAtomFlags = io.bidmachine.media3.extractor.mp4.a.parseFullAtomFlags(parsableByteArray.readInt());
        if ((fullAtomFlags & 1) != 0) {
            throw ParserException.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z10 = (fullAtomFlags & 2) != 0;
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        if (unsignedIntToInt == 0) {
            Arrays.fill(kVar.sampleHasSubsampleEncryptionTable, 0, kVar.sampleCount, false);
            return;
        }
        if (unsignedIntToInt == kVar.sampleCount) {
            Arrays.fill(kVar.sampleHasSubsampleEncryptionTable, 0, unsignedIntToInt, z10);
            kVar.initEncryptionData(parsableByteArray.bytesLeft());
            kVar.fillEncryptionData(parsableByteArray);
        } else {
            throw ParserException.createForMalformedContainer("Senc sample count " + unsignedIntToInt + " is different from fragment sample count" + kVar.sampleCount, null);
        }
    }

    private static Pair<Long, ChunkIndex> parseSidx(ParsableByteArray parsableByteArray, long j10) throws ParserException {
        long unsignedLongToLong;
        long unsignedLongToLong2;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        if (fullAtomVersion == 0) {
            unsignedLongToLong = parsableByteArray.readUnsignedInt();
            unsignedLongToLong2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            unsignedLongToLong2 = parsableByteArray.readUnsignedLongToLong();
        }
        long j11 = unsignedLongToLong;
        long j12 = j10 + unsignedLongToLong2;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j11, 1000000L, unsignedInt);
        parsableByteArray.skipBytes(2);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int[] iArr = new int[unsignedShort];
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        long[] jArr3 = new long[unsignedShort];
        long j13 = jScaleLargeTimestamp;
        int i10 = 0;
        long j14 = j11;
        while (i10 < unsignedShort) {
            int i11 = parsableByteArray.readInt();
            if ((i11 & Integer.MIN_VALUE) != 0) {
                throw ParserException.createForMalformedContainer("Unhandled indirect reference", null);
            }
            long unsignedInt2 = parsableByteArray.readUnsignedInt();
            iArr[i10] = i11 & Integer.MAX_VALUE;
            jArr[i10] = j12;
            jArr3[i10] = j13;
            long j15 = j14 + unsignedInt2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            int i12 = unsignedShort;
            int[] iArr2 = iArr;
            long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j15, 1000000L, unsignedInt);
            jArr4[i10] = jScaleLargeTimestamp2 - jArr5[i10];
            parsableByteArray.skipBytes(4);
            j12 += (long) iArr2[i10];
            i10++;
            iArr = iArr2;
            jArr3 = jArr5;
            jArr2 = jArr4;
            jArr = jArr;
            unsignedShort = i12;
            j14 = j15;
            j13 = jScaleLargeTimestamp2;
        }
        return Pair.create(Long.valueOf(jScaleLargeTimestamp), new ChunkIndex(iArr, jArr, jArr2, jArr3));
    }

    private static long parseTfdt(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        return io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt()) == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
    }

    @Nullable
    private static b parseTfhd(ParsableByteArray parsableByteArray, SparseArray<b> sparseArray, boolean z10) {
        parsableByteArray.setPosition(8);
        int fullAtomFlags = io.bidmachine.media3.extractor.mp4.a.parseFullAtomFlags(parsableByteArray.readInt());
        b bVarValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(parsableByteArray.readInt());
        if (bVarValueAt == null) {
            return null;
        }
        if ((fullAtomFlags & 1) != 0) {
            long unsignedLongToLong = parsableByteArray.readUnsignedLongToLong();
            k kVar = bVarValueAt.fragment;
            kVar.dataPosition = unsignedLongToLong;
            kVar.auxiliaryDataPosition = unsignedLongToLong;
        }
        ih.a aVar = bVarValueAt.defaultSampleValues;
        bVarValueAt.fragment.header = new ih.a((fullAtomFlags & 2) != 0 ? parsableByteArray.readInt() - 1 : aVar.sampleDescriptionIndex, (fullAtomFlags & 8) != 0 ? parsableByteArray.readInt() : aVar.duration, (fullAtomFlags & 16) != 0 ? parsableByteArray.readInt() : aVar.size, (fullAtomFlags & 32) != 0 ? parsableByteArray.readInt() : aVar.flags);
        return bVarValueAt;
    }

    private static Pair<Integer, ih.a> parseTrex(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(12);
        return Pair.create(Integer.valueOf(parsableByteArray.readInt()), new ih.a(parsableByteArray.readInt() - 1, parsableByteArray.readInt(), parsableByteArray.readInt(), parsableByteArray.readInt()));
    }

    private static int parseTrun(b bVar, int i10, int i11, ParsableByteArray parsableByteArray, int i12) throws ParserException {
        int i13;
        b bVar2 = bVar;
        parsableByteArray.setPosition(8);
        int fullAtomFlags = io.bidmachine.media3.extractor.mp4.a.parseFullAtomFlags(parsableByteArray.readInt());
        Track track = bVar2.moovSampleTable.track;
        k kVar = bVar2.fragment;
        ih.a aVar = (ih.a) Util.castNonNull(kVar.header);
        kVar.trunLength[i10] = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = kVar.trunDataPosition;
        long j10 = kVar.dataPosition;
        jArr[i10] = j10;
        if ((fullAtomFlags & 1) != 0) {
            jArr[i10] = j10 + ((long) parsableByteArray.readInt());
        }
        boolean z10 = (fullAtomFlags & 4) != 0;
        int i14 = aVar.flags;
        if (z10) {
            i14 = parsableByteArray.readInt();
        }
        boolean z11 = (fullAtomFlags & 256) != 0;
        boolean z12 = (fullAtomFlags & 512) != 0;
        boolean z13 = (fullAtomFlags & 1024) != 0;
        boolean z14 = (fullAtomFlags & 2048) != 0;
        long j11 = isEdtsListDurationForEntireMediaTimeline(track) ? ((long[]) Util.castNonNull(track.editListMediaTimes))[0] : 0L;
        int[] iArr = kVar.sampleSizeTable;
        long[] jArr2 = kVar.samplePresentationTimesUs;
        boolean[] zArr = kVar.sampleIsSyncFrameTable;
        int i15 = i14;
        boolean z15 = track.type == 2 && (i11 & 1) != 0;
        int i16 = i12 + kVar.trunLength[i10];
        boolean z16 = z15;
        long j12 = track.timescale;
        long j13 = kVar.nextFragmentDecodeTime;
        int i17 = i12;
        while (i17 < i16) {
            int iCheckNonNegative = checkNonNegative(z11 ? parsableByteArray.readInt() : aVar.duration);
            int iCheckNonNegative2 = checkNonNegative(z12 ? parsableByteArray.readInt() : aVar.size);
            if (z13) {
                i13 = parsableByteArray.readInt();
            } else {
                i13 = (i17 == 0 && z10) ? i15 : aVar.flags;
            }
            long jScaleLargeTimestamp = Util.scaleLargeTimestamp((((long) (z14 ? parsableByteArray.readInt() : 0)) + j13) - j11, 1000000L, j12);
            jArr2[i17] = jScaleLargeTimestamp;
            if (!kVar.nextFragmentDecodeTimeIncludesMoov) {
                jArr2[i17] = jScaleLargeTimestamp + bVar2.moovSampleTable.durationUs;
            }
            iArr[i17] = iCheckNonNegative2;
            zArr[i17] = ((i13 >> 16) & 1) == 0 && (!z16 || i17 == 0);
            j13 += (long) iCheckNonNegative;
            i17++;
            bVar2 = bVar;
            z11 = z11;
            z10 = z10;
            z14 = z14;
            z12 = z12;
            z13 = z13;
        }
        kVar.nextFragmentDecodeTime = j13;
        return i16;
    }

    private static void parseTruns(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, b bVar, int i10) throws ParserException {
        List<io.bidmachine.media3.extractor.mp4.a.b> list = c0509a.leafChildren;
        int size = list.size();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar2 = list.get(i13);
            if (bVar2.type == 1953658222) {
                ParsableByteArray parsableByteArray = bVar2.data;
                parsableByteArray.setPosition(12);
                int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
                if (unsignedIntToInt > 0) {
                    i12 += unsignedIntToInt;
                    i11++;
                }
            }
        }
        bVar.currentTrackRunIndex = 0;
        bVar.currentSampleInTrackRun = 0;
        bVar.currentSampleIndex = 0;
        bVar.fragment.initTables(i11, i12);
        int i14 = 0;
        int trun = 0;
        for (int i15 = 0; i15 < size; i15++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar3 = list.get(i15);
            if (bVar3.type == 1953658222) {
                trun = parseTrun(bVar, i14, i10, bVar3.data, trun);
                i14++;
            }
        }
    }

    private static void parseUuid(ParsableByteArray parsableByteArray, k kVar, byte[] bArr) throws ParserException {
        parsableByteArray.setPosition(8);
        parsableByteArray.readBytes(bArr, 0, 16);
        if (Arrays.equals(bArr, PIFF_SAMPLE_ENCRYPTION_BOX_EXTENDED_TYPE)) {
            parseSenc(parsableByteArray, 16, kVar);
        }
    }

    private void processAtomEnded(long j10) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j10) {
            onContainerAtomRead(this.containerAtoms.pop());
        }
        enterReadingAtomHeaderState();
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException {
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.getData(), 0, 8, true)) {
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
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + ((long) this.atomHeaderBytesRead);
            }
        }
        if (this.atomSize < this.atomHeaderBytesRead) {
            throw ParserException.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
        }
        long position = extractorInput.getPosition() - ((long) this.atomHeaderBytesRead);
        int i10 = this.atomType;
        if ((i10 == 1836019558 || i10 == 1835295092) && !this.haveOutputSeekMap) {
            this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs, position));
            this.haveOutputSeekMap = true;
        }
        if (this.atomType == 1836019558) {
            int size = this.trackBundles.size();
            for (int i11 = 0; i11 < size; i11++) {
                k kVar = this.trackBundles.valueAt(i11).fragment;
                kVar.atomPosition = position;
                kVar.auxiliaryDataPosition = position;
                kVar.dataPosition = position;
            }
        }
        int i12 = this.atomType;
        if (i12 == 1835295092) {
            this.currentTrackBundle = null;
            this.endOfMdatPosition = position + this.atomSize;
            this.parserState = 2;
            return true;
        }
        if (shouldParseContainerAtom(i12)) {
            long position2 = (extractorInput.getPosition() + this.atomSize) - 8;
            this.containerAtoms.push(new io.bidmachine.media3.extractor.mp4.a.C0509a(this.atomType, position2));
            if (this.atomSize == this.atomHeaderBytesRead) {
                processAtomEnded(position2);
            } else {
                enterReadingAtomHeaderState();
            }
        } else if (shouldParseLeafAtom(this.atomType)) {
            if (this.atomHeaderBytesRead != 8) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
            }
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
            }
            ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
            System.arraycopy(this.atomHeader.getData(), 0, parsableByteArray.getData(), 0, 8);
            this.atomData = parsableByteArray;
            this.parserState = 1;
        } else {
            if (this.atomSize > 2147483647L) {
                throw ParserException.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
            }
            this.atomData = null;
            this.parserState = 1;
        }
        return true;
    }

    private void readAtomPayload(ExtractorInput extractorInput) throws IOException {
        int i10 = ((int) this.atomSize) - this.atomHeaderBytesRead;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.getData(), 8, i10);
            onLeafAtomRead(new io.bidmachine.media3.extractor.mp4.a.b(this.atomType, parsableByteArray), extractorInput.getPosition());
        } else {
            extractorInput.skipFully(i10);
        }
        processAtomEnded(extractorInput.getPosition());
    }

    private void readEncryptionData(ExtractorInput extractorInput) throws IOException {
        int size = this.trackBundles.size();
        long j10 = Long.MAX_VALUE;
        b bVarValueAt = null;
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = this.trackBundles.valueAt(i10).fragment;
            if (kVar.sampleEncryptionDataNeedsFill) {
                long j11 = kVar.auxiliaryDataPosition;
                if (j11 < j10) {
                    bVarValueAt = this.trackBundles.valueAt(i10);
                    j10 = j11;
                }
            }
        }
        if (bVarValueAt == null) {
            this.parserState = 3;
            return;
        }
        int position = (int) (j10 - extractorInput.getPosition());
        if (position < 0) {
            throw ParserException.createForMalformedContainer("Offset to encryption data was negative.", null);
        }
        extractorInput.skipFully(position);
        bVarValueAt.fragment.fillEncryptionData(extractorInput);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private boolean readSample(ExtractorInput extractorInput) throws IOException {
        int iSampleData;
        b nextTrackBundle = this.currentTrackBundle;
        Throwable th2 = null;
        if (nextTrackBundle == null) {
            nextTrackBundle = getNextTrackBundle(this.trackBundles);
            if (nextTrackBundle == null) {
                int position = (int) (this.endOfMdatPosition - extractorInput.getPosition());
                if (position < 0) {
                    throw ParserException.createForMalformedContainer("Offset to end of mdat was negative.", null);
                }
                extractorInput.skipFully(position);
                enterReadingAtomHeaderState();
                return false;
            }
            int currentSampleOffset = (int) (nextTrackBundle.getCurrentSampleOffset() - extractorInput.getPosition());
            if (currentSampleOffset < 0) {
                Log.w(TAG, "Ignoring negative offset to sample data.");
                currentSampleOffset = 0;
            }
            extractorInput.skipFully(currentSampleOffset);
            this.currentTrackBundle = nextTrackBundle;
        }
        int i10 = 4;
        int i11 = 1;
        if (this.parserState == 3) {
            int currentSampleSize = nextTrackBundle.getCurrentSampleSize();
            this.sampleSize = currentSampleSize;
            if (nextTrackBundle.currentSampleIndex < nextTrackBundle.firstSampleToOutputIndex) {
                extractorInput.skipFully(currentSampleSize);
                nextTrackBundle.skipSampleEncryptionData();
                if (!nextTrackBundle.next()) {
                    this.currentTrackBundle = null;
                }
                this.parserState = 3;
                return true;
            }
            if (nextTrackBundle.moovSampleTable.track.sampleTransformation == 1) {
                this.sampleSize = currentSampleSize - 8;
                extractorInput.skipFully(8);
            }
            if ("audio/ac4".equals(nextTrackBundle.moovSampleTable.track.format.sampleMimeType)) {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 7);
                Ac4Util.getAc4SampleHeader(this.sampleSize, this.scratch);
                nextTrackBundle.output.sampleData(this.scratch, 7);
                this.sampleBytesWritten += 7;
            } else {
                this.sampleBytesWritten = nextTrackBundle.outputSampleEncryptionData(this.sampleSize, 0);
            }
            this.sampleSize += this.sampleBytesWritten;
            this.parserState = 4;
            this.sampleCurrentNalBytesRemaining = 0;
        }
        Track track = nextTrackBundle.moovSampleTable.track;
        TrackOutput trackOutput = nextTrackBundle.output;
        long currentSamplePresentationTimeUs = nextTrackBundle.getCurrentSamplePresentationTimeUs();
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster != null) {
            currentSamplePresentationTimeUs = timestampAdjuster.adjustSampleTimestamp(currentSamplePresentationTimeUs);
        }
        long j10 = currentSamplePresentationTimeUs;
        if (track.nalUnitLengthFieldLength == 0) {
            while (true) {
                int i12 = this.sampleBytesWritten;
                int i13 = this.sampleSize;
                if (i12 >= i13) {
                    break;
                }
                this.sampleBytesWritten += trackOutput.sampleData((DataReader) extractorInput, i13 - i12, false);
            }
        } else {
            byte[] data = this.nalPrefix.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i14 = track.nalUnitLengthFieldLength;
            int i15 = i14 + 1;
            int i16 = 4 - i14;
            while (this.sampleBytesWritten < this.sampleSize) {
                int i17 = this.sampleCurrentNalBytesRemaining;
                if (i17 == 0) {
                    extractorInput.readFully(data, i16, i15);
                    this.nalPrefix.setPosition(0);
                    int i18 = this.nalPrefix.readInt();
                    if (i18 < i11) {
                        throw ParserException.createForMalformedContainer("Invalid NAL length", th2);
                    }
                    this.sampleCurrentNalBytesRemaining = i18 - 1;
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, i10);
                    trackOutput.sampleData(this.nalPrefix, i11);
                    this.processSeiNalUnitPayload = (this.ceaTrackOutputs.length <= 0 || !NalUnitUtil.isNalUnitSei(track.format.sampleMimeType, data[i10])) ? 0 : i11;
                    this.sampleBytesWritten += 5;
                    this.sampleSize += i16;
                } else {
                    if (this.processSeiNalUnitPayload) {
                        this.nalBuffer.reset(i17);
                        extractorInput.readFully(this.nalBuffer.getData(), 0, this.sampleCurrentNalBytesRemaining);
                        trackOutput.sampleData(this.nalBuffer, this.sampleCurrentNalBytesRemaining);
                        iSampleData = this.sampleCurrentNalBytesRemaining;
                        int iUnescapeStream = NalUnitUtil.unescapeStream(this.nalBuffer.getData(), this.nalBuffer.limit());
                        this.nalBuffer.setPosition("video/hevc".equals(track.format.sampleMimeType) ? 1 : 0);
                        this.nalBuffer.setLimit(iUnescapeStream);
                        CeaUtil.consume(j10, this.nalBuffer, this.ceaTrackOutputs);
                    } else {
                        iSampleData = trackOutput.sampleData((DataReader) extractorInput, i17, false);
                    }
                    this.sampleBytesWritten += iSampleData;
                    this.sampleCurrentNalBytesRemaining -= iSampleData;
                    th2 = null;
                    i10 = 4;
                    i11 = 1;
                }
            }
        }
        int currentSampleFlags = nextTrackBundle.getCurrentSampleFlags();
        TrackEncryptionBox encryptionBoxIfEncrypted = nextTrackBundle.getEncryptionBoxIfEncrypted();
        trackOutput.sampleMetadata(j10, currentSampleFlags, this.sampleSize, 0, encryptionBoxIfEncrypted != null ? encryptionBoxIfEncrypted.cryptoData : null);
        outputPendingMetadataSamples(j10);
        if (!nextTrackBundle.next()) {
            this.currentTrackBundle = null;
        }
        this.parserState = 3;
        return true;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public ImmutableList<SniffFailure> getSniffFailureDetails() {
        return this.lastSniffFailures;
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = (this.flags & 32) == 0 ? new SubtitleTranscodingExtractorOutput(extractorOutput, this.subtitleParserFactory) : extractorOutput;
        enterReadingAtomHeaderState();
        initExtraTracks();
        Track track = this.sideloadedTrack;
        if (track != null) {
            this.trackBundles.put(0, new b(extractorOutput.track(0, track.type), new l(this.sideloadedTrack, new long[0], new int[0], 0, new long[0], new int[0], 0L), new ih.a(0, 0, 0, 0)));
            this.extractorOutput.endTracks();
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 == 1) {
                    readAtomPayload(extractorInput);
                } else if (i10 == 2) {
                    readEncryptionData(extractorInput);
                } else if (readSample(extractorInput)) {
                    return 0;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        int size = this.trackBundles.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.trackBundles.valueAt(i10).resetFragmentInfo();
        }
        this.pendingMetadataSampleInfos.clear();
        this.pendingMetadataSampleBytes = 0;
        this.pendingSeekTimeUs = j11;
        this.containerAtoms.clear();
        enterReadingAtomHeaderState();
    }

    private ih.a getDefaultSampleValues(SparseArray<ih.a> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (ih.a) Assertions.checkNotNull(sparseArray.get(i10));
    }

    @Nullable
    private static DrmInitData getDrmInitDataFromAtoms(List<io.bidmachine.media3.extractor.mp4.a.b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar = list.get(i10);
            if (bVar.type == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] data = bVar.data.getData();
                UUID uuid = PsshAtomUtil.parseUuid(data);
                if (uuid == null) {
                    Log.w(TAG, "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuid, "video/mp4", data));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    @Nullable
    private static b getNextTrackBundle(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            b bVarValueAt = sparseArray.valueAt(i10);
            if ((bVarValueAt.currentlyInFragment || bVarValueAt.currentSampleIndex != bVarValueAt.moovSampleTable.sampleCount) && (!bVarValueAt.currentlyInFragment || bVarValueAt.currentTrackRunIndex != bVarValueAt.fragment.trunCount)) {
                long currentSampleOffset = bVarValueAt.getCurrentSampleOffset();
                if (currentSampleOffset < j10) {
                    bVar = bVarValueAt;
                    j10 = currentSampleOffset;
                }
            }
        }
        return bVar;
    }

    private static void parseTraf(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, SparseArray<b> sparseArray, boolean z10, int i10, byte[] bArr) throws ParserException {
        String str;
        b tfhd = parseTfhd(((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1952868452))).data, sparseArray, z10);
        if (tfhd == null) {
            return;
        }
        k kVar = tfhd.fragment;
        long j10 = kVar.nextFragmentDecodeTime;
        boolean z11 = kVar.nextFragmentDecodeTimeIncludesMoov;
        tfhd.resetFragmentInfo();
        tfhd.currentlyInFragment = true;
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a.getLeafAtomOfType(1952867444);
        if (leafAtomOfType != null && (i10 & 2) == 0) {
            kVar.nextFragmentDecodeTime = parseTfdt(leafAtomOfType.data);
            kVar.nextFragmentDecodeTimeIncludesMoov = true;
        } else {
            kVar.nextFragmentDecodeTime = j10;
            kVar.nextFragmentDecodeTimeIncludesMoov = z11;
        }
        parseTruns(c0509a, tfhd, i10);
        TrackEncryptionBox sampleDescriptionEncryptionBox = tfhd.moovSampleTable.track.getSampleDescriptionEncryptionBox(((ih.a) Assertions.checkNotNull(kVar.header)).sampleDescriptionIndex);
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType2 = c0509a.getLeafAtomOfType(1935763834);
        if (leafAtomOfType2 != null) {
            parseSaiz((TrackEncryptionBox) Assertions.checkNotNull(sampleDescriptionEncryptionBox), leafAtomOfType2.data, kVar);
        }
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType3 = c0509a.getLeafAtomOfType(1935763823);
        if (leafAtomOfType3 != null) {
            parseSaio(leafAtomOfType3.data, kVar);
        }
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType4 = c0509a.getLeafAtomOfType(1936027235);
        if (leafAtomOfType4 != null) {
            parseSenc(leafAtomOfType4.data, kVar);
        }
        if (sampleDescriptionEncryptionBox != null) {
            str = sampleDescriptionEncryptionBox.schemeType;
        } else {
            str = null;
        }
        parseSampleGroups(c0509a, str, kVar);
        int size = c0509a.leafChildren.size();
        for (int i11 = 0; i11 < size; i11++) {
            io.bidmachine.media3.extractor.mp4.a.b bVar = c0509a.leafChildren.get(i11);
            if (bVar.type == 1970628964) {
                parseUuid(bVar.data, kVar, bArr);
            }
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        ImmutableList<SniffFailure> immutableListOf;
        SniffFailure sniffFailureSniffFragmented = j.sniffFragmented(extractorInput);
        if (sniffFailureSniffFragmented != null) {
            immutableListOf = ImmutableList.of(sniffFailureSniffFragmented);
        } else {
            immutableListOf = ImmutableList.of();
        }
        this.lastSniffFailures = immutableListOf;
        if (sniffFailureSniffFragmented == null) {
            return true;
        }
        return false;
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory) {
        this(factory, 0, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i10) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10 | 32, null, null, ImmutableList.of(), null);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i10) {
        this(factory, i10, null, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i10, @Nullable TimestampAdjuster timestampAdjuster) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10 | 32, timestampAdjuster, null, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i10, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10 | 32, timestampAdjuster, track, ImmutableList.of(), null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i10, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10 | 32, timestampAdjuster, track, list, null);
    }

    @Deprecated
    public FragmentedMp4Extractor(int i10, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this(SubtitleParser.Factory.UNSUPPORTED, i10 | 32, timestampAdjuster, track, list, trackOutput);
    }

    public FragmentedMp4Extractor(SubtitleParser.Factory factory, int i10, @Nullable TimestampAdjuster timestampAdjuster, @Nullable Track track, List<Format> list, @Nullable TrackOutput trackOutput) {
        this.subtitleParserFactory = factory;
        this.flags = i10;
        this.timestampAdjuster = timestampAdjuster;
        this.sideloadedTrack = track;
        this.closedCaptionFormats = Collections.unmodifiableList(list);
        this.additionalEmsgTrackOutput = trackOutput;
        this.eventMessageEncoder = new EventMessageEncoder();
        this.atomHeader = new ParsableByteArray(16);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalPrefix = new ParsableByteArray(5);
        this.nalBuffer = new ParsableByteArray();
        byte[] bArr = new byte[16];
        this.scratchBytes = bArr;
        this.scratch = new ParsableByteArray(bArr);
        this.containerAtoms = new ArrayDeque<>();
        this.pendingMetadataSampleInfos = new ArrayDeque<>();
        this.trackBundles = new SparseArray<>();
        this.lastSniffFailures = ImmutableList.of();
        this.durationUs = -9223372036854775807L;
        this.pendingSeekTimeUs = -9223372036854775807L;
        this.segmentIndexEarliestPresentationTimeUs = -9223372036854775807L;
        this.extractorOutput = ExtractorOutput.PLACEHOLDER;
        this.emsgTrackOutputs = new TrackOutput[0];
        this.ceaTrackOutputs = new TrackOutput[0];
    }
}
