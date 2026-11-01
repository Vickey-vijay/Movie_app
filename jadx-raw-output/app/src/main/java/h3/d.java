package h3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: VungleRtbNativeAd.java */
/* JADX INFO: loaded from: classes6.dex */
public class d extends UnifiedNativeAdMapper implements NativeAdListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f53675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediationNativeAdCallback f53676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd f53677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediaView f53678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f53679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.ads.mediation.vungle.b f53680g;

    /* JADX INFO: compiled from: VungleRtbNativeAd.java */
    public class a implements com.google.ads.mediation.vungle.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f53681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f53682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f53683c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f53684d;

        public a(Context context, String str, int i10, String str2) {
            this.f53681a = context;
            this.f53682b = str;
            this.f53683c = i10;
            this.f53684d = str2;
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeError(AdError adError) {
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            d.this.f53675b.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.c.a
        public void onInitializeSuccess() {
            d dVar = d.this;
            dVar.f53677d = dVar.f53680g.d(this.f53681a, this.f53682b);
            d.this.f53677d.setAdOptionsPosition(this.f53683c);
            d.this.f53677d.setAdListener(d.this);
            d.this.f53678e = new MediaView(this.f53681a);
            if (!TextUtils.isEmpty(this.f53684d)) {
                d.this.f53677d.getAdConfig().setWatermark(this.f53684d);
            }
            d.this.f53677d.load(d.this.f53679f);
        }
    }

    /* JADX INFO: compiled from: VungleRtbNativeAd.java */
    public static class b extends com.google.android.gms.ads.formats.NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f53686a;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f53686a;
        }

        public b(Uri uri) {
            this.f53686a = uri;
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(@NonNull BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(@NonNull BaseAd baseAd) {
    }

    public final void g() {
        setHeadline(this.f53677d.getAdTitle());
        setBody(this.f53677d.getAdBodyText());
        setCallToAction(this.f53677d.getAdCallToActionText());
        Double adStarRating = this.f53677d.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f53677d.getAdSponsoredText());
        setMediaView(this.f53678e);
        String appIcon = this.f53677d.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(AdPayload.FILE_SCHEME)) {
            setIcon(new b(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.f53677d.getAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f53676c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f53676c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f53676c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(@NonNull BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f53676c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    public d(@NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, com.google.ads.mediation.vungle.b bVar) {
        this.f53675b = mediationAdLoadCallback;
        this.f53680g = bVar;
    }

    public void h(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i10;
        int i11;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError.toString());
            this.f53675b.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString("placementID");
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.d(VungleMediationAdapter.TAG, adError2.toString());
            this.f53675b.onFailure(adError2);
            return;
        }
        this.f53679f = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i10 = 1;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 3;
            }
            com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
        }
        i10 = 0;
        i11 = i10;
        com.google.ads.mediation.vungle.c.a().b(string, context, new a(context, string2, i11, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        this.f53675b.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(@NonNull BaseAd baseAd, @NonNull VungleError vungleError) {
        Log.w(VungleMediationAdapter.TAG, VungleMediationAdapter.getAdError(vungleError).toString());
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(@NonNull BaseAd baseAd) {
        g();
        this.f53676c = this.f53675b.onSuccess(this);
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        Log.d(str, "trackViews()");
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        NativeAd nativeAd = this.f53677d;
        if (nativeAd != null && nativeAd.canPlayAd().booleanValue()) {
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                Log.d(str, "Vungle requires a FrameLayout to render the native ad.");
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            View value = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    value = entry.getValue();
                }
            }
            if (value instanceof ImageView) {
                imageView = (ImageView) value;
            } else {
                Log.d(VungleMediationAdapter.TAG, "The view to display a Vungle native icon image is not a type of ImageView, so it can't be registered for click events.");
            }
            this.f53677d.registerViewForInteraction((FrameLayout) childAt, this.f53678e, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        super.untrackView(view);
        Log.d(VungleMediationAdapter.TAG, "untrackView()");
        NativeAd nativeAd = this.f53677d;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
