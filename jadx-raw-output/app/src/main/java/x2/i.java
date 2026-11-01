package x2;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.applovin.mediation.AppLovinExtras;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdRequest;
import com.unity3d.ironsourceads.banner.BannerAdView;
import com.unity3d.ironsourceads.banner.BannerAdViewListener;

/* JADX INFO: compiled from: IronSourceRtbBannerAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class i implements MediationBannerAd, BannerAdLoaderListener, BannerAdViewListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public MediationBannerAdCallback f74264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f74265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FrameLayout f74266d;

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f74266d;
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdClicked(@NonNull BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f74264b;
        if (mediationBannerAdCallback == null) {
            return;
        }
        mediationBannerAdCallback.onAdOpened();
        this.f74264b.reportAdClicked();
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoadFailed(@NonNull IronSourceError ironSourceError) {
        if (this.f74265c == null) {
            return;
        }
        this.f74265c.onFailure(new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN));
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdLoaderListener
    public void onBannerAdLoaded(@NonNull BannerAdView bannerAdView) {
        if (this.f74266d == null || this.f74265c == null) {
            return;
        }
        bannerAdView.setListener(this);
        this.f74266d.addView(bannerAdView);
        this.f74264b = this.f74265c.onSuccess(this);
    }

    @Override // com.unity3d.ironsourceads.banner.BannerAdViewListener
    public void onBannerAdShown(@NonNull BannerAdView bannerAdView) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f74264b;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public i(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f74265c = mediationAdLoadCallback;
    }

    public void a(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "");
        if (TextUtils.isEmpty(string)) {
            this.f74265c.onFailure(a.a(101, "Missing or invalid instance ID."));
            return;
        }
        String watermark = mediationBannerAdConfiguration.getWatermark();
        Bundle bundle = new Bundle();
        bundle.putString(AppLovinExtras.Keys.KEY_WATERMARK, watermark);
        Context context = mediationBannerAdConfiguration.getContext();
        BannerAdRequest bannerAdRequestBuild = new BannerAdRequest.Builder(context, string, mediationBannerAdConfiguration.getBidResponse(), a.d(context, mediationBannerAdConfiguration.getAdSize())).withExtraParams(bundle).build();
        this.f74266d = new FrameLayout(context);
        BannerAdLoader.loadAd(bannerAdRequestBuild, this);
    }
}
