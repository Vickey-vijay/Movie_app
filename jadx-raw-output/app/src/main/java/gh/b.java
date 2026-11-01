package gh;

import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.mkv.EbmlProcessor;
import java.io.IOException;

/* JADX INFO: compiled from: EbmlReader.java */
/* JADX INFO: loaded from: classes11.dex */
public interface b {
    void init(EbmlProcessor ebmlProcessor);

    boolean read(ExtractorInput extractorInput) throws IOException;

    void reset();
}
