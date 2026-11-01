package jh;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.FlacFrameReader;
import io.bidmachine.media3.extractor.FlacMetadataReader;
import io.bidmachine.media3.extractor.FlacSeekTableSeekMap;
import io.bidmachine.media3.extractor.FlacStreamMetadata;
import io.bidmachine.media3.extractor.SeekMap;
import java.util.Arrays;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends h {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;

    @Nullable
    private a flacOggSeeker;

    @Nullable
    private FlacStreamMetadata streamMetadata;

    /* JADX INFO: compiled from: FlacReader.java */
    public static final class a implements f {
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private FlacStreamMetadata.SeekTable seekTable;
        private FlacStreamMetadata streamMetadata;

        @Override // jh.f
        public SeekMap createSeekMap() {
            Assertions.checkState(this.firstFrameOffset != -1);
            return new FlacSeekTableSeekMap(this.streamMetadata, this.firstFrameOffset);
        }

        @Override // jh.f
        public long read(ExtractorInput extractorInput) {
            long j10 = this.pendingSeekGranule;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.pendingSeekGranule = -1L;
            return j11;
        }

        public void setFirstFrameOffset(long j10) {
            this.firstFrameOffset = j10;
        }

        @Override // jh.f
        public void startSeek(long j10) {
            long[] jArr = this.seekTable.pointSampleNumbers;
            this.pendingSeekGranule = jArr[Util.binarySearchFloor(jArr, j10, true, true)];
        }

        public a(FlacStreamMetadata flacStreamMetadata, FlacStreamMetadata.SeekTable seekTable) {
            this.streamMetadata = flacStreamMetadata;
            this.seekTable = seekTable;
        }
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int getFlacFrameBlockSize(ParsableByteArray parsableByteArray) {
        int i10 = (parsableByteArray.getData()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            parsableByteArray.skipBytes(4);
            parsableByteArray.readUtf8EncodedLong();
        }
        int frameBlockSizeSamplesFromKey = FlacFrameReader.readFrameBlockSizeSamplesFromKey(parsableByteArray, i10);
        parsableByteArray.setPosition(0);
        return frameBlockSizeSamplesFromKey;
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563) {
            return true;
        }
        return false;
    }

    @Override // jh.h
    public long preparePayload(ParsableByteArray parsableByteArray) {
        if (!isAudioPacket(parsableByteArray.getData())) {
            return -1L;
        }
        return getFlacFrameBlockSize(parsableByteArray);
    }

    @Override // jh.h
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j10, h.b bVar) {
        byte[] data = parsableByteArray.getData();
        FlacStreamMetadata flacStreamMetadata = this.streamMetadata;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(data, 17);
            this.streamMetadata = flacStreamMetadata2;
            bVar.format = flacStreamMetadata2.getFormat(Arrays.copyOfRange(data, 9, parsableByteArray.limit()), null);
            return true;
        }
        if ((data[0] & 127) == 3) {
            FlacStreamMetadata.SeekTable seekTableMetadataBlock = FlacMetadataReader.readSeekTableMetadataBlock(parsableByteArray);
            FlacStreamMetadata flacStreamMetadataCopyWithSeekTable = flacStreamMetadata.copyWithSeekTable(seekTableMetadataBlock);
            this.streamMetadata = flacStreamMetadataCopyWithSeekTable;
            this.flacOggSeeker = new a(flacStreamMetadataCopyWithSeekTable, seekTableMetadataBlock);
            return true;
        }
        if (!isAudioPacket(data)) {
            return true;
        }
        a aVar = this.flacOggSeeker;
        if (aVar != null) {
            aVar.setFirstFrameOffset(j10);
            bVar.oggSeeker = this.flacOggSeeker;
        }
        Assertions.checkNotNull(bVar.format);
        return false;
    }

    @Override // jh.h
    public void reset(boolean z10) {
        super.reset(z10);
        if (z10) {
            this.streamMetadata = null;
            this.flacOggSeeker = null;
        }
    }
}
