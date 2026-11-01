package com.vungle.ads;

import android.content.Context;
import ck.p;
import com.ironsource.Mf;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignaledAd;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: BaseFullscreenAd.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/BaseFullscreenAd;", "Lcom/vungle/ads/BaseAd;", "Lcom/vungle/ads/FullscreenAd;", "", "adMarkup", "Lmj/r;", "load", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", Mf.f27060j, "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "play", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public abstract class BaseFullscreenAd extends BaseAd implements FullscreenAd {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFullscreenAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(adConfig, "adConfig");
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        p.j(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        SignaledAd signaledAd = getSignaledAd();
        if (signaledAd == null) {
            return;
        }
        signaledAd.setAdAvailabilityCallbackTime(System.currentTimeMillis());
    }

    @Override // com.vungle.ads.FullscreenAd
    public void play(Context context) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (String) null, 4, (Object) null);
        getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        SignaledAd signaledAd = getSignaledAd();
        if (signaledAd != null) {
            signaledAd.setPlayAdTime(System.currentTimeMillis());
            signaledAd.calculateTimeBetweenAdAvailabilityAndPlayAd();
            getSignalManager$vungle_ads_release().registerSignaledAd(context, signaledAd);
        }
        getAdInternal$vungle_ads_release().play(context, new AdPlayCallback() { // from class: com.vungle.ads.BaseFullscreenAd.play.2
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdClick$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(baseFullscreenAd);
                        }
                    }
                });
                BaseFullscreenAd.this.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getDisplayToClickMetric(), BaseFullscreenAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdEnd$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(baseFullscreenAd);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToCloseMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getShowToCloseMetric(), BaseFullscreenAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdImpression$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(baseFullscreenAd);
                        }
                    }
                });
                BaseFullscreenAd.this.getPresentToDisplayMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getPresentToDisplayMetric(), BaseFullscreenAd.this.getLogEntry(), (String) null, 4, (Object) null);
                BaseFullscreenAd.this.getDisplayToClickMetric().markStart();
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdLeftApplication(String str) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdLeftApplication$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(baseFullscreenAd);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getLeaveApplicationMetric(), BaseFullscreenAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdRewarded$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        RewardedAdListener rewardedAdListener = adListener instanceof RewardedAdListener ? (RewardedAdListener) adListener : null;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdRewarded(baseFullscreenAd);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, BaseFullscreenAd.this.getRewardedMetric(), BaseFullscreenAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                BaseFullscreenAd.this.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                BaseFullscreenAd.this.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onAdStart$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(baseFullscreenAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError vungleError) {
                p.j(vungleError, "error");
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final BaseFullscreenAd baseFullscreenAd = BaseFullscreenAd.this;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.BaseFullscreenAd$play$2$onFailure$1
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
                        BaseAdListener adListener = baseFullscreenAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(baseFullscreenAd, vungleError);
                        }
                    }
                });
                BaseFullscreenAd.this.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(BaseFullscreenAd.this.getShowToFailMetric(), BaseFullscreenAd.this.getLogEntry(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
            }
        });
    }

    @Override // com.vungle.ads.BaseAd, com.vungle.ads.Ad
    public void load(String str) {
        setSignaledAd$vungle_ads_release(getSignalManager$vungle_ads_release().getSignaledAd(getPlacementId()));
        super.load(str);
    }
}
