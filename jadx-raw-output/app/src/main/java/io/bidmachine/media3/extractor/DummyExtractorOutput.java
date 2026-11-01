package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        return new DiscardingTrackOutput();
    }
}
