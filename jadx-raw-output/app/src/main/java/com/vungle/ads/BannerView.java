package com.vungle.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.C3537j8;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;

/* JADX INFO: compiled from: BannerView.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>BA\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\f\u001a\u00020\u0002H\u0014J\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010+\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001b\u00101\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u0006E²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002²\u0006\f\u0010B\u001a\u00020A8\nX\u008a\u0084\u0002²\u0006\f\u0010D\u001a\u00020C8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/BannerView;", "Landroid/widget/RelativeLayout;", "Lmj/r;", "logViewVisibleOnPlay", "", C3537j8.f29257k, "setAdVisibility", "checkHardwareAcceleration", "renderAd", "", "visibility", "onWindowVisibilityChanged", "onAttachedToWindow", "isFinishedByApi", "finishAdInternal", "Lcom/vungle/ads/internal/model/Placement;", "placement", "Lcom/vungle/ads/internal/model/Placement;", "getPlacement", "()Lcom/vungle/ads/internal/model/Placement;", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "Lcom/vungle/ads/internal/model/AdPayload;", "getAdvertisement", "()Lcom/vungle/ads/internal/model/AdPayload;", "calculatedPixelWidth", "I", "calculatedPixelHeight", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "adWidget", "Lcom/vungle/ads/internal/ui/view/MRAIDAdWidget;", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "presenter", "Lcom/vungle/ads/internal/presenter/MRAIDPresenter;", "Lcom/vungle/ads/internal/ui/WatermarkView;", "imageView", "Lcom/vungle/ads/internal/ui/WatermarkView;", "isOnImpressionCalled", "Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "presenterStarted", "isInvisibleLogged", "Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "Lmj/g;", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/VungleAdSize;", C3426d4.i.O, "Lcom/vungle/ads/AdConfig;", "adConfig", "Lcom/vungle/ads/internal/presenter/AdPlayCallback;", "adPlayCallback", "Lcom/vungle/ads/internal/model/BidPayload;", "bidPayload", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/model/Placement;Lcom/vungle/ads/internal/model/AdPayload;Lcom/vungle/ads/VungleAdSize;Lcom/vungle/ads/AdConfig;Lcom/vungle/ads/internal/presenter/AdPlayCallback;Lcom/vungle/ads/internal/model/BidPayload;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/executor/Executors;", "executors", "Lcom/vungle/ads/internal/omsdk/OMTracker$Factory;", "omTrackerFactory", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class BannerView extends RelativeLayout {
    private static final String TAG = "BannerView";
    private MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private final AtomicBoolean destroyed;
    private WatermarkView imageView;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final g impressionTracker;
    private final AtomicBoolean isInvisibleLogged;
    private boolean isOnImpressionCalled;
    private final Placement placement;
    private MRAIDPresenter presenter;
    private final AtomicBoolean presenterStarted;

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
    public BannerView(final Context context, final Placement placement, AdPayload adPayload, VungleAdSize vungleAdSize, AdConfig adConfig, final AdPlayCallback adPlayCallback, BidPayload bidPayload) throws InstantiationException {
        super(context);
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(placement, "placement");
        p.j(adPayload, "advertisement");
        p.j(vungleAdSize, C3426d4.i.O);
        p.j(adConfig, "adConfig");
        p.j(adPlayCallback, "adPlayCallback");
        this.placement = placement;
        this.advertisement = adPayload;
        this.destroyed = new AtomicBoolean(false);
        this.presenterStarted = new AtomicBoolean(false);
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.impressionTracker = kotlin.b.a(new bk.a<ImpressionTracker>() { // from class: com.vungle.ads.BannerView$impressionTracker$2
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
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, vungleAdSize.getHeight());
        this.calculatedPixelWidth = viewUtility.dpToPixels(context, vungleAdSize.getWidth());
        AdEventListener adEventListener = new AdEventListener(adPlayCallback, placement) { // from class: com.vungle.ads.BannerView$adEventListener$1
        };
        try {
            MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context, null, 2, null);
            this.adWidget = mRAIDAdWidget;
            mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.BannerView.1
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
                public void close() {
                    BannerView.this.finishAdInternal(false);
                }
            });
            mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.BannerView.2
                @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
                public boolean onTouch(MotionEvent event) {
                    MRAIDPresenter mRAIDPresenter = BannerView.this.presenter;
                    if (mRAIDPresenter == null) {
                        return false;
                    }
                    mRAIDPresenter.onViewTouched(event);
                    return false;
                }
            });
            ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
            g gVarB = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Executors>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // bk.a
                public final Executors invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Executors.class);
                }
            });
            OMTracker oMTrackerMake = m3201_init_$lambda3(kotlin.b.b(lazyThreadSafetyMode, new bk.a<OMTracker.Factory>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
                @Override // bk.a
                public final OMTracker.Factory invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(OMTracker.Factory.class);
                }
            })).make(adPayload.omEnabled());
            g gVarB2 = kotlin.b.b(lazyThreadSafetyMode, new bk.a<Platform>() { // from class: com.vungle.ads.BannerView$special$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.platform.Platform, java.lang.Object] */
                @Override // bk.a
                public final Platform invoke() {
                    return ServiceLocator.INSTANCE.getInstance(context).getService(Platform.class);
                }
            });
            VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, m3200_init_$lambda2(gVarB).getOFFLOAD_EXECUTOR(), m3202_init_$lambda4(gVarB2), null, null, 48, null);
            vungleWebClient.setWebViewObserver(oMTrackerMake);
            MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, vungleWebClient, m3200_init_$lambda2(gVarB).getJOB_EXECUTOR(), oMTrackerMake, m3202_init_$lambda4(gVarB2));
            mRAIDPresenter.setEventListener(adEventListener);
            this.presenter = mRAIDPresenter;
            String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
            if (watermark$vungle_ads_release != null) {
                this.imageView = new WatermarkView(context, watermark$vungle_ads_release);
            }
        } catch (InstantiationException e10) {
            adEventListener.onError(new AdCantPlayWithoutWebView(null, 1, null).setLogEntry$vungle_ads_release(this.advertisement.getLogEntry()).logError$vungle_ads_release(), this.placement.getReferenceId());
            throw e10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHardwareAcceleration() {
        Logger.INSTANCE.w(TAG, "hardwareAccelerated = " + isHardwareAccelerated());
        if (isHardwareAccelerated()) {
            return;
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.HARDWARE_ACCELERATE_DISABLED, 0L, this.advertisement.getLogEntry(), null, 10, null);
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, this.advertisement.getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    private final void renderAd() {
        MRAIDAdWidget mRAIDAdWidget = this.adWidget;
        if (mRAIDAdWidget != null) {
            if (!p.e(mRAIDAdWidget != null ? mRAIDAdWidget.getParent() : null, this)) {
                addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
                WatermarkView watermarkView = this.imageView;
                if (watermarkView != null) {
                    addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
                    WatermarkView watermarkView2 = this.imageView;
                    if (watermarkView2 != null) {
                        watermarkView2.bringToFront();
                    }
                }
            }
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

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    /* JADX INFO: renamed from: _init_$lambda-2, reason: not valid java name */
    private static final Executors m3200_init_$lambda2(g<? extends Executors> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    private static final OMTracker.Factory m3201_init_$lambda3(g<OMTracker.Factory> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: renamed from: _init_$lambda-4, reason: not valid java name */
    private static final Platform m3202_init_$lambda4(g<? extends Platform> gVar) {
        return gVar.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.INSTANCE.d(TAG, "onAttachedToWindow()");
        if (!this.presenterStarted.getAndSet(true)) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (mRAIDPresenter != null) {
                mRAIDPresenter.prepare();
            }
            getImpressionTracker().addView(this, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.BannerView.onAttachedToWindow.1
                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onImpression(View view) {
                    Logger.INSTANCE.d(BannerView.TAG, "ImpressionTracker checked the banner view become visible.");
                    BannerView.this.isOnImpressionCalled = true;
                    BannerView.this.logViewVisibleOnPlay();
                    BannerView.this.checkHardwareAcceleration();
                    MRAIDPresenter mRAIDPresenter2 = BannerView.this.presenter;
                    if (mRAIDPresenter2 != null) {
                        mRAIDPresenter2.start();
                    }
                }

                @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
                public void onViewInvisible(View view) {
                    if (BannerView.this.isInvisibleLogged.getAndSet(true)) {
                        return;
                    }
                    Logger.INSTANCE.d(BannerView.TAG, "ImpressionTracker checked the banner view invisible on play.");
                    AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                    SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                    singleValueMetric.setValue(1L);
                    AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, BannerView.this.getAdvertisement().getLogEntry(), (String) null, 4, (Object) null);
                }
            });
        }
        renderAd();
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
