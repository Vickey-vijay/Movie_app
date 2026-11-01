package x2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: IronSourceInterstitialAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements ISDemandOnlyInterstitialListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(@NonNull String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackB;
        Log.d(d.f74253a, String.format("IronSource interstitial ad clicked for instance ID: %s", str));
        e eVarA = e.a(str);
        if (eVarA == null || (mediationInterstitialAdCallbackB = eVarA.b()) == null) {
            return;
        }
        mediationInterstitialAdCallbackB.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(@NonNull String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackB;
        Log.d(d.f74253a, String.format("IronSource interstitial ad closed for instance ID: %s", str));
        e eVarA = e.a(str);
        if (eVarA != null && (mediationInterstitialAdCallbackB = eVarA.b()) != null) {
            mediationInterstitialAdCallbackB.onAdClosed();
        }
        e.i(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(@NonNull String str, @NonNull IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.toString());
        e eVarA = e.a(str);
        if (eVarA != null && eVarA.d() != null) {
            eVarA.d().onFailure(adError);
        }
        e.i(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(@NonNull String str) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackB;
        Log.d(d.f74253a, String.format("IronSource interstitial ad opened for instance ID: %s", str));
        e eVarA = e.a(str);
        if (eVarA == null || (mediationInterstitialAdCallbackB = eVarA.b()) == null) {
            return;
        }
        mediationInterstitialAdCallbackB.onAdOpened();
        mediationInterstitialAdCallbackB.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(@NonNull String str) {
        Log.d(d.f74253a, String.format("IronSource interstitial ad is ready for instance ID: %s", str));
        e eVarA = e.a(str);
        if (eVarA == null || eVarA.d() == null) {
            return;
        }
        eVarA.j(eVarA.d().onSuccess(eVarA));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(@NonNull String str, @NonNull IronSourceError ironSourceError) {
        MediationInterstitialAdCallback mediationInterstitialAdCallbackB;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.w(d.f74253a, adError.toString());
        e eVarA = e.a(str);
        if (eVarA != null && (mediationInterstitialAdCallbackB = eVarA.b()) != null) {
            mediationInterstitialAdCallbackB.onAdFailedToShow(adError);
        }
        e.i(str);
    }
}
