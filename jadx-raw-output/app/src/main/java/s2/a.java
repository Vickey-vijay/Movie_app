package s2;

import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import ck.p;
import ck.s;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* JADX INFO: compiled from: DTExchangeBannerAd.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements MediationBannerAd, InneractiveAdSpot.RequestListener, InneractiveAdViewEventsListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C0635a f66976f = new C0635a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66977g = s.b(a.class).i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f66978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f66979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RelativeLayout f66980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationBannerAdCallback f66981e;

    /* JADX INFO: renamed from: s2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DTExchangeBannerAd.kt */
    public static final class C0635a {
        public C0635a() {
        }

        public /* synthetic */ C0635a(ck.i iVar) {
            this();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdExpanded(InneractiveAdSpot inneractiveAdSpot) {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener
    public void onAdResized(InneractiveAdSpot inneractiveAdSpot) {
    }

    public a(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        p.j(mediationAdLoadCallback, "mediationAdLoadCallback");
        this.f66978b = mediationAdLoadCallback;
    }

    public final void a(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        p.j(mediationBannerAdConfiguration, "mediationBannerAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f18859n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        p.i(bidResponse, "getBidResponse(...)");
        this.f66979c = InneractiveAdSpotManager.get().createSpot();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = new InneractiveAdViewUnitController();
        InneractiveAdSpot inneractiveAdSpot = this.f66979c;
        InneractiveAdSpot inneractiveAdSpot2 = null;
        if (inneractiveAdSpot == null) {
            p.B("adSpot");
            inneractiveAdSpot = null;
        }
        inneractiveAdSpot.addUnitController(inneractiveAdViewUnitController);
        this.f66980d = new RelativeLayout(mediationBannerAdConfiguration.getContext());
        InneractiveAdSpot inneractiveAdSpot3 = this.f66979c;
        if (inneractiveAdSpot3 == null) {
            p.B("adSpot");
            inneractiveAdSpot3 = null;
        }
        inneractiveAdSpot3.setRequestListener(this);
        inneractiveAdViewUnitController.setEventsListener(this);
        e.c(mediationBannerAdConfiguration.getMediationExtras());
        InneractiveAdSpot inneractiveAdSpot4 = this.f66979c;
        if (inneractiveAdSpot4 == null) {
            p.B("adSpot");
        } else {
            inneractiveAdSpot2 = inneractiveAdSpot4;
        }
        inneractiveAdSpot2.loadAd(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        RelativeLayout relativeLayout = this.f66980d;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        p.B("wrapperView");
        return null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66981e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66981e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66981e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdClosed();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        MediationBannerAdCallback mediationBannerAdCallback = this.f66981e;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.onAdOpened();
            mediationBannerAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        p.j(inneractiveErrorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.f66978b.onFailure(b.a(inneractiveErrorCode));
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
    public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdSpot inneractiveAdSpot2 = this.f66979c;
        RelativeLayout relativeLayout = null;
        InneractiveAdSpot inneractiveAdSpot3 = null;
        InneractiveAdSpot inneractiveAdSpot4 = null;
        if (inneractiveAdSpot2 == null) {
            p.B("adSpot");
            inneractiveAdSpot2 = null;
        }
        if (!inneractiveAdSpot2.isReady()) {
            AdError adError = new AdError(106, "DT Exchange's banner ad spot is not ready.", "com.google.ads.mediation.dtexchange");
            Log.w(f66977g, adError.getMessage());
            this.f66978b.onFailure(adError);
            InneractiveAdSpot inneractiveAdSpot5 = this.f66979c;
            if (inneractiveAdSpot5 == null) {
                p.B("adSpot");
            } else {
                inneractiveAdSpot3 = inneractiveAdSpot5;
            }
            inneractiveAdSpot3.destroy();
            return;
        }
        InneractiveAdSpot inneractiveAdSpot6 = this.f66979c;
        if (inneractiveAdSpot6 == null) {
            p.B("adSpot");
            inneractiveAdSpot6 = null;
        }
        InneractiveUnitController selectedUnitController = inneractiveAdSpot6.getSelectedUnitController();
        InneractiveAdViewUnitController inneractiveAdViewUnitController = selectedUnitController instanceof InneractiveAdViewUnitController ? (InneractiveAdViewUnitController) selectedUnitController : null;
        if (inneractiveAdViewUnitController != null) {
            RelativeLayout relativeLayout2 = this.f66980d;
            if (relativeLayout2 == null) {
                p.B("wrapperView");
            } else {
                relativeLayout = relativeLayout2;
            }
            inneractiveAdViewUnitController.bindView(relativeLayout);
            this.f66981e = this.f66978b.onSuccess(this);
            return;
        }
        AdError adError2 = new AdError(105, "Unexpected controller type.", "com.google.ads.mediation.dtexchange");
        Log.w(f66977g, adError2.getMessage());
        this.f66978b.onFailure(adError2);
        InneractiveAdSpot inneractiveAdSpot7 = this.f66979c;
        if (inneractiveAdSpot7 == null) {
            p.B("adSpot");
        } else {
            inneractiveAdSpot4 = inneractiveAdSpot7;
        }
        inneractiveAdSpot4.destroy();
    }
}
