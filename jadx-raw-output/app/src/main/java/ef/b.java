package ef;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: GAMBaseAdListener.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class b<GAMAdType extends InternalGAMAd, UnifiedAdCallbackType extends UnifiedAdCallback> implements x<GAMAdType>, InternalGAMAdPresentListener {

    @NonNull
    private final UnifiedAdCallbackType callback;

    @Override // ef.x, ef.y
    public abstract /* synthetic */ void onAdLoaded(@NonNull GAMAdType gamadtype);

    @NonNull
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdClicked() {
        this.callback.onAdClicked();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdExpired() {
        this.callback.onAdExpired();
    }

    @Override // ef.x
    public void onAdLoadFailed(@NonNull BMError bMError) {
        this.callback.onAdLoadFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShowFailed(@NonNull BMError bMError) {
        this.callback.onAdShowFailed(bMError);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    public void onAdShown() {
        this.callback.onAdShown();
    }

    public b(@NonNull UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }
}
