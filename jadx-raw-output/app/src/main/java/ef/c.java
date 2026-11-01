package ef;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAd;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* JADX INFO: compiled from: GAMFullscreenAdListener.java */
/* JADX INFO: loaded from: classes5.dex */
public class c<GAMAdType extends InternalGAMFullscreenAd> extends b<GAMAdType, UnifiedFullscreenAdCallback> implements InternalGAMFullscreenAdPresentListener {
    @Override // ef.b, ef.x, ef.y
    public void onAdLoaded(@NonNull GAMAdType gamadtype) {
        getCallback().onAdLoaded();
    }

    public c(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        super(unifiedFullscreenAdCallback);
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }
}
