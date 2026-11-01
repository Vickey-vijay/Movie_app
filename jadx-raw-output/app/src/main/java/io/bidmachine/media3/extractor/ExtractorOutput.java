package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = new a();

    public class a implements ExtractorOutput {
        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public TrackOutput track(int i10, int i11) {
            throw new UnsupportedOperationException();
        }
    }

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i10, int i11);
}
