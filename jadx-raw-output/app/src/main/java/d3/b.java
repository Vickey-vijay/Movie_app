package d3;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: compiled from: PangleBannerAd.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements MediationBannerAd, PAGBannerAdInteractionListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f51809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f51810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.d f51811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.b f51812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationBannerAdCallback f51813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @VisibleForTesting
    public FrameLayout f51814g;

    /* JADX INFO: compiled from: PangleBannerAd.java */
    public class a implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f51815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f51816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f51818d;

        /* JADX INFO: renamed from: d3.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleBannerAd.java */
        public class C0460a implements PAGBannerAdLoadListener {
            public C0460a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGBannerAd pAGBannerAd) {
                pAGBannerAd.setAdInteractionListener(b.this);
                b.this.f51814g.addView(pAGBannerAd.getBannerView());
                b bVar = b.this;
                bVar.f51813f = (MediationBannerAdCallback) bVar.f51809b.onSuccess(b.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = c3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                b.this.f51809b.onFailure(adErrorC);
            }
        }

        public a(MediationBannerAdConfiguration mediationBannerAdConfiguration, Context context, String str, String str2) {
            this.f51815a = mediationBannerAdConfiguration;
            this.f51816b = context;
            this.f51817c = str;
            this.f51818d = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            b.this.f51809b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            PAGBannerSize pAGBannerSizeE = b.e(this.f51816b, this.f51815a.getAdSize());
            if (pAGBannerSizeE == null) {
                AdError adErrorA = c3.a.a(102, "Failed to request banner ad from Pangle. Invalid banner size.");
                Log.w(PangleMediationAdapter.TAG, adErrorA.toString());
                b.this.f51809b.onFailure(adErrorA);
            } else {
                b.this.f51814g = new FrameLayout(this.f51816b);
                PAGBannerRequest pAGBannerRequestC = b.this.f51812e.c(pAGBannerSizeE);
                pAGBannerRequestC.setAdString(this.f51817c);
                c3.c.a(pAGBannerRequestC, this.f51817c, this.f51815a);
                b.this.f51811d.f(this.f51818d, pAGBannerRequestC, new C0460a());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
    }

    public static PAGBannerSize e(Context context, AdSize adSize) {
        if (adSize == null) {
            return null;
        }
        int width = adSize.getWidth();
        PAGBannerSize pAGBannerSize = PAGBannerSize.BANNER_W_320_H_50;
        if (width == pAGBannerSize.getWidth() && adSize.getHeight() == pAGBannerSize.getHeight()) {
            return pAGBannerSize;
        }
        int width2 = adSize.getWidth();
        PAGBannerSize pAGBannerSize2 = PAGBannerSize.BANNER_W_300_H_250;
        if (width2 == pAGBannerSize2.getWidth() && adSize.getHeight() == pAGBannerSize2.getHeight()) {
            return pAGBannerSize2;
        }
        int width3 = adSize.getWidth();
        PAGBannerSize pAGBannerSize3 = PAGBannerSize.BANNER_W_728_H_90;
        if (width3 == pAGBannerSize3.getWidth() && adSize.getHeight() == pAGBannerSize3.getHeight()) {
            return pAGBannerSize3;
        }
        PAGBannerSize currentOrientationAnchoredAdaptiveBannerAdSize = PAGBannerSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, adSize.getWidth());
        return (adSize.getWidth() == currentOrientationAnchoredAdaptiveBannerAdSize.getWidth() && adSize.getHeight() == currentOrientationAnchoredAdaptiveBannerAdSize.getHeight()) ? currentOrientationAnchoredAdaptiveBannerAdSize : PAGBannerSize.getInlineAdaptiveBannerAdSize(adSize.getWidth(), adSize.getHeight());
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.f51814g;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51813f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        MediationBannerAdCallback mediationBannerAdCallback = this.f51813f;
        if (mediationBannerAdCallback != null) {
            mediationBannerAdCallback.reportAdImpression();
        }
    }

    public b(@NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull c3.d dVar, @NonNull c3.b bVar) {
        this.f51809b = mediationAdLoadCallback;
        this.f51810c = aVar;
        this.f51811d = dVar;
        this.f51812e = bVar;
    }

    public void f(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = c3.a.a(101, "Failed to load banner ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f51809b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationBannerAdConfiguration.getBidResponse();
            Context context = mediationBannerAdConfiguration.getContext();
            this.f51810c.b(context, serverParameters.getString("appid"), new a(mediationBannerAdConfiguration, context, bidResponse, string));
        }
    }
}
