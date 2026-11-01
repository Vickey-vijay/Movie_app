package com.vungle.ads;

import android.content.Context;
import ck.p;
import com.ironsource.C3426d4;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mj.r;

/* JADX INFO: compiled from: BannerAd.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B)\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001bB!\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u000e\u001a\u00020\u001c¢\u0006\u0004\b\u0019\u0010\u001dJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000b\u001a\u00020\nJ\b\u0010\r\u001a\u0004\u0018\u00010\fR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/vungle/ads/BannerAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/VungleAdSize;", "getAdViewSize", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/BannerAdInternal;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/BannerAdInternal;", "constructAdInternal", "Lmj/r;", "finishAd", "Lcom/vungle/ads/BannerView;", "getBannerView", C3426d4.i.O, "Lcom/vungle/ads/VungleAdSize;", "bannerView", "Lcom/vungle/ads/BannerView;", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "adPlayCallback", "Lcom/vungle/ads/internal/presenter/AdPlayCallbackWrapper;", "", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;)V", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", "Lcom/vungle/ads/BannerAdSize;", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/BannerAdSize;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BannerAd extends BaseAd {
    private final AdPlayCallbackWrapper adPlayCallback;
    private final VungleAdSize adSize;
    private BannerView bannerView;

    /* JADX INFO: compiled from: BannerAd.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BannerAdSize.values().length];
            iArr[BannerAdSize.BANNER.ordinal()] = 1;
            iArr[BannerAdSize.BANNER_SHORT.ordinal()] = 2;
            iArr[BannerAdSize.BANNER_LEADERBOARD.ordinal()] = 3;
            iArr[BannerAdSize.VUNGLE_MREC.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BannerAd(Context context, String str, VungleAdSize vungleAdSize, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adSize = vungleAdSize;
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.DEPRECATED_API_USED), getLogEntry(), "BannerAd is deprecated");
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.h(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        this.adPlayCallback = ((BannerAdInternal) adInternal$vungle_ads_release).wrapCallback$vungle_ads_release(new AdPlayCallback() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str2) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdClick$1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(bannerAd);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdEnd$1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(bannerAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdImpression$1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(bannerAd);
                        }
                    }
                });
                this.this$0.getPresentToDisplayMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getPresentToDisplayMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdLeftApplication$1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(bannerAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str2) {
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onAdStart$1
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(bannerAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError vungleError) {
                p.j(vungleError, "error");
                this.this$0.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric(), this.this$0.getLogEntry(), String.valueOf(vungleError.getCode()));
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BannerAd bannerAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd$adPlayCallback$1$onFailure$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // bk.a
                    public /* bridge */ /* synthetic */ r invoke() {
                        invoke2();
                        return r.f64562a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BaseAdListener adListener = bannerAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(bannerAd, vungleError);
                        }
                    }
                });
            }
        });
    }

    @Override // com.vungle.ads.BaseAd
    public BannerAdInternal constructAdInternal$vungle_ads_release(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return new BannerAdInternal(context, this.adSize);
    }

    public final void finishAd() {
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd.finishAd.1
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                BannerView bannerView = BannerAd.this.bannerView;
                if (bannerView != null) {
                    bannerView.finishAdInternal(true);
                }
            }
        });
    }

    public final BannerView getBannerView() {
        Placement placement;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (String) null, 4, (Object) null);
        BannerView bannerView = this.bannerView;
        if (bannerView != null) {
            return bannerView;
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        final VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BannerAd.getBannerView.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    BaseAdListener adListener = BannerAd.this.getAdListener();
                    if (adListener != null) {
                        adListener.onAdFailedToPlay(BannerAd.this, vungleErrorCanPlayAd);
                    }
                }
            });
            return null;
        }
        AdPayload advertisement = getAdInternal$vungle_ads_release().getAdvertisement();
        if (advertisement == null || (placement = getAdInternal$vungle_ads_release().getPlacement()) == null) {
            return null;
        }
        getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        try {
            try {
                this.bannerView = new BannerView(getContext(), placement, advertisement, getAdViewSize(), getAdConfig(), this.adPlayCallback, getAdInternal$vungle_ads_release().getBidPayload());
                getResponseToShowMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
                getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getAdInternal$vungle_ads_release().getShowToValidationMetric(), getLogEntry(), (String) null, 4, (Object) null);
                getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
                return this.bannerView;
            } catch (InstantiationException e10) {
                Logger.INSTANCE.e("BannerAd", "Can not create banner view: " + e10.getMessage(), e10);
                getResponseToShowMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
                return null;
            }
        } catch (Throwable th2) {
            getResponseToShowMetric().markEnd();
            AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
            throw th2;
        }
    }

    public final VungleAdSize getAdViewSize() {
        AdInternal adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.h(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.BannerAdInternal");
        VungleAdSize updatedAdSize = ((BannerAdInternal) adInternal$vungle_ads_release).getUpdatedAdSize();
        if (updatedAdSize == null) {
            return this.adSize;
        }
        return updatedAdSize;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerAd(Context context, String str, VungleAdSize vungleAdSize) {
        this(context, str, vungleAdSize, new AdConfig());
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(vungleAdSize, C3426d4.i.O);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BannerAd(Context context, String str, BannerAdSize bannerAdSize) {
        VungleAdSize vungleAdSize;
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(bannerAdSize, C3426d4.i.O);
        VungleAdSize.Companion companion = VungleAdSize.INSTANCE;
        int i10 = WhenMappings.$EnumSwitchMapping$0[bannerAdSize.ordinal()];
        if (i10 == 1) {
            vungleAdSize = VungleAdSize.BANNER;
        } else if (i10 == 2) {
            vungleAdSize = VungleAdSize.BANNER_SHORT;
        } else if (i10 == 3) {
            vungleAdSize = VungleAdSize.BANNER_LEADERBOARD;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            vungleAdSize = VungleAdSize.MREC;
        }
        this(context, str, vungleAdSize, new AdConfig());
    }
}
