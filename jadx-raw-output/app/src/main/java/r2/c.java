package r2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import q2.e;

/* JADX INFO: compiled from: FacebookRtbNativeAd.java */
/* JADX INFO: loaded from: classes9.dex */
public class c extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MediationNativeAdConfiguration f66669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f66670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdBase f66671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediationNativeAdCallback f66672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public MediaView f66673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f66674g;

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class a implements MediaViewListener {
        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f10) {
        }

        public a() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (c.this.f66672e != null) {
                c.this.f66672e.onVideoComplete();
            }
        }
    }

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f66676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f66677b;

        public b() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public b(Uri uri) {
            this.f66677b = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @Nullable
        public Drawable getDrawable() {
            return this.f66676a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.f66677b;
        }

        public b(Drawable drawable) {
            this.f66676a = drawable;
        }
    }

    /* JADX INFO: renamed from: r2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public interface InterfaceC0622c {
        void a(AdError adError);

        void b();
    }

    /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
    public class d implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakReference<Context> f66679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NativeAdBase f66680c;

        /* JADX INFO: compiled from: FacebookRtbNativeAd.java */
        public class a implements InterfaceC0622c {
            public a() {
            }

            @Override // r2.c.InterfaceC0622c
            public void a(AdError adError) {
                Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f66670c.onFailure(adError);
            }

            @Override // r2.c.InterfaceC0622c
            public void b() {
                c cVar = c.this;
                cVar.f66672e = (MediationNativeAdCallback) cVar.f66670c.onSuccess(c.this);
            }
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad2) {
        }

        public d(Context context, NativeAdBase nativeAdBase) {
            this.f66680c = nativeAdBase;
            this.f66679b = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad2) {
            c.this.f66672e.reportAdClicked();
            c.this.f66672e.onAdOpened();
            c.this.f66672e.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad2) {
            if (ad2 != this.f66680c) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", FacebookMediationAdapter.ERROR_DOMAIN);
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                c.this.f66670c.onFailure(adError);
                return;
            }
            Context context = this.f66679b.get();
            if (context != null) {
                c.this.e(context, new a());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f66670c.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad2) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad2, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            c.this.f66670c.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f66671d;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Meta Audience Network impression recording might be impacted for this ad.");
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Meta Audience Network Adapter. Meta Audience Network impression recording might be impacted for this ad.");
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f66673f, (ImageView) view2, arrayList);
        } else {
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.f66673f, arrayList);
        }
    }

    public void e(@NonNull Context context, @NonNull InterfaceC0622c interfaceC0622c) {
        if (!d(this.f66671d)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            interfaceC0622c.a(adError);
            return;
        }
        setHeadline(this.f66671d.getAdHeadline());
        if (this.f66671d.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b(Uri.parse(this.f66671d.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f66671d.getAdBodyText());
        if (this.f66671d.getPreloadedIconViewDrawable() != null) {
            setIcon(new b(this.f66671d.getPreloadedIconViewDrawable()));
        } else if (this.f66671d.getAdIcon() == null) {
            setIcon(new b());
        } else {
            setIcon(new b(Uri.parse(this.f66671d.getAdIcon().getUrl())));
        }
        setCallToAction(this.f66671d.getAdCallToAction());
        setAdvertiser(this.f66671d.getAdvertiserName());
        this.f66673f.setListener(new a());
        setHasVideoContent(true);
        setMediaView(this.f66673f);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f66671d.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f66671d.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f66671d, null));
        interfaceC0622c.b();
    }

    public void f() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.f66669b.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", FacebookMediationAdapter.ERROR_DOMAIN);
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.f66670c.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.f66669b);
        this.f66673f = this.f66674g.b(this.f66669b.getContext());
        try {
            this.f66671d = NativeAdBase.fromBidPayload(this.f66669b.getContext(), placementID, this.f66669b.getBidResponse());
            if (!TextUtils.isEmpty(this.f66669b.getWatermark())) {
                this.f66671d.setExtraHints(new ExtraHints.Builder().mediationData(this.f66669b.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.f66671d;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new d(this.f66669b.getContext(), this.f66671d)).withBid(this.f66669b.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e10) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e10.getMessage(), FacebookMediationAdapter.ERROR_DOMAIN);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.f66670c.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        NativeAdBase nativeAdBase = this.f66671d;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    public c(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, e eVar) {
        this.f66670c = mediationAdLoadCallback;
        this.f66669b = mediationNativeAdConfiguration;
        this.f66674g = eVar;
    }

    public final boolean d(NativeAdBase nativeAdBase) {
        boolean z10;
        if (nativeAdBase.getAdHeadline() != null && nativeAdBase.getAdBodyText() != null && nativeAdBase.getAdIcon() != null && nativeAdBase.getAdCallToAction() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nativeAdBase instanceof NativeBannerAd) {
            return z10;
        }
        if (z10 && nativeAdBase.getAdCoverImage() != null && this.f66673f != null) {
            return true;
        }
        return false;
    }
}
