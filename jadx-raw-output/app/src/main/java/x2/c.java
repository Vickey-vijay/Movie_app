package x2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: IronSourceBannerAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class c implements ISDemandOnlyBannerListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdClicked(@NonNull String str) {
        MediationBannerAdCallback mediationBannerAdCallbackC;
        Log.d(d.f74253a, String.format("IronSource banner ad clicked for instance ID: %s", str));
        b bVarD = b.d(str);
        if (bVarD == null || (mediationBannerAdCallbackC = bVarD.c()) == null) {
            return;
        }
        mediationBannerAdCallbackC.onAdOpened();
        mediationBannerAdCallbackC.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLeftApplication(@NonNull String str) {
        MediationBannerAdCallback mediationBannerAdCallbackC;
        Log.d(d.f74253a, String.format("IronSource banner ad has caused user to leave the application for instance ID: %s", str));
        b bVarD = b.d(str);
        if (bVarD == null || (mediationBannerAdCallbackC = bVarD.c()) == null) {
            return;
        }
        mediationBannerAdCallbackC.onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoadFailed(@NonNull String str, @NonNull IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.toString());
        b bVarD = b.d(str);
        if (bVarD == null) {
            return;
        }
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallbackB = bVarD.b();
        if (mediationAdLoadCallbackB != null) {
            mediationAdLoadCallbackB.onFailure(adError);
        }
        if (ironSourceError.getErrorCode() == 1050 || ironSourceError.getErrorCode() == 619) {
            return;
        }
        b.j(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdLoaded(@NonNull String str) {
        Log.d(d.f74253a, String.format("IronSource banner ad loaded for instance ID: %s", str));
        b bVarD = b.d(str);
        if (bVarD == null || bVarD.e() == null) {
            return;
        }
        bVarD.e().addView(bVarD.f());
        if (bVarD.b() != null) {
            bVarD.k(bVarD.b().onSuccess(bVarD));
        }
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener
    public void onBannerAdShown(@NonNull String str) {
        MediationBannerAdCallback mediationBannerAdCallbackC;
        Log.d(d.f74253a, String.format("IronSource banner ad shown for instance ID: %s", str));
        b bVarD = b.d(str);
        if (bVarD != null && (mediationBannerAdCallbackC = bVarD.c()) != null) {
            mediationBannerAdCallbackC.reportAdImpression();
        }
        b.a(str);
    }
}
