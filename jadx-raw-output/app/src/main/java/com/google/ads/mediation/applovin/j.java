package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import ck.p;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: AppLovinWaterfallAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements MediationAppOpenAd, MaxAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f18829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f18830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f18831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MaxAppOpenAd f18832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationAppOpenAdCallback f18833f;

    public j(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, d dVar, a aVar) {
        p.j(mediationAdLoadCallback, "loadCallback");
        p.j(dVar, "appLovinInitializer");
        p.j(aVar, "appLovinAdFactory");
        this.f18829b = mediationAdLoadCallback;
        this.f18830c = dVar;
        this.f18831d = aVar;
    }

    public static final void c(j jVar, String str) {
        MaxAppOpenAd maxAppOpenAdE = jVar.f18831d.e(str);
        jVar.f18832e = maxAppOpenAdE;
        if (maxAppOpenAdE != null) {
            maxAppOpenAdE.setListener(jVar);
        }
        MaxAppOpenAd maxAppOpenAd = jVar.f18832e;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.loadAd();
        }
    }

    public final void b(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        p.j(mediationAppOpenAdConfiguration, "appOpenAdConfiguration");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        p.i(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
        if (string == null || string.length() == 0) {
            this.f18829b.onFailure(new AdError(110, AppLovinMediationAdapter.ERROR_MSG_MISSING_SDK, AppLovinMediationAdapter.ERROR_DOMAIN));
            return;
        }
        final String string2 = serverParameters.getString("ad_unit_id");
        if (string2 == null || string2.length() == 0) {
            this.f18829b.onFailure(new AdError(113, "Ad Unit ID is missing.", AppLovinMediationAdapter.ERROR_DOMAIN));
        } else {
            this.f18830c.b(mediationAppOpenAdConfiguration.getContext(), string, new d.b() { // from class: com.google.ads.mediation.applovin.i
                @Override // com.google.ads.mediation.applovin.d.b
                public final void onInitializeSuccess() {
                    j.c(this.f18827a, string2);
                }
            });
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        p.j(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18833f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.reportAdClicked();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        p.j(maxAd, "ad");
        p.j(maxError, "appLovinError");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18833f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(new AdError(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        p.j(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18833f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdOpened();
        }
        MediationAppOpenAdCallback mediationAppOpenAdCallback2 = this.f18833f;
        if (mediationAppOpenAdCallback2 != null) {
            mediationAppOpenAdCallback2.reportAdImpression();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        p.j(maxAd, "ad");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18833f;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdClosed();
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        p.j(str, "p0");
        p.j(maxError, "appLovinError");
        this.f18829b.onFailure(new AdError(maxError.getCode(), maxError.getMessage(), AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN));
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        p.j(maxAd, "ad");
        this.f18833f = this.f18829b.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        MaxAppOpenAd maxAppOpenAd = this.f18832e;
        if (maxAppOpenAd != null) {
            if (maxAppOpenAd != null && maxAppOpenAd.isReady()) {
                MaxAppOpenAd maxAppOpenAd2 = this.f18832e;
                if (maxAppOpenAd2 != null) {
                    maxAppOpenAd2.showAd();
                    return;
                }
                return;
            }
            MediationAppOpenAdCallback mediationAppOpenAdCallback = this.f18833f;
            if (mediationAppOpenAdCallback != null) {
                mediationAppOpenAdCallback.onAdFailedToShow(new AdError(106, "Ad is not ready to be displayed", AppLovinMediationAdapter.ERROR_DOMAIN));
            }
        }
    }
}
