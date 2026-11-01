package ah;

import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;

/* JADX INFO: compiled from: AviStreamHeaderChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements a {
    private static final String TAG = "AviStreamHeaderChunk";
    public final int initialFrames;
    public final int length;
    public final int rate;
    public final int scale;
    public final int streamType;
    public final int suggestedBufferSize;

    @Override // ah.a
    public int getType() {
        return 1752331379;
    }

    public long getDurationUs() {
        return Util.scaleLargeTimestamp(this.length, ((long) this.scale) * 1000000, this.rate);
    }

    public float getFrameRate() {
        return this.rate / this.scale;
    }

    public int getTrackType() {
        int i10 = this.streamType;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        Log.w(TAG, "Found unsupported streamType fourCC: " + Integer.toHexString(this.streamType));
        return -1;
    }

    private c(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.streamType = i10;
        this.initialFrames = i11;
        this.scale = i12;
        this.rate = i13;
        this.length = i14;
        this.suggestedBufferSize = i15;
    }

    public static c parseFrom(ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt5 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt6 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        return new c(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4, littleEndianInt5, littleEndianInt6);
    }
}
