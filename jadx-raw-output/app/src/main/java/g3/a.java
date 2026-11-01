package g3;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import ck.p;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.vungle.ads.AdConfig;
import com.vungle.ads.BaseAd;
import com.vungle.ads.InterstitialAd;
import com.vungle.ads.InterstitialAdListener;
import com.vungle.ads.VungleError;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: VungleAppOpenAd.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements MediationAppOpenAd, InterstitialAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f53021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f53022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterstitialAd f53023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationAppOpenAdCallback f53024e;

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: VungleAppOpenAd.kt */
    public static final class C0473a implements c.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Bundle f53026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f53027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f53028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f53029e;

        public C0473a(Bundle bundle, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, Context context, String str) {
            this.f53026b = bundle;
            this.f53027c = mediationAppOpenAdConfiguration;
            this.f53028d = context;
            this.f53029e = str;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            p.j(adError, "error");
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            a.this.f53021b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            AdConfig adConfigA = a.this.f53022c.a();
            if (this.f53026b.containsKey("adOrientation")) {
                adConfigA.setAdOrientation(this.f53026b.getInt("adOrientation", 2));
            }
            a.this.f(adConfigA, this.f53027c);
            a aVar = a.this;
            com.google.ads.mediation.vungle.b bVar = aVar.f53022c;
            Context context = this.f53028d;
            String str = this.f53029e;
            p.g(str);
            aVar.f53023d = bVar.c(context, str, adConfigA);
            InterstitialAd interstitialAd = a.this.f53023d;
            InterstitialAd interstitialAd2 = null;
            if (interstitialAd == null) {
                p.B("appOpenAd");
                interstitialAd = null;
            }
            interstitialAd.setAdListener(a.this);
            InterstitialAd interstitialAd3 = a.this.f53023d;
            if (interstitialAd3 == null) {
                p.B("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.load(a.this.e(this.f53027c));
        }
    }

    public abstract String e(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void f(AdConfig adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
    }

    public a(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        p.j(mediationAdLoadCallback, "mediationAdLoadCallback");
        p.j(bVar, "vungleFactory");
        this.f53021b = mediationAdLoadCallback;
        this.f53022c = bVar;
    }

    public final void g(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.j(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        p.i(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        p.i(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            this.f53021b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(VungleMediationAdapter.TAG, adError2.toString());
            this.f53021b.onFailure(adError2);
        } else {
            Context context = mediationAppOpenAdConfiguration.getContext();
            p.i(context, "getContext(...)");
            c cVarA = c.a();
            p.g(string);
            cVarA.b(string, context, new C0473a(mediationExtras, mediationAppOpenAdConfiguration, context, string2));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        p.j(baseAd, "baseAd");
        p.j(vungleError, "adError");
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        p.i(adError, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f53021b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        p.j(baseAd, "baseAd");
        p.j(vungleError, "adError");
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        p.i(adError, "getAdError(...)");
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
        this.f53024e = this.f53021b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
        p.j(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        InterstitialAd interstitialAd = this.f53023d;
        InterstitialAd interstitialAd2 = null;
        if (interstitialAd == null) {
            p.B("appOpenAd");
            interstitialAd = null;
        }
        if (interstitialAd.canPlayAd().booleanValue()) {
            InterstitialAd interstitialAd3 = this.f53023d;
            if (interstitialAd3 == null) {
                p.B("appOpenAd");
            } else {
                interstitialAd2 = interstitialAd3;
            }
            interstitialAd2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f53024e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
