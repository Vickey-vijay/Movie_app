package s2;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import ck.p;
import ck.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: compiled from: DTExchangeInterstitialAd.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements MediationInterstitialAd, InneractiveAdSpot.RequestListener, InneractiveFullscreenAdEventsListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66983e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66984f = s.b(c.class).i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f66985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f66986c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MediationInterstitialAdCallback f66987d;

    /* JADX INFO: compiled from: DTExchangeInterstitialAd.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
    }

    public c(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        p.j(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f66985b = mediationAdLoadCallback;
    }

    public final void a(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        p.j(mediationInterstitialAdConfiguration, "mediationInterstitialAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f18859n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        p.i(bidResponse, "getBidResponse(...)");
        this.f66986c = InneractiveAdSpotManager.get().createSpot();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = new InneractiveFullscreenUnitController();
        InneractiveAdSpot inneractiveAdSpot = this.f66986c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.B("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveFullscreenUnitController);
        InneractiveAdSpot inneractiveAdSpot3 = this.f66986c;
        if (inneractiveAdSpot3 == null) {
            p.B("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveFullscreenUnitController.setEventsListener(this);
        e.c(mediationInterstitialAdConfiguration.getMediationExtras());
        InneractiveAdSpot inneractiveAdSpot4 = this.f66986c;
        if (inneractiveAdSpot4 == null) {
            p.B("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66987d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
    public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66987d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66987d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.f66987d;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66987d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        p.j(inneractiveErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f66985b.onFailure(b.a(inneractiveErrorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.f66986c;
        InneractiveAdSpot inneractiveAdSpot3 = null;
        if (inneractiveAdSpot2 == null) {
            p.B("adSpot");
            inneractiveAdSpot2 = null;
        }
        if (inneractiveAdSpot2.isReady()) {
            this.f66987d = this.f66985b.onSuccess(this);
            return;
        }
        AdError adError = new AdError(106, "DT Exchange's interstitial ad spot is not ready.", "com.google.ads.mediation.dtexchange");
        Log.w(f66984f, adError.getMessage());
        this.f66985b.onFailure(adError);
        InneractiveAdSpot inneractiveAdSpot4 = this.f66986c;
        if (inneractiveAdSpot4 == null) {
            p.B("adSpot");
        } else {
            inneractiveAdSpot3 = inneractiveAdSpot4;
        }
        inneractiveAdSpot3.destroy();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        InneractiveAdSpot inneractiveAdSpot = this.f66986c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.B("adSpot");
            inneractiveAdSpot = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
        InneractiveFullscreenUnitController inneractiveFullscreenUnitController = selectedUnitController instanceof InneractiveFullscreenUnitController ? (InneractiveFullscreenUnitController) selectedUnitController : null;
        if (inneractiveFullscreenUnitController != null) {
            inneractiveFullscreenUnitController.show((Activity) context);
            return;
        }
        Log.w(f66984f, "showInterstitial called, but wrong spot has been used (should not happen).");
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.f66987d;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback2 = this.f66987d;
        if (mediationInterstitialAdCallback2 != null) {
            mediationInterstitialAdCallback2.onAdClosed();
        }
        InneractiveAdSpot inneractiveAdSpot3 = this.f66986c;
        if (inneractiveAdSpot3 == null) {
            p.B("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot3;
        }
        inneractiveAdSpot2.destroy();
    }
}
