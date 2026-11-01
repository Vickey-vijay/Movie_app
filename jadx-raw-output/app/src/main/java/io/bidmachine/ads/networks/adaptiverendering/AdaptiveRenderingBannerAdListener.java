package io.bidmachine.ads.networks.adaptiverendering;

import android.content.Context;
import ck.p;
import com.ironsource.Mf;
import io.bidmachine.core.Utils;
import io.bidmachine.rendering.ad.view.AdView;
import io.bidmachine.rendering.ad.view.AdViewListener;
import io.bidmachine.rendering.model.BrokenCreativeEvent;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.view.PrivacySheetDialog;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.utils.BMError;
import kotlin.Metadata;

/* JADX INFO: compiled from: AdaptiveRenderingBannerAdListener.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lio/bidmachine/ads/networks/adaptiverendering/AdaptiveRenderingBannerAdListener;", "Lio/bidmachine/rendering/ad/view/AdViewListener;", "Lio/bidmachine/rendering/ad/view/AdView;", "adView", "Lmj/r;", Mf.f27060j, "Lio/bidmachine/rendering/model/Error;", "error", "onAdFailToLoad", "onAdShown", "onAdFailToShow", Mf.f27056f, "onAdFinished", "onAdAppeared", "onAdDisappeared", "onAdExpired", "Lio/bidmachine/rendering/model/PrivacySheetParams;", "privacySheetParams", "onOpenPrivacySheet", "Lio/bidmachine/rendering/model/BrokenCreativeEvent;", "brokenCreativeEvent", "onBrokenCreativeEvent", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "callback", "Lio/bidmachine/unified/UnifiedBannerAdCallback;", "<init>", "(Lio/bidmachine/unified/UnifiedBannerAdCallback;)V", "bidmachine-android-sdk_bi_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class AdaptiveRenderingBannerAdListener implements AdViewListener {
    private final UnifiedBannerAdCallback callback;

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdAppeared(AdView adView) {
        p.j(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdDisappeared(AdView adView) {
        p.j(adView, "adView");
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFinished(AdView adView) {
        p.j(adView, "adView");
    }

    public AdaptiveRenderingBannerAdListener(UnifiedBannerAdCallback unifiedBannerAdCallback) {
        p.j(unifiedBannerAdCallback, "callback");
        this.callback = unifiedBannerAdCallback;
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdClicked(AdView adView) {
        p.j(adView, "adView");
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdExpired(AdView adView) {
        p.j(adView, "adView");
        this.callback.onAdExpired();
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFailToLoad(AdView adView, Error error) {
        p.j(adView, "adView");
        p.j(error, "error");
        UnifiedBannerAdCallback unifiedBannerAdCallback = this.callback;
        BMError bMError = BMError.NoFill;
        p.i(bMError, "NoFill");
        unifiedBannerAdCallback.onAdLoadFailed(AdaptiveRenderingAdapterKt.toBMError(error, bMError));
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdFailToShow(AdView adView, Error error) {
        p.j(adView, "adView");
        p.j(error, "error");
        UnifiedBannerAdCallback unifiedBannerAdCallback = this.callback;
        BMError bMError = BMError.InternalUnknownError;
        p.i(bMError, "InternalUnknownError");
        unifiedBannerAdCallback.onAdShowFailed(AdaptiveRenderingAdapterKt.toBMError(error, bMError));
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdLoaded(AdView adView) {
        p.j(adView, "adView");
        this.callback.onAdLoaded(adView);
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onAdShown(AdView adView) {
        p.j(adView, "adView");
        this.callback.onAdShown();
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onBrokenCreativeEvent(AdView adView, BrokenCreativeEvent brokenCreativeEvent) {
        p.j(adView, "adView");
        p.j(brokenCreativeEvent, "brokenCreativeEvent");
        this.callback.onBrokenCreativeEvent(AdaptiveRenderingAdapterKt.toEventParams(brokenCreativeEvent));
    }

    @Override // io.bidmachine.rendering.ad.view.AdViewListener, io.bidmachine.rendering.ad.AdListener
    public void onOpenPrivacySheet(AdView adView, PrivacySheetParams privacySheetParams) {
        p.j(adView, "adView");
        p.j(privacySheetParams, "privacySheetParams");
        PrivacySheetDialog.Companion companion = PrivacySheetDialog.INSTANCE;
        Context contextFindDialogContext = Utils.findDialogContext(adView.getContext(), adView);
        p.i(contextFindDialogContext, "findDialogContext(adView.context, adView)");
        companion.show(contextFindDialogContext, privacySheetParams);
    }
}
