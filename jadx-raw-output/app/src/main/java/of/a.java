package of;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.iab.vast.VastRequest;
import io.bidmachine.iab.vast.VideoType;
import io.bidmachine.iab.vast.activity.VastView;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.measurer.VastOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: VastFullScreenAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends UnifiedFullscreenAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private MraidOMSDKAdMeasurer postBannerAdMeasurer;

    @Nullable
    private b vastAdLoadListener;

    @Nullable
    private d vastAdShowListener;

    @Nullable
    private VastOMSDKAdMeasurer vastOMSDKAdMeasurer;

    @Nullable
    private VastRequest vastRequest;

    @Nullable
    private VastView vastView;

    @NonNull
    private final VideoType videoType;

    /* JADX INFO: renamed from: of.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VastFullScreenAd.java */
    public class RunnableC0599a implements Runnable {
        public RunnableC0599a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.destroyVastView();
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        this.vastAdLoadListener = null;
        this.vastAdShowListener = null;
        VastOMSDKAdMeasurer vastOMSDKAdMeasurer = this.vastOMSDKAdMeasurer;
        if (vastOMSDKAdMeasurer != null) {
            vastOMSDKAdMeasurer.destroy();
            this.vastOMSDKAdMeasurer = null;
        }
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.postBannerAdMeasurer;
        if (mraidOMSDKAdMeasurer != null) {
            mraidOMSDKAdMeasurer.destroy(new RunnableC0599a());
            this.postBannerAdMeasurer = null;
        } else {
            destroyVastView();
        }
        if (this.vastRequest != null) {
            this.vastRequest = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyVastView() {
        VastView vastView = this.vastView;
        if (vastView != null) {
            vastView.destroy();
            this.vastView = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        e eVar = new e(unifiedMediationParams);
        if (eVar.isValid(unifiedFullscreenAdCallback)) {
            if (eVar.omsdkEnabled) {
                this.vastOMSDKAdMeasurer = new VastOMSDKAdMeasurer();
                this.postBannerAdMeasurer = new MraidOMSDKAdMeasurer();
            }
            Context applicationContext = contextProvider.getApplicationContext();
            this.vastAdLoadListener = new b(unifiedFullscreenAdCallback);
            this.vastView = new VastView(applicationContext);
            VastRequest vastRequestBuild = VastRequest.newBuilder().setCacheControl(eVar.cacheControl).setPlaceholderTimeoutSec(eVar.placeholderTimeoutSec).setVideoCloseTime(eVar.skipOffset).setCompanionCloseTime(eVar.companionSkipOffset).forceUseNativeCloseTime(eVar.useNativeClose).setAdMeasurer(this.vastOMSDKAdMeasurer).build();
            this.vastRequest = vastRequestBuild;
            vastRequestBuild.loadVideoWithData(applicationContext, eVar.creativeAdm, this.vastAdLoadListener);
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        VastRequest vastRequest = this.vastRequest;
        if (vastRequest == null || !vastRequest.canDisplay()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("VAST fullscreen object is null or can not find video file"));
        } else {
            this.vastAdShowListener = new d(unifiedFullscreenAdCallback, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
            this.vastRequest.display(contextProvider.getContext(), this.videoType, this.vastAdShowListener, this.vastView, this.vastOMSDKAdMeasurer, this.postBannerAdMeasurer);
        }
    }

    public a(@NonNull VideoType videoType) {
        this.videoType = videoType;
    }
}
