package d3;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;

/* JADX INFO: compiled from: PangleAppOpenAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements MediationAppOpenAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> f51797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f51798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.d f51799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.b f51800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationAppOpenAdCallback f51801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGAppOpenAd f51802g;

    /* JADX INFO: renamed from: d3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleAppOpenAd.java */
    public class C0458a implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationAppOpenAdConfiguration f51804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51805c;

        /* JADX INFO: renamed from: d3.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleAppOpenAd.java */
        public class C0459a implements PAGAppOpenAdLoadListener {
            public C0459a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGAppOpenAd pAGAppOpenAd) {
                a aVar = a.this;
                aVar.f51801f = (MediationAppOpenAdCallback) aVar.f51797b.onSuccess(a.this);
                a.this.f51802g = pAGAppOpenAd;
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = c3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                a.this.f51797b.onFailure(adErrorC);
            }
        }

        public C0458a(String str, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, String str2) {
            this.f51803a = str;
            this.f51804b = mediationAppOpenAdConfiguration;
            this.f51805c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            a.this.f51797b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            PAGAppOpenRequest pAGAppOpenRequestB = a.this.f51800e.b();
            pAGAppOpenRequestB.setAdString(this.f51803a);
            c3.c.a(pAGAppOpenRequestB, this.f51803a, this.f51804b);
            a.this.f51799d.e(this.f51805c, pAGAppOpenRequestB, new C0459a());
        }
    }

    /* JADX INFO: compiled from: PangleAppOpenAd.java */
    public class b implements PAGAppOpenAdInteractionListener {
        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (a.this.f51801f != null) {
                a.this.f51801f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
            if (a.this.f51801f != null) {
                a.this.f51801f.onAdClosed();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (a.this.f51801f != null) {
                a.this.f51801f.onAdOpened();
                a.this.f51801f.reportAdImpression();
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(@NonNull Context context) {
        this.f51802g.setAdInteractionListener(new b());
        if (context instanceof Activity) {
            this.f51802g.show((Activity) context);
        } else {
            this.f51802g.show(null);
        }
    }

    public a(@NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull c3.d dVar, @NonNull c3.b bVar) {
        this.f51797b = mediationAdLoadCallback;
        this.f51798c = aVar;
        this.f51799d = dVar;
        this.f51800e = bVar;
    }

    public void g(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = c3.a.a(101, "Failed to load app open ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f51797b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationAppOpenAdConfiguration.getBidResponse();
            this.f51798c.b(mediationAppOpenAdConfiguration.getContext(), serverParameters.getString("appid"), new C0458a(bidResponse, mediationAppOpenAdConfiguration, string));
        }
    }
}
