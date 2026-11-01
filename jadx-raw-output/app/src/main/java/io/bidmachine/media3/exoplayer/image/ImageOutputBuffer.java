package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.decoder.DecoderOutputBuffer;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public abstract class ImageOutputBuffer extends DecoderOutputBuffer {

    @Nullable
    public Bitmap bitmap;
}
