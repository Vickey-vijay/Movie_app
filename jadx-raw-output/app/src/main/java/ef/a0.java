package ef;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam.InternalGAMAd;
import io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam.InternalGAMInterstitialAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalGAMInterstitialAdListener.java */
/* JADX INFO: loaded from: classes11.dex */
public interface a0 extends x<InternalGAMInterstitialAd>, InternalGAMFullscreenAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdClosed();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener
    /* synthetic */ void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // ef.x
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // ef.x, ef.y
    /* synthetic */ void onAdLoaded(@NonNull InternalGAMAd internalGAMAd);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam.InternalGAMFullscreenAdPresentListener, io.bidmachine.ads.networks.gam.InternalGAMAdPresentListener
    /* synthetic */ void onAdShown();
}
