package i3;

import ck.p;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;

/* JADX INFO: compiled from: VungleWaterfallBannerAd.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class b extends g3.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        super(mediationAdLoadCallback, bVar);
        p.j(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.j(bVar, "vungleFactory");
    }

    @Override // g3.b
    public void d(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        p.j(vungleBannerView, "bannerAdView");
        p.j(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        vungleBannerView.load(null);
    }
}
