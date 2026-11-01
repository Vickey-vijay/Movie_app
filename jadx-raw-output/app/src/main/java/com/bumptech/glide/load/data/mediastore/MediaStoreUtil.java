package com.bumptech.glide.load.data.mediastore;

import android.net.Uri;
import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes11.dex */
public final class MediaStoreUtil {
    private static final int MINI_THUMB_HEIGHT = 384;
    private static final int MINI_THUMB_WIDTH = 512;

    public static boolean isThumbnailSize(int i10, int i11) {
        return i10 != Integer.MIN_VALUE && i11 != Integer.MIN_VALUE && i10 <= 512 && i11 <= 384;
    }

    public static boolean isMediaStoreUri(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && C3426d4.i.I0.equals(uri.getAuthority());
    }

    private MediaStoreUtil() {
    }

    public static boolean isMediaStoreImageUri(Uri uri) {
        if (isMediaStoreUri(uri) && !isVideoUri(uri)) {
            return true;
        }
        return false;
    }

    public static boolean isMediaStoreVideoUri(Uri uri) {
        if (isMediaStoreUri(uri) && isVideoUri(uri)) {
            return true;
        }
        return false;
    }

    private static boolean isVideoUri(Uri uri) {
        return uri.getPathSegments().contains("video");
    }
}
