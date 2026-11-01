package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.ironsource.Mf;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.special.SpecialsBridge;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f7836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f7837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i8 f7838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f7839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxAdView f7840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f7841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f7842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f7843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f7844i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f7845j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MaxAd f7846k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r f7847l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List f7848m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ListView f7849n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f7850o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f7851p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private TextView f7852q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private w f7853r;

    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (l.this.f7846k != null) {
                l.this.f7845j.destroy(l.this.f7846k);
            }
            l.this.f7846k = maxAd;
            l.this.f7845j.render(l.this.f7844i, maxAd);
            l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        this.f7851p.setControlState(AdControlButton.b.LOAD);
        this.f7852q.setText("");
        if (204 == maxError.getCode()) {
            n7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        n7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f7839d.k());
        this.f7849n = (ListView) findViewById(R.id.listView);
        this.f7850o = findViewById(R.id.ad_presenter_view);
        this.f7851p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f7852q = (TextView) findViewById(R.id.status_textview);
        this.f7849n.setAdapter((ListAdapter) this.f7839d);
        this.f7852q.setText(a());
        this.f7852q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7851p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f7850o.setBackground(layerDrawable);
    }

    private void b() {
        String strC = this.f7837b.c();
        if (this.f7837b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f7837b.a());
            this.f7840e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f29886h);
            this.f7840e.setExtraParameter("disable_auto_retries", "true");
            this.f7840e.setExtraParameter("disable_precache", "true");
            this.f7840e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f7840e.stopAutoRefresh();
            this.f7840e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7837b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f7841f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f7841f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7837b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f7842g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f7842g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f7837b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f7843h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f7843h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f7837b.a()) {
            this.f7844i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f7845j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f7845j.setNativeAdListener(new a());
            this.f7845j.setRevenueListener(this);
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f7836a;
    }

    public void initialize(final n nVar, @Nullable final o oVar, @Nullable i8 i8Var, final com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f7836a = kVar;
        this.f7837b = nVar;
        this.f7838c = i8Var;
        this.f7848m = kVar.s0().b();
        m mVar = new m(nVar, oVar, i8Var, this);
        this.f7839d = mVar;
        mVar.a(new s2.a() { // from class: com.applovin.impl.kb
            @Override // com.applovin.impl.s2.a
            public final void a(j2 j2Var, r2 r2Var) {
                this.f7822a.a(kVar, nVar, oVar, j2Var, r2Var);
            }
        });
        b();
        if (nVar.f().f()) {
            if ((i8Var != null && !i8Var.b().d().C()) || (listA = kVar.U().a(nVar.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f7853r = new w(listA, nVar.a(), getApplicationContext(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(@NonNull MaxAd maxAd) {
        n7.a(Mf.f27056f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(@NonNull MaxAd maxAd) {
        n7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f7851p.setControlState(AdControlButton.b.LOAD);
        this.f7852q.setText("");
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(@NonNull MaxAd maxAd) {
        n7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(@NonNull MaxAd maxAd) {
        n7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(@NonNull MaxAd maxAd) {
        n7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        this.f7852q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f7851p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f7840e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f7837b.a()) {
            a(this.f7844i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f7836a.s0().c()) {
            n7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f7839d.j() != this.f7837b.f()) {
            n7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f7837b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            w wVar = this.f7853r;
            if (wVar != null) {
                wVar.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(final com.applovin.impl.sdk.k kVar, final n nVar, final o oVar, j2 j2Var, final r2 r2Var) {
        if (r2Var instanceof m.b) {
            d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new d.b() { // from class: com.applovin.impl.lb
                @Override // com.applovin.impl.d.b
                public final void a(Activity activity) {
                    l.a(r2Var, nVar, oVar, kVar, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7840e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7841f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7842g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7843h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7845j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f7838c != null) {
            this.f7836a.s0().a(this.f7848m);
        }
        MaxAdView maxAdView = this.f7840e;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxInterstitialAd maxInterstitialAd = this.f7841f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f7842g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7843h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f7845j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f7846k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f7845j.destroy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, n nVar, o oVar, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(nVar, oVar, ((m.b) r2Var).v(), kVar);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7840e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7841f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f7842g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7843h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7845j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f7838c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f7839d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f7838c != null) {
            this.f7836a.s0().a(this.f7838c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f7840e.setPlacement("[Mediation Debugger Live Ad]");
            this.f7840e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7837b.a()) {
            this.f7841f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7837b.a()) {
            this.f7842g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f7837b.a()) {
            this.f7843h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f7837b.a()) {
            this.f7845j.setPlacement("[Mediation Debugger Live Ad]");
            this.f7845j.loadAd();
        } else {
            n7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f7847l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f7847l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.jb
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f7772b.a(dialogInterface);
            }
        });
        this.f7847l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f7847l = null;
    }

    private String a() {
        if (this.f7836a.s0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.f7839d.j() != this.f7837b.f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        i8 i8Var = this.f7838c;
        sb2.append(i8Var != null ? i8Var.b().a() : this.f7839d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f7840e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f7837b.a()) {
            this.f7841f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f7837b.a()) {
            this.f7842g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f7837b.a()) {
            this.f7843h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f7837b.a()) {
            a(this.f7844i, MaxAdFormat.MREC.getSize());
        }
    }
}
