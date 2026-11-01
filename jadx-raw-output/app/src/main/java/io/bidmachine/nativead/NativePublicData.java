package io.bidmachine.nativead;

import androidx.annotation.Nullable;
import io.bidmachine.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public interface NativePublicData {
    String getCallToAction();

    String getDescription();

    @Nullable
    ImageData getIcon();

    @Nullable
    ImageData getMainImage();

    float getRating();

    String getTitle();

    boolean hasVideo();
}
