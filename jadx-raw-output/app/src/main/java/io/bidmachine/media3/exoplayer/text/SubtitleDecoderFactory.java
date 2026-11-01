package io.bidmachine.media3.exoplayer.text;

import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.text.DefaultSubtitleParserFactory;
import io.bidmachine.media3.extractor.text.SubtitleDecoder;
import io.bidmachine.media3.extractor.text.SubtitleParser;
import io.bidmachine.media3.extractor.text.cea.Cea608Decoder;
import io.bidmachine.media3.extractor.text.cea.Cea708Decoder;
import java.util.Objects;
import sg.b;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public interface SubtitleDecoderFactory {
    public static final SubtitleDecoderFactory DEFAULT = new a();

    public class a implements SubtitleDecoderFactory {
        private final DefaultSubtitleParserFactory delegate = new DefaultSubtitleParserFactory();

        @Override // io.bidmachine.media3.exoplayer.text.SubtitleDecoderFactory
        public SubtitleDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new Cea608Decoder(str, format.accessibilityChannel, 16000L);
                    case "application/cea-708":
                        return new Cea708Decoder(format.accessibilityChannel, format.initializationData);
                }
            }
            if (!this.delegate.supportsFormat(format)) {
                throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
            }
            SubtitleParser subtitleParserCreate = this.delegate.create(format);
            return new b(subtitleParserCreate.getClass().getSimpleName() + "Decoder", subtitleParserCreate);
        }

        @Override // io.bidmachine.media3.exoplayer.text.SubtitleDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return this.delegate.supportsFormat(format) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }
    }

    SubtitleDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
