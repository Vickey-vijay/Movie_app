package p001if;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMBaseAdListener.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class i<InternalAdType extends InternalAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements c0<InternalAdType>, InternalAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    @Override // p001if.c0
    public abstract /* synthetic */ void onAdLoaded(@NonNull InternalAdType internaladtype);

    @NonNull
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // p001if.c0
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }

    public i(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }
}
