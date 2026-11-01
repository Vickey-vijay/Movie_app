package ig;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.exoplayer.FormatHolder;
import io.bidmachine.media3.exoplayer.hls.HlsSampleStreamWrapper;
import io.bidmachine.media3.exoplayer.hls.SampleQueueMappingException;
import io.bidmachine.media3.exoplayer.source.SampleStream;
import java.io.IOException;

/* JADX INFO: compiled from: HlsSampleStream.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements SampleStream {
    private int sampleQueueIndex = -1;
    private final HlsSampleStreamWrapper sampleStreamWrapper;
    private final int trackGroupIndex;

    private boolean hasValidSampleQueueIndex() {
        int i10 = this.sampleQueueIndex;
        return (i10 == -1 || i10 == -3 || i10 == -2) ? false : true;
    }

    public void bindSampleQueue() {
        Assertions.checkArgument(this.sampleQueueIndex == -1);
        this.sampleQueueIndex = this.sampleStreamWrapper.bindSampleQueueToSampleStream(this.trackGroupIndex);
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleStream
    public boolean isReady() {
        return this.sampleQueueIndex == -3 || (hasValidSampleQueueIndex() && this.sampleStreamWrapper.isReady(this.sampleQueueIndex));
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleStream
    public void maybeThrowError() throws IOException {
        int i10 = this.sampleQueueIndex;
        if (i10 == -2) {
            throw new SampleQueueMappingException(this.sampleStreamWrapper.getTrackGroups().get(this.trackGroupIndex).getFormat(0).sampleMimeType);
        }
        if (i10 == -1) {
            this.sampleStreamWrapper.maybeThrowError();
        } else if (i10 != -3) {
            this.sampleStreamWrapper.maybeThrowError(i10);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleStream
    public int readData(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i10) {
        if (this.sampleQueueIndex == -3) {
            decoderInputBuffer.addFlag(4);
            return -4;
        }
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.readData(this.sampleQueueIndex, formatHolder, decoderInputBuffer, i10);
        }
        return -3;
    }

    public void unbindSampleQueue() {
        if (this.sampleQueueIndex != -1) {
            this.sampleStreamWrapper.unbindSampleQueue(this.trackGroupIndex);
            this.sampleQueueIndex = -1;
        }
    }

    public c(HlsSampleStreamWrapper hlsSampleStreamWrapper, int i10) {
        this.sampleStreamWrapper = hlsSampleStreamWrapper;
        this.trackGroupIndex = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.source.SampleStream
    public int skipData(long j10) {
        if (hasValidSampleQueueIndex()) {
            return this.sampleStreamWrapper.skipData(this.sampleQueueIndex, j10);
        }
        return 0;
    }
}
