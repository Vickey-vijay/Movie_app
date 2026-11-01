package io.bidmachine.media3.exoplayer.image;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public final class ImageDecoderException extends DecoderException {
    public ImageDecoderException(String str) {
        super(str);
    }

    public ImageDecoderException(@Nullable Throwable th2) {
        super(th2);
    }

    public ImageDecoderException(String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
