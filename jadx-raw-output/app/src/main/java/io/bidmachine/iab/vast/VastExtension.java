package io.bidmachine.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.vast.tags.CompanionTag;
import io.bidmachine.iab.vast.tags.PostBannerTag;

/* JADX INFO: loaded from: classes6.dex */
public interface VastExtension {
    @Nullable
    Integer getAssetsBackgroundColor();

    @Nullable
    Integer getAssetsColor();

    @NonNull
    IabElementStyle getCloseStyle();

    @Nullable
    Float getCloseTimeSec();

    @Nullable
    CompanionTag getCompanionTag();

    @NonNull
    IabElementStyle getCountDownStyle();

    @NonNull
    IabElementStyle getCtaStyle();

    @Nullable
    Integer getForceOrientation();

    @NonNull
    IabElementStyle getLoadingStyle();

    @NonNull
    IabElementStyle getMuteStyle();

    @NonNull
    PostBannerTag getPostBannerTag();

    @NonNull
    IabElementStyle getProgressStyle();

    @NonNull
    IabElementStyle getRepeatStyle();

    @NonNull
    IabElementStyle getVideoStyle();

    @Nullable
    Boolean isAutoRotate();

    boolean isMuted();

    boolean isR1();

    boolean isR2();

    boolean isVideoClickable();
}
