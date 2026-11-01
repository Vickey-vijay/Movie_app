package g3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.ads.mediation.vungle.c;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.BannerAdListener;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.VungleError;
import com.vungle.mediation.VungleInterstitialAdapter;

/* JADX INFO: compiled from: VungleBannerAd.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b implements MediationBannerAd, BannerAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f53030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationBannerAdCallback f53031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VungleBannerView f53032d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f53033e;

    /* JADX INFO: compiled from: VungleBannerAd.java */
    public class a implements c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53035b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ VungleAdSize f53036c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f53037d;

        public a(Context context, String str, VungleAdSize vungleAdSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f53034a = context;
            this.f53035b = str;
            this.f53036c = vungleAdSize;
            this.f53037d = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            Log.w(VungleMediationAdapter.TAG, adError.toString());
            b.this.f53030b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            b.this.c(this.f53034a, this.f53035b, this.f53036c, this.f53037d);
        }
    }

    public abstract void d(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration);

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
    }

    public final void c(Context context, String str, VungleAdSize vungleAdSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        VungleBannerView vungleBannerViewB = this.f53033e.b(context, str, vungleAdSize);
        this.f53032d = vungleBannerViewB;
        vungleBannerViewB.setAdListener(this);
        d(this.f53032d, mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f53032d;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f53031c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f53031c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f53031c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f53031c;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        this.f53031c = this.f53030b.onSuccess(this);
    }

    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f53030b = mediationAdLoadCallback;
        this.f53033e = bVar;
    }

    public void e(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError.getMessage());
            this.f53030b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding banner ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.e(VungleMediationAdapter.TAG, adError2.getMessage());
            this.f53030b.onFailure(adError2);
        } else {
            Context context = mediationBannerAdConfiguration.getContext();
            c.a().b(string, context, new a(context, string2, VungleInterstitialAdapter.getVungleBannerAdSizeFromGoogleAdSize(mediationBannerAdConfiguration.getAdSize(), string2), mediationBannerAdConfiguration));
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        Log.w(VungleMediationAdapter.TAG, adError.toString());
        this.f53030b.onFailure(adError);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }
}
