package p001if;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalInterstitialAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalInterstitialAdListener.java */
/* JADX INFO: loaded from: classes10.dex */
public interface f0 extends c0<InternalInterstitialAd>, InternalFullscreenAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    /* synthetic */ void onAdClosed();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener
    /* synthetic */ void onAdComplete();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // p001if.c0
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // p001if.c0
    /* synthetic */ void onAdLoaded(@NonNull InternalAd internalAd);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalFullscreenAdPresentListener, io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShown();
}
