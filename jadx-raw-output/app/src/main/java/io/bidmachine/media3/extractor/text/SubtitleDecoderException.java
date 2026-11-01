package io.bidmachine.media3.extractor.text;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public class SubtitleDecoderException extends DecoderException {
    public SubtitleDecoderException(String str) {
        super(str);
    }

    public SubtitleDecoderException(@Nullable Throwable th2) {
        super(th2);
    }

    public SubtitleDecoderException(String str, @Nullable Throwable th2) {
        super(str, th2);
    }
}
