package d3;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PangleNativeAd.java */
/* JADX INFO: loaded from: classes10.dex */
public class d extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f51833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.google.ads.mediation.pangle.a f51834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c3.d f51835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c3.b f51836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediationNativeAdCallback f51837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PAGNativeAd f51838g;

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class a implements com.google.ads.mediation.pangle.a.InterfaceC0174a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f51839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f51840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f51841c;

        /* JADX INFO: renamed from: d3.d$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PangleNativeAd.java */
        public class C0462a implements PAGNativeAdLoadListener {
            public C0462a() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                d.this.h(pAGNativeAd);
                d dVar = d.this;
                dVar.f51837f = (MediationNativeAdCallback) dVar.f51833b.onSuccess(d.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.ra
            public void onError(int i10, String str) {
                AdError adErrorC = c3.a.c(i10, str);
                Log.w(PangleMediationAdapter.TAG, adErrorC.toString());
                d.this.f51833b.onFailure(adErrorC);
            }
        }

        public a(String str, MediationNativeAdConfiguration mediationNativeAdConfiguration, String str2) {
            this.f51839a = str;
            this.f51840b = mediationNativeAdConfiguration;
            this.f51841c = str2;
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeError(@NonNull AdError adError) {
            Log.w(PangleMediationAdapter.TAG, adError.toString());
            d.this.f51833b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.a.InterfaceC0174a
        public void onInitializeSuccess() {
            PAGNativeRequest pAGNativeRequestE = d.this.f51836e.e();
            pAGNativeRequestE.setAdString(this.f51839a);
            c3.c.a(pAGNativeRequestE, this.f51839a, this.f51840b);
            d.this.f51835d.h(this.f51841c, pAGNativeRequestE, new C0462a());
        }
    }

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class b implements PAGNativeAdInteractionListener {
        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }

        public b() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (d.this.f51837f != null) {
                d.this.f51837f.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (d.this.f51837f != null) {
                d.this.f51837f.reportAdImpression();
            }
        }
    }

    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f51838g.showPrivacyActivity();
        }
    }

    /* JADX INFO: renamed from: d3.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PangleNativeAd.java */
    public class C0463d extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f51846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f51847b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f51848c;

        public C0463d(Drawable drawable, Uri uri, double d10) {
            this.f51846a = drawable;
            this.f51847b = uri;
            this.f51848c = d10;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Drawable getDrawable() {
            return this.f51846a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f51848c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f51847b;
        }
    }

    public final void h(PAGNativeAd pAGNativeAd) {
        this.f51838g = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new C0463d(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f51838g.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new b());
        getAdChoicesContent().setOnClickListener(new c());
    }

    public d(@NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull com.google.ads.mediation.pangle.a aVar, @NonNull c3.d dVar, @NonNull c3.b bVar) {
        this.f51833b = mediationAdLoadCallback;
        this.f51834c = aVar;
        this.f51835d = dVar;
        this.f51836e = bVar;
    }

    public void i(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorA = c3.a.a(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            Log.e(PangleMediationAdapter.TAG, adErrorA.toString());
            this.f51833b.onFailure(adErrorA);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            this.f51834c.b(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new a(bidResponse, mediationNativeAdConfiguration, string));
        }
    }
}
