package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MimeTypes;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.BitmapUtil;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.decoder.SimpleDecoder;
import io.bidmachine.media3.exoplayer.RendererCapabilities;
import io.bidmachine.media3.exoplayer.image.BitmapFactoryImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class BitmapFactoryImageDecoder extends SimpleDecoder<DecoderInputBuffer, ImageOutputBuffer, ImageDecoderException> implements ImageDecoder {
    private final BitmapDecoder bitmapDecoder;

    @VisibleForTesting(otherwise = 2)
    public interface BitmapDecoder {
        Bitmap decode(byte[] bArr, int i10) throws ImageDecoderException;
    }

    public static final class Factory implements ImageDecoder.Factory {
        private final BitmapDecoder bitmapDecoder;

        public Factory() {
            this.bitmapDecoder = new BitmapDecoder() { // from class: kg.a
                @Override // io.bidmachine.media3.exoplayer.image.BitmapFactoryImageDecoder.BitmapDecoder
                public final Bitmap decode(byte[] bArr, int i10) {
                    return BitmapFactoryImageDecoder.access$100(bArr, i10);
                }
            };
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageDecoder.Factory
        public BitmapFactoryImageDecoder createImageDecoder() {
            return new BitmapFactoryImageDecoder(this.bitmapDecoder, null);
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageDecoder.Factory
        public int supportsFormat(Format format) {
            String str = format.sampleMimeType;
            if (str == null || !MimeTypes.isImage(str)) {
                return RendererCapabilities.create(0);
            }
            return Util.isBitmapFactorySupportedMimeType(format.sampleMimeType) ? RendererCapabilities.create(4) : RendererCapabilities.create(1);
        }

        public Factory(BitmapDecoder bitmapDecoder) {
            this.bitmapDecoder = bitmapDecoder;
        }
    }

    public class a extends ImageOutputBuffer {
        public a() {
        }

        @Override // io.bidmachine.media3.decoder.DecoderOutputBuffer
        public void release() {
            BitmapFactoryImageDecoder.this.releaseOutputBuffer(this);
        }
    }

    public /* synthetic */ BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder, a aVar) {
        this(bitmapDecoder);
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder, io.bidmachine.media3.decoder.Decoder
    public String getName() {
        return "BitmapFactoryImageDecoder";
    }

    private BitmapFactoryImageDecoder(BitmapDecoder bitmapDecoder) {
        super(new DecoderInputBuffer[1], new ImageOutputBuffer[1]);
        this.bitmapDecoder = bitmapDecoder;
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder
    public DecoderInputBuffer createInputBuffer() {
        return new DecoderInputBuffer(1);
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder
    public ImageOutputBuffer createOutputBuffer() {
        return new a();
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder
    public ImageDecoderException createUnexpectedDecodeException(Throwable th2) {
        return new ImageDecoderException("Unexpected decode error", th2);
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder
    @Nullable
    public ImageDecoderException decode(DecoderInputBuffer decoderInputBuffer, ImageOutputBuffer imageOutputBuffer, boolean z10) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) Assertions.checkNotNull(decoderInputBuffer.data);
            Assertions.checkState(byteBuffer.hasArray());
            Assertions.checkArgument(byteBuffer.arrayOffset() == 0);
            imageOutputBuffer.bitmap = this.bitmapDecoder.decode(byteBuffer.array(), byteBuffer.remaining());
            imageOutputBuffer.timeUs = decoderInputBuffer.timeUs;
            return null;
        } catch (ImageDecoderException e10) {
            return e10;
        }
    }

    public static /* synthetic */ Bitmap access$100(byte[] bArr, int i10) throws ImageDecoderException {
        return decode(bArr, i10);
    }

    @Override // io.bidmachine.media3.decoder.SimpleDecoder, io.bidmachine.media3.decoder.Decoder
    @Nullable
    public /* bridge */ /* synthetic */ ImageOutputBuffer dequeueOutputBuffer() throws ImageDecoderException {
        return (ImageOutputBuffer) super.dequeueOutputBuffer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr, int i10) throws ImageDecoderException {
        try {
            return BitmapUtil.decode(bArr, i10, null);
        } catch (ParserException e10) {
            throw new ImageDecoderException("Could not decode image data with BitmapFactory. (data.length = " + bArr.length + ", input length = " + i10 + ")", e10);
        } catch (IOException e11) {
            throw new ImageDecoderException(e11);
        }
    }
}
