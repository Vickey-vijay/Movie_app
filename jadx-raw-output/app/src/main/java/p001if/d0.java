package p001if;

import androidx.annotation.NonNull;
import io.bidmachine.ads.networks.gam_dynamic.InternalAd;
import io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener;
import io.bidmachine.ads.networks.gam_dynamic.InternalBannerAd;
import io.bidmachine.utils.BMError;

/* JADX INFO: compiled from: InternalBannerAdListener.java */
/* JADX INFO: loaded from: classes9.dex */
public interface d0 extends c0<InternalBannerAd>, InternalAdPresentListener {
    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdClicked();

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdExpired();

    @Override // p001if.c0
    /* synthetic */ void onAdLoadFailed(@NonNull BMError bMError);

    @Override // p001if.c0
    /* synthetic */ void onAdLoaded(@NonNull InternalAd internalAd);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShowFailed(@NonNull BMError bMError);

    @Override // io.bidmachine.ads.networks.gam_dynamic.InternalAdPresentListener
    /* synthetic */ void onAdShown();
}
