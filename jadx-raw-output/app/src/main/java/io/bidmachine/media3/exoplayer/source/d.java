package io.bidmachine.media3.exoplayer.source;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.CryptoInfo;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.upstream.Allocation;
import io.bidmachine.media3.exoplayer.upstream.Allocator;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: compiled from: SampleDataQueue.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final Allocator allocator;
    private a firstAllocationNode;
    private a readAllocationNode;
    private final ParsableByteArray scratch;
    private long totalBytesWritten;
    private a writeAllocationNode;

    /* JADX INFO: compiled from: SampleDataQueue.java */
    public static final class a implements Allocator.AllocationNode {

        @Nullable
        public Allocation allocation;
        public long endPosition;

        @Nullable
        public a next;
        public long startPosition;

        public a clear() {
            this.allocation = null;
            a aVar = this.next;
            this.next = null;
            return aVar;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Allocator.AllocationNode
        public Allocation getAllocation() {
            return (Allocation) Assertions.checkNotNull(this.allocation);
        }

        public void initialize(Allocation allocation, a aVar) {
            this.allocation = allocation;
            this.next = aVar;
        }

        @Override // io.bidmachine.media3.exoplayer.upstream.Allocator.AllocationNode
        @Nullable
        public Allocator.AllocationNode next() {
            a aVar = this.next;
            if (aVar == null || aVar.allocation == null) {
                return null;
            }
            return aVar;
        }

        public void reset(long j10, int i10) {
            Assertions.checkState(this.allocation == null);
            this.startPosition = j10;
            this.endPosition = j10 + ((long) i10);
        }

        public int translateOffset(long j10) {
            return ((int) (j10 - this.startPosition)) + this.allocation.offset;
        }

        public a(long j10, int i10) {
            reset(j10, i10);
        }
    }

    private static a readData(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a nodeContainingPosition = getNodeContainingPosition(aVar, j10);
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (nodeContainingPosition.endPosition - j10));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
        int iPreAppend = preAppend(i10);
        a aVar = this.writeAllocationNode;
        int i11 = dataReader.read(aVar.allocation.data, aVar.translateOffset(this.totalBytesWritten), iPreAppend);
        if (i11 != -1) {
            postAppend(i11);
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    private void clearAllocationNodes(a aVar) {
        if (aVar.allocation == null) {
            return;
        }
        this.allocator.release(aVar);
        aVar.clear();
    }

    private static a getNodeContainingPosition(a aVar, long j10) {
        while (j10 >= aVar.endPosition) {
            aVar = aVar.next;
        }
        return aVar;
    }

    private void postAppend(int i10) {
        long j10 = this.totalBytesWritten + ((long) i10);
        this.totalBytesWritten = j10;
        a aVar = this.writeAllocationNode;
        if (j10 == aVar.endPosition) {
            this.writeAllocationNode = aVar.next;
        }
    }

    private int preAppend(int i10) {
        a aVar = this.writeAllocationNode;
        if (aVar.allocation == null) {
            aVar.initialize(this.allocator.allocate(), new a(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return Math.min(i10, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private static a readEncryptionData(a aVar, DecoderInputBuffer decoderInputBuffer, SampleQueue.b bVar, ParsableByteArray parsableByteArray) {
        long j10 = bVar.offset;
        int unsignedShort = 1;
        parsableByteArray.reset(1);
        a data = readData(aVar, j10, parsableByteArray.getData(), 1);
        long j11 = j10 + 1;
        byte b10 = parsableByteArray.getData()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        byte[] bArr = cryptoInfo.iv;
        if (bArr == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a data2 = readData(data, j11, cryptoInfo.iv, i10);
        long j12 = j11 + ((long) i10);
        if (z10) {
            parsableByteArray.reset(2);
            data2 = readData(data2, j12, parsableByteArray.getData(), 2);
            j12 += 2;
            unsignedShort = parsableByteArray.readUnsignedShort();
        }
        int i11 = unsignedShort;
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i11) {
            iArr = new int[i11];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i11) {
            iArr3 = new int[i11];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i12 = i11 * 6;
            parsableByteArray.reset(i12);
            data2 = readData(data2, j12, parsableByteArray.getData(), i12);
            j12 += (long) i12;
            parsableByteArray.setPosition(0);
            for (int i13 = 0; i13 < i11; i13++) {
                iArr2[i13] = parsableByteArray.readUnsignedShort();
                iArr4[i13] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar.size - ((int) (j12 - bVar.offset));
        }
        TrackOutput.CryptoData cryptoData = (TrackOutput.CryptoData) Util.castNonNull(bVar.cryptoData);
        cryptoInfo.set(i11, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        long j13 = bVar.offset;
        int i14 = (int) (j12 - j13);
        bVar.offset = j13 + ((long) i14);
        bVar.size -= i14;
        return data2;
    }

    public void discardDownstreamTo(long j10) {
        a aVar;
        if (j10 == -1) {
            return;
        }
        while (true) {
            aVar = this.firstAllocationNode;
            if (j10 < aVar.endPosition) {
                break;
            }
            this.allocator.release(aVar.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < aVar.startPosition) {
            this.readAllocationNode = aVar;
        }
    }

    public void discardUpstreamSampleBytes(long j10) {
        Assertions.checkArgument(j10 <= this.totalBytesWritten);
        this.totalBytesWritten = j10;
        if (j10 != 0) {
            a aVar = this.firstAllocationNode;
            if (j10 != aVar.startPosition) {
                while (this.totalBytesWritten > aVar.endPosition) {
                    aVar = aVar.next;
                }
                a aVar2 = (a) Assertions.checkNotNull(aVar.next);
                clearAllocationNodes(aVar2);
                a aVar3 = new a(aVar.endPosition, this.allocationLength);
                aVar.next = aVar3;
                if (this.totalBytesWritten == aVar.endPosition) {
                    aVar = aVar3;
                }
                this.writeAllocationNode = aVar;
                if (this.readAllocationNode == aVar2) {
                    this.readAllocationNode = aVar3;
                    return;
                }
                return;
            }
        }
        clearAllocationNodes(this.firstAllocationNode);
        a aVar4 = new a(this.totalBytesWritten, this.allocationLength);
        this.firstAllocationNode = aVar4;
        this.readAllocationNode = aVar4;
        this.writeAllocationNode = aVar4;
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public void peekToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.b bVar) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, bVar, this.scratch);
    }

    public void readToBuffer(DecoderInputBuffer decoderInputBuffer, SampleQueue.b bVar) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, bVar, this.scratch);
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        a aVar = this.firstAllocationNode;
        this.readAllocationNode = aVar;
        this.writeAllocationNode = aVar;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public d(Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new ParsableByteArray(32);
        a aVar = new a(0L, individualAllocationLength);
        this.firstAllocationNode = aVar;
        this.readAllocationNode = aVar;
        this.writeAllocationNode = aVar;
    }

    private static a readSampleData(a aVar, DecoderInputBuffer decoderInputBuffer, SampleQueue.b bVar, ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            aVar = readEncryptionData(aVar, decoderInputBuffer, bVar, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            a data = readData(aVar, bVar.offset, parsableByteArray.getData(), 4);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            bVar.offset += 4;
            bVar.size -= 4;
            decoderInputBuffer.ensureSpaceForWrite(unsignedIntToInt);
            a data2 = readData(data, bVar.offset, decoderInputBuffer.data, unsignedIntToInt);
            bVar.offset += (long) unsignedIntToInt;
            int i10 = bVar.size - unsignedIntToInt;
            bVar.size = i10;
            decoderInputBuffer.resetSupplementalData(i10);
            return readData(data2, bVar.offset, decoderInputBuffer.supplementalData, bVar.size);
        }
        decoderInputBuffer.ensureSpaceForWrite(bVar.size);
        return readData(aVar, bVar.offset, decoderInputBuffer.data, bVar.size);
    }

    private static a readData(a aVar, long j10, byte[] bArr, int i10) {
        a nodeContainingPosition = getNodeContainingPosition(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (nodeContainingPosition.endPosition - j10));
            System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    public void sampleData(ParsableByteArray parsableByteArray, int i10) {
        while (i10 > 0) {
            int iPreAppend = preAppend(i10);
            a aVar = this.writeAllocationNode;
            parsableByteArray.readBytes(aVar.allocation.data, aVar.translateOffset(this.totalBytesWritten), iPreAppend);
            i10 -= iPreAppend;
            postAppend(iPreAppend);
        }
    }
}
