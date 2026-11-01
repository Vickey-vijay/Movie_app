package io.bidmachine.media3.exoplayer.metadata;

import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.metadata.MetadataDecoder;
import io.bidmachine.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessageDecoder;
import io.bidmachine.media3.extractor.metadata.icy.IcyDecoder;
import io.bidmachine.media3.extractor.metadata.id3.Id3Decoder;
import io.bidmachine.media3.extractor.metadata.scte35.SpliceInfoDecoder;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public interface MetadataDecoderFactory {
    public static final MetadataDecoderFactory DEFAULT = new a();

    public class a implements MetadataDecoderFactory {
        @Override // io.bidmachine.media3.exoplayer.metadata.MetadataDecoderFactory
        public MetadataDecoder createDecoder(Format format) {
            String str = format.sampleMimeType;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder();
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }

        @Override // io.bidmachine.media3.exoplayer.metadata.MetadataDecoderFactory
        public boolean supportsFormat(Format format) {
            String str = format.sampleMimeType;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    MetadataDecoder createDecoder(Format format);

    boolean supportsFormat(Format format);
}
