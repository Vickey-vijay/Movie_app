package p001if;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;

/* JADX INFO: compiled from: GAMFullscreenAdListener.java */
/* JADX INFO: loaded from: classes2.dex */
public class m<InternalAdType extends InternalFullscreenAd> extends i<InternalAdType, UnifiedFullscreenAdCallback> implements InternalFullscreenAdPresentListener {

    @NonNull
    private final l gamFullscreenAd;

    @Override // p001if.i, p001if.c0
    public void onAdLoaded(@NonNull InternalAdType internaladtype) {
        this.gamFullscreenAd.internalFullscreenAd = internaladtype;
        getCallback().onAdLoaded();
    }

    public m(@NonNull UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, @NonNull l lVar) {
        super(unifiedFullscreenAdCallback);
        this.gamFullscreenAd = lVar;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdClosed() {
        getCallback().onAdClosed();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    public void onAdComplete() {
        getCallback().onAdFinished();
    }
}
