package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public class ForwardingSeekMap implements SeekMap {
    private final SeekMap seekMap;

    @Override // io.bidmachine.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.seekMap.getDurationUs();
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        return this.seekMap.getSeekPoints(j10);
    }

    @Override // io.bidmachine.media3.extractor.SeekMap
    public boolean isSeekable() {
        return this.seekMap.isSeekable();
    }

    public ForwardingSeekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }
}
