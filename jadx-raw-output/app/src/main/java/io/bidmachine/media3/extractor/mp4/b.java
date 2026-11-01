package io.bidmachine.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.common.collect.ImmutableList;
import com.google.common.primitives.Ints;
import ih.l;
import io.bidmachine.media3.common.ColorInfo;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.CodecSpecificDataUtil;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.container.MdtaMetadataEntry;
import io.bidmachine.media3.container.Mp4LocationData;
import io.bidmachine.media3.container.Mp4TimestampData;
import io.bidmachine.media3.extractor.AacUtil;
import io.bidmachine.media3.extractor.Ac3Util;
import io.bidmachine.media3.extractor.Ac4Util;
import io.bidmachine.media3.extractor.AvcConfig;
import io.bidmachine.media3.extractor.DolbyVisionConfig;
import io.bidmachine.media3.extractor.ExtractorUtil;
import io.bidmachine.media3.extractor.GaplessInfoHolder;
import io.bidmachine.media3.extractor.HevcConfig;
import io.bidmachine.media3.extractor.OpusUtil;
import io.bidmachine.media3.extractor.VorbisUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: AtomParsers.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final String TAG = "AtomParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class a {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public boolean moveNext() {
            int i10 = this.index + 1;
            this.index = i10;
            if (i10 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i11 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i11;
                this.nextSamplesPerChunkChangeIndex = i11 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }

        public a(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z10) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z10;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.media3.extractor.mp4.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class C0510b {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public C0510b(String str, byte[] bArr, long j10, long j11) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j10;
            this.peakBitrate = j11;
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public interface c {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class e implements c {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int readNextSampleSize() {
            int i10 = this.fixedSampleSize;
            return i10 == -1 ? this.data.readUnsignedIntToInt() : i10;
        }

        public e(io.bidmachine.media3.extractor.mp4.a.b bVar, Format format) {
            ParsableByteArray parsableByteArray = bVar.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(b.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class f implements c {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // io.bidmachine.media3.extractor.mp4.b.c
        public int readNextSampleSize() {
            int i10 = this.fieldSize;
            if (i10 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i10 == 16) {
                return this.data.readUnsignedShort();
            }
            int i11 = this.sampleIndex;
            this.sampleIndex = i11 + 1;
            if (i11 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }

        public f(io.bidmachine.media3.extractor.mp4.a.b bVar) {
            ParsableByteArray parsableByteArray = bVar.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class g {
        private final long duration;

        /* JADX INFO: renamed from: id, reason: collision with root package name */
        private final int f59899id;
        private final int rotationDegrees;

        public g(int i10, long j10, int i11) {
            this.f59899id = i10;
            this.duration = j10;
            this.rotationDegrees = i11;
        }
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    private static boolean canTrimSamplesWithTimestampChange(int i10) {
        return i10 != 1;
    }

    private static int getTrackTypeForHdlr(int i10) {
        if (i10 == TYPE_soun) {
            return 1;
        }
        if (i10 == TYPE_vide) {
            return 2;
        }
        if (i10 == TYPE_text || i10 == TYPE_sbtl || i10 == TYPE_subt || i10 == TYPE_clcp) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008b  */
    /* JADX WARN: Code duplicated, block: B:86:0x013e  */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, boolean z10, @Nullable DrmInitData drmInitData, d dVar, int i14) throws ParserException {
        int unsignedShort;
        int unsignedShort2;
        int unsignedFixedPoint1616;
        int i15;
        int i16;
        char c10;
        int i17;
        int i18 = i11;
        int i19 = i12;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i18 + 8 + 8);
        if (z10) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i15 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i16 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            unsignedShort2 = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            boolean z11 = (unsignedIntToInt2 & 1) != 0;
            boolean z12 = (unsignedIntToInt2 & 2) != 0;
            if (z11) {
                if (unsignedIntToInt == 32) {
                    i16 = 4;
                } else {
                    i16 = -1;
                }
            } else if (unsignedIntToInt == 8) {
                i16 = 3;
            } else if (unsignedIntToInt == 16) {
                i16 = z12 ? 268435456 : 2;
            } else if (unsignedIntToInt == 24) {
                i16 = z12 ? 1342177280 : 21;
            } else if (unsignedIntToInt == 32) {
                i16 = z12 ? 1610612736 : 22;
            } else {
                i16 = -1;
            }
            parsableByteArray.skipBytes(8);
            i15 = 0;
        }
        int position = parsableByteArray.getPosition();
        int iIntValue = i10;
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i18, i19);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                dVar.trackEncryptionBoxes[i14] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str2 = "audio/mhm1";
        String str3 = "audio/raw";
        if (iIntValue == 1633889587) {
            str3 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str3 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str3 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str3 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str3 = "audio/vnd.dts.hd";
        } else if (iIntValue == 1685353317) {
            str3 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str3 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str3 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str3 = "audio/amr-wb";
        } else if (iIntValue == 1936684916) {
            i16 = 2;
        } else if (iIntValue == 1953984371) {
            i16 = 268435456;
        } else if (iIntValue == 1819304813) {
            if (i16 == -1) {
                i16 = 2;
            }
        } else if (iIntValue == 778924082 || iIntValue == 778924083) {
            str3 = "audio/mpeg";
        } else if (iIntValue == 1835557169) {
            str3 = "audio/mha1";
        } else if (iIntValue == 1835560241) {
            str3 = "audio/mhm1";
        } else if (iIntValue == 1634492771) {
            str3 = "audio/alac";
        } else if (iIntValue == 1634492791) {
            str3 = "audio/g711-alaw";
        } else if (iIntValue == 1970037111) {
            str3 = "audio/g711-mlaw";
        } else if (iIntValue == 1332770163) {
            str3 = "audio/opus";
        } else if (iIntValue == 1716281667) {
            str3 = "audio/flac";
        } else {
            str3 = iIntValue == 1835823201 ? "audio/true-hd" : null;
        }
        int i20 = i16;
        String str4 = str3;
        List<byte[]> listOf = null;
        String str5 = null;
        C0510b esdsFromParent = null;
        while (position - i18 < i19) {
            parsableByteArray.setPosition(position);
            int i21 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i21 > 0, "childAtomSize must be positive");
            int i22 = parsableByteArray.readInt();
            if (i22 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                if (Objects.equals(str4, str2)) {
                    i17 = 0;
                    str5 = String.format("mhm1.%02X", Integer.valueOf(unsignedByte));
                } else {
                    i17 = 0;
                    str5 = String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                }
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort3];
                parsableByteArray.readBytes(bArr, i17, unsignedShort3);
                listOf = listOf == null ? ImmutableList.of(bArr) : ImmutableList.of(bArr, listOf.get(i17));
            } else {
                str2 = str2;
                if (i22 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte2 > 0) {
                        byte[] bArr2 = new byte[unsignedByte2];
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                        listOf = listOf == null ? ImmutableList.of(bArr2) : ImmutableList.of(listOf.get(0), bArr2);
                    }
                } else {
                    if (i22 == 1702061171 || (z10 && i22 == 2002876005)) {
                        int iFindBoxPosition = i22 == 1702061171 ? position : findBoxPosition(parsableByteArray, 1702061171, position, i21);
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str4 = esdsFromParent.mimeType;
                            byte[] bArr3 = esdsFromParent.initializationData;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str4)) {
                                    listOf = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str4)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                        int i23 = audioSpecificConfig.sampleRateHz;
                                        int i24 = audioSpecificConfig.channelCount;
                                        str5 = audioSpecificConfig.codecs;
                                        unsignedFixedPoint1616 = i23;
                                        unsignedShort2 = i24;
                                    }
                                    listOf = ImmutableList.of(bArr3);
                                }
                            }
                        }
                    } else {
                        if (i22 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            dVar.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitDataCopyWithSchemeType);
                        } else if (i22 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            dVar.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i13), str, drmInitDataCopyWithSchemeType);
                        } else if (i22 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            dVar.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i13), str, drmInitDataCopyWithSchemeType);
                        } else if (i22 == 1684892784) {
                            if (i15 <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i15, null);
                            }
                            unsignedFixedPoint1616 = i15;
                            unsignedShort2 = 2;
                        } else if (i22 == 1684305011 || i22 == 1969517683) {
                            c10 = 24931;
                            dVar.format = new Format.Builder().setId(i13).setSampleMimeType(str4).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                        } else if (i22 == 1682927731) {
                            int i25 = i21 - 8;
                            byte[] bArr4 = opusMagic;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i25);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i25);
                            listOf = OpusUtil.buildInitializationData(bArrCopyOf);
                        } else if (i22 == 1684425825) {
                            int i26 = i21 - 12;
                            byte[] bArr5 = new byte[i26 + 4];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[2] = 97;
                            bArr5[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            parsableByteArray.readBytes(bArr5, 4, i26);
                            listOf = ImmutableList.of(bArr5);
                        } else {
                            c10 = 24931;
                            if (i22 == 1634492771) {
                                int i27 = i21 - 12;
                                byte[] bArr6 = new byte[i27];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i27);
                                Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                unsignedShort2 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                listOf = ImmutableList.of(bArr6);
                                unsignedFixedPoint1616 = iIntValue2;
                            }
                        }
                        c10 = 24931;
                    }
                    position += i21;
                    i18 = i11;
                    i19 = i12;
                    str2 = str2;
                }
            }
            position += i21;
            i18 = i11;
            i19 = i12;
            str2 = str2;
        }
        if (dVar.format != null || str4 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i13).setSampleMimeType(str4).setCodecs(str5).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i20).setInitializationData(listOf).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
        if (esdsFromParent != null) {
            language.setAverageBitrate(Ints.m(esdsFromParent.bitrate)).setPeakBitrate(Ints.m(esdsFromParent.peakBitrate));
        }
        dVar.format = language.build();
    }

    public static List<l> parseTraks(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, GaplessInfoHolder gaplessInfoHolder, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11, m5.e<Track, Track> eVar) throws ParserException {
        Track trackApply;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < c0509a.containerChildren.size(); i10++) {
            io.bidmachine.media3.extractor.mp4.a.C0509a c0509a2 = c0509a.containerChildren.get(i10);
            if (c0509a2.type == 1953653099 && (trackApply = eVar.apply(parseTrak(c0509a2, (io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1836476516)), j10, drmInitData, z10, z11))) != null) {
                arrayList.add(parseStbl(trackApply, (io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(((io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(((io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(c0509a2.getContainerAtomOfType(1835297121))).getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, int i14, @Nullable DrmInitData drmInitData, d dVar, int i15) throws ParserException {
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20 = i11;
        int i21 = i12;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        d dVar2 = dVar;
        int i22 = 8;
        parsableByteArray.setPosition(i20 + 8 + 8);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i20, i21);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                dVar2.trackEncryptionBoxes[i15] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str2 = "video/3gpp";
        if (iIntValue == 1831958048) {
            str = "video/mpeg";
        } else {
            str = iIntValue == 1211250227 ? "video/3gpp" : null;
        }
        float paspFromParent = 1.0f;
        List<byte[]> listOf = null;
        String str3 = null;
        byte[] projFromParent = null;
        int i23 = -1;
        int i24 = -1;
        int iIsoColorPrimariesToColorSpace = -1;
        int i25 = -1;
        int iIsoTransferCharacteristicsToColorTransfer = -1;
        ByteBuffer byteBuffer = null;
        C0510b esdsFromParent = null;
        boolean z10 = false;
        String str4 = str;
        int i26 = position;
        int i27 = 8;
        while (i26 - i20 < i21) {
            parsableByteArray.setPosition(i26);
            int position2 = parsableByteArray.getPosition();
            int i28 = parsableByteArray.readInt();
            if (i28 == 0 && parsableByteArray.getPosition() - i20 == i21) {
                break;
            }
            ExtractorUtil.checkContainerInput(i28 > 0, "childAtomSize must be positive");
            int i29 = parsableByteArray.readInt();
            if (i29 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List<byte[]> list = avcConfig.initializationData;
                dVar2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z10) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str5 = avcConfig.codecs;
                int i30 = avcConfig.maxNumReorderFrames;
                int i31 = avcConfig.colorSpace;
                int i32 = avcConfig.colorRange;
                int i33 = avcConfig.colorTransfer;
                int i34 = avcConfig.bitdepthLuma;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                i24 = i30;
                iIsoColorPrimariesToColorSpace = i31;
                i25 = i32;
                iIsoTransferCharacteristicsToColorTransfer = i33;
                str4 = "video/avc";
                listOf = list;
                str3 = str5;
                i27 = avcConfig.bitdepthChroma;
                i22 = i34;
            } else {
                if (i29 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list2 = hevcConfig.initializationData;
                    dVar2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z10) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i35 = hevcConfig.maxNumReorderPics;
                    String str6 = hevcConfig.codecs;
                    int i36 = hevcConfig.colorSpace;
                    listOf = list2;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    i24 = i35;
                    iIsoColorPrimariesToColorSpace = i36;
                    iIntValue = iIntValue;
                    str2 = str2;
                    i25 = hevcConfig.colorRange;
                    iIsoTransferCharacteristicsToColorTransfer = hevcConfig.colorTransfer;
                    str4 = "video/hevc";
                    i22 = hevcConfig.bitdepthLuma;
                    str3 = str6;
                    i27 = hevcConfig.bitdepthChroma;
                } else {
                    if (i29 == 1685480259 || i29 == 1685485123) {
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        i16 = i22;
                        i17 = i27;
                        iIntValue = iIntValue;
                        str2 = str2;
                        i18 = iIsoColorPrimariesToColorSpace;
                        i19 = iIsoTransferCharacteristicsToColorTransfer;
                        DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                        if (dolbyVisionConfig != null) {
                            str4 = "video/dolby-vision";
                            str3 = dolbyVisionConfig.codecs;
                        }
                    } else if (i29 == 1987076931) {
                        ExtractorUtil.checkContainerInput(str4 == null, null);
                        String str7 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                        parsableByteArray.setPosition(position2 + 12);
                        parsableByteArray.skipBytes(2);
                        int unsignedByte = parsableByteArray.readUnsignedByte();
                        i22 = unsignedByte >> 4;
                        boolean z11 = (unsignedByte & 1) != 0;
                        int unsignedByte2 = parsableByteArray.readUnsignedByte();
                        int unsignedByte3 = parsableByteArray.readUnsignedByte();
                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte2);
                        i25 = z11 ? 1 : 2;
                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte3);
                        str4 = str7;
                        i27 = i22;
                    } else if (i29 == 1635135811) {
                        int i37 = i28 - 8;
                        byte[] bArr = new byte[i37];
                        parsableByteArray.readBytes(bArr, 0, i37);
                        listOf = ImmutableList.of(bArr);
                        parsableByteArray.setPosition(position2 + 8);
                        ColorInfo av1c = parseAv1c(parsableByteArray);
                        int i38 = av1c.lumaBitdepth;
                        i27 = av1c.chromaBitdepth;
                        int i39 = av1c.colorSpace;
                        int i40 = av1c.colorRange;
                        str4 = "video/av01";
                        iIsoTransferCharacteristicsToColorTransfer = av1c.colorTransfer;
                        i22 = i38;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                        iIsoColorPrimariesToColorSpace = i39;
                        i25 = i40;
                    } else {
                        if (i29 == 1668050025) {
                            ByteBuffer byteBufferAllocateHdrStaticInfo = byteBuffer == null ? allocateHdrStaticInfo() : byteBuffer;
                            byteBufferAllocateHdrStaticInfo.position(21);
                            byteBufferAllocateHdrStaticInfo.putShort(parsableByteArray.readShort());
                            byteBufferAllocateHdrStaticInfo.putShort(parsableByteArray.readShort());
                            byteBuffer = byteBufferAllocateHdrStaticInfo;
                        } else if (i29 == 1835295606) {
                            ByteBuffer byteBufferAllocateHdrStaticInfo2 = byteBuffer == null ? allocateHdrStaticInfo() : byteBuffer;
                            short s10 = parsableByteArray.readShort();
                            short s11 = parsableByteArray.readShort();
                            short s12 = parsableByteArray.readShort();
                            short s13 = parsableByteArray.readShort();
                            short s14 = parsableByteArray.readShort();
                            short s15 = parsableByteArray.readShort();
                            int i41 = i27;
                            short s16 = parsableByteArray.readShort();
                            int i42 = i22;
                            short s17 = parsableByteArray.readShort();
                            long unsignedInt = parsableByteArray.readUnsignedInt();
                            long unsignedInt2 = parsableByteArray.readUnsignedInt();
                            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                            byteBufferAllocateHdrStaticInfo2.position(1);
                            byteBufferAllocateHdrStaticInfo2.putShort(s14);
                            byteBufferAllocateHdrStaticInfo2.putShort(s15);
                            byteBufferAllocateHdrStaticInfo2.putShort(s10);
                            byteBufferAllocateHdrStaticInfo2.putShort(s11);
                            byteBufferAllocateHdrStaticInfo2.putShort(s12);
                            byteBufferAllocateHdrStaticInfo2.putShort(s13);
                            byteBufferAllocateHdrStaticInfo2.putShort(s16);
                            byteBufferAllocateHdrStaticInfo2.putShort(s17);
                            byteBufferAllocateHdrStaticInfo2.putShort((short) (unsignedInt / 10000));
                            byteBufferAllocateHdrStaticInfo2.putShort((short) (unsignedInt2 / 10000));
                            byteBuffer = byteBufferAllocateHdrStaticInfo2;
                            i27 = i41;
                            i22 = i42;
                        } else {
                            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                            i16 = i22;
                            i17 = i27;
                            iIntValue = iIntValue;
                            str2 = str2;
                            if (i29 == 1681012275) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                str4 = str2;
                            } else if (i29 == 1702061171) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                String str8 = esdsFromParent.mimeType;
                                byte[] bArr2 = esdsFromParent.initializationData;
                                if (bArr2 != null) {
                                    listOf = ImmutableList.of(bArr2);
                                }
                                str4 = str8;
                            } else if (i29 == 1885434736) {
                                paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                i27 = i17;
                                i22 = i16;
                                z10 = true;
                            } else if (i29 == 1937126244) {
                                projFromParent = parseProjFromParent(parsableByteArray, position2, i28);
                            } else if (i29 == 1936995172) {
                                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                parsableByteArray.skipBytes(3);
                                if (unsignedByte4 == 0) {
                                    int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                    if (unsignedByte5 == 0) {
                                        i23 = 0;
                                    } else if (unsignedByte5 == 1) {
                                        i23 = 1;
                                    } else if (unsignedByte5 == 2) {
                                        i23 = 2;
                                    } else if (unsignedByte5 == 3) {
                                        i23 = 3;
                                    }
                                }
                            } else {
                                i18 = iIsoColorPrimariesToColorSpace;
                                if (i29 == 1668246642) {
                                    i19 = iIsoTransferCharacteristicsToColorTransfer;
                                    if (i18 == -1 && i19 == -1) {
                                        int i43 = parsableByteArray.readInt();
                                        if (i43 == TYPE_nclx || i43 == TYPE_nclc) {
                                            int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                            int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                            parsableByteArray.skipBytes(2);
                                            boolean z12 = i28 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                            iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                            i25 = z12 ? 1 : 2;
                                            iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                        } else {
                                            Log.w(TAG, "Unsupported color type: " + io.bidmachine.media3.extractor.mp4.a.getAtomTypeString(i43));
                                        }
                                    }
                                    i27 = i17;
                                    i22 = i16;
                                } else {
                                    i19 = iIsoTransferCharacteristicsToColorTransfer;
                                }
                            }
                            i27 = i17;
                            i22 = i16;
                        }
                        i26 += i28;
                        i20 = i11;
                        i21 = i12;
                        dVar2 = dVar;
                        iIntValue = iIntValue;
                        str2 = str2;
                        drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                    }
                    iIsoTransferCharacteristicsToColorTransfer = i19;
                    iIsoColorPrimariesToColorSpace = i18;
                    i27 = i17;
                    i22 = i16;
                    i26 += i28;
                    i20 = i11;
                    i21 = i12;
                    dVar2 = dVar;
                    iIntValue = iIntValue;
                    str2 = str2;
                    drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
                }
                i26 += i28;
                i20 = i11;
                i21 = i12;
                dVar2 = dVar;
                iIntValue = iIntValue;
                str2 = str2;
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
            }
            i26 += i28;
            i20 = i11;
            i21 = i12;
            dVar2 = dVar;
            iIntValue = iIntValue;
            str2 = str2;
            drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType;
        }
        DrmInitData drmInitData2 = drmInitDataCopyWithSchemeType;
        int i44 = i22;
        int i45 = i27;
        int i46 = iIsoColorPrimariesToColorSpace;
        int i47 = iIsoTransferCharacteristicsToColorTransfer;
        if (str4 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i13).setSampleMimeType(str4).setCodecs(str3).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i14).setProjectionData(projFromParent).setStereoMode(i23).setInitializationData(listOf).setMaxNumReorderSamples(i24).setDrmInitData(drmInitData2).setColorInfo(new ColorInfo.Builder().setColorSpace(i46).setColorRange(i25).setColorTransfer(i47).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : null).setLumaBitdepth(i44).setChromaBitdepth(i45).build());
        if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(Ints.m(esdsFromParent.bitrate)).setPeakBitrate(Ints.m(esdsFromParent.peakBitrate));
        }
        dVar.format = colorInfo.build();
    }

    /* JADX INFO: compiled from: AtomParsers.java */
    public static final class d {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public d(int i10) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i10];
        }
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= bits4; i10++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z10 = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z10 || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i10, int i11) throws ParserException {
        int i12 = i10 + 8;
        int i13 = -1;
        String string = null;
        Integer numValueOf = null;
        int i14 = 0;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i15 = parsableByteArray.readInt();
            int i16 = parsableByteArray.readInt();
            if (i16 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i16 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i16 == 1935894633) {
                i13 = i12;
                i14 = i15;
            }
            i12 += i15;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i13 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i13, i14, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static C0510b parseEsdsFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8 + 4);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new C0510b(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        return new C0510b(mimeTypeFromMp4ObjectType, bArr, unsignedInt2 > 0 ? unsignedInt2 : -1L, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i10) {
            Metadata.Entry ilstElement = ih.e.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static Pair<Long, String> parseMdhd(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 4 : 8);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        return Pair.create(Long.valueOf(unsignedInt), "" + ((char) (((unsignedShort >> 10) & 31) + 96)) + ((char) (((unsignedShort >> 5) & 31) + 96)) + ((char) ((unsignedShort & 31) + 96)));
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, d dVar) {
        parsableByteArray.setPosition(i11 + 8 + 8);
        if (i10 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                dVar.format = new Format.Builder().setId(i12).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.setPosition(i10 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            parsableByteArray.setPosition(i12);
            int i13 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i12, i13 + i12);
            }
            i12 += i13;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            parsableByteArray.setPosition(i14);
            int i15 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullAtomVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i12 = unsignedByte & 15;
                    i13 = (unsignedByte & 240) >> 4;
                }
                boolean z10 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z10 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z10, str, unsignedByte2, bArr2, i13, i12, bArr);
            }
            i14 += i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:149:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:150:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:154:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:156:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:164:0x040f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0411  */
    /* JADX WARN: Code duplicated, block: B:167:0x0415  */
    /* JADX WARN: Code duplicated, block: B:172:0x0431  */
    /* JADX WARN: Code duplicated, block: B:175:0x0436  */
    /* JADX WARN: Code duplicated, block: B:176:0x0439  */
    /* JADX WARN: Code duplicated, block: B:178:0x043c  */
    /* JADX WARN: Code duplicated, block: B:179:0x043f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0442  */
    /* JADX WARN: Code duplicated, block: B:182:0x0444  */
    /* JADX WARN: Code duplicated, block: B:184:0x0448  */
    /* JADX WARN: Code duplicated, block: B:185:0x044b  */
    /* JADX WARN: Code duplicated, block: B:189:0x045a  */
    /* JADX WARN: Code duplicated, block: B:191:0x0468  */
    /* JADX WARN: Code duplicated, block: B:192:0x0478  */
    /* JADX WARN: Code duplicated, block: B:195:0x0480  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:198:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:201:0x04be  */
    /* JADX WARN: Code duplicated, block: B:203:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:204:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:214:0x0426 A[EDGE_INSN: B:214:0x0426->B:169:0x0426 BREAK  A[LOOP:2: B:152:0x03c5->B:168:0x041f], SYNTHETIC] */
    private static l parseStbl(Track track, io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        c fVar;
        boolean z10;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        int i10;
        int i11;
        int i12;
        boolean z11;
        int i13;
        Track track2;
        int i14;
        long[] jArr;
        int[] iArr;
        int i15;
        long j10;
        long[] jArr2;
        int[] iArr2;
        int i16;
        int i17;
        int i18;
        int i19;
        long[] jArr3;
        boolean z12;
        int[] iArr3;
        int[] iArr4;
        long[] jArr4;
        int i20;
        boolean z13;
        int i21;
        int i22;
        long[] jArr5;
        long[] jArr6;
        int[] iArr5;
        int i23;
        boolean z14;
        long[] jArr7;
        int[] iArr6;
        int i24;
        int[] iArr7;
        long[] jArr8;
        int i25;
        int[] iArr8;
        long j11;
        int i26;
        long j12;
        int i27;
        int i28;
        int[] iArr9;
        int i29;
        int i30;
        long jScaleLargeTimestamp;
        int i31;
        long j13;
        boolean z15;
        int i32;
        int i33;
        int i34;
        boolean z16;
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a.getLeafAtomOfType(1937011578);
        if (leafAtomOfType != null) {
            fVar = new e(leafAtomOfType, track.format);
        } else {
            io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType2 = c0509a.getLeafAtomOfType(1937013298);
            if (leafAtomOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            fVar = new f(leafAtomOfType2);
        }
        int sampleCount = fVar.getSampleCount();
        if (sampleCount == 0) {
            return new l(track, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType3 = c0509a.getLeafAtomOfType(1937007471);
        if (leafAtomOfType3 == null) {
            leafAtomOfType3 = (io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1668232756));
            z10 = true;
        } else {
            z10 = false;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType3.data;
        ParsableByteArray parsableByteArray2 = ((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1937011555))).data;
        ParsableByteArray parsableByteArray3 = ((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1937011827))).data;
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType4 = c0509a.getLeafAtomOfType(1937011571);
        ParsableByteArray parsableByteArray4 = leafAtomOfType4 != null ? leafAtomOfType4.data : null;
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType5 = c0509a.getLeafAtomOfType(1668576371);
        ParsableByteArray parsableByteArray5 = leafAtomOfType5 != null ? leafAtomOfType5.data : null;
        a aVar = new a(parsableByteArray2, parsableByteArray, z10);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
            } else {
                unsignedIntToInt2 = -1;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
        }
        int fixedSampleSize = fVar.getFixedSampleSize();
        String str = track.format.sampleMimeType;
        if (fixedSampleSize != -1 && ("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0) {
            int i35 = aVar.length;
            long[] jArr9 = new long[i35];
            int[] iArr10 = new int[i35];
            while (aVar.moveNext()) {
                int i36 = aVar.index;
                jArr9[i36] = aVar.offset;
                iArr10[i36] = aVar.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr9, iArr10, unsignedIntToInt6);
            long[] jArr10 = resultsRechunk.offsets;
            int[] iArr11 = resultsRechunk.sizes;
            int i37 = resultsRechunk.maximumSize;
            long[] jArr11 = resultsRechunk.timestamps;
            int[] iArr12 = resultsRechunk.flags;
            long j14 = resultsRechunk.duration;
            track2 = track;
            i14 = sampleCount;
            jArr = jArr10;
            iArr = iArr11;
            i15 = i37;
            iArr2 = iArr12;
            j10 = j14;
            jArr2 = jArr11;
        } else {
            long[] jArrCopyOf = new long[sampleCount];
            int[] iArrCopyOf = new int[sampleCount];
            long[] jArrCopyOf2 = new long[sampleCount];
            int[] iArrCopyOf2 = new int[sampleCount];
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int unsignedIntToInt8 = 0;
            long j15 = 0;
            long j16 = 0;
            int i42 = unsignedIntToInt;
            int i43 = unsignedIntToInt6;
            int i44 = unsignedIntToInt5;
            int i45 = unsignedIntToInt4;
            int i46 = unsignedIntToInt3;
            while (true) {
                i10 = i45;
                if (i38 >= sampleCount) {
                    i11 = i44;
                    i12 = i41;
                    break;
                }
                long j17 = j16;
                int i47 = i41;
                boolean zMoveNext = true;
                while (i47 == 0) {
                    zMoveNext = aVar.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i48 = i44;
                    long j18 = aVar.offset;
                    i47 = aVar.numSamples;
                    j17 = j18;
                    i44 = i48;
                    i43 = i43;
                    sampleCount = sampleCount;
                }
                int i49 = sampleCount;
                i11 = i44;
                int i50 = i43;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i38);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i38);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i38);
                    iArrCopyOf2 = Arrays.copyOf(iArrCopyOf2, i38);
                    sampleCount = i38;
                    i12 = i47;
                    break;
                }
                if (parsableByteArray5 != null) {
                    while (unsignedIntToInt8 == 0 && i42 > 0) {
                        unsignedIntToInt8 = parsableByteArray5.readUnsignedIntToInt();
                        i40 = parsableByteArray5.readInt();
                        i42--;
                    }
                    unsignedIntToInt8--;
                }
                int i51 = i40;
                jArrCopyOf[i38] = j17;
                int nextSampleSize = fVar.readNextSampleSize();
                iArrCopyOf[i38] = nextSampleSize;
                if (nextSampleSize > i39) {
                    i39 = nextSampleSize;
                }
                jArrCopyOf2[i38] = j15 + ((long) i51);
                iArrCopyOf2[i38] = parsableByteArray4 == null ? 1 : 0;
                if (i38 == unsignedIntToInt7) {
                    iArrCopyOf2[i38] = 1;
                    i46--;
                    if (i46 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray4)).readUnsignedIntToInt() - 1;
                    }
                }
                int i52 = unsignedIntToInt7;
                j15 += (long) i50;
                int unsignedIntToInt9 = i11 - 1;
                if (unsignedIntToInt9 != 0 || i10 <= 0) {
                    i16 = i50;
                    i17 = i10;
                } else {
                    unsignedIntToInt9 = parsableByteArray3.readUnsignedIntToInt();
                    i16 = parsableByteArray3.readInt();
                    i17 = i10 - 1;
                }
                int i53 = unsignedIntToInt9;
                long j19 = j17 + ((long) iArrCopyOf[i38]);
                i41 = i47 - 1;
                i38++;
                j16 = j19;
                unsignedIntToInt7 = i52;
                i43 = i16;
                sampleCount = i49;
                i40 = i51;
                i45 = i17;
                i44 = i53;
            }
            long j20 = j15 + ((long) i40);
            if (parsableByteArray5 == null) {
                z11 = true;
                break;
            }
            while (true) {
                if (i42 <= 0) {
                    z11 = true;
                    break;
                }
                if (parsableByteArray5.readUnsignedIntToInt() != 0) {
                    z11 = false;
                    break;
                }
                parsableByteArray5.readInt();
                i42--;
            }
            if (i46 == 0 && i11 == 0 && i12 == 0 && i10 == 0) {
                i13 = unsignedIntToInt8;
                if (i13 == 0 && z11) {
                    track2 = track;
                }
                i14 = sampleCount;
                jArr = jArrCopyOf;
                iArr = iArrCopyOf;
                i15 = i39;
                j10 = j20;
                jArr2 = jArrCopyOf2;
                iArr2 = iArrCopyOf2;
            } else {
                i13 = unsignedIntToInt8;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Inconsistent stbl box for track ");
            track2 = track;
            sb2.append(track2.f59898id);
            sb2.append(": remainingSynchronizationSamples ");
            sb2.append(i46);
            sb2.append(", remainingSamplesAtTimestampDelta ");
            sb2.append(i11);
            sb2.append(", remainingSamplesInChunk ");
            sb2.append(i12);
            sb2.append(", remainingTimestampDeltaChanges ");
            sb2.append(i10);
            sb2.append(", remainingSamplesAtTimestampOffset ");
            sb2.append(i13);
            sb2.append(!z11 ? ", ctts invalid" : "");
            Log.w(TAG, sb2.toString());
            i14 = sampleCount;
            jArr = jArrCopyOf;
            iArr = iArrCopyOf;
            i15 = i39;
            j10 = j20;
            jArr2 = jArrCopyOf2;
            iArr2 = iArrCopyOf2;
        }
        long jScaleLargeTimestamp2 = Util.scaleLargeTimestamp(j10, 1000000L, track2.timescale);
        long[] jArr12 = track2.editListDurations;
        if (jArr12 == null) {
            Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
            return new l(track, jArr, iArr, i15, jArr2, iArr2, jScaleLargeTimestamp2);
        }
        if (jArr12.length == 1 && track2.type == 1 && jArr2.length >= 2) {
            long j21 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
            long jScaleLargeTimestamp3 = j21 + Util.scaleLargeTimestamp(track2.editListDurations[0], track2.timescale, track2.movieTimescale);
            i18 = i14;
            if (canApplyEditWithGaplessInfo(jArr2, j10, j21, jScaleLargeTimestamp3)) {
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j21 - jArr2[0], track2.format.sampleRate, track2.timescale);
                i19 = i15;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j10 - jScaleLargeTimestamp3, track2.format.sampleRate, track2.timescale);
                if ((jScaleLargeTimestamp4 != 0 || jScaleLargeTimestamp5 != 0) && jScaleLargeTimestamp4 <= 2147483647L && jScaleLargeTimestamp5 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp4;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp5;
                    Util.scaleLargeTimestampsInPlace(jArr2, 1000000L, track2.timescale);
                    return new l(track, jArr, iArr, i19, jArr2, iArr2, Util.scaleLargeTimestamp(track2.editListDurations[0], 1000000L, track2.movieTimescale));
                }
            }
            jArr3 = track2.editListDurations;
            if (jArr3.length != 1 && jArr3[0] == 0) {
                long j22 = ((long[]) Assertions.checkNotNull(track2.editListMediaTimes))[0];
                for (int i54 = 0; i54 < jArr2.length; i54++) {
                    jArr2[i54] = Util.scaleLargeTimestamp(jArr2[i54] - j22, 1000000L, track2.timescale);
                }
                return new l(track, jArr, iArr, i19, jArr2, iArr2, Util.scaleLargeTimestamp(j10 - j22, 1000000L, track2.timescale));
            }
            if (track2.type == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            iArr3 = new int[jArr3.length];
            iArr4 = new int[jArr3.length];
            jArr4 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
            i20 = 0;
            z13 = false;
            i21 = 0;
            i22 = 0;
            while (true) {
                jArr5 = track2.editListDurations;
                if (i20 < jArr5.length) {
                    break;
                }
                long[] jArr13 = jArr;
                int[] iArr13 = iArr;
                j13 = jArr4[i20];
                if (j13 != -1) {
                    i33 = i22;
                    boolean z17 = z13;
                    int i55 = i21;
                    long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(jArr5[i20], track2.timescale, track2.movieTimescale);
                    iArr3[i20] = Util.binarySearchFloor(jArr2, j13, true, true);
                    iArr4[i20] = Util.binarySearchCeil(jArr2, j13 + jScaleLargeTimestamp6, z12, false);
                    while (true) {
                        i34 = iArr3[i20];
                        i32 = iArr4[i20];
                        if (i34 >= i32 || (iArr2[i34] & 1) != 0) {
                            break;
                        }
                        iArr3[i20] = i34 + 1;
                    }
                    i21 = i55 + (i32 - i34);
                    if (i33 != i34) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z15 = z17 | z16;
                } else {
                    z15 = z13;
                    i32 = i22;
                }
                i20++;
                z13 = z15;
                i22 = i32;
                jArr = jArr13;
                iArr = iArr13;
            }
            jArr6 = jArr;
            iArr5 = iArr;
            boolean z18 = z13;
            i23 = 0;
            z14 = z18 | (i21 != i18);
            if (z14) {
                jArr7 = new long[i21];
            } else {
                jArr7 = jArr6;
            }
            if (z14) {
                iArr6 = new int[i21];
            } else {
                iArr6 = iArr5;
            }
            if (z14) {
                i24 = 0;
            } else {
                i24 = i19;
            }
            if (z14) {
                iArr7 = new int[i21];
            } else {
                iArr7 = iArr2;
            }
            jArr8 = new long[i21];
            i25 = i24;
            iArr8 = iArr5;
            j11 = 0;
            i26 = 0;
            while (i23 < track2.editListDurations.length) {
                j12 = track2.editListMediaTimes[i23];
                i27 = iArr3[i23];
                int[] iArr14 = iArr3;
                i28 = iArr4[i23];
                int[] iArr15 = iArr4;
                if (z14) {
                    int i56 = i28 - i27;
                    System.arraycopy(jArr6, i27, jArr7, i26, i56);
                    iArr9 = iArr8;
                    System.arraycopy(iArr9, i27, iArr6, i26, i56);
                    System.arraycopy(iArr2, i27, iArr7, i26, i56);
                } else {
                    iArr9 = iArr8;
                }
                i29 = i25;
                while (i27 < i28) {
                    i30 = i29;
                    int i57 = i28;
                    long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale);
                    long[] jArr14 = jArr2;
                    int[] iArr16 = iArr2;
                    jScaleLargeTimestamp = Util.scaleLargeTimestamp(jArr2[i27] - j12, 1000000L, track2.timescale);
                    int[] iArr17 = iArr7;
                    long j23 = j11;
                    if (canTrimSamplesWithTimestampChange(track2.type)) {
                        jScaleLargeTimestamp = Math.max(0L, jScaleLargeTimestamp);
                    }
                    jArr8[i26] = jScaleLargeTimestamp7 + jScaleLargeTimestamp;
                    if (z14) {
                        i31 = i30;
                        if (iArr6[i26] > i31) {
                            i29 = iArr9[i27];
                        }
                        i26++;
                        i27++;
                        i28 = i57;
                        jArr2 = jArr14;
                        iArr2 = iArr16;
                        j11 = j23;
                        iArr7 = iArr17;
                    } else {
                        i31 = i30;
                    }
                    i29 = i31;
                    i26++;
                    i27++;
                    i28 = i57;
                    jArr2 = jArr14;
                    iArr2 = iArr16;
                    j11 = j23;
                    iArr7 = iArr17;
                }
                long[] jArr15 = jArr2;
                long j24 = j11 + track2.editListDurations[i23];
                i23++;
                i25 = i29;
                iArr8 = iArr9;
                j11 = j24;
                iArr3 = iArr14;
                jArr2 = jArr15;
                iArr2 = iArr2;
                iArr4 = iArr15;
                jArr6 = jArr6;
                iArr7 = iArr7;
            }
            return new l(track, jArr7, iArr6, i25, jArr8, iArr7, Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale));
        }
        i18 = i14;
        i19 = i15;
        jArr3 = track2.editListDurations;
        if (jArr3.length != 1) {
        }
        if (track2.type == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        iArr3 = new int[jArr3.length];
        iArr4 = new int[jArr3.length];
        jArr4 = (long[]) Assertions.checkNotNull(track2.editListMediaTimes);
        i20 = 0;
        z13 = false;
        i21 = 0;
        i22 = 0;
        while (true) {
            jArr5 = track2.editListDurations;
            if (i20 < jArr5.length) {
                break;
                break;
            }
            long[] jArr16 = jArr;
            int[] iArr18 = iArr;
            j13 = jArr4[i20];
            if (j13 != -1) {
                i33 = i22;
                boolean z19 = z13;
                int i58 = i21;
                long jScaleLargeTimestamp8 = Util.scaleLargeTimestamp(jArr5[i20], track2.timescale, track2.movieTimescale);
                iArr3[i20] = Util.binarySearchFloor(jArr2, j13, true, true);
                iArr4[i20] = Util.binarySearchCeil(jArr2, j13 + jScaleLargeTimestamp8, z12, false);
                while (true) {
                    i34 = iArr3[i20];
                    i32 = iArr4[i20];
                    if (i34 >= i32) {
                        break;
                    }
                    break;
                    break;
                    iArr3[i20] = i34 + 1;
                }
                i21 = i58 + (i32 - i34);
                if (i33 != i34) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z15 = z19 | z16;
            } else {
                z15 = z13;
                i32 = i22;
            }
            i20++;
            z13 = z15;
            i22 = i32;
            jArr = jArr16;
            iArr = iArr18;
        }
        jArr6 = jArr;
        iArr5 = iArr;
        boolean z110 = z13;
        i23 = 0;
        z14 = z110 | (i21 != i18);
        if (z14) {
            jArr7 = new long[i21];
        } else {
            jArr7 = jArr6;
        }
        if (z14) {
            iArr6 = new int[i21];
        } else {
            iArr6 = iArr5;
        }
        if (z14) {
            i24 = 0;
        } else {
            i24 = i19;
        }
        if (z14) {
            iArr7 = new int[i21];
        } else {
            iArr7 = iArr2;
        }
        jArr8 = new long[i21];
        i25 = i24;
        iArr8 = iArr5;
        j11 = 0;
        i26 = 0;
        while (i23 < track2.editListDurations.length) {
            j12 = track2.editListMediaTimes[i23];
            i27 = iArr3[i23];
            int[] iArr19 = iArr3;
            i28 = iArr4[i23];
            int[] iArr110 = iArr4;
            if (z14) {
                int i59 = i28 - i27;
                System.arraycopy(jArr6, i27, jArr7, i26, i59);
                iArr9 = iArr8;
                System.arraycopy(iArr9, i27, iArr6, i26, i59);
                System.arraycopy(iArr2, i27, iArr7, i26, i59);
            } else {
                iArr9 = iArr8;
            }
            i29 = i25;
            while (i27 < i28) {
                i30 = i29;
                int i510 = i28;
                long jScaleLargeTimestamp9 = Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale);
                long[] jArr17 = jArr2;
                int[] iArr111 = iArr2;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(jArr2[i27] - j12, 1000000L, track2.timescale);
                int[] iArr112 = iArr7;
                long j25 = j11;
                if (canTrimSamplesWithTimestampChange(track2.type)) {
                    jScaleLargeTimestamp = Math.max(0L, jScaleLargeTimestamp);
                }
                jArr8[i26] = jScaleLargeTimestamp9 + jScaleLargeTimestamp;
                if (z14) {
                    i31 = i30;
                    if (iArr6[i26] > i31) {
                        i29 = iArr9[i27];
                    }
                    i26++;
                    i27++;
                    i28 = i510;
                    jArr2 = jArr17;
                    iArr2 = iArr111;
                    j11 = j25;
                    iArr7 = iArr112;
                } else {
                    i31 = i30;
                }
                i29 = i31;
                i26++;
                i27++;
                i28 = i510;
                jArr2 = jArr17;
                iArr2 = iArr111;
                j11 = j25;
                iArr7 = iArr112;
            }
            long[] jArr18 = jArr2;
            long j26 = j11 + track2.editListDurations[i23];
            i23++;
            i25 = i29;
            iArr8 = iArr9;
            j11 = j26;
            iArr3 = iArr19;
            jArr2 = jArr18;
            iArr2 = iArr2;
            iArr4 = iArr110;
            jArr6 = jArr6;
            iArr7 = iArr7;
        }
        return new l(track, jArr7, iArr6, i25, jArr8, iArr7, Util.scaleLargeTimestamp(j11, 1000000L, track2.movieTimescale));
    }

    private static d parseStsd(ParsableByteArray parsableByteArray, int i10, int i11, String str, @Nullable DrmInitData drmInitData, boolean z10) throws ParserException {
        int i12;
        parsableByteArray.setPosition(12);
        int i13 = parsableByteArray.readInt();
        d dVar = new d(i13);
        for (int i14 = 0; i14 < i13; i14++) {
            int position = parsableByteArray.getPosition();
            int i15 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i15 > 0, "childAtomSize must be positive");
            int i16 = parsableByteArray.readInt();
            if (i16 == 1635148593 || i16 == 1635148595 || i16 == 1701733238 || i16 == 1831958048 || i16 == 1836070006 || i16 == 1752589105 || i16 == 1751479857 || i16 == 1932670515 || i16 == 1211250227 || i16 == 1987063864 || i16 == 1987063865 || i16 == 1635135537 || i16 == 1685479798 || i16 == 1685479729 || i16 == 1685481573 || i16 == 1685481521) {
                i12 = position;
                parseVideoSampleEntry(parsableByteArray, i16, i12, i15, i10, i11, drmInitData, dVar, i14);
            } else if (i16 == 1836069985 || i16 == 1701733217 || i16 == 1633889587 || i16 == 1700998451 || i16 == 1633889588 || i16 == 1835823201 || i16 == 1685353315 || i16 == 1685353317 || i16 == 1685353320 || i16 == 1685353324 || i16 == 1685353336 || i16 == 1935764850 || i16 == 1935767394 || i16 == 1819304813 || i16 == 1936684916 || i16 == 1953984371 || i16 == 778924082 || i16 == 778924083 || i16 == 1835557169 || i16 == 1835560241 || i16 == 1634492771 || i16 == 1634492791 || i16 == 1970037111 || i16 == 1332770163 || i16 == 1716281667) {
                i12 = position;
                parseAudioSampleEntry(parsableByteArray, i16, position, i15, i10, str, z10, drmInitData, dVar, i14);
            } else {
                if (i16 == 1414810956 || i16 == 1954034535 || i16 == 2004251764 || i16 == 1937010800 || i16 == 1664495672) {
                    parseTextSampleEntry(parsableByteArray, i16, position, i15, i10, str, dVar);
                } else if (i16 == 1835365492) {
                    parseMetaDataSampleEntry(parsableByteArray, i16, position, i10, dVar);
                } else if (i16 == 1667329389) {
                    dVar.format = new Format.Builder().setId(i10).setSampleMimeType("application/x-camera-motion").build();
                }
                i12 = position;
            }
            parsableByteArray.setPosition(i12 + i15);
        }
        return dVar;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i10, int i11, int i12, int i13, String str, d dVar) {
        parsableByteArray.setPosition(i11 + 8 + 8);
        String str2 = "application/ttml+xml";
        ImmutableList immutableListOf = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i14 = (i12 - 8) - 8;
                byte[] bArr = new byte[i14];
                parsableByteArray.readBytes(bArr, 0, i14);
                immutableListOf = ImmutableList.of(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else {
                if (i10 != 1664495672) {
                    throw new IllegalStateException();
                }
                dVar.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        dVar.format = new Format.Builder().setId(i13).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j10).setInitializationData(immutableListOf).build();
    }

    private static g parseTkhd(ParsableByteArray parsableByteArray) {
        boolean z10;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullAtomVersion == 0 ? 8 : 16);
        int i10 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i11 = fullAtomVersion == 0 ? 4 : 8;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            if (i13 >= i11) {
                z10 = true;
                break;
            }
            if (parsableByteArray.getData()[position + i13] != -1) {
                z10 = false;
                break;
            }
            i13++;
        }
        long j10 = -9223372036854775807L;
        if (z10) {
            parsableByteArray.skipBytes(i11);
        } else {
            long unsignedInt = fullAtomVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
            if (unsignedInt != 0) {
                j10 = unsignedInt;
            }
        }
        parsableByteArray.skipBytes(16);
        int i14 = parsableByteArray.readInt();
        int i15 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i16 = parsableByteArray.readInt();
        int i17 = parsableByteArray.readInt();
        if (i14 == 0 && i15 == 65536 && i16 == -65536 && i17 == 0) {
            i12 = 90;
        } else if (i14 == 0 && i15 == -65536 && i16 == 65536 && i17 == 0) {
            i12 = 270;
        } else if (i14 == -65536 && i15 == 0 && i16 == 0 && i17 == -65536) {
            i12 = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
        }
        return new g(i10, j10, i12);
    }

    @Nullable
    private static Track parseTrak(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a, io.bidmachine.media3.extractor.mp4.a.b bVar, long j10, @Nullable DrmInitData drmInitData, boolean z10, boolean z11) throws ParserException {
        long[] jArr;
        long[] jArr2;
        io.bidmachine.media3.extractor.mp4.a.C0509a containerAtomOfType;
        Pair<long[], long[]> edts;
        io.bidmachine.media3.extractor.mp4.a.C0509a c0509a2 = (io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(c0509a.getContainerAtomOfType(1835297121));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a2.getLeafAtomOfType(1751411826))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        g tkhd = parseTkhd(((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a.getLeafAtomOfType(1953196132))).data);
        long j11 = j10 == -9223372036854775807L ? tkhd.duration : j10;
        long j12 = parseMvhd(bVar.data).timescale;
        long jScaleLargeTimestamp = j11 != -9223372036854775807L ? Util.scaleLargeTimestamp(j11, 1000000L, j12) : -9223372036854775807L;
        io.bidmachine.media3.extractor.mp4.a.C0509a c0509a3 = (io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(((io.bidmachine.media3.extractor.mp4.a.C0509a) Assertions.checkNotNull(c0509a2.getContainerAtomOfType(1835626086))).getContainerAtomOfType(1937007212));
        Pair<Long, String> mdhd = parseMdhd(((io.bidmachine.media3.extractor.mp4.a.b) Assertions.checkNotNull(c0509a2.getLeafAtomOfType(1835296868))).data);
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a3.getLeafAtomOfType(1937011556);
        if (leafAtomOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        d stsd = parseStsd(leafAtomOfType.data, tkhd.f59899id, tkhd.rotationDegrees, (String) mdhd.second, drmInitData, z11);
        if (z10 || (containerAtomOfType = c0509a.getContainerAtomOfType(1701082227)) == null || (edts = parseEdts(containerAtomOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        return new Track(tkhd.f59899id, trackTypeForHdlr, ((Long) mdhd.first).longValue(), j12, jScaleLargeTimestamp, stsd.format, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static Metadata parseUdta(io.bidmachine.media3.extractor.mp4.a.b bVar) {
        ParsableByteArray parsableByteArray = bVar.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i10 = parsableByteArray.readInt();
            int i11 = parsableByteArray.readInt();
            if (i11 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i10));
            } else if (i11 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i10));
            } else if (i11 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i10);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i10) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaAtomHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i10) {
            int position = parsableByteArray.getPosition();
            int i11 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i11);
            }
            parsableByteArray.setPosition(position + i11);
        }
        return null;
    }

    private b() {
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i10, int i11, int i12) throws ParserException {
        boolean z10;
        boolean z11;
        int position = parsableByteArray.getPosition();
        if (position >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        ExtractorUtil.checkContainerInput(z10, null);
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int i13 = parsableByteArray.readInt();
            if (i13 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ExtractorUtil.checkContainerInput(z11, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i10) {
                return position;
            }
            position += i13;
        }
        return -1;
    }

    public static void maybeSkipRemainingMetaAtomHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) {
        long unsignedInt;
        long j10;
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a.getLeafAtomOfType(1701606260);
        if (leafAtomOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType.data;
        parsableByteArray.setPosition(8);
        int fullAtomVersion = io.bidmachine.media3.extractor.mp4.a.parseFullAtomVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i10 = 0; i10 < unsignedIntToInt; i10++) {
            if (fullAtomVersion == 1) {
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                unsignedInt = parsableByteArray.readUnsignedInt();
            }
            jArr[i10] = unsignedInt;
            if (fullAtomVersion == 1) {
                j10 = parsableByteArray.readLong();
            } else {
                j10 = parsableByteArray.readInt();
            }
            jArr2[i10] = j10;
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i10 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i10 = (i10 << 7) | (unsignedByte & 127);
        }
        return i10;
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(io.bidmachine.media3.extractor.mp4.a.C0509a c0509a) {
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType = c0509a.getLeafAtomOfType(1751411826);
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType2 = c0509a.getLeafAtomOfType(1801812339);
        io.bidmachine.media3.extractor.mp4.a.b leafAtomOfType3 = c0509a.getLeafAtomOfType(1768715124);
        if (leafAtomOfType == null || leafAtomOfType2 == null || leafAtomOfType3 == null || parseHdlr(leafAtomOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafAtomOfType2.data;
        parsableByteArray.setPosition(12);
        int i10 = parsableByteArray.readInt();
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i11] = parsableByteArray.readString(i12 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafAtomOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i13 = parsableByteArray2.readInt();
            int i14 = parsableByteArray2.readInt() - 1;
            if (i14 >= 0 && i14 < i10) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = ih.e.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i13, strArr[i14]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i14);
            }
            parsableByteArray2.setPosition(position + i13);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i10, int i11) throws ParserException {
        boolean z10;
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i10 < i11) {
            parsableByteArray.setPosition(position);
            int i12 = parsableByteArray.readInt();
            if (i12 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ExtractorUtil.checkContainerInput(z10, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i12)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i12;
        }
        return null;
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s10 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s10);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }
}
