package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.Function;
import io.bidmachine.LabelData;
import io.bidmachine.MediaAssetType;
import io.bidmachine.PrivacySheetData;
import io.bidmachine.ads.networks.nast.NastParams;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: loaded from: classes11.dex */
public class NastParams extends UnifiedParams {

    @Nullable
    public final LabelData adLabelData;

    @Nullable
    public final String callToAction;

    @Nullable
    public final String clickUrl;

    @Nullable
    public final String description;

    @Nullable
    public final String iconUrl;

    @Nullable
    public final String imageUrl;

    @Nullable
    public final PrivacySheetData privacySheetData;

    @Nullable
    public final Float rating;

    @Nullable
    public final String title;

    @Nullable
    public final String videoAdm;

    @Nullable
    public final String videoUrl;

    @Override // io.bidmachine.unified.UnifiedParams
    public boolean isValid(@NonNull UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.title)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("title"));
            return false;
        }
        if (!TextUtils.isEmpty(this.callToAction)) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound("cta"));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ LabelData lambda$new$0(Object obj) {
        return (LabelData) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ PrivacySheetData lambda$new$1(Object obj) {
        return (PrivacySheetData) obj;
    }

    public NastParams(@NonNull UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.title = unifiedMediationParams.getStringOrNull("title");
        this.description = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_DESCRIPTION);
        this.callToAction = unifiedMediationParams.getStringOrNull("cta");
        this.rating = unifiedMediationParams.getFloatOrNull("rating");
        this.iconUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_ICON_URL);
        this.imageUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_IMAGE_URL);
        this.videoUrl = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_URL);
        this.videoAdm = unifiedMediationParams.getStringOrNull(UnifiedMediationParams.KEY_VIDEO_ADM);
        this.clickUrl = unifiedMediationParams.getStringOrNull("clickUrl");
        this.adLabelData = (LabelData) unifiedMediationParams.getOrNullSafely(UnifiedMediationParams.KEY_AD_LABEL, new Function() { // from class: nf.b
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return NastParams.lambda$new$0(obj);
            }
        });
        this.privacySheetData = (PrivacySheetData) unifiedMediationParams.getOrNullSafely(UnifiedMediationParams.KEY_PRIVACY_SHEET, new Function() { // from class: nf.c
            @Override // io.bidmachine.Function
            public final Object apply(Object obj) {
                return NastParams.lambda$new$1(obj);
            }
        });
    }

    public boolean isValid(@NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull UnifiedAdCallback unifiedAdCallback) {
        if (!isValid(unifiedAdCallback)) {
            return false;
        }
        NativeAdRequestParameters adRequestParameters = unifiedNativeAdRequestParams.getAdRequestParameters();
        if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Icon) && TextUtils.isEmpty(this.iconUrl)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_ICON_URL));
            return false;
        }
        if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Image) && TextUtils.isEmpty(this.imageUrl)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(UnifiedMediationParams.KEY_IMAGE_URL));
            return false;
        }
        if (!adRequestParameters.isValidateAssets() || !adRequestParameters.containsAssetType(MediaAssetType.Video) || !TextUtils.isEmpty(this.videoAdm) || !TextUtils.isEmpty(this.videoUrl)) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound("videoAdm or videoUrl"));
        return false;
    }
}
