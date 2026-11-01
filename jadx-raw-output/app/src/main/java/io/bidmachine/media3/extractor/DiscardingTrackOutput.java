package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public final class DiscardingTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public /* bridge */ /* synthetic */ int sampleData(DataReader dataReader, int i10, boolean z10) throws IOException {
        return super.sampleData(dataReader, i10, z10);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i10, boolean z10, int i11) throws IOException {
        int i12 = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i10));
        if (i12 != -1) {
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public /* bridge */ /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i10) {
        super.sampleData(parsableByteArray, i10);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleMetadata(long j10, int i10, int i11, int i12, @Nullable TrackOutput.CryptoData cryptoData) {
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i10, int i11) {
        parsableByteArray.skipBytes(i10);
    }
}
