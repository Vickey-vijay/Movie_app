package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
@Deprecated
public final class DummyTrackOutput implements TrackOutput {
    private final DiscardingTrackOutput discardingTrackOutput = new DiscardingTrackOutput();

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i10, z10);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void format(Format format) {
        this.discardingTrackOutput.format(format);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i10) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i10);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
        this.discardingTrackOutput.sampleMetadata(j10, i10, i11, i12, cryptoData);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i10, z10, i11);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i10, i11);
    }
}
