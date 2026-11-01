package ah;

import io.bidmachine.media3.common.util.ParsableByteArray;

/* JADX INFO: compiled from: AviMainHeaderChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements a {
    private static final int AVIF_HAS_INDEX = 16;
    public final int flags;
    public final int frameDurationUs;
    public final int streams;
    public final int totalFrames;

    @Override // ah.a
    public int getType() {
        return 1751742049;
    }

    public boolean hasIndex() {
        return (this.flags & 16) == 16;
    }

    private b(int i10, int i11, int i12, int i13) {
        this.frameDurationUs = i10;
        this.flags = i11;
        this.totalFrames = i12;
        this.streams = i13;
    }

    public static b parseFrom(ParsableByteArray parsableByteArray) {
        int littleEndianInt = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(8);
        int littleEndianInt2 = parsableByteArray.readLittleEndianInt();
        int littleEndianInt3 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(4);
        int littleEndianInt4 = parsableByteArray.readLittleEndianInt();
        parsableByteArray.skipBytes(12);
        return new b(littleEndianInt, littleEndianInt2, littleEndianInt3, littleEndianInt4);
    }
}
