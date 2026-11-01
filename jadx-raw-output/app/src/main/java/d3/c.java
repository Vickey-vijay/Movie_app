package d3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: compiled from: PangleInterstitialAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class c implements MediationInterstitialAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f51821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f51822c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.d f51823d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.b f51824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationInterstitialAdCallback f51825f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGInterstitialAd f51826g;

    /* JADX INFO: compiled from: PangleInterstitialAd.java */
    public class a implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f51828b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51829c;

        /* JADX INFO: renamed from: d3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleInterstitialAd.java */
        public class C0461a implements PAGInterstitialAdLoadListener {
            public C0461a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
                c cVar = c.this;
                cVar.f51825f = (MediationInterstitialAdCallback) cVar.f51821b.onSuccess(c.this);
                c.this.f51826g = pAGInterstitialAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = c3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                c.this.f51821b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, String str2) {
            this.f51827a = str;
            this.f51828b = mediationInterstitialAdConfiguration;
            this.f51829c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            c.this.f51821b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            PAGInterstitialRequest pAGInterstitialRequestD = c.this.f51824e.d();
            pAGInterstitialRequestD.setAdString(this.f51827a);
            c3.c.a(pAGInterstitialRequestD, this.f51827a, this.f51828b);
            c.this.f51823d.g(this.f51829c, pAGInterstitialRequestD, new C0461a());
        }
    }

    /* JADX INFO: compiled from: PangleInterstitialAd.java */
    public class b implements PAGInterstitialAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (c.this.f51825f != null) {
                c.this.f51825f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (c.this.f51825f != null) {
                c.this.f51825f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (c.this.f51825f != null) {
                c.this.f51825f.onAdOpened();
                c.this.f51825f.reportAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.f51826g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f51826g.show((Activity) context);
        } else {
            this.f51826g.show(null);
        }
    }

    public c(@NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, c3.d dVar, c3.b bVar) {
        this.f51821b = mediationAdLoadCallback;
        this.f51822c = aVar;
        this.f51823d = dVar;
        this.f51824e = bVar;
    }

    public void g(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = c3.a.a(101, "Failed to load interstitial ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f51821b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
            this.f51822c.b(mediationInterstitialAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationInterstitialAdConfiguration, string));
        }
    }
}
