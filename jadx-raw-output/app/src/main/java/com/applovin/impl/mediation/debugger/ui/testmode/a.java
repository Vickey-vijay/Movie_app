package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.e3;
import com.applovin.impl.n3;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.w;
import com.applovin.impl.x;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e3 f8252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f8253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MaxAdView f8254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MaxAdView f8255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f8256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f8257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f8258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private MaxAd f8259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f8260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f8261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f8262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AdControlButton f8263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private AdControlButton f8264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private AdControlButton f8265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private AdControlButton f8266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private AdControlButton f8267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private AdControlButton f8268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Button f8269r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Button f8270s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private FrameLayout f8271t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f8272u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Switch f8273v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Switch f8274w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Map f8275x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0041a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MaxNativeAdView f8276a;

        public C0041a(MaxNativeAdView maxNativeAdView) {
            this.f8276a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f8259h != null) {
                a.this.f8260i.destroy(a.this.f8259h);
            }
            a.this.f8259h = maxAd;
            a.this.f8260i.render(this.f8276a, maxAd);
            a.this.f8272u.removeAllViews();
            a.this.f8272u.addView(this.f8276a);
            a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f8255d.removeAllViews();
        this.f8264m.setControlState(AdControlButton.b.LOAD);
    }

    @Override // com.applovin.impl.n3, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44955a, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(@NonNull String str, @NonNull MaxError maxError) {
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        n7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f8252a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f8252a.g() + " Test Ads");
        this.f8261j = this.f8253b.s0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f8269r = (Button) findViewById(R.id.show_mrec_button);
        this.f8270s = (Button) findViewById(R.id.show_native_button);
        if (this.f8252a.I() && this.f8252a.r().contains(MaxAdFormat.MREC)) {
            this.f8272u.setVisibility(8);
            this.f8269r.setBackgroundColor(-1);
            this.f8270s.setBackgroundColor(-3355444);
            this.f8269r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8278b.a(view);
                }
            });
            this.f8270s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8279b.b(view);
                }
            });
        } else {
            this.f8269r.setVisibility(8);
            this.f8270s.setVisibility(8);
        }
        this.f8273v = (Switch) findViewById(R.id.native_banner_switch);
        this.f8274w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f8252a.J()) {
            this.f8273v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8280b.c(view);
                }
            });
            this.f8274w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8281b.d(view);
                }
            });
        } else {
            this.f8273v.setVisibility(8);
            this.f8274w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f8252a.e()) || this.f8252a.d() == null || this.f8252a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f8252a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f8252a.d().size());
        for (MaxAdFormat maxAdFormat : this.f8252a.d().keySet()) {
            map.put(maxAdFormat, new w((x) this.f8252a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f8275x = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f8272u.setVisibility(0);
        this.f8271t.setVisibility(8);
        this.f8270s.setBackgroundColor(-1);
        this.f8269r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f8254c.removeAllViews();
        this.f8263l.setControlState(AdControlButton.b.LOAD);
    }

    private void e() {
        List listR = this.f8252a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f8252a.m();
        this.f8262k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f8253b.y0(), this);
        this.f8258g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f8258g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f8267p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f8267p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    public k getSdk() {
        return this.f8253b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f8252a.x() == null || !this.f8252a.x().containsKey(maxAdFormat)) ? this.f8252a.m() : (String) this.f8252a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f8252a = e3Var;
        this.f8253b = e3Var.o();
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

    @Override // com.applovin.impl.w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f8254c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f8255d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8256e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8257f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8258g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8260i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(@NonNull MaxAd maxAd) {
        n7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(@NonNull MaxAd maxAd, @NonNull MaxReward maxReward) {
        n7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f8271t.setVisibility(0);
        this.f8272u.setVisibility(8);
        this.f8269r.setBackgroundColor(-1);
        this.f8270s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f8272u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f8252a.I()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f8260i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f8260i.setNativeAdListener(new C0041a(maxNativeAdView));
            this.f8260i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f8268q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8268q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f8272u.setVisibility(8);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(@NonNull MaxAd maxAd, @NonNull MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        n7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(@NonNull MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (!maxAd.getFormat().isAdViewAd() && !maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map map = this.f8275x;
            if (map != null && map.get(format) != null) {
                ((w) this.f8275x.get(format)).a();
                return;
            } else {
                a(format);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(bVar);
            b(format);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f8253b.s0().a(this.f8261j);
        MaxAdView maxAdView = this.f8254c;
        if (maxAdView != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView);
        }
        MaxAdView maxAdView2 = this.f8255d;
        if (maxAdView2 != null) {
            SpecialsBridge.maxAdViewDestroy(maxAdView2);
        }
        MaxInterstitialAd maxInterstitialAd = this.f8256e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f8258g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f8260i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f8259h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f8260i.destroy();
        }
    }

    private void c() {
        this.f8271t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f8252a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f8253b.y0(), this);
            this.f8255d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f8255d.setExtraParameter("disable_precache", "true");
            this.f8255d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8255d.stopAutoRefresh();
            this.f8255d.setListener(this);
            this.f8271t.addView(this.f8255d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f8264m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8264m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f8271t.setVisibility(8);
    }

    @Override // com.applovin.impl.w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f8255d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f8256e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f8257f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f8258g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f8260i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f8254c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void b() {
        List listR = this.f8252a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f8253b.y0(), this);
            this.f8256e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f8256e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f8265n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8265n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f8252a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f8253b.y0(), this);
            this.f8254c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", com.ironsource.mediationsdk.metadata.a.f29886h);
            this.f8254c.setExtraParameter("disable_auto_retries", "true");
            this.f8254c.setExtraParameter("disable_precache", "true");
            this.f8254c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f8254c.stopAutoRefresh();
            this.f8254c.setListener(this);
            frameLayout.addView(this.f8254c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f8263l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f8263l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f8252a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8256e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8257f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8258g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f8252a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f8273v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z11 = maxAdFormat3 == maxAdFormat && this.f8274w.isChecked();
        if (!z10 && !z11) {
            this.f8253b.s0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f8253b.s0().a(this.f8252a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f8254c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f8255d.loadAd();
            this.f8269r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f8256e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f8257f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f8258g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f8260i.loadAd();
            this.f8270s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f8264m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f8265n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f8266o;
            }
            if (str.equals(this.f8262k)) {
                return this.f8267p;
            }
            if (str.equals("test_mode_native")) {
                return this.f8268q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
        }
        return this.f8263l;
    }
}
