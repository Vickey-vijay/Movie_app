package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.ParsableBitArray;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i10, int i11, int i12, int i13, int i14) {
            this.bitstreamVersion = i10;
            this.channelCount = i11;
            this.sampleRate = i12;
            this.frameSize = i13;
            this.sampleCount = i14;
        }
    }

    private Ac4Util() {
    }

    public static void getAc4SampleHeader(int i10, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i10 >> 16) & 255);
        data[5] = (byte) ((i10 >> 8) & 255);
        data[6] = (byte) (i10 & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, @Nullable DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new Format.Builder().setId(str).setSampleMimeType("audio/ac4").setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i12 == 65535) {
            i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i10) {
        int i11 = 0;
        while (true) {
            int bits = i11 + parsableBitArray.readBits(i10);
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i11 = (bits + 1) << i10;
        }
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i10;
        int i11;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i10 = 7;
        } else {
            i10 = 4;
        }
        int i12 = bits2 + i10;
        if (bits == 44097) {
            i12 += 2;
        }
        int i13 = i12;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i14 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i15 = parsableBitArray.readBit() ? 48000 : 44100;
        int bits5 = parsableBitArray.readBits(4);
        int i16 = 0;
        if (i15 == 44100 && bits5 == 13) {
            i11 = SAMPLE_COUNT[bits5];
        } else {
            if (i15 == 48000) {
                int[] iArr = SAMPLE_COUNT;
                if (bits5 < iArr.length) {
                    i16 = iArr[bits5];
                    int i17 = bits4 % 5;
                    if (i17 == 1) {
                        if (bits5 != 3 || bits5 == 8) {
                            i16++;
                        }
                    } else if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 == 4 && (bits5 == 3 || bits5 == 8 || bits5 == 11)) {
                                i16++;
                            }
                        } else if (bits5 != 3) {
                            i16++;
                        } else {
                            i16++;
                        }
                    } else if (bits5 == 8 || bits5 == 11) {
                        i16++;
                    }
                }
            }
            i11 = i16;
        }
        return new SyncFrameInfo(i14, 2, i15, i13, i11);
    }
}
