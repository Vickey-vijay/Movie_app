package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i10, int i11, int i12, long j10, int i13) {
            this.mimeType = str;
            this.channelCount = i10;
            this.sampleRate = i11;
            this.frameSize = i12;
            this.frameDurationUs = j10;
            this.bitrate = i13;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    private DtsUtil() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
    public static int getDtsFrameSize(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        int i12;
        byte b11;
        boolean z10 = false;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i12 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b11 = bArr[9];
            } else if (b12 != 31) {
                i10 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b10 = bArr[7];
            } else {
                i12 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b11 = bArr[8];
            }
            i11 = (((b11 & 60) >> 2) | i12) + 1;
            z10 = true;
            if (z10) {
                return (i11 * 16) / 14;
            }
            return i11;
        }
        i10 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b10 = bArr[6];
        i11 = (((b10 & 240) >> 4) | i10) + 1;
        if (z10) {
            return (i11 * 16) / 14;
        }
        return i11;
    }

    public static int getFrameType(int i10) {
        if (i10 == SYNC_VALUE_BE || i10 == SYNC_VALUE_LE || i10 == SYNC_VALUE_14B_BE || i10 == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i10 == SYNC_VALUE_EXTSS_BE || i10 == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i10 == SYNC_VALUE_UHD_FTOC_SYNC_BE || i10 == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i10 == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i10 == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i10 = 0; i10 < bArrCopyOf.length - 1; i10 += 2) {
                byte b11 = bArrCopyOf[i10];
                int i11 = i10 + 1;
                bArrCopyOf[i10] = bArrCopyOf[i11];
                bArrCopyOf[i11] = b11;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b10 = bArr[0];
        return b10 == -2 || b10 == -1 || b10 == 37 || b10 == -14 || b10 == -24;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        byte b12 = bArr[0];
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (bArr[4] & 7) << 4;
                b11 = bArr[7];
            } else if (b12 != 31) {
                i10 = (bArr[4] & 1) << 6;
                b10 = bArr[5];
            } else {
                i10 = (bArr[5] & 7) << 4;
                b11 = bArr[6];
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (bArr[5] & 1) << 6;
        b10 = bArr[4];
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z10) {
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 3 && parsableBitArray.readBit(); i12++) {
            i11++;
        }
        if (z10) {
            int i13 = 0;
            while (i10 < i11) {
                i13 += 1 << iArr[i10];
                i10++;
            }
            i10 = i13;
        }
        return i10 + parsableBitArray.readBits(iArr[i11]);
    }

    private static void checkCrc(byte[] bArr, int i10) throws ParserException {
        int i11 = i10 - 2;
        if (((bArr[i10 - 1] & 255) | ((bArr[i11] << 8) & 65535)) != Util.crc16(bArr, 0, i11, 65535)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    public static Format parseDtsFormat(byte[] bArr, @Nullable String str, @Nullable String str2, int i10, @Nullable DrmInitData drmInitData) {
        int i11;
        int i12;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i13 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i14 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        if (bits >= iArr.length) {
            i11 = -1;
        } else {
            i11 = (iArr[bits] * 1000) / 2;
        }
        normalizedFrame.skipBits(10);
        if (normalizedFrame.readBits(2) > 0) {
            i12 = 1;
        } else {
            i12 = 0;
        }
        return new Format.Builder().setId(str).setSampleMimeType("audio/vnd.dts").setAverageBitrate(i11).setChannelCount(i13 + i12).setSampleRate(i14).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i10).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        int i10;
        int i11;
        int bits;
        int i12;
        int bits2;
        long jScaleLargeTimestamp;
        int i13;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits3 = normalizedFrame.readBits(2);
        if (!normalizedFrame.readBit()) {
            i10 = 16;
            i11 = 8;
        } else {
            i10 = 20;
            i11 = 12;
        }
        normalizedFrame.skipBits(i11);
        int bits4 = normalizedFrame.readBits(i10) + 1;
        boolean bit = normalizedFrame.readBit();
        int i14 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 == 1 && bits7 == 1) {
                int i15 = bits3 + 1;
                int bits8 = normalizedFrame.readBits(i15);
                for (int i16 = 0; i16 < i15; i16++) {
                    if (((bits8 >> i16) & 1) == 1) {
                        normalizedFrame.skipBits(8);
                    }
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(2);
                    int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                    int bits10 = normalizedFrame.readBits(2) + 1;
                    while (i14 < bits10) {
                        normalizedFrame.skipBits(bits9);
                        i14++;
                    }
                }
                i14 = bits5;
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i10);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            int i17 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            bits2 = normalizedFrame.readBits(8) + 1;
            i12 = i17;
        } else {
            i12 = -2147483647;
            bits2 = -1;
        }
        if (bit) {
            if (bits != 0) {
                if (bits != 1) {
                    if (bits == 2) {
                        i13 = 48000;
                    } else {
                        throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                    }
                } else {
                    i13 = 44100;
                }
            } else {
                i13 = 32000;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i14, 1000000L, i13);
        } else {
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        return new DtsHeader("audio/vnd.dts.hd;profile=lbr", bits2, i12, bits4, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        int i10;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        if (normalizedFrame.readBit()) {
            i10 = 12;
        } else {
            i10 = 8;
        }
        return normalizedFrame.readBits(i10) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int i10;
        int bits;
        int unsignedVarInt;
        int i11;
        int i12;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        if (normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int unsignedVarInt2 = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        long jScaleLargeTimestamp = -9223372036854775807L;
        if (i10 != 0) {
            if (normalizedFrame.readBit()) {
                checkCrc(bArr, unsignedVarInt2);
                int bits2 = normalizedFrame.readBits(2);
                if (bits2 != 0) {
                    if (bits2 != 1) {
                        if (bits2 == 2) {
                            i11 = 384;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                        }
                    } else {
                        i11 = 480;
                    }
                } else {
                    i11 = 512;
                }
                int bits3 = i11 * (normalizedFrame.readBits(3) + 1);
                int bits4 = normalizedFrame.readBits(2);
                if (bits4 != 0) {
                    if (bits4 != 1) {
                        if (bits4 == 2) {
                            i12 = 48000;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                        }
                    } else {
                        i12 = 44100;
                    }
                } else {
                    i12 = 32000;
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(36);
                }
                bits = (1 << normalizedFrame.readBits(2)) * i12;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(bits3, 1000000L, i12);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
        } else {
            bits = -2147483647;
        }
        long j10 = jScaleLargeTimestamp;
        int unsignedVarInt3 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            unsignedVarInt3 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        for (int i14 = 0; i14 < 1; i14++) {
            if (i10 != 0) {
                atomicInteger.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
            }
            if (atomicInteger.get() != 0) {
                unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true);
            } else {
                unsignedVarInt = 0;
            }
            unsignedVarInt3 += unsignedVarInt;
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, bits, unsignedVarInt2 + unsignedVarInt3, j10, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b12 = byteBuffer.get(iPosition);
        if (b12 != -2) {
            if (b12 == -1) {
                i10 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 7);
            } else if (b12 != 31) {
                i10 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b10 = byteBuffer.get(iPosition + 5);
            } else {
                i10 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b11 = byteBuffer.get(iPosition + 6);
            }
            i11 = b11 & 60;
            return (((i11 >> 2) | i10) + 1) * 32;
        }
        i10 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b10 = byteBuffer.get(iPosition + 4);
        i11 = b10 & 252;
        return (((i11 >> 2) | i10) + 1) * 32;
    }
}
