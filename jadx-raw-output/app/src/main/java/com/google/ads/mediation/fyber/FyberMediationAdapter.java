package com.google.ads.mediation.fyber;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveMediationName;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class FyberMediationAdapter extends RtbAdapter implements MediationBannerAdapter, MediationInterstitialAdapter {
    public static final String KEY_MUTE_VIDEO = "muteVideo";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f18858m = "FyberMediationAdapter";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InneractiveMediationName f18859n = InneractiveMediationName.ADMOB;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdSize f18860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f18861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f18862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationBannerListener f18863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationInterstitialListener f18864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference<Activity> f18865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InneractiveAdSpot f18866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s2.a f18867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public s2.c f18868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s2.g f18869k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public s2.d f18870l;

    public class a implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediationAdLoadCallback f18871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f18872b;

        public a(MediationAdLoadCallback mediationAdLoadCallback, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f18871a = mediationAdLoadCallback;
            this.f18872b = mediationRewardedAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = s2.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f18858m, adErrorB.getMessage());
                this.f18871a.onFailure(adErrorB);
            } else {
                FyberMediationAdapter.this.f18869k = new s2.g(this.f18871a);
                FyberMediationAdapter.this.f18869k.d(this.f18872b);
            }
        }
    }

    public class b implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InitializationCompleteCallback f18874a;

        public b(InitializationCompleteCallback initializationCompleteCallback) {
            this.f18874a = initializationCompleteCallback;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                this.f18874a.onInitializationSucceeded();
                return;
            }
            AdError adErrorB = s2.b.b(fyberInitStatus);
            Log.w(FyberMediationAdapter.f18858m, adErrorB.getMessage());
            this.f18874a.onInitializationFailed(adErrorB.getMessage());
        }
    }

    public class c implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f18876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AdSize f18878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Bundle f18879d;

        public c(Bundle bundle, Context context, AdSize adSize, Bundle bundle2) {
            this.f18876a = bundle;
            this.f18877b = context;
            this.f18878c = adSize;
            this.f18879d = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = s2.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f18858m, adErrorB.getMessage());
                FyberMediationAdapter.this.f18863e.onAdFailedToLoad(FyberMediationAdapter.this, adErrorB);
                return;
            }
            String string = this.f18876a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render banner ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
                FyberMediationAdapter.this.f18863e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            FyberMediationAdapter.this.f18861c = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f18861c.addUnitController(new InneractiveAdViewUnitController());
            FyberMediationAdapter.this.f18862d = new RelativeLayout(this.f18877b);
            FyberMediationAdapter.this.f18861c.setRequestListener(FyberMediationAdapter.this.s());
            FyberMediationAdapter.this.f18860b = this.f18878c;
            s2.e.c(this.f18879d);
            FyberMediationAdapter.this.f18861c.requestAd(new InneractiveAdRequest(string));
        }
    }

    public class d implements InneractiveAdSpot.RequestListener {
        public d() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f18861c.getSelectedUnitController() instanceof InneractiveAdViewUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f18861c.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
                FyberMediationAdapter.this.f18863e.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f18861c.destroy();
            }
            InneractiveAdViewUnitController inneractiveAdViewUnitController = (InneractiveAdViewUnitController) FyberMediationAdapter.this.f18861c.getSelectedUnitController();
            inneractiveAdViewUnitController.setEventsListener(FyberMediationAdapter.this.r());
            inneractiveAdViewUnitController.bindView(FyberMediationAdapter.this.f18862d);
            Context context = FyberMediationAdapter.this.f18862d.getContext();
            float f10 = context.getResources().getDisplayMetrics().density;
            int iRound = Math.round(inneractiveAdViewUnitController.getAdContentWidth() / f10);
            int iRound2 = Math.round(inneractiveAdViewUnitController.getAdContentHeight() / f10);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new AdSize(iRound, iRound2));
            if (MediationUtils.findClosestSize(context, FyberMediationAdapter.this.f18860b, arrayList) != null) {
                FyberMediationAdapter.this.f18863e.onAdLoaded(FyberMediationAdapter.this);
                return;
            }
            AdError adError2 = new AdError(103, String.format("The loaded ad size did not match the requested ad size. Requested ad size: %dx%d. Loaded ad size: %dx%d.", Integer.valueOf(Math.round(FyberMediationAdapter.this.f18860b.getWidthInPixels(context) / f10)), Integer.valueOf(Math.round(FyberMediationAdapter.this.f18860b.getHeightInPixels(context) / f10)), Integer.valueOf(iRound), Integer.valueOf(iRound2)), "com.google.ads.mediation.dtexchange");
            Log.w(FyberMediationAdapter.f18858m, adError2.getMessage());
            FyberMediationAdapter.this.f18863e.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorA = s2.b.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f18858m, adErrorA.getMessage());
            FyberMediationAdapter.this.f18863e.onAdFailedToLoad(FyberMediationAdapter.this, adErrorA);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
    }

    public class e extends InneractiveAdViewEventsListenerAdapter {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        public e() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18863e.onAdClicked(FyberMediationAdapter.this);
            FyberMediationAdapter.this.f18863e.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18863e.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18863e.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    public class f implements OnFyberMarketplaceInitializedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bundle f18883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f18884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Bundle f18885c;

        public f(Bundle bundle, Context context, Bundle bundle2) {
            this.f18883a = bundle;
            this.f18884b = context;
            this.f18885c = bundle2;
        }

        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
            if (fyberInitStatus != OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                AdError adErrorB = s2.b.b(fyberInitStatus);
                Log.w(FyberMediationAdapter.f18858m, adErrorB.getMessage());
                FyberMediationAdapter.this.f18864f.onAdFailedToLoad(FyberMediationAdapter.this, adErrorB);
                return;
            }
            String string = this.f18883a.getString("spotId");
            if (TextUtils.isEmpty(string)) {
                AdError adError = new AdError(101, "Cannot render interstitial ad. Please define a valid spot id on the AdMob UI.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
                FyberMediationAdapter.this.f18864f.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                return;
            }
            if (!(this.f18884b instanceof Activity)) {
                AdError adError2 = new AdError(107, "Cannot request an interstitial ad without an activity context.", "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f18858m, adError2.getMessage());
                if (FyberMediationAdapter.this.f18864f != null) {
                    FyberMediationAdapter.this.f18864f.onAdFailedToLoad(FyberMediationAdapter.this, adError2);
                    return;
                }
                return;
            }
            FyberMediationAdapter.this.f18865g = new WeakReference((Activity) this.f18884b);
            FyberMediationAdapter.this.f18866h = InneractiveAdSpotManager.get().createSpot();
            FyberMediationAdapter.this.f18866h.addUnitController(new InneractiveFullscreenUnitController());
            FyberMediationAdapter.this.f18866h.setRequestListener(FyberMediationAdapter.this.t());
            s2.e.c(this.f18885c);
            FyberMediationAdapter.this.f18866h.requestAd(new InneractiveAdRequest(string));
        }
    }

    public class g implements InneractiveAdSpot.RequestListener {
        public g() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveSuccessfulAdRequest(InneractiveAdSpot inneractiveAdSpot) {
            if (!(FyberMediationAdapter.this.f18866h.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                AdError adError = new AdError(105, String.format("Unexpected controller type. Expected: %s. Actual: %s", InneractiveUnitController.class.getName(), FyberMediationAdapter.this.f18861c.getSelectedUnitController().getClass().getName()), "com.google.ads.mediation.dtexchange");
                Log.w(FyberMediationAdapter.f18858m, adError.getMessage());
                FyberMediationAdapter.this.f18864f.onAdFailedToLoad(FyberMediationAdapter.this, adError);
                FyberMediationAdapter.this.f18866h.destroy();
            }
            ((InneractiveFullscreenUnitController) FyberMediationAdapter.this.f18866h.getSelectedUnitController()).setEventsListener(FyberMediationAdapter.this.u());
            FyberMediationAdapter.this.f18864f.onAdLoaded(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            AdError adErrorA = s2.b.a(inneractiveErrorCode);
            Log.w(FyberMediationAdapter.f18858m, adErrorA.getMessage());
            FyberMediationAdapter.this.f18864f.onAdFailedToLoad(FyberMediationAdapter.this, adErrorA);
        }
    }

    public class h extends InneractiveFullscreenAdEventsListenerAdapter {
        public h() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18864f.onAdClicked(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener
        public void onAdDismissed(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18864f.onAdClosed(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18864f.onAdOpened(FyberMediationAdapter.this);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListenerAdapter, com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            FyberMediationAdapter.this.f18864f.onAdLeftApplication(FyberMediationAdapter.this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f18862d;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        s2.a aVar = new s2.a(mediationAdLoadCallback);
        this.f18867i = aVar;
        aVar.a(mediationBannerAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        s2.c cVar = new s2.c(mediationAdLoadCallback);
        this.f18868j = cVar;
        cVar.a(mediationInterstitialAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        s2.d dVar = this.f18870l;
        if (dVar != null) {
            dVar.destroy();
            this.f18870l = null;
        }
        s2.d dVar2 = new s2.d(mediationAdLoadCallback);
        this.f18870l = dVar2;
        dVar2.f(mediationNativeAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18869k = new s2.g(mediationAdLoadCallback);
        InneractiveAdManager.setMediationName(f18859n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        this.f18869k.c(mediationRewardedAdConfiguration);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        InneractiveAdSpot inneractiveAdSpot = this.f18861c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
            this.f18861c = null;
        }
        InneractiveAdSpot inneractiveAdSpot2 = this.f18866h;
        if (inneractiveAdSpot2 != null) {
            inneractiveAdSpot2.destroy();
            this.f18866h = null;
        }
        WeakReference<Activity> weakReference = this.f18865g;
        if (weakReference != null) {
            weakReference.clear();
            this.f18865g = null;
        }
        s2.d dVar = this.f18870l;
        if (dVar != null) {
            dVar.destroy();
            this.f18870l = null;
        }
    }

    @NonNull
    public final InneractiveAdViewEventsListener r() {
        return new e();
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.f18863e = mediationBannerListener;
        String string = bundle.getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f18858m, adError.getMessage());
            this.f18863e.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f18859n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new c(bundle, context, adSize, bundle2));
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.f18864f = mediationInterstitialListener;
        String string = bundle.getString("applicationId");
        AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
        if (TextUtils.isEmpty(string)) {
            Log.w(f18858m, adError.getMessage());
            this.f18864f.onAdFailedToLoad(this, adError);
        } else {
            InneractiveAdManager.setMediationName(f18859n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(context, string, new f(bundle, context, bundle2));
        }
    }

    @NonNull
    public final InneractiveAdSpot.RequestListener s() {
        return new d();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.f18865g;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity == null) {
            Log.w(f18858m, "showInterstitial called, but activity reference was lost.");
            this.f18864f.onAdOpened(this);
            this.f18864f.onAdClosed(this);
        } else {
            if (!(this.f18866h.getSelectedUnitController() instanceof InneractiveFullscreenUnitController)) {
                Log.w(f18858m, "showInterstitial called, but wrong spot has been used (should not happen).");
                this.f18864f.onAdOpened(this);
                this.f18864f.onAdClosed(this);
                return;
            }
            InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) this.f18866h.getSelectedUnitController();
            if (this.f18866h.isReady()) {
                inneractiveFullscreenUnitController.show(activity);
                return;
            }
            Log.w(f18858m, "showInterstitial called, but Ad has expired.");
            this.f18864f.onAdOpened(this);
            this.f18864f.onAdClosed(this);
        }
    }

    @NonNull
    public final InneractiveAdSpot.RequestListener t() {
        return new g();
    }

    @NonNull
    public final InneractiveFullscreenAdEventsListener u() {
        return new h();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        signalCallbacks.onSuccess(bidderToken);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String strB = s2.e.b();
        String[] strArrSplit = strB.split("\\.");
        if (strArrSplit.length >= 3) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
        }
        Log.w(f18858m, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", strB));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String strA = s2.e.a();
        String[] strArrSplit = strA.split("\\.");
        if (strArrSplit.length >= 4) {
            return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
        }
        Log.w(f18858m, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", strA));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (s2.h.a().isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("applicationId");
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(101, "DT Exchange SDK requires an appId to be configured on the AdMob UI.", "com.google.ads.mediation.dtexchange");
            Log.w(f18858m, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        } else {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                Log.w(f18858m, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the DT Exchange SDK.", "applicationId", hashSet, str));
            }
            InneractiveAdManager.initialize(context, str, new b(initializationCompleteCallback));
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("applicationId");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "App ID is null or empty.", "com.google.ads.mediation.dtexchange");
            Log.w(f18858m, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        } else {
            InneractiveAdManager.setMediationName(f18859n);
            InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
            InneractiveAdManager.initialize(mediationRewardedAdConfiguration.getContext(), string, new a(mediationAdLoadCallback, mediationRewardedAdConfiguration));
        }
    }
}
