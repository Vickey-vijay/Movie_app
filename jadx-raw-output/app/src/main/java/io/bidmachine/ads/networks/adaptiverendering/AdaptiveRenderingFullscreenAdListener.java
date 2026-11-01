package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import ck.p;
import com.ironsource.C3537j8;
import com.ironsource.Mf;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAd;
import io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingFullscreenAdListener.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u0019\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingFullscreenAdListener;", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAdListener;", "Lio/bidmachine/rendering/ad/fullscreen/FullScreenAd;", "fullScreenAd", "Lmj/r;", Mf.f27060j, "Lio/bidmachine/rendering/model/Error;", "error", "onAdFailToLoad", "onAdShown", "onAdFailToShow", Mf.f27056f, "onAdFinished", "onAdAppeared", "onAdDisappeared", "onAdExpired", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "onOpenPrivacySheet", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "brokenCreativeEvent", "onBrokenCreativeEvent", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedFullscreenAdCallback;", "Landroid/content/Context;", "applicationContext", "Landroid/content/Context;", "", C3537j8.f29259m, "Z", GAMConfig.KEY_CONTEXT, "<init>", "(Landroid/content/Context;Lio/bidmachine/unified/UnifiedFullscreenAdCallback;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdaptiveRenderingFullscreenAdListener implements FullScreenAdListener {
    private final Context applicationContext;
    private final UnifiedFullscreenAdCallback callback;
    private volatile boolean isShown;

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdAppeared(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdDisappeared(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
    }

    public AdaptiveRenderingFullscreenAdListener(Context context, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(unifiedFullscreenAdCallback, "callback");
        this.callback = unifiedFullscreenAdCallback;
        Context applicationContext = context.getApplicationContext();
        p.i(applicationContext, "context.applicationContext");
        this.applicationContext = applicationContext;
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdClicked(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdExpired(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFailToLoad(FullScreenAd fullScreenAd, Error error) {
        p.j(fullScreenAd, "fullScreenAd");
        p.j(error, "error");
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.callback;
        BMError bMError = BMError.NoFill;
        p.i(bMError, "NoFill");
        unifiedFullscreenAdCallback.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, bMError));
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFailToShow(FullScreenAd fullScreenAd, Error error) {
        p.j(fullScreenAd, "fullScreenAd");
        p.j(error, "error");
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.callback;
        BMError bMError = BMError.InternalUnknownError;
        p.i(bMError, "InternalUnknownError");
        unifiedFullscreenAdCallback.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, bMError));
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFinished(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
        if (this.isShown) {
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdLoaded(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
        this.callback.onAdLoaded();
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onAdShown(FullScreenAd fullScreenAd) {
        p.j(fullScreenAd, "fullScreenAd");
        this.isShown = true;
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onBrokenCreativeEvent(FullScreenAd fullScreenAd, BrokenCreativeEvent brokenCreativeEvent) {
        p.j(fullScreenAd, "fullScreenAd");
        p.j(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // io.bidmachine.rendering.ad.fullscreen.FullScreenAdListener, io.bidmachine.rendering.ad.AdListener
    public void onOpenPrivacySheet(FullScreenAd fullScreenAd, PrivacySheetParams privacySheetParams) {
        p.j(fullScreenAd, "fullScreenAd");
        p.j(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context contextFindDialogContext = Utils.findDialogContext(this.applicationContext);
        p.i(contextFindDialogContext, "findDialogContext(applicationContext)");
        companion.show(contextFindDialogContext, privacySheetParams);
    }
}
