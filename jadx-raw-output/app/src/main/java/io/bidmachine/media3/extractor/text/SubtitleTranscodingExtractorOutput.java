package io.bidmachine.media3.extractor.text;

import android.util.SparseArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.SeekMap;
import io.bidmachine.media3.extractor.TrackOutput;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    private final ExtractorOutput delegate;
    private final SubtitleParser.Factory subtitleParserFactory;
    private final SparseArray<a> textTrackOutputs = new SparseArray<>();

    public void resetSubtitleParsers() {
        for (int i10 = 0; i10 < this.textTrackOutputs.size(); i10++) {
            this.textTrackOutputs.valueAt(i10).resetSubtitleParser();
        }
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public TrackOutput track(int i10, int i11) {
        if (i11 != 3) {
            return this.delegate.track(i10, i11);
        }
        a aVar = this.textTrackOutputs.get(i10);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this.delegate.track(i10, i11), this.subtitleParserFactory);
        this.textTrackOutputs.put(i10, aVar2);
        return aVar2;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void endTracks() {
        this.delegate.endTracks();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorOutput
    public void seekMap(SeekMap seekMap) {
        this.delegate.seekMap(seekMap);
    }

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.delegate = extractorOutput;
        this.subtitleParserFactory = factory;
    }
}
