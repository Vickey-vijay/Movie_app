package io.bidmachine.media3.extractor.jpeg;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.SingleSampleExtractor;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public final class JpegExtractor implements Extractor {
    public static final int FLAG_READ_IMAGE = 1;
    private static final int JPEG_FILE_SIGNATURE = 65496;
    private static final int JPEG_FILE_SIGNATURE_LENGTH = 2;
    private final Extractor extractor;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public JpegExtractor() {
        this(0);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ List getSniffFailureDetails() {
        return super.getSniffFailureDetails();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public /* bridge */ /* synthetic */ Extractor getUnderlyingImplementation() {
        return super.getUnderlyingImplementation();
    }

    public JpegExtractor(int i10) {
        if ((i10 & 1) != 0) {
            this.extractor = new SingleSampleExtractor(65496, 2, "image/jpeg");
        } else {
            this.extractor = new dh.a();
        }
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractor.init(extractorOutput);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.extractor.read(extractorInput, positionHolder);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void release() {
        this.extractor.release();
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public void seek(long j10, long j11) {
        this.extractor.seek(j10, j11);
    }

    @Override // io.bidmachine.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        return this.extractor.sniff(extractorInput);
    }
}
