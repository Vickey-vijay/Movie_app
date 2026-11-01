package mf;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.iab.mraid.MraidInterstitial;
import io.bidmachine.iab.mraid.MraidType;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: MraidFullScreenAd.java */
/* JADX INFO: loaded from: classes8.dex */
public class g extends UnifiedFullscreenAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Nullable
    private MraidInterstitial mraidInterstitial;

    @Nullable
    private MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;

    @NonNull
    private final MraidType mraidType;

    /* JADX INFO: compiled from: MraidFullScreenAd.java */
    public class a implements Runnable {
        public final /* synthetic */ Context val$applicationContext;
        public final /* synthetic */ UnifiedFullscreenAdCallback val$callback;
        public final /* synthetic */ String val$creativeAdm;
        public final /* synthetic */ m val$mraidParams;

        public a(m mVar, Context context, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, String str) {
            this.val$mraidParams = mVar;
            this.val$applicationContext = context;
            this.val$callback = unifiedFullscreenAdCallback;
            this.val$creativeAdm = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.mraidInterstitial = MraidInterstitial.newBuilder().setCacheControl(this.val$mraidParams.cacheControl).setPlaceholderTimeoutSec(this.val$mraidParams.placeholderTimeoutSec).setCloseTime(this.val$mraidParams.skipOffset).forceUseNativeCloseButton(this.val$mraidParams.useNativeClose).setListener(new l(this.val$applicationContext, this.val$callback, g.this.mraidOMSDKAdMeasurer)).setR1(this.val$mraidParams.f64518r1).setR2(this.val$mraidParams.f64519r2).setDurationSec(this.val$mraidParams.progressDuration).setProductLink(this.val$mraidParams.storeUrl).setCloseStyle(this.val$mraidParams.closeableViewStyle).setCountDownStyle(this.val$mraidParams.countDownStyle).setProgressStyle(this.val$mraidParams.progressStyle).setAdMeasurer(g.this.mraidOMSDKAdMeasurer).build(this.val$applicationContext);
                g.this.mraidInterstitial.load(this.val$creativeAdm);
            } catch (Throwable th2) {
                Logger.w(th2);
                this.val$callback.onAdLoadFailed(BMError.throwable("Exception loading MRAID fullscreen object", th2));
            }
        }
    }

    /* JADX INFO: compiled from: MraidFullScreenAd.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                g.this.destroyMraidInterstitial();
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyMraidInterstitial() {
        MraidInterstitial mraidInterstitial = this.mraidInterstitial;
        if (mraidInterstitial != null) {
            mraidInterstitial.destroy();
            this.mraidInterstitial = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        String strPrepareCreativeForMeasure;
        m mVar = new m(unifiedMediationParams);
        if (mVar.isValid(unifiedFullscreenAdCallback)) {
            Context applicationContext = contextProvider.getApplicationContext();
            if (mVar.omsdkEnabled) {
                MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = new MraidOMSDKAdMeasurer();
                this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer;
                strPrepareCreativeForMeasure = mraidOMSDKAdMeasurer.prepareCreativeForMeasure(mVar.creativeAdm);
            } else {
                strPrepareCreativeForMeasure = mVar.creativeAdm;
            }
            Utils.onUiThread(new a(mVar, applicationContext, unifiedFullscreenAdCallback, strPrepareCreativeForMeasure));
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer == null) {
            destroyMraidInterstitial();
        } else {
            mraidOMSDKAdMeasurer.destroy(new b());
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        MraidInterstitial mraidInterstitial = this.mraidInterstitial;
        if (mraidInterstitial == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("MRAID fullscreen object is null"));
            return;
        }
        if (!mraidInterstitial.isReady()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("MRAID fullscreen object is not ready"));
        } else if (this.mraidInterstitial.isShown()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("MRAID fullscreen object is already was shown"));
        } else {
            this.mraidInterstitial.show(contextProvider.getContext(), this.mraidType);
        }
    }

    public g(@NonNull MraidType mraidType) {
        this.mraidType = mraidType;
    }
}
