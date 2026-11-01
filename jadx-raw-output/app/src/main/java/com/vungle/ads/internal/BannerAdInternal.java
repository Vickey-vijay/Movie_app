package com.vungle.ads.internal;

import android.content.Context;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.util.ViewUtility;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.Pair;

/* JADX INFO: compiled from: BannerAdImpl.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/vungle/ads/internal/BannerAdInternal;", "Lcom/vungle/ads/internal/AdInternal;", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "wrapCallback$vungle_ads_release", "(Lcom/vungle/ads/internal/presenter/AdPlayCallback;)Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "wrapCallback", "Lcom/vungle/ads/internal/model/Placement;", "placement", "", "isValidAdTypeForPlacement", "Lcom/vungle/ads/VungleAdSize;", C3426d4.i.O, "isValidAdSize", "getAdSizeForAdRequest", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lmj/r;", "adLoadedAndUpdateConfigure$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", "adLoadedAndUpdateConfigure", "Lcom/vungle/ads/VungleAdSize;", "updatedAdSize", "getUpdatedAdSize$vungle_ads_release", "()Lcom/vungle/ads/VungleAdSize;", "setUpdatedAdSize$vungle_ads_release", "(Lcom/vungle/ads/VungleAdSize;)V", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Lcom/vungle/ads/VungleAdSize;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BannerAdInternal extends AdInternal {
    private final VungleAdSize adSize;
    private VungleAdSize updatedAdSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerAdInternal(Context context, VungleAdSize vungleAdSize) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(vungleAdSize, C3426d4.i.O);
        this.adSize = vungleAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload advertisement) {
        p.j(advertisement, "advertisement");
        super.adLoadedAndUpdateConfigure$vungle_ads_release(advertisement);
        if (this.adSize.getIsAdaptiveWidth() || this.adSize.getIsAdaptiveHeight()) {
            Pair<Integer, Integer> deviceWidthAndHeightWithOrientation = ViewUtility.INSTANCE.getDeviceWidthAndHeightWithOrientation(getContext(), 0);
            int iIntValue = deviceWidthAndHeightWithOrientation.component1().intValue();
            int iIntValue2 = deviceWidthAndHeightWithOrientation.component2().intValue();
            int iAdWidth = this.adSize.getIsAdaptiveWidth() ? advertisement.adWidth() : this.adSize.getWidth();
            int iAdHeight = this.adSize.getIsAdaptiveHeight() ? advertisement.adHeight() : this.adSize.getHeight();
            int iMin = Math.min(iIntValue, iAdWidth);
            int iMin2 = Math.min(iIntValue2, iAdHeight);
            if (this.adSize.getIsAdaptiveHeight() && this.adSize.getHeight() > 0) {
                iMin2 = Math.min(this.adSize.getHeight(), iMin2);
            }
            this.updatedAdSize = new VungleAdSize(iMin, iMin2);
        }
    }

    @Override // com.vungle.ads.internal.AdInternal
    /* JADX INFO: renamed from: getAdSizeForAdRequest, reason: from getter */
    public VungleAdSize getAdSize() {
        return this.adSize;
    }

    /* JADX INFO: renamed from: getUpdatedAdSize$vungle_ads_release, reason: from getter */
    public final VungleAdSize getUpdatedAdSize() {
        return this.updatedAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(VungleAdSize adSize) {
        if (adSize != null) {
            return adSize.isValidSize$vungle_ads_release();
        }
        return false;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        p.j(placement, "placement");
        return placement.isBanner() || placement.isMREC() || placement.isInline();
    }

    public final void setUpdatedAdSize$vungle_ads_release(VungleAdSize vungleAdSize) {
        this.updatedAdSize = vungleAdSize;
    }

    public final AdPlayCallbackWrapper wrapCallback$vungle_ads_release(final AdPlayCallback adPlayCallback) {
        p.j(adPlayCallback, "adPlayCallback");
        return new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.BannerAdInternal$wrapCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                this.setAdState(AdInternal.AdState.PLAYING);
                super.onAdStart(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError vungleError) {
                p.j(vungleError, "error");
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(vungleError);
            }
        };
    }
}
