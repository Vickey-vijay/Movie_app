package io.bidmachine.media3.extractor.jpeg;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ForwardingSeekMap;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.SeekPoint;
import io.bidmachine.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput extractorOutput;
    private final long startOffset;

    public class a extends ForwardingSeekMap {
        public final /* synthetic */ SeekMap val$seekMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SeekMap seekMap, SeekMap seekMap2) {
            super(seekMap);
            this.val$seekMap = seekMap2;
        }

        @Override // io.bidmachine.media3.extractor.ForwardingSeekMap, io.bidmachine.media3.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            SeekMap.SeekPoints seekPoints = this.val$seekMap.getSeekPoints(j10);
            SeekPoint seekPoint = seekPoints.first;
            SeekPoint seekPoint2 = new SeekPoint(seekPoint.timeUs, seekPoint.position + StartOffsetExtractorOutput.this.startOffset);
            SeekPoint seekPoint3 = seekPoints.second;
            return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.timeUs, seekPoint3.position + StartOffsetExtractorOutput.this.startOffset));
        }
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.extractorOutput.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.extractorOutput.seekMap(new a(seekMap, seekMap));
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        return this.extractorOutput.track(i10, i11);
    }

    public StartOffsetExtractorOutput(long j10, ExtractorOutput extractorOutput) {
        this.startOffset = j10;
        this.extractorOutput = extractorOutput;
    }
}
