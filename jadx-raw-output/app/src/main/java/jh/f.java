package jh;

import androidx.annotation.Nullable;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.SeekMap;
import java.io.IOException;

/* JADX INFO: compiled from: OggSeeker.java */
/* JADX INFO: loaded from: classes8.dex */
public interface f {
    @Nullable
    SeekMap createSeekMap();

    long read(ExtractorInput extractorInput) throws IOException;

    void startSeek(long j10);
}
