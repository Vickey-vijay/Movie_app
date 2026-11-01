package dh;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ForwardingExtractorInput;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends ForwardingExtractorInput {
    private final long startOffset;

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        super.setRetryPosition(j10 + this.startOffset, e10);
    }

    public b(ExtractorInput extractorInput, long j10) {
        boolean z10;
        super(extractorInput);
        if (extractorInput.getPosition() >= j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.startOffset = j10;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }
}
