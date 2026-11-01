package io.bidmachine.media3.decoder;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public class DecoderException extends Exception {
    public DecoderException(String str) {
        super(str);
    }

    public DecoderException(@Nullable Throwable th2) {
        super(th2);
    }

    public DecoderException(String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
