package s2;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdEventsListener;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.google.ads.mediation.fyber.FyberMediationAdapter;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.Map;

/* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class d extends NativeAdMapper {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f66988e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> f66989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediationNativeAdCallback f66990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InneractiveAdSpot f66991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAdContent f66992d;

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(ck.i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class b extends NativeAd.Image {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f66993a;

        public Void a() {
            return null;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        public b(Uri uri) {
            p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
            this.f66993a = uri;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public Uri getUri() {
            return this.f66993a;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.Image
        public /* bridge */ /* synthetic */ Drawable getDrawable() {
            return (Drawable) a();
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class c implements VideoContentListener {
        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onPlayerError() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onProgress(int i10, int i11) {
        }

        public c() {
        }

        @Override // com.fyber.inneractive.sdk.external.VideoContentListener
        public void onCompleted() {
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f66990b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onVideoComplete();
            }
        }
    }

    /* JADX INFO: renamed from: s2.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class C0636d extends NativeAdEventsListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
            p.j(inneractiveAdSpot, "adSpot");
        }

        public C0636d() {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
            p.j(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f66990b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.reportAdClicked();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = d.this.f66990b;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.onAdOpened();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
            p.j(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f66990b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdOpened();
            }
            MediationNativeAdCallback mediationNativeAdCallback2 = d.this.f66990b;
            if (mediationNativeAdCallback2 != null) {
                mediationNativeAdCallback2.reportAdImpression();
            }
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener, com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
            p.j(inneractiveAdSpot, "adSpot");
            MediationNativeAdCallback mediationNativeAdCallback = d.this.f66990b;
            if (mediationNativeAdCallback != null) {
                mediationNativeAdCallback.onAdLeftApplication();
            }
        }
    }

    /* JADX INFO: compiled from: DTExchangeNativeAdMapper.kt */
    public static final class e extends InneractiveAdSpot.NativeAdRequestListener {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f66997c;

        public e(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
            this.f66997c = mediationNativeAdConfiguration;
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.RequestListener
        public void onInneractiveFailedAdRequest(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
            d.this.i("onInneractiveFailedAdRequest error: " + inneractiveErrorCode, inneractiveErrorCode);
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveAdSpot.NativeAdRequestListener
        public void onInneractiveSuccessfulNativeAdRequest(InneractiveAdSpot inneractiveAdSpot, NativeAdContent nativeAdContent) {
            if (nativeAdContent == null) {
                d.this.i("content is NOT NativeAdContent", InneractiveErrorCode.SDK_INTERNAL_ERROR);
                return;
            }
            d dVar = d.this;
            Context context = this.f66997c.getContext();
            p.i(context, "getContext(...)");
            dVar.h(context, nativeAdContent);
            d dVar2 = d.this;
            dVar2.f66990b = (MediationNativeAdCallback) dVar2.f66989a.onSuccess(d.this);
        }
    }

    public d(MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        p.j(mediationAdLoadCallback, "adLoadCallback");
        this.f66989a = mediationAdLoadCallback;
    }

    public final void f(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        p.j(mediationNativeAdConfiguration, "mediationNativeAdConfiguration");
        InneractiveAdManager.setMediationName(FyberMediationAdapter.f18859n);
        InneractiveAdManager.setMediationVersion(MobileAds.getVersion().toString());
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        p.i(bidResponse, "getBidResponse(...)");
        InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
        NativeAdUnitController nativeAdUnitControllerB = f.b();
        NativeAdVideoContentController nativeAdVideoContentControllerC = f.c();
        nativeAdVideoContentControllerC.setEventsListener(new c());
        nativeAdUnitControllerB.addContentController(nativeAdVideoContentControllerC);
        nativeAdUnitControllerB.setEventsListener(new C0636d());
        inneractiveAdSpotCreateSpot.addUnitController(nativeAdUnitControllerB);
        inneractiveAdSpotCreateSpot.setRequestListener(new e(mediationNativeAdConfiguration));
        s2.e.c(mediationNativeAdConfiguration.getMediationExtras());
        inneractiveAdSpotCreateSpot.loadAd(bidResponse);
        this.f66991c = inneractiveAdSpotCreateSpot;
    }

    public final void h(Context context, NativeAdContent nativeAdContent) {
        nativeAdContent.bindMediaView(new MediaView(context));
        this.f66992d = nativeAdContent;
        setHeadline(nativeAdContent.getAdTitle());
        setBody(nativeAdContent.getAdDescription());
        Uri appIcon = nativeAdContent.getAppIcon();
        p.i(appIcon, "getAppIcon(...)");
        setIcon(new b(appIcon));
        setCallToAction(nativeAdContent.getAdCallToAction());
        setMediaView(nativeAdContent.getMediaView());
        setStarRating(Double.valueOf(nativeAdContent.getRating().floatValue()));
        Float mediaAspectRatio = nativeAdContent.getMediaAspectRatio();
        setMediaContentAspectRatio(mediaAspectRatio != null ? mediaAspectRatio.floatValue() : 0.0f);
        setOverrideClickHandling(true);
        setOverrideImpressionRecording(true);
    }

    public final void i(String str, InneractiveErrorCode inneractiveErrorCode) {
        Log.e("DTExchangeNativeAdMapper", str);
        MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.f66989a;
        if (inneractiveErrorCode == null) {
            inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
        }
        mediationAdLoadCallback.onFailure(s2.b.a(inneractiveErrorCode));
        InneractiveAdSpot inneractiveAdSpot = this.f66991c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f66991c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void trackViews(View view, Map<String, ? extends View> map, Map<String, ? extends View> map2) {
        MediaView mediaView;
        p.j(view, "containerView");
        p.j(map, "clickableAssetViews");
        p.j(map2, "nonClickableAssetViews");
        view.setTag(NativeAdContent.ViewTag.ROOT);
        NativeAdContent nativeAdContent = this.f66992d;
        if (nativeAdContent != null && (mediaView = nativeAdContent.getMediaView()) != null) {
            mediaView.setTag(NativeAdContent.ViewTag.MEDIA_VIEW);
        }
        for (Map.Entry<String, ? extends View> entry : map.entrySet()) {
            entry.getValue().setTag(g(entry.getKey()));
        }
        NativeAdContent nativeAdContent2 = this.f66992d;
        if (nativeAdContent2 != 0) {
            nativeAdContent2.registerViewsForInteraction((ViewGroup) view, nativeAdContent2 != 0 ? nativeAdContent2.getMediaView() : null, null, map.values());
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeAdMapper
    public void destroy() {
        super.destroy();
        InneractiveAdSpot inneractiveAdSpot = this.f66991c;
        if (inneractiveAdSpot != null) {
            inneractiveAdSpot.destroy();
        }
        this.f66991c = null;
        NativeAdContent nativeAdContent = this.f66992d;
        if (nativeAdContent != null) {
            nativeAdContent.destroy();
        }
        this.f66992d = null;
        this.f66990b = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final String g(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 1567014) {
            switch (iHashCode) {
                case 1567006:
                    if (str.equals("3001")) {
                        return NativeAdContent.ViewTag.AD_TITLE;
                    }
                    break;
                case 1567007:
                    if (str.equals("3002")) {
                        return "CTA";
                    }
                    break;
                case 1567008:
                    if (str.equals("3003")) {
                        return NativeAdContent.ViewTag.AD_ICON;
                    }
                    break;
                case 1567009:
                    if (str.equals("3004")) {
                        return NativeAdContent.ViewTag.AD_DESCRIPTION;
                    }
                    break;
            }
        } else if (str.equals("3009")) {
            return NativeAdContent.ViewTag.RATING;
        }
        return NativeAdContent.ViewTag.OTHER;
    }
}
