package pf;

import android.content.Context;
import androidx.annotation.NonNull;
import io.bidmachine.AdListener;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.banner.BannerRequest;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;

/* JADX INFO: compiled from: BannerAd.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends ViewAd<a, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, UnifiedBannerAdRequestParams, AdListener<a>> {
    public a(@NonNull Context context) {
        super(context, AdsType.Banner);
    }

    @Override // io.bidmachine.BidMachineAd
    public ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams> createAdObject(@NonNull ContextProvider contextProvider, @NonNull BannerRequest bannerRequest, @NonNull NetworkAdapter networkAdapter, @NonNull AdObjectParams adObjectParams, @NonNull AdProcessCallback adProcessCallback) {
        UnifiedBannerAd unifiedBannerAdCreateBanner = networkAdapter.createBanner();
        if (unifiedBannerAdCreateBanner == null) {
            return null;
        }
        ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams> viewAdObject = new ViewAdObject<>(contextProvider, adProcessCallback, bannerRequest, adObjectParams, unifiedBannerAdCreateBanner);
        BannerSize size = bannerRequest.getSize();
        viewAdObject.setWidth(size.width);
        viewAdObject.setHeight(size.height);
        return viewAdObject;
    }
}
