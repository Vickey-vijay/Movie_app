package androidx.media3.common.util;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaMetadata;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
public interface BitmapLoader {
    q5.i<Bitmap> decodeBitmap(byte[] bArr);

    q5.i<Bitmap> loadBitmap(Uri uri);

    boolean supportsMimeType(String str);

    @Nullable
    default q5.i<Bitmap> loadBitmapFromMetadata(MediaMetadata mediaMetadata) {
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
