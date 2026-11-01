package r2;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import q2.e;

/* JADX INFO: compiled from: FacebookRtbBannerAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class a implements MediationBannerAd, AdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationBannerAdConfiguration f66656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f66657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdView f66658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FrameLayout f66659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f66660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f66661g;

    public void a() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f66656b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f66657c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f66656b);
        try {
            this.f66658d = this.f66661g.c(this.f66656b.getContext(), placementID, this.f66656b.getBidResponse());
            if (!TextUtils.isEmpty(this.f66656b.getWatermark())) {
                this.f66658d.setExtraHints(new ExtraHints.Builder().mediationData(this.f66656b.getWatermark()).build());
            }
            Context context = this.f66656b.getContext();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f66656b.getAdSize().getWidthInPixels(context), -2);
            this.f66659e = new FrameLayout(context);
            this.f66658d.setLayoutParams(layoutParams);
            this.f66659e.addView(this.f66658d);
            AdView adView = this.f66658d;
            adView.loadAd(adView.buildLoadAdConfig().withAdListener(this).withBid(this.f66656b.getBidResponse()).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(111, "Failed to create banner ad: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f66657c.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f66659e;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66660f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
            this.f66660f.onAdOpened();
            this.f66660f.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad2) {
        this.f66660f = this.f66657c.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad2) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66660f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, e eVar) {
        this.f66656b = mediationBannerAdConfiguration;
        this.f66657c = mediationAdLoadCallback;
        this.f66661g = eVar;
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad2, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        this.f66657c.onFailure(adError2);
    }
}
