package com.inmobi.media;

import android.content.Context;
import android.view.View;
import androidx.webkit.Profile;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.core.config.models.AdConfig;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: renamed from: com.inmobi.media.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2987ki extends GestureDetectorOnGestureListenerC2785ci {

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public final byte f24684i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public final C3053n9 f24685j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public final String f24686k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public final GestureDetectorOnGestureListenerC2785ci f24687l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public final C2962ji f24688m1;

    private static /* synthetic */ void getOverrideListener$annotations() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci
    public final void C() {
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci, com.inmobi.media.AbstractC3320y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci
    public final void u() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2987ki(Context context, byte b10, C3053n9 c3053n9, C3069o0 c3069o0, ko koVar, Di di2, AdConfig adConfig) {
        super(context, b10, null, null, c3069o0.f24934r, 0L, c3069o0.f24935s, c3053n9, di2, koVar, c3069o0, adConfig, 92);
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(c3069o0, "adMetaData");
        ck.p.j(koVar, "webViewFactory");
        ck.p.j(di2, "route");
        ck.p.j(adConfig, "adConfig");
        this.f24684i1 = b10;
        this.f24685j1 = c3053n9;
        this.f24686k1 = "RenderViewSibling - " + di2.f22535b;
        koVar.getClass();
        ck.p.j("default", "id");
        this.f24687l1 = (GestureDetectorOnGestureListenerC2785ci) koVar.f24705b.get("default");
        this.f24688m1 = new C2962ji(this, koVar, di2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GestureDetectorOnGestureListenerC2785ci getAdRenderView() {
        C3053n9 c3053n9;
        if (this.f24687l1 == null && (c3053n9 = this.f24685j1) != null) {
            c3053n9.b(this.f24686k1, "Ad RenderView not found for id: " + getRoute().f22535b);
        }
        return this.f24687l1;
    }

    public final void Z() {
        Map<View, FriendlyObstructionPurpose> friendlyViews;
        C3053n9 c3053n9 = this.f24685j1;
        if (c3053n9 != null) {
            c3053n9.a(this.f24686k1, "initialize RenderViewSibling");
        }
        a(this.f24688m1);
        GestureDetectorOnGestureListenerC2785ci adRenderView = getAdRenderView();
        setContextualDataHandler(adRenderView != null ? adRenderView.getContextualDataHandler() : null);
        GestureDetectorOnGestureListenerC2785ci adRenderView2 = getAdRenderView();
        setEmbeddedBrowserJsCallbacks(adRenderView2 != null ? adRenderView2.getEmbeddedBrowserJsCallbacks() : null);
        GestureDetectorOnGestureListenerC2785ci adRenderView3 = getAdRenderView();
        if (adRenderView3 == null || (friendlyViews = adRenderView3.getFriendlyViews()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<View, FriendlyObstructionPurpose> entry : friendlyViews.entrySet()) {
            if (!(entry.getKey() instanceof C2987ki)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        C3053n9 c3053n10 = this.f24685j1;
        if (c3053n10 != null) {
            c3053n10.a(this.f24686k1, "Setting friendly views from adRenderView: " + linkedHashMap);
        }
        setFriendlyViews(kotlin.collections.a.B(linkedHashMap));
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci
    public final void a(Ff ff2) {
        ck.p.j(ff2, "orientationProperties");
        C3053n9 c3053n9 = this.f24685j1;
        if (c3053n9 != null) {
            c3053n9.a(this.f24686k1, "setOrientationProperties " + this);
        }
        setOrientationProperties(ff2);
    }

    public final InterfaceC3028m9 getLogger() {
        return this.f24685j1;
    }

    public final byte getMPlacementType() {
        return this.f24684i1;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci
    public final void m() {
        C3053n9 c3053n9 = this.f24685j1;
        if (c3053n9 != null) {
            c3053n9.a(this.f24686k1, "dismissCurrentViewContainer " + this);
        }
        C3280wc mediaProcessor = getMediaProcessor();
        if (mediaProcessor != null) {
            C2907hc c2907hc = mediaProcessor.f25635c;
            if (c2907hc != null) {
                c2907hc.b();
            }
            mediaProcessor.f25635c = null;
        }
        if (ck.p.e(Profile.DEFAULT_PROFILE_NAME, getViewState())) {
            setAndUpdateViewState("Hidden");
        }
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci, com.inmobi.media.C
    public final void b() {
        j();
        removeAllViews();
        ck.p.h(this, "null cannot be cast to non-null type android.webkit.WebView");
        destroy();
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci, com.inmobi.media.C
    public Fn getViewableAd() {
        if (getMViewableAd() == null) {
            setMViewableAd(new D9(this, this, new C3126q7(getImpressionType(), getMCreativeType(), getMImpressionMinTimeViewed(), getMImpressionMinPercentageViewed(), getAdConfig().getViewability().getCompanionVisibilityMinPercentageViewed(), this.f24685j1), this.f24685j1));
        }
        Fn mViewableAd = getMViewableAd();
        ck.p.g(mViewableAd);
        return mViewableAd;
    }

    @Override // com.inmobi.media.GestureDetectorOnGestureListenerC2785ci, android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        ko webViewFactory = getWebViewFactory();
        String str = getRoute().f22534a;
        webViewFactory.getClass();
        ck.p.j(str, "id");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = (GestureDetectorOnGestureListenerC2785ci) webViewFactory.f24705b.get(str);
        if (gestureDetectorOnGestureListenerC2785ci == null) {
            C3053n9 c3053n9 = this.f24685j1;
            if (c3053n9 != null) {
                c3053n9.b(this.f24686k1, "Not able to give show success as the source view is not present");
                return;
            }
            return;
        }
        c(gestureDetectorOnGestureListenerC2785ci, getRoute().f22535b);
    }
}
