package io.bidmachine.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.MediaMetadata;
import q5.i;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public interface BitmapLoader {
    i<Bitmap> decodeBitmap(byte[] bArr);

    i<Bitmap> loadBitmap(Uri uri);

    boolean supportsMimeType(String str);

    @Nullable
    default i<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr != null) {
            return decodeBitmap(bArr);
        }
        Uri uri = mediaMetadata.artworkUri;
        if (uri != null) {
            return loadBitmap(uri);
        }
        return null;
    }
}
