package x2;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.ironsource.IronSourceMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: IronSourceRewardedAdListener.java */
/* JADX INFO: loaded from: classes6.dex */
public class h implements ISDemandOnlyRewardedVideoListener {
    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(@NonNull String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackD;
        Log.d(d.f74253a, String.format("IronSource rewarded ad clicked for instance ID: %s", str));
        g gVarA = g.a(str);
        if (gVarA == null || (mediationRewardedAdCallbackD = gVarA.d()) == null) {
            return;
        }
        mediationRewardedAdCallbackD.reportAdClicked();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(@NonNull String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackD;
        Log.d(d.f74253a, String.format("IronSource rewarded ad closed for instance ID: %s", str));
        g gVarA = g.a(str);
        if (gVarA != null && (mediationRewardedAdCallbackD = gVarA.d()) != null) {
            mediationRewardedAdCallbackD.onAdClosed();
        }
        g.i(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(@NonNull String str, @NonNull IronSourceError ironSourceError) {
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(d.f74253a, adError.toString());
        g gVarA = g.a(str);
        if (gVarA != null && gVarA.c() != null) {
            gVarA.c().onFailure(adError);
        }
        g.i(str);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(@NonNull String str) {
        Log.d(d.f74253a, String.format("IronSource rewarded ad loaded for instance ID: %s", str));
        g gVarA = g.a(str);
        if (gVarA == null || gVarA.c() == null) {
            return;
        }
        gVarA.j(gVarA.c().onSuccess(gVarA));
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(@NonNull String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackD;
        Log.d(d.f74253a, String.format("IronSource rewarded ad opened for instance ID: %s", str));
        g gVarA = g.a(str);
        if (gVarA == null || (mediationRewardedAdCallbackD = gVarA.d()) == null) {
            return;
        }
        mediationRewardedAdCallbackD.onAdOpened();
        mediationRewardedAdCallbackD.onVideoStart();
        mediationRewardedAdCallbackD.reportAdImpression();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(@NonNull String str) {
        MediationRewardedAdCallback mediationRewardedAdCallbackD;
        Log.d(d.f74253a, String.format("IronSource rewarded ad received reward for instance ID: %s", str));
        g gVarA = g.a(str);
        if (gVarA == null || (mediationRewardedAdCallbackD = gVarA.d()) == null) {
            return;
        }
        mediationRewardedAdCallbackD.onVideoComplete();
        mediationRewardedAdCallbackD.onUserEarnedReward();
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(@NonNull String str, @NonNull IronSourceError ironSourceError) {
        MediationRewardedAdCallback mediationRewardedAdCallbackD;
        AdError adError = new AdError(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage(), IronSourceMediationAdapter.IRONSOURCE_SDK_ERROR_DOMAIN);
        Log.e(d.f74253a, adError.toString());
        g gVarA = g.a(str);
        if (gVarA != null && (mediationRewardedAdCallbackD = gVarA.d()) != null) {
            mediationRewardedAdCallbackD.onAdFailedToShow(adError);
        }
        g.i(str);
    }
}
