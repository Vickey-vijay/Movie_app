package s2;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: compiled from: FyberRewardedVideoRenderer.java */
/* JADX INFO: loaded from: classes10.dex */
public class g implements MediationRewardedAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener, InneractiveFullScreenAdRewardedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f66999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationRewardedAdCallback f67000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InneractiveAdSpot f67001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InneractiveFullscreenUnitController f67002e;

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(@NonNull InneractiveAdSpot inneractiveAdSpot, @NonNull InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(@NonNull InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(@NonNull InneractiveAdSpot inneractiveAdSpot) {
    }

    public final boolean b(InneractiveFullscreenUnitController inneractiveFullscreenUnitController) {
        return (inneractiveFullscreenUnitController == null || inneractiveFullscreenUnitController.getSelectedContentController() == null || !(inneractiveFullscreenUnitController.getSelectedContentController() instanceof InneractiveFullscreenVideoContentController)) ? false : true;
    }

    public final void e() {
        this.f67002e.setEventsListener(this);
        this.f67002e.setRewardedListener(this);
        this.f67002e.addContentController(new InneractiveFullscreenVideoContentController());
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f67000c.reportAdClicked();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f67000c.onAdClosed();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f67000c.onAdOpened();
        if (b(this.f67002e)) {
            this.f67000c.onVideoStart();
        }
        this.f67000c.reportAdImpression();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullScreenAdRewardedListener
    public void onAdRewarded(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f67000c.onUserEarnedReward();
        this.f67000c.onVideoComplete();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(@NonNull InneractiveAdSpot inneractiveAdSpot) {
        this.f67000c = this.f66999b.onSuccess(this);
        e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (!(context instanceof Activity)) {
            AdError adError = new AdError(107, "Cannot show a rewarded ad without an activity context.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
            MediationRewardedAdCallback mediationRewardedAdCallback = this.f67000c;
            if (mediationRewardedAdCallback != null) {
                mediationRewardedAdCallback.onAdFailedToShow(adError);
                return;
            }
            return;
        }
        InneractiveAdSpot inneractiveAdSpot = this.f67001d;
        if (inneractiveAdSpot != null && this.f67002e != null && inneractiveAdSpot.isReady()) {
            this.f67002e.show((Activity) context);
        } else if (this.f67000c != null) {
            AdError adError2 = new AdError(106, "DT Exchange's rewarded spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f18858m, adError2.getMessage());
            this.f67000c.onAdFailedToShow(adError2);
        }
    }

    public g(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f66999b = mediationAdLoadCallback;
    }

    public final void a(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        this.f67001d = f.d();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitControllerA = f.a();
        this.f67002e = inneractiveFullscreenUnitControllerA;
        this.f67001d.addUnitController(inneractiveFullscreenUnitControllerA);
        this.f67001d.setRequestListener(this);
        e.c(mediationRewardedAdConfiguration.getMediationExtras());
    }

    public void c(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        a(mediationRewardedAdConfiguration);
        this.f67001d.loadAd(bidResponse);
    }

    public void d(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("spotId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Spot ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
            this.f66999b.onFailure(adError);
        } else {
            a(mediationRewardedAdConfiguration);
            this.f67001d.requestAd(new InneractiveAdRequest(string));
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(@NonNull InneractiveAdSpot inneractiveAdSpot, @NonNull InneractiveErrorCode inneractiveErrorCode) {
        AdError adErrorA = b.a(inneractiveErrorCode);
        Log.w(FyberMediationAdapter.f18858m, adErrorA.getMessage());
        this.f66999b.onFailure(adErrorA);
    }
}
