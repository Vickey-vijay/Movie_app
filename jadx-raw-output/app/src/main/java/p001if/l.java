package p001if;

import android.app.Activity;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.ContextProvider;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;
import java.util.Map;

/* JADX INFO: compiled from: GAMFullscreenAd.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l extends UnifiedFullscreenAd {

    @NonNull
    public final o gamNetwork;

    @Nullable
    @VisibleForTesting(otherwise = 4)
    public InternalFullscreenAd internalFullscreenAd;

    @Nullable
    public abstract InternalFullscreenAdPresentListener getPresentListener();

    @Override // io.bidmachine.unified.UnifiedAd
    @Nullable
    public Map<String, Object> getCustomParams() {
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            return internalFullscreenAd.getCustomParamsMap();
        }
        return null;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    @CallSuper
    public void onDestroy() {
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            internalFullscreenAd.destroy();
            this.internalFullscreenAd = null;
        }
    }

    public l(@NonNull o oVar) {
        this.gamNetwork = oVar;
    }

    @Override // io.bidmachine.unified.UnifiedAd
    public void onShown() {
        super.onShown();
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd != null) {
            internalFullscreenAd.onAdShown();
        }
    }

    @Override // io.bidmachine.unified.UnifiedFullscreenAd
    public void show(@NonNull ContextProvider contextProvider, @NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) throws Throwable {
        Activity activity = contextProvider.getActivity();
        if (activity == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Activity is null"));
            return;
        }
        InternalFullscreenAd internalFullscreenAd = this.internalFullscreenAd;
        if (internalFullscreenAd == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen object is null"));
            return;
        }
        if (internalFullscreenAd.isExpired()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen object is expired"));
            return;
        }
        if (!this.internalFullscreenAd.isLoaded()) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen object not loaded"));
            return;
        }
        InternalFullscreenAdPresentListener presentListener = getPresentListener();
        if (presentListener == null) {
            unifiedFullscreenAdCallback.onAdShowFailed(BMError.internal("Fullscreen listener is null"));
        } else {
            this.internalFullscreenAd.show(activity, presentListener);
        }
    }
}
