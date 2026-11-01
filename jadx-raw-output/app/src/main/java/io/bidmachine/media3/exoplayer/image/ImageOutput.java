package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes9.dex */
@UnstableApi
public interface ImageOutput {
    public static final ImageOutput NO_OP = new a();

    public class a implements ImageOutput {
        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void onDisabled() {
        }

        @Override // io.bidmachine.media3.exoplayer.image.ImageOutput
        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }

    void onDisabled();

    void onImageAvailable(long j10, Bitmap bitmap);
}
