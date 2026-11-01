package io.bidmachine.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.exoplayer.source.BundledExtractorsAdapter;
import io.bidmachine.media3.extractor.DefaultExtractorInput;
import io.bidmachine.media3.extractor.Extractor;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ExtractorOutput;
import io.bidmachine.media3.extractor.ExtractorsFactory;
import io.bidmachine.media3.extractor.PositionHolder;
import io.bidmachine.media3.extractor.mp3.Mp3Extractor;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    @Nullable
    private Extractor extractor;

    @Nullable
    private ExtractorInput extractorInput;
    private final ExtractorsFactory extractorsFactory;

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        Extractor extractor = this.extractor;
        if (extractor == null) {
            return;
        }
        Extractor underlyingImplementation = extractor.getUnderlyingImplementation();
        if (underlyingImplementation instanceof Mp3Extractor) {
            ((Mp3Extractor) underlyingImplementation).disableSeeking();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void init(DataReader dataReader, Uri uri, Map<String, List<String>> map, long j10, long j11, ExtractorOutput extractorOutput) throws IOException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataReader, j10, j11);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        Extractor[] extractorArrCreateExtractors = this.extractorsFactory.createExtractors(uri, map);
        ImmutableList.a aVarBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(extractorArrCreateExtractors.length);
        if (extractorArrCreateExtractors.length == 1) {
            this.extractor = extractorArrCreateExtractors[0];
        } else {
            for (Extractor extractor : extractorArrCreateExtractors) {
                try {
                    if (extractor.sniff(defaultExtractorInput)) {
                        this.extractor = extractor;
                        Assertions.checkState(true);
                        defaultExtractorInput.resetPeekPosition();
                        break;
                    } else {
                        aVarBuilderWithExpectedSize.k(extractor.getSniffFailureDetails());
                        boolean z10 = this.extractor != null || defaultExtractorInput.getPosition() == j10;
                        Assertions.checkState(z10);
                        defaultExtractorInput.resetPeekPosition();
                    }
                } catch (EOFException unused) {
                    if (this.extractor != null || defaultExtractorInput.getPosition() == j10) {
                    }
                } catch (Throwable th2) {
                    Assertions.checkState(this.extractor != null || defaultExtractorInput.getPosition() == j10);
                    defaultExtractorInput.resetPeekPosition();
                    throw th2;
                }
                Assertions.checkState(z10);
                defaultExtractorInput.resetPeekPosition();
            }
            if (this.extractor == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + m5.f.g(", ").d(Lists.m(ImmutableList.copyOf(extractorArrCreateExtractors), new m5.e() { // from class: og.a
                    @Override // m5.e
                    public final Object apply(Object obj) {
                        return BundledExtractorsAdapter.lambda$init$0((Extractor) obj);
                    }
                })) + ") could read the stream.", (Uri) Assertions.checkNotNull(uri), aVarBuilderWithExpectedSize.m());
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public int read(PositionHolder positionHolder) throws IOException {
        return ((Extractor) Assertions.checkNotNull(this.extractor)).read((ExtractorInput) Assertions.checkNotNull(this.extractorInput), positionHolder);
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // io.bidmachine.media3.exoplayer.source.ProgressiveMediaExtractor
    public void seek(long j10, long j11) {
        ((Extractor) Assertions.checkNotNull(this.extractor)).seek(j10, j11);
    }

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$init$0(Extractor extractor) {
        return extractor.getUnderlyingImplementation().getClass().getSimpleName();
    }
}
