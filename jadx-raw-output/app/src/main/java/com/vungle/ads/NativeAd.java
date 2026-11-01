package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bk.l;
import ck.p;
import com.ironsource.Mf;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.NativeAdInternal;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.util.ImageLoader;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ThreadUtil;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mj.g;
import mj.r;

/* JADX INFO: compiled from: NativeAd.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000»\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001a\u0018\u0000 j2\u00020\u0001:\u0002kjB!\b\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010d\u001a\u00020\u0002\u0012\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hB\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010d\u001a\u00020\u0002¢\u0006\u0004\bg\u0010iJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0017\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\u0002J\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u001d\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020 J\u000f\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\"\u0010#J\u000f\u0010&\u001a\u00020\u0002H\u0000¢\u0006\u0004\b%\u0010#J\u000f\u0010(\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010#J\u0006\u0010)\u001a\u00020\u0004J0\u00102\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010\b2\u000e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/J\u0006\u00103\u001a\u00020\u0004R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R$\u0010@\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010HR\u0016\u0010J\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010L\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001e\u00101\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010S\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR(\u0010Y\u001a\u00020X8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010`\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006n²\u0006\f\u0010m\u001a\u00020l8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "", "getMainImagePath", "Lmj/r;", "createMediaAspectRatio", "logViewVisibleOnPlay", "path", "Landroid/widget/ImageView;", "imageView", "displayImage", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Lcom/vungle/ads/internal/NativeAdInternal;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/NativeAdInternal;", "constructAdInternal", "Lcom/vungle/ads/internal/model/AdPayload;", "advertisement", "onAdLoaded$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AdPayload;)V", Mf.f27060j, "getAppIcon", "getAdTitle", "getAdBodyText", "getAdCallToActionText", "", "getAdStarRating", "()Ljava/lang/Double;", "getAdSponsoredText", "", "hasCallToAction", "", "getMediaAspectRatio", "getPrivacyIconUrl$vungle_ads_release", "()Ljava/lang/String;", "getPrivacyIconUrl", "getPrivacyUrl$vungle_ads_release", "getPrivacyUrl", "getCtaUrl$vungle_ads_release", "getCtaUrl", "unregisterView", "Landroid/widget/FrameLayout;", "rootView", "Lcom/vungle/ads/internal/ui/view/MediaView;", "mediaView", "adIconView", "", "Landroid/view/View;", "clickableViews", "registerViewForInteraction", "performCTA", "Lcom/vungle/ads/internal/util/ImageLoader;", "imageLoader$delegate", "Lmj/g;", "getImageLoader", "()Lcom/vungle/ads/internal/util/ImageLoader;", "imageLoader", "Lcom/vungle/ads/internal/executor/Executors;", "executors$delegate", "getExecutors", "()Lcom/vungle/ads/internal/executor/Executors;", "executors", "", "nativeAdAssetMap", "Ljava/util/Map;", "Landroid/widget/ImageView;", "adContentView", "Lcom/vungle/ads/internal/ui/view/MediaView;", "Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker$delegate", "getImpressionTracker", "()Lcom/vungle/ads/internal/ImpressionTracker;", "impressionTracker", "aspectRatio", "F", "adRootView", "Landroid/widget/FrameLayout;", "Ljava/util/Collection;", "Lcom/vungle/ads/NativeAdOptionsView;", "adOptionsView", "Lcom/vungle/ads/NativeAdOptionsView;", "Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "presenter", "Lcom/vungle/ads/internal/presenter/NativeAdPresenter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isInvisibleLogged", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "adOptionsPosition", "I", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "getAdOptionsPosition$annotations", "()V", "com/vungle/ads/NativeAd$adPlayCallback$1", "adPlayCallback", "Lcom/vungle/ads/NativeAd$adPlayCallback$1;", "placementId", "Lcom/vungle/ads/AdConfig;", "adConfig", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/vungle/ads/AdConfig;)V", "(Landroid/content/Context;Ljava/lang/String;)V", VastTagName.COMPANION, "AdOptionsPosition", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    private static final String TAG = "NativeAd";
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private float aspectRatio;
    private Collection<? extends View> clickableViews;

    /* JADX INFO: renamed from: executors$delegate, reason: from kotlin metadata */
    private final g executors;

    /* JADX INFO: renamed from: imageLoader$delegate, reason: from kotlin metadata */
    private final g imageLoader;

    /* JADX INFO: renamed from: impressionTracker$delegate, reason: from kotlin metadata */
    private final g impressionTracker;
    private final AtomicBoolean isInvisibleLogged;
    private Map<String, String> nativeAdAssetMap;
    private NativeAdPresenter presenter;

    /* JADX INFO: compiled from: NativeAd.kt */
    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    private NativeAd(final Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.imageLoader = kotlin.b.a(new bk.a<ImageLoader>() { // from class: com.vungle.ads.NativeAd$imageLoader$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final ImageLoader invoke() {
                ImageLoader companion = ImageLoader.INSTANCE.getInstance();
                companion.init(this.this$0.getExecutors().getIO_EXECUTOR());
                return companion;
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.executors = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<Executors>() { // from class: com.vungle.ads.NativeAd$special$$inlined$inject$1
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
        this.impressionTracker = kotlin.b.a(new bk.a<ImpressionTracker>() { // from class: com.vungle.ads.NativeAd$impressionTracker$2
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
        this.isInvisibleLogged = new AtomicBoolean(false);
        this.adOptionsPosition = 1;
        this.adOptionsView = new NativeAdOptionsView(context);
        this.adPlayCallback = new AdPlayCallback() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdRewarded(String str2) {
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdClick(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdClick$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdClicked(nativeAd);
                        }
                    }
                });
                this.this$0.getDisplayToClickMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getDisplayToClickMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str2) {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.FINISHED);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdEnd$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdEnd(nativeAd);
                        }
                    }
                });
                this.this$0.getShowToCloseMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getShowToCloseMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdImpression(String str2) {
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdImpression$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdImpression(nativeAd);
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
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdLeftApplication$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdLeftApplication(nativeAd);
                        }
                    }
                });
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getLeaveApplicationMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str2) {
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.PLAYING);
                this.this$0.getSignalManager$vungle_ads_release().increaseSessionDepthCounter();
                this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric().markEnd();
                AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.this$0.getAdInternal$vungle_ads_release().getValidationToPresentMetric(), this.this$0.getLogEntry(), (String) null, 4, (Object) null);
                this.this$0.getPresentToDisplayMetric().markStart();
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onAdStart$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdStart(nativeAd);
                        }
                    }
                });
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(final VungleError vungleError) {
                p.j(vungleError, "error");
                this.this$0.getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                final NativeAd nativeAd = this.this$0;
                threadUtil.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1$onFailure$1
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
                        BaseAdListener adListener = nativeAd.getAdListener();
                        if (adListener != null) {
                            adListener.onAdFailedToPlay(nativeAd, vungleError);
                        }
                    }
                });
                this.this$0.getShowToFailMetric().markEnd();
                AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(this.this$0.getShowToFailMetric(), this.this$0.getLogEntry(), vungleError.getCode() + '-' + vungleError.getErrorMessage());
            }
        };
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Executors getExecutors() {
        return (Executors) this.executors.getValue();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader.getValue();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logViewVisibleOnPlay() {
        long j10 = this.isInvisibleLogged.get() ? 3L : 2L;
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
        singleValueMetric.setValue(Long.valueOf(j10));
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, singleValueMetric, getLogEntry(), (String) null, 4, (Object) null);
        Logger.INSTANCE.d(TAG, "Log metric AD_VISIBILITY: " + j10);
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        return new NativeAdInternal(context);
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_DESCRIPTION)) == null) ? "" : str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_TEXT)) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_SPONSORED_BY)) == null) ? "" : str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_NAME)) == null) ? "" : str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_ICON)) == null) ? "" : str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_URL)) == null) ? "" : str;
    }

    /* JADX INFO: renamed from: getMediaAspectRatio, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get("VUNGLE_PRIVACY_ICON_URL")) == null) ? "" : str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        return (map == null || (str = map.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_URL)) == null) ? "" : str;
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload advertisement) {
        p.j(advertisement, "advertisement");
        super.onAdLoaded$vungle_ads_release(advertisement);
        this.nativeAdAssetMap = advertisement.getMRAIDArgsInMap();
        createMediaAspectRatio();
    }

    public final void performCTA() {
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, getCtaUrl$vungle_ads_release());
        }
    }

    public final void registerViewForInteraction(FrameLayout frameLayout, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) {
        String str;
        p.j(frameLayout, "rootView");
        p.j(mediaView, "mediaView");
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), (String) null, 4, (Object) null);
        getResponseToShowMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markStart();
        getShowToFailMetric().markStart();
        getShowToCloseMetric().markStart();
        VungleError vungleErrorCanPlayAd = getAdInternal$vungle_ads_release().canPlayAd(true);
        if (vungleErrorCanPlayAd != null) {
            if (getAdInternal$vungle_ads_release().isErrorTerminal$vungle_ads_release(vungleErrorCanPlayAd.getCode())) {
                getAdInternal$vungle_ads_release().setAdState(AdInternal.AdState.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorCanPlayAd);
                return;
            }
            return;
        }
        this.adRootView = frameLayout;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = getContext();
        g gVarB = kotlin.b.b(LazyThreadSafetyMode.SYNCHRONIZED, new bk.a<Platform>() { // from class: com.vungle.ads.NativeAd$registerViewForInteraction$$inlined$inject$1
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
        Context context2 = getContext();
        AdLoaderCallback adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        p.h(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.presenter.NativePresenterDelegate");
        this.presenter = new NativeAdPresenter(context2, (NativePresenterDelegate) adInternal$vungle_ads_release, getAdInternal$vungle_ads_release().getAdvertisement(), m3203registerViewForInteraction$lambda1(gVarB));
        Map<String, String> map2 = this.nativeAdAssetMap;
        if (map2 == null || (str = map2.get(NativeAdInternal.TOKEN_OM_SDK_DATA)) == null) {
            str = "";
        }
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.initOMTracker(str);
        }
        NativeAdPresenter nativeAdPresenter2 = this.presenter;
        if (nativeAdPresenter2 != null) {
            nativeAdPresenter2.startTracking(frameLayout);
        }
        NativeAdPresenter nativeAdPresenter3 = this.presenter;
        if (nativeAdPresenter3 != null) {
            nativeAdPresenter3.setEventListener(new AdEventListener(this.adPlayCallback, getAdInternal$vungle_ads_release().getPlacement()));
        }
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m3204registerViewForInteraction$lambda2(this.f45418b, view);
                }
            });
        }
        if (collection == null) {
            collection = nj.r.e(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.vungle.ads.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NativeAd.m3205registerViewForInteraction$lambda4$lambda3(this.f45419b, view);
                }
            });
        }
        NativeAdOptionsView nativeAdOptionsView2 = this.adOptionsView;
        if (nativeAdOptionsView2 != null) {
            nativeAdOptionsView2.renderTo(frameLayout, this.adOptionsPosition);
        }
        getImpressionTracker().addView(frameLayout, new ImpressionTracker.ImpressionListener() { // from class: com.vungle.ads.NativeAd.registerViewForInteraction.3
            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onImpression(View view) {
                Logger.INSTANCE.d(NativeAd.TAG, "ImpressionTracker checked the native ad view become visible.");
                NativeAdPresenter nativeAdPresenter4 = NativeAd.this.presenter;
                if (nativeAdPresenter4 != null) {
                    NativeAdPresenter.processCommand$default(nativeAdPresenter4, NativeAdPresenter.VIDEO_VIEWED, null, 2, null);
                }
                NativeAdPresenter nativeAdPresenter5 = NativeAd.this.presenter;
                if (nativeAdPresenter5 != null) {
                    nativeAdPresenter5.processCommand("tpat", "checkpoint.0");
                }
                NativeAdPresenter nativeAdPresenter6 = NativeAd.this.presenter;
                if (nativeAdPresenter6 != null) {
                    nativeAdPresenter6.onImpression();
                }
                NativeAd.this.logViewVisibleOnPlay();
            }

            @Override // com.vungle.ads.internal.ImpressionTracker.ImpressionListener
            public void onViewInvisible(View view) {
                if (NativeAd.this.isInvisibleLogged.getAndSet(true)) {
                    return;
                }
                Logger.INSTANCE.d(NativeAd.TAG, "ImpressionTracker checked the native ad view invisible on play, log AD_VISIBILITY_INVISIBLE.");
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                SingleValueMetric singleValueMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY);
                singleValueMetric.setValue(1L);
                AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient2, singleValueMetric, NativeAd.this.getLogEntry(), (String) null, 4, (Object) null);
            }
        });
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        String privacyIconUrl$vungle_ads_release = getPrivacyIconUrl$vungle_ads_release();
        NativeAdOptionsView nativeAdOptionsView3 = this.adOptionsView;
        displayImage(privacyIconUrl$vungle_ads_release, nativeAdOptionsView3 != null ? nativeAdOptionsView3.getPrivacyIcon$vungle_ads_release() : null);
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            Context context3 = frameLayout.getContext();
            p.i(context3, "rootView.context");
            WatermarkView watermarkView = new WatermarkView(context3, watermark$vungle_ads_release);
            frameLayout.addView(watermarkView);
            watermarkView.bringToFront();
        }
        getAdInternal$vungle_ads_release().getShowToValidationMetric().markEnd();
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().getShowToValidationMetric(), getLogEntry(), (String) null, 4, (Object) null);
        getAdInternal$vungle_ads_release().getValidationToPresentMetric().markStart();
        NativeAdPresenter nativeAdPresenter4 = this.presenter;
        if (nativeAdPresenter4 != null) {
            nativeAdPresenter4.prepare();
        }
    }

    public final void setAdOptionsPosition(int i10) {
        this.adOptionsPosition = i10;
    }

    private final void createMediaAspectRatio() {
        getImageLoader().getImageSize(getMainImagePath(), new bk.p<Integer, Integer, r>() { // from class: com.vungle.ads.NativeAd.createMediaAspectRatio.1
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ r mo1invoke(Integer num, Integer num2) {
                invoke(num.intValue(), num2.intValue());
                return r.f64562a;
            }

            public final void invoke(int i10, int i11) {
                NativeAd.this.aspectRatio = i10 / i11;
            }
        });
    }

    private final void displayImage(String str, final ImageView imageView) {
        getImageLoader().displayImage(str, new l<Bitmap, r>() { // from class: com.vungle.ads.NativeAd.displayImage.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Bitmap bitmap) {
                invoke2(bitmap);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Bitmap bitmap) {
                p.j(bitmap, "it");
                final ImageView imageView2 = imageView;
                if (imageView2 != null) {
                    ThreadUtil.INSTANCE.runOnUiThread(new bk.a<r>() { // from class: com.vungle.ads.NativeAd.displayImage.1.1
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
                            imageView2.setImageBitmap(bitmap);
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: renamed from: registerViewForInteraction$lambda-1, reason: not valid java name */
    private static final Platform m3203registerViewForInteraction$lambda1(g<? extends Platform> gVar) {
        return gVar.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-2, reason: not valid java name */
    public static final void m3204registerViewForInteraction$lambda2(NativeAd nativeAd, View view) {
        p.j(nativeAd, "this$0");
        NativeAdPresenter nativeAdPresenter = nativeAd.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand("openPrivacy", nativeAd.getPrivacyUrl$vungle_ads_release());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: registerViewForInteraction$lambda-4$lambda-3, reason: not valid java name */
    public static final void m3205registerViewForInteraction$lambda4$lambda3(NativeAd nativeAd, View view) {
        p.j(nativeAd, "this$0");
        NativeAdPresenter nativeAdPresenter = nativeAd.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.processCommand(NativeAdPresenter.DOWNLOAD, nativeAd.getCtaUrl$vungle_ads_release());
        }
    }

    public final boolean hasCallToAction() {
        if (getCtaUrl$vungle_ads_release().length() > 0) {
            return true;
        }
        return false;
    }

    public final void unregisterView() {
        Drawable drawable;
        if (getAdInternal$vungle_ads_release().getAdState() == AdInternal.AdState.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.clickableViews = null;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.adContentView = null;
        NativeAdOptionsView nativeAdOptionsView = this.adOptionsView;
        if (nativeAdOptionsView != null) {
            nativeAdOptionsView.destroy();
        }
        this.adOptionsView = null;
        try {
            ImageView imageView = this.adIconView;
            if (imageView != null) {
                drawable = imageView.getDrawable();
            } else {
                drawable = null;
            }
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.INSTANCE.w(TAG, "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.adIconView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.adIconView = null;
        NativeAdPresenter nativeAdPresenter = this.presenter;
        if (nativeAdPresenter != null) {
            nativeAdPresenter.detach();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(Context context, String str) {
        this(context, str, new AdConfig());
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(str, "placementId");
    }
}
