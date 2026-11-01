package nf;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.nast.NastParams;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.nativead.NativeNetworkAdapter;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;

/* JADX INFO: compiled from: NastNative.java */
/* JADX INFO: loaded from: classes7.dex */
public class a extends UnifiedNativeAd {

    /* JADX INFO: compiled from: NastNative.java */
    public static final class b extends NativeNetworkAdapter {
        private b() {
        }

        @Override // io.bidmachine.nativead.NativeNetworkAdapter, io.bidmachine.nativead.NativeData, io.bidmachine.nativead.NativePublicData
        public boolean hasVideo() {
            if (TextUtils.isEmpty(getVideoAdm()) && TextUtils.isEmpty(getVideoUrl())) {
                return false;
            }
            return true;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedNativeAdCallback unifiedNativeAdCallback, @NonNull UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        NastParams nastParams = new NastParams(unifiedMediationParams);
        if (nastParams.isValid(unifiedNativeAdRequestParams, unifiedNativeAdCallback)) {
            unifiedNativeAdCallback.setVisibilitySource(VisibilitySource.BidMachine);
            NativeNetworkAdapter privacySheetData = new b().setTitle(nastParams.title).setDescription(nastParams.description).setCallToAction(nastParams.callToAction).setIcon(new ImageDataImpl(nastParams.iconUrl)).setMainImage(new ImageDataImpl(nastParams.imageUrl)).setVideoUrl(nastParams.videoUrl).setVideoAdm(nastParams.videoAdm).setClickUrl(nastParams.clickUrl).setNetworkControlLoadingAssets(false).setAdLabelData(nastParams.adLabelData).setPrivacySheetData(nastParams.privacySheetData);
            Float f10 = nastParams.rating;
            if (f10 != null) {
                privacySheetData.setRating(f10.floatValue());
            }
            unifiedNativeAdCallback.onAdLoaded(privacySheetData);
        }
    }
}
