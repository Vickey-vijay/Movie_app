package xe;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f74441a;

    public e(r rVar) {
        this.f74441a = rVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        InterstitialAd interstitialAd = (InterstitialAd) ad2;
        g gVar = this.f74441a.f74465a;
        gVar.D = interstitialAd;
        interstitialAd.setAdInteractionListener(gVar.F);
        this.f74441a.f74465a.C.onAdLoaded();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f74441a.f74465a.v(adError.getCode() + ", " + adError.getMessage());
    }
}
