package io.bidmachine.media3.exoplayer.image;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.Decoder;
import io.bidmachine.media3.decoder.DecoderException;
import io.bidmachine.media3.decoder.DecoderInputBuffer;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface ImageDecoder extends Decoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> {

    public interface Factory {
        public static final Factory DEFAULT = new BitmapFactoryImageDecoder.Factory();

        ImageDecoder createImageDecoder();

        int supportsFormat(Format format);
    }

    @Override // io.bidmachine.media3.decoder.Decoder
    @Nullable
    /* synthetic */ DecoderInputBuffer dequeueInputBuffer() throws DecoderException;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.decoder.Decoder
    @Nullable
    ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException;

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void flush();

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ String getName();

    @Override // io.bidmachine.media3.decoder.Decoder
    void queueInputBuffer(DecoderInputBuffer decoderInputBuffer) throws ImageDecoderException;

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void release();

    @Override // io.bidmachine.media3.decoder.Decoder
    /* synthetic */ void setOutputStartTimeUs(long j10);
}
