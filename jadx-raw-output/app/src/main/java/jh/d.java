package jh;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorUtil;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: OggPacket.java */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    private boolean populated;
    private int segmentCount;
    private final e pageHeader = new e();
    private final ParsableByteArray packetArray = new ParsableByteArray(new byte[65025], 0);
    private int currentSegmentIndex = -1;

    private int calculatePacketSize(int i10) {
        int i11;
        int i12 = 0;
        this.segmentCount = 0;
        do {
            int i13 = this.segmentCount;
            int i14 = i10 + i13;
            e eVar = this.pageHeader;
            if (i14 >= eVar.pageSegmentCount) {
                break;
            }
            int[] iArr = eVar.laces;
            this.segmentCount = i13 + 1;
            i11 = iArr[i13 + i10];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public boolean populate(ExtractorInput extractorInput) throws IOException {
        int i10;
        Assertions.checkState(extractorInput != null);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset(0);
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.skipToNextPage(extractorInput) || !this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                e eVar = this.pageHeader;
                int iCalculatePacketSize = eVar.headerSize;
                if ((eVar.type & 1) == 1 && this.packetArray.limit() == 0) {
                    iCalculatePacketSize += calculatePacketSize(0);
                    i10 = this.segmentCount + 0;
                } else {
                    i10 = 0;
                }
                if (!ExtractorUtil.skipFullyQuietly(extractorInput, iCalculatePacketSize)) {
                    return false;
                }
                this.currentSegmentIndex = i10;
            }
            int iCalculatePacketSize2 = calculatePacketSize(this.currentSegmentIndex);
            int i11 = this.currentSegmentIndex + this.segmentCount;
            if (iCalculatePacketSize2 > 0) {
                ParsableByteArray parsableByteArray = this.packetArray;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + iCalculatePacketSize2);
                if (!ExtractorUtil.readFullyQuietly(extractorInput, this.packetArray.getData(), this.packetArray.limit(), iCalculatePacketSize2)) {
                    return false;
                }
                ParsableByteArray parsableByteArray2 = this.packetArray;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + iCalculatePacketSize2);
                this.populated = this.pageHeader.laces[i11 + (-1)] != 255;
            }
            if (i11 == this.pageHeader.pageSegmentCount) {
                i11 = -1;
            }
            this.currentSegmentIndex = i11;
        }
        return true;
    }

    public e getPageHeader() {
        return this.pageHeader;
    }

    public ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public void reset() {
        this.pageHeader.reset();
        this.packetArray.reset(0);
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public void trimPayload() {
        if (this.packetArray.getData().length == 65025) {
            return;
        }
        ParsableByteArray parsableByteArray = this.packetArray;
        parsableByteArray.reset(Arrays.copyOf(parsableByteArray.getData(), Math.max(65025, this.packetArray.limit())), this.packetArray.limit());
    }
}
