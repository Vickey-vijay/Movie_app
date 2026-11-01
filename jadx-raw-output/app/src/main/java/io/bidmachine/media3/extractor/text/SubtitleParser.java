package io.bidmachine.media3.extractor.text;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.Consumer;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.text.CuesWithTiming;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface SubtitleParser {

    public interface Factory {
        public static final Factory UNSUPPORTED = new a();

        public class a implements Factory {
            @Override // io.bidmachine.media3.extractor.text.SubtitleParser.Factory
            public int getCueReplacementBehavior(Format format) {
                return 1;
            }

            @Override // io.bidmachine.media3.extractor.text.SubtitleParser.Factory
            public boolean supportsFormat(Format format) {
                return false;
            }

            @Override // io.bidmachine.media3.extractor.text.SubtitleParser.Factory
            public SubtitleParser create(Format format) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        SubtitleParser create(Format format);

        int getCueReplacementBehavior(Format format);

        boolean supportsFormat(Format format);
    }

    public static class OutputOptions {
        private static final OutputOptions ALL = new OutputOptions(-9223372036854775807L, false);
        public final boolean outputAllCues;
        public final long startTimeUs;

        public static OutputOptions allCues() {
            return ALL;
        }

        public static OutputOptions cuesAfterThenRemainingCuesBefore(long j10) {
            return new OutputOptions(j10, true);
        }

        public static OutputOptions onlyCuesAfter(long j10) {
            return new OutputOptions(j10, false);
        }

        private OutputOptions(long j10, boolean z10) {
            this.startTimeUs = j10;
            this.outputAllCues = z10;
        }
    }

    int getCueReplacementBehavior();

    void parse(byte[] bArr, int i10, int i11, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer);

    default void parse(byte[] bArr, OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        parse(bArr, 0, bArr.length, outputOptions, consumer);
    }

    default void reset() {
    }

    default Subtitle parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        final ImmutableList.a aVarBuilder = ImmutableList.builder();
        OutputOptions outputOptions = OutputOptions.ALL;
        Objects.requireNonNull(aVarBuilder);
        parse(bArr, i10, i11, outputOptions, new Consumer() { // from class: kh.d
            @Override // io.bidmachine.media3.common.util.Consumer
            public final void accept(Object obj) {
                aVarBuilder.a((CuesWithTiming) obj);
            }
        });
        return new CuesWithTimingSubtitle(aVarBuilder.m());
    }
}
