package mf;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.core.VisibilitySource;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.mraid.MraidView;
import io.bidmachine.measurer.MraidOMSDKAdMeasurer;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdCallback;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.utils.BMError;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MraidBannerAd.java */
/* JADX INFO: loaded from: classes2.dex */
public class a extends UnifiedBannerAd {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @NonNull
    private final AtomicBoolean isPrepareToShowExecuted = new AtomicBoolean(false);

    @Nullable
    private MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer;

    @Nullable
    @VisibleForTesting
    public MraidView mraidView;

    /* JADX INFO: renamed from: mf.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MraidBannerAd.java */
    public class RunnableC0586a implements Runnable {
        public final /* synthetic */ Context val$applicationContext;
        public final /* synthetic */ UnifiedBannerAdCallback val$callback;
        public final /* synthetic */ String val$creativeAdm;
        public final /* synthetic */ m val$mraidParams;

        public RunnableC0586a(m mVar, UnifiedBannerAdCallback unifiedBannerAdCallback, Context context, String str) {
            this.val$mraidParams = mVar;
            this.val$callback = unifiedBannerAdCallback;
            this.val$applicationContext = context;
            this.val$creativeAdm = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.mraidView = new MraidView.Builder().setCacheControl(this.val$mraidParams.cacheControl).setPlaceholderTimeoutSec(this.val$mraidParams.placeholderTimeoutSec).setListener(new f(this.val$callback)).setAdMeasurer(a.this.mraidOMSDKAdMeasurer).build(this.val$applicationContext);
                a.this.mraidView.load(this.val$creativeAdm);
            } catch (Throwable th2) {
                Logger.w(th2);
                this.val$callback.onAdLoadFailed(BMError.throwable("Exception loading MRAID banner object", th2));
            }
        }
    }

    /* JADX INFO: compiled from: MraidBannerAd.java */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a.this.destroyMraidView();
            } catch (Throwable th2) {
                Logger.w(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyMraidView() {
        MraidView mraidView = this.mraidView;
        if (mraidView != null) {
            mraidView.destroy();
            this.mraidView = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void load(@NonNull ContextProvider contextProvider, @NonNull UnifiedBannerAdCallback unifiedBannerAdCallback, @NonNull UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, @NonNull UnifiedMediationParams unifiedMediationParams, @NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        String strPrepareCreativeForMeasure;
        m mVar = new m(unifiedMediationParams);
        if (mVar.isValid(unifiedBannerAdCallback)) {
            unifiedBannerAdCallback.setVisibilitySource(mVar.cacheControl == CacheControl.FullLoad ? VisibilitySource.BidMachine : VisibilitySource.All);
            Context applicationContext = contextProvider.getApplicationContext();
            if (mVar.omsdkEnabled) {
                MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = new MraidOMSDKAdMeasurer(true);
                this.mraidOMSDKAdMeasurer = mraidOMSDKAdMeasurer;
                strPrepareCreativeForMeasure = mraidOMSDKAdMeasurer.prepareCreativeForMeasure(mVar.creativeAdm);
            } else {
                strPrepareCreativeForMeasure = mVar.creativeAdm;
            }
            Utils.onUiThread(new RunnableC0586a(mVar, unifiedBannerAdCallback, applicationContext, strPrepareCreativeForMeasure));
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onDestroy() {
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer == null) {
            destroyMraidView();
        } else {
            mraidOMSDKAdMeasurer.destroy(new b());
            this.mraidOMSDKAdMeasurer = null;
        }
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        MraidOMSDKAdMeasurer mraidOMSDKAdMeasurer = this.mraidOMSDKAdMeasurer;
        if (mraidOMSDKAdMeasurer != null) {
            mraidOMSDKAdMeasurer.trackShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedViewAd
    public void prepareToShow() throws Throwable {
        MraidView mraidView;
        super.prepareToShow();
        if (this.isPrepareToShowExecuted.compareAndSet(false, true) && (mraidView = this.mraidView) != null) {
            mraidView.show(null);
        }
    }
}
