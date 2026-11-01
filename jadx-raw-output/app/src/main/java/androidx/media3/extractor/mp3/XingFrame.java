package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* JADX INFO: loaded from: classes8.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    public long computeDurationUs() {
        long j10 = this.frameCount;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        MpegAudioUtil.Header header = this.header;
        return Util.sampleCountToDurationUs((j10 * ((long) header.samplesPerFrame)) - 1, header.sampleRate);
    }

    private XingFrame(MpegAudioUtil.Header header, long j10, long j11, @Nullable long[] jArr, int i10, int i11) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j10;
        this.dataSize = j11;
        this.tableOfContents = jArr;
        this.encoderDelay = i10;
        this.encoderPadding = i11;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int unsignedIntToInt;
        long unsignedInt;
        long[] jArr;
        int i10;
        int i11;
        int i12 = parsableByteArray.readInt();
        if ((i12 & 1) != 0) {
            unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = -1;
        }
        if ((i12 & 2) != 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = -1;
        }
        long j10 = unsignedInt;
        if ((i12 & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr2[i13] = parsableByteArray.readUnsignedByte();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((i12 & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24();
            i11 = unsignedInt24 & 4095;
            i10 = (16773120 & unsignedInt24) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new XingFrame(header, unsignedIntToInt, j10, jArr, i10, i11);
    }
}
