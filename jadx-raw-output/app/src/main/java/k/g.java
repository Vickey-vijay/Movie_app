package k;

import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements AdLoadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f62008a;

    public g(w wVar) {
        this.f62008a = wVar;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad2) {
        SplashAd splashAd = (SplashAd) ad2;
        k kVar = this.f62008a.f62040b;
        kVar.E = splashAd;
        splashAd.setAdInteractionListener((SplashAdInteractionListener) kVar.G);
        this.f62008a.f62040b.D.onAdLoaded();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        this.f62008a.f62040b.v(adError.getCode() + ", " + adError.getMessage());
    }
}
