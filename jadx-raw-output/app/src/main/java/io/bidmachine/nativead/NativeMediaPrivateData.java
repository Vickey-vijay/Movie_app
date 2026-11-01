package io.bidmachine.nativead;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.iab.vast.VastRequest;

/* JADX INFO: loaded from: classes11.dex */
public interface NativeMediaPrivateData extends NativeMediaPublicData {
    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Drawable getIconDrawable();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getIconUri();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Drawable getImageDrawable();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getImageUri();

    VastRequest getVastRequest();

    @Override // io.bidmachine.nativead.NativeMediaPublicData
    @Nullable
    /* synthetic */ Uri getVideoUri();

    void setIconBitmap(Bitmap bitmap);

    void setIconUri(Uri uri);

    void setImageBitmap(Bitmap bitmap);

    void setImageUri(Uri uri);

    void setVastRequest(VastRequest vastRequest);

    void setVideoUri(Uri uri);
}
