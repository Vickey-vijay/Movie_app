package com.vungle.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3537j8;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.BannerAdImpl;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.WebViewManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.RingerModeReceiver;
import com.vungle.ads.internal.util.ThreadUtil;
import com.vungle.ads.internal.util.ViewUtility;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: VungleBannerView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 ]2\u00020\u0001:\u0001]B\u001f\u0012\u0006\u0010Z\u001a\u00020Y\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020\u0013¢\u0006\u0004\b[\u0010\\J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J \u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0006\u0010\u0016\u001a\u00020\u0013J\u0012\u0010\u0019\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u001a\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u0004H\u0014J\b\u0010\u001f\u001a\u00020\u0004H\u0014R\u0017\u0010 \u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010$\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00106R\u0018\u00109\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010ER\u0014\u0010H\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010ER\u0014\u0010I\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ER\u001b\u0010O\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010BR\u0011\u0010T\u001a\u00020Q8F¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0013\u0010V\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bU\u0010#R\u0013\u0010X\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bW\u0010#¨\u0006d²\u0006\f\u0010_\u001a\u00020^8\nX\u008a\u0084\u0002²\u0006\f\u0010a\u001a\u00020`8\nX\u008a\u0084\u0002²\u0006\f\u0010c\u001a\u00020b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/VungleBannerView;", "Landroid/widget/RelativeLayout;", "", C3537j8.f29257k, "Lmj/r;", "setAdVisibility", "checkHardwareAcceleration", "logViewVisibleOnPlay", "logViewInvisibleOnPlay", "isFinishedByApi", "finishAdInternal", "renderAd", "Lcom/vungle/ads/BaseAd;", "baseAd", "onBannerAdLoaded", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/VungleAdSize;", "fixedAdSize", "willPresentAdView", "getAdViewSize", "", "adMarkup", "load", "finishAd", "", "visibility", "onWindowVisibilityChanged", "onAttachedToWindow", "onDetachedFromWindow", "placementId", "Ljava/lang/String;", "getPlacementId", "()Ljava/lang/String;", C3426d4.i.O, "Lcom/vungle/ads/VungleAdSize;", "getAdSize", "()Lcom/vungle/ads/VungleAdSize;", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "ringerModeReceiver", "Lcom/vungle/ads/internal/util/RingerModeReceiver;", "Lcom/vungle/ads/BannerAdListener;", "adListener", "Lcom/vungle/ads/BannerAdListener;", "getAdListener", "()Lcom/vungle/ads/BannerAdListener;", "setAdListener", "(Lcom/vungle/ads/BannerAdListener;)V", "Lcom/vungle/ads/internal/BannerAdImpl;", "adViewImpl", "Lcom/vungle/ads/internal/BannerAdImpl;", "calculatedPixelWidth", "I", "calculatedPixelHeight", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/WatermarkView;", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "isOnImpressionCalled", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "presenterStarted", "isAdDownloaded", "isAdAttachedToWindow", "isInvisibleLogged", "Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lmj/g;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker", "isReceiverRegistered", "Lcom/vungle/ads/AdConfig;", "getAdConfig", "()Lcom/vungle/ads/AdConfig;", "adConfig", "getCreativeId", "creativeId", "getEventId", "eventId", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleBannerView extends RelativeLayout {
    private static final String TAG = "VungleBannerView";
    private BannerAdListener adListener;
    private final VungleAdSize adSize;
    private final BannerAdImpl adViewImpl;
    private MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final g impressionTracker;
    private final AtomicBoolean isAdAttachedToWindow;
    private final AtomicBoolean isAdDownloaded;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private boolean isReceiverRegistered;
    private final String placementId;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;
    private final RingerModeReceiver ringerModeReceiver;

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44958d, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleBannerView(final Context context, String str, VungleAdSize vungleAdSize) {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
        p.j(vungleAdSize, C3426d4.i.O);
        this.placementId = str;
        this.adSize = vungleAdSize;
        this.ringerModeReceiver = new RingerModeReceiver();
        BannerAdImpl bannerAdImpl = new BannerAdImpl(context, str, vungleAdSize, new AdConfig());
        this.adViewImpl = bannerAdImpl;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isAdDownloaded = new AtomicBoolean(false);
        this.isAdAttachedToWindow = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker = kotlin.b.a(new bk.a<ImpressionTracker>() { // from class: com.vungle.ads.VungleBannerView$impressionTracker$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ImpressionTracker invoke() {
                return new ImpressionTracker(context);
            }
        });
        bannerAdImpl.setAdListener(new BannerAdListener() { // from class: com.vungle.ads.VungleBannerView.1
            @Override // com.vungle.ads.BaseAdListener
            public void onAdClicked(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdClicked(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdEnd(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdEnd(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
                p.j(baseAd, "baseAd");
                p.j(vungleError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToLoad(baseAd, vungleError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
                p.j(baseAd, "baseAd");
                p.j(vungleError, "adError");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdFailedToPlay(baseAd, vungleError);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdImpression(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdImpression(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLeftApplication(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdLeftApplication(baseAd);
                }
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdLoaded(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                VungleBannerView.this.onBannerAdLoaded(baseAd);
            }

            @Override // com.vungle.ads.BaseAdListener
            public void onAdStart(BaseAd baseAd) {
                p.j(baseAd, "baseAd");
                BannerAdListener adListener = VungleBannerView.this.getAdListener();
                if (adListener != null) {
                    adListener.onAdStart(baseAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        Logger.INSTANCE.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.adViewImpl.getLogEntry(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishAdInternal(boolean z10) {
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        int i10 = (z10 ? 4 : 0) | 2;
        MRAIDPresenter mRAIDPresenter = this.presenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
        MRAIDPresenter mRAIDPresenter2 = this.presenter;
        if (mRAIDPresenter2 != null) {
            mRAIDPresenter2.detach(i10);
        }
        getImpressionTracker().destroy();
        try {
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this);
            }
            removeAllViews();
        } catch (Exception e10) {
            Logger.INSTANCE.d(TAG, "Removing webView error: " + e10);
        }
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    public static /* synthetic */ void load$default(VungleBannerView vungleBannerView, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        vungleBannerView.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewInvisibleOnPlay() {
        if (this.isInvisibleLogged.getAndSet(true)) {
            return;
        }
        Logger.INSTANCE.d(TAG, "ImpressionTracker checked the banner view invisible on play, log AD_VISIBILITY_INVISIBLE. " + hashCode());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(1L);
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onBannerAdLoaded(BaseAd baseAd) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getResponseToShowMetric(), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        this.adViewImpl.getShowToCloseMetric().markStart();
        this.adViewImpl.getShowToFailMetric().markStart();
        VungleError vungleErrorCanPlayAd = this.adViewImpl.getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (this.adViewImpl.getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                this.adViewImpl.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
            }
            BannerAdListener bannerAdListener = this.adListener;
            if (bannerAdListener != null) {
                bannerAdListener.onAdFailedToPlay(baseAd, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        AdPayload advertisement = this.adViewImpl.getAdInternal$vungle_ads_release().getAdvertisement();
        Placement placement = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        if (advertisement == null || placement == null) {
            BannerAdListener bannerAdListener2 = this.adListener;
            if (bannerAdListener2 != null) {
                bannerAdListener2.onAdFailedToPlay(baseAd, new AdNotLoadedCantPlay("Ad or Placement is null").setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release());
                return;
            }
            return;
        }
        this.adViewImpl.getAdInternal$vungle_ads_release().cancelDownload$vungle_ads_release();
        this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, this.adViewImpl.getAdInternal$vungle_ads_release().getShowToValidationMetric(), this.adViewImpl.getLogEntry(), (String) null, 4, (Object) null);
        this.adViewImpl.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
        try {
            willPresentAdView(advertisement, placement, getAdViewSize());
            this.isAdDownloaded.set(true);
            BannerAdListener bannerAdListener3 = this.adListener;
            if (bannerAdListener3 != null) {
                bannerAdListener3.onAdLoaded(baseAd);
            }
            renderAd();
        } catch (InstantiationException unused) {
        }
    }

    private final void renderAd() {
        if (this.destroyed.get()) {
            Logger.INSTANCE.w(TAG, "renderAd() - destroyed");
            return;
        }
        if (!this.isAdDownloaded.get()) {
            Logger.INSTANCE.d(TAG, "renderAd() - not ready: not downloaded.");
            return;
        }
        if (!this.isAdAttachedToWindow.get()) {
            Logger.INSTANCE.d(TAG, "renderAd() - not ready: not attached.");
            return;
        }
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.VungleBannerView.renderAd.1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(View view) {
                    Logger.INSTANCE.d(VungleBannerView.TAG, "ImpressionTracker checked the banner view become visible.");
                    VungleBannerView.this.isOnImpressionCalled = true;
                    VungleBannerView.this.logViewVisibleOnPlay();
                    VungleBannerView.this.checkHardwareAcceleration();
                    MRAIDPresenter mRAIDPresenter2 = VungleBannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(View view) {
                    VungleBannerView.this.logViewInvisibleOnPlay();
                }
            });
        }
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null && !p.e(mRAIDAdWidget.getParent(), this)) {
            ViewParent parent = mRAIDAdWidget.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(mRAIDAdWidget);
            }
            addView(mRAIDAdWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
        }
        WatermarkView watermarkView = this.imageView;
        if (watermarkView != null && !p.e(watermarkView.getParent(), this)) {
            ViewParent parent2 = watermarkView.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(watermarkView);
            }
            addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
            watermarkView.bringToFront();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    private final void setAdVisibility(boolean z10) {
        MRAIDPresenter mRAIDPresenter;
        if (!this.isOnImpressionCalled || this.destroyed.get() || (mRAIDPresenter = this.presenter) == null) {
            return;
        }
        mRAIDPresenter.setAdVisibility(z10);
    }

    private final void willPresentAdView(AdPayload adPayload, Placement placement, VungleAdSize vungleAdSize) throws InstantiationException {
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        Context context = getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, vungleAdSize.getHeight());
        Context context2 = getContext();
        p.i(context2, GAMConfig.KEY_CONTEXT);
        this.calculatedPixelWidth = viewUtility.dpToPixels(context2, vungleAdSize.getWidth());
        final AdPlayCallbackWrapper adPlayCallback$vungle_ads_release = this.adViewImpl.getAdPlayCallback();
        final Placement placement2 = this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement();
        AdEventListener adEventListener = new AdEventListener(adPlayCallback$vungle_ads_release, placement2) { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$adEventListener$1
        };
        try {
            Context context3 = getContext();
            p.i(context3, GAMConfig.KEY_CONTEXT);
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context3, adPayload.eventId());
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    VungleBannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.VungleBannerView.willPresentAdView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent event) {
                    MRAIDPresenter mRAIDPresenter = VungleBannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(event);
                    return false;
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            final Context context4 = getContext();
            p.i(context4, GAMConfig.KEY_CONTEXT);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Executors>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // bk.a
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context4).getService(Executors.class);
                }
            });
            final Context context5 = getContext();
            p.i(context5, GAMConfig.KEY_CONTEXT);
            OMTracker oMTrackerMake = m3208willPresentAdView$lambda6(kotlin.b.b(lazyThreadSafetyMode, new bk.a<OMTracker.Factory>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // bk.a
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context5).getService(OMTracker.Factory.class);
                }
            })).make(adPayload.omEnabled());
            final Context context6 = getContext();
            p.i(context6, GAMConfig.KEY_CONTEXT);
            g gVarB2 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Platform>() { // from class: com.vungle.ads.VungleBannerView$willPresentAdView$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // bk.a
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context6).getService(Platform.class);
                }
            });
            VungleWebClient orCreateWebViewClient = WebViewManager.INSTANCE.getOrCreateWebViewClient(adPayload, placement, m3207willPresentAdView$lambda5(gVarB).getOFFLOAD_EXECUTOR(), m3209willPresentAdView$lambda7(gVarB2));
            this.ringerModeReceiver.setWebClient(orCreateWebViewClient);
            orCreateWebViewClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, orCreateWebViewClient, m3207willPresentAdView$lambda5(gVarB).getJOB_EXECUTOR(), oMTrackerMake, m3209willPresentAdView$lambda7(gVarB2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                Context context7 = getContext();
                p.i(context7, GAMConfig.KEY_CONTEXT);
                this.imageView = new WatermarkView(context7, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            adEventListener.onError(new AdCantPlayWithoutWebView(e10.getMessage()).setLogEntry$vungle_ads_release(this.adViewImpl.getLogEntry()).logError$vungle_ads_release(), this.placementId);
            throw e10;
        }
    }

    public final void finishAd() {
        ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.VungleBannerView.finishAd.1
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
                VungleBannerView.this.finishAdInternal(true);
            }
        });
    }

    public final AdConfig getAdConfig() {
        return this.adViewImpl.getAdConfig();
    }

    public final BannerAdListener getAdListener() {
        return this.adListener;
    }

    public final VungleAdSize getAdSize() {
        return this.adSize;
    }

    public final VungleAdSize getAdViewSize() {
        return this.adViewImpl.getAdViewSize();
    }

    public final String getCreativeId() {
        return this.adViewImpl.getCreativeId();
    }

    public final String getEventId() {
        return this.adViewImpl.getEventId();
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public final void load(String str) {
        this.adViewImpl.load(str);
    }

    public final void setAdListener(BannerAdListener bannerAdListener) {
        this.adListener = bannerAdListener;
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-5, reason: not valid java name */
    private static final Executors m3207willPresentAdView$lambda5(g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-6, reason: not valid java name */
    private static final OMTracker.Factory m3208willPresentAdView$lambda6(g<OMTracker.Factory> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: willPresentAdView$lambda-7, reason: not valid java name */
    private static final Platform m3209willPresentAdView$lambda7(g<? extends Platform> gVar) {
        return gVar.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.Companion companion = Logger.INSTANCE;
        companion.d(TAG, "onAttachedToWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(true);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (!this.isReceiverRegistered) {
                    getContext().registerReceiver(this.ringerModeReceiver, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
                    this.isReceiverRegistered = true;
                    companion.d(TAG, "registerReceiver(): " + this.ringerModeReceiver.hashCode());
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "registerReceiver error: " + e10.getLocalizedMessage());
            }
        }
        renderAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Logger.INSTANCE.d(TAG, "onDetachedFromWindow(): " + hashCode());
        this.isAdAttachedToWindow.set(false);
        if (this.adViewImpl.getAdInternal$vungle_ads_release().getPlacement() != null) {
            try {
                if (this.isReceiverRegistered) {
                    getContext().unregisterReceiver(this.ringerModeReceiver);
                    this.isReceiverRegistered = false;
                }
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "unregisterReceiver error: " + e10.getLocalizedMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setAdVisibility(z10);
    }
}
