package io.bidmachine.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public interface NativeMediaPublicData {
    @Nullable
    Drawable getIconDrawable();

    @Nullable
    Uri getIconUri();

    @Nullable
    Drawable getImageDrawable();

    @Nullable
    Uri getImageUri();

    @Nullable
    Uri getVideoUri();
}
