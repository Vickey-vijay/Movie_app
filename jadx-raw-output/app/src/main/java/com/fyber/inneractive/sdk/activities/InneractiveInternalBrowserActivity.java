package com.fyber.inneractive.sdk.activities;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.network.u;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.h0;
import com.fyber.inneractive.sdk.util.o0;
import com.fyber.inneractive.sdk.util.v;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.Logger;
import java.net.URLDecoder;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class InneractiveInternalBrowserActivity extends InneractiveBaseActivity {
    public static final String EXTRA_KEY_SPOT_ID = "spotId";
    public static final String URL_EXTRA = "extra_url";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static String f14835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static InternalBrowserListener f14836k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f14837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f14838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LinearLayout f14839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f14840e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageButton f14841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageButton f14842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f14843h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f14844i;

    public interface InternalBrowserListener {
        void onApplicationInBackground();

        void onInternalBrowserDismissed();
    }

    public static void a(InneractiveInternalBrowserActivity inneractiveInternalBrowserActivity, com.fyber.inneractive.sdk.click.b bVar) {
        r rVar;
        x xVar = inneractiveInternalBrowserActivity.f14837b;
        InneractiveAdRequest inneractiveAdRequest = xVar != null ? xVar.f15746a : null;
        com.fyber.inneractive.sdk.response.e eVarB = xVar != null ? xVar.b() : null;
        x xVar2 = inneractiveInternalBrowserActivity.f14837b;
        JSONArray jSONArrayB = (xVar2 == null || (rVar = xVar2.f15748c) == null) ? null : rVar.b();
        u uVar = u.FYBER_SUCCESS_CLICK;
        w wVar = new w(eVarB);
        wVar.f16129c = uVar;
        wVar.f16127a = inneractiveAdRequest;
        wVar.f16130d = jSONArrayB;
        JSONObject jSONObject = new JSONObject();
        long j10 = bVar.f14964e;
        if (j10 != 0) {
            Object objValueOf = Long.valueOf(j10);
            try {
                jSONObject.put("time_passed", objValueOf);
            } catch (Exception unused) {
                IAlog.f("Got exception adding param to json object: %s, %s", "time_passed", objValueOf);
            }
        }
        JSONArray jSONArray = new JSONArray();
        for (com.fyber.inneractive.sdk.click.j jVar : bVar.f14965f) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("url", jVar.f14982a);
                jSONObject2.put("success", jVar.f14983b);
                jSONObject2.put("opened_by", jVar.f14984c);
                jSONObject2.put("reason", jVar.f14985d);
            } catch (Exception unused2) {
            }
            jSONArray.put(jSONObject2);
        }
        try {
            jSONObject.put("urls", jSONArray);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "urls", jSONArray);
        }
        Object obj = com.fyber.inneractive.sdk.util.g.VIDEO_CTA;
        try {
            jSONObject.put("origin", obj);
        } catch (Exception unused4) {
            IAlog.f("Got exception adding param to json object: %s, %s", "origin", obj);
        }
        wVar.f16132f.put(jSONObject);
        wVar.a((String) null);
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p11, com.safedk.android.utils.g.f44970p);
        p10.startActivity(p11);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.g.f44970p, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InneractiveAdSpot spot;
        getWindow().requestFeature(2);
        getWindow().setFeatureInt(2, -1);
        getWindow().addFlags(1024);
        super.onCreate(bundle);
        if (getActionBar() != null) {
            getActionBar().hide();
        }
        try {
            setContentView(a());
            String stringExtra = getIntent().getStringExtra("spotId");
            this.f14838c = stringExtra;
            if (!TextUtils.isEmpty(stringExtra) && (spot = InneractiveAdSpotManager.get().getSpot(this.f14838c)) != null) {
                this.f14837b = spot.getAdContent();
            }
            Intent intent = getIntent();
            WebSettings settings = this.f14840e.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            disableWebviewZoomControls(this.f14840e);
            this.f14840e.setWebChromeClient(new e(this));
            String stringExtra2 = intent.getStringExtra("extra_url");
            if (!TextUtils.isEmpty(f14835j)) {
                String str = f14835j + "<title>DigitalTurbine Internal Browser</title>";
                f14835j = str;
                this.f14840e.loadDataWithBaseURL(stringExtra2, str, "text/html", "UTF-8", null);
            } else if (TextUtils.isEmpty(stringExtra2)) {
                IAlog.f("Empty url", new Object[0]);
                finish();
            } else if (!h0.d(stringExtra2)) {
                this.f14840e.loadUrl(stringExtra2);
            } else if (h0.c(stringExtra2)) {
                try {
                    stringExtra2 = URLDecoder.decode(stringExtra2, G5.N);
                    this.f14840e.loadUrl(stringExtra2);
                } catch (Exception unused) {
                    IAlog.f("Failed to open Url: %s", stringExtra2);
                    finish();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2));
                intent2.addFlags(268435456);
                try {
                    startActivity(intent2);
                    InternalBrowserListener internalBrowserListener = f14836k;
                    if (internalBrowserListener != null) {
                        internalBrowserListener.onApplicationInBackground();
                    }
                } catch (ActivityNotFoundException unused2) {
                    IAlog.f("Failed to start activity for %s. Please ensure that your phone can handle this intent.", stringExtra2);
                }
                finish();
            }
            this.f14841f.setBackgroundColor(0);
            this.f14841f.setOnClickListener(new i(this));
            this.f14841f.setContentDescription("IABackButton");
            this.f14842g.setBackgroundColor(0);
            this.f14842g.setOnClickListener(new j(this));
            this.f14842g.setContentDescription("IAForwardButton");
            this.f14843h.setBackgroundColor(0);
            this.f14843h.setOnClickListener(new k(this));
            this.f14843h.setContentDescription("IARefreshButton");
            this.f14844i.setBackgroundColor(0);
            this.f14844i.setOnClickListener(new l(this));
            this.f14844i.setContentDescription("IACloseButton");
            com.fyber.inneractive.sdk.util.o.a();
            com.fyber.inneractive.sdk.util.o.f();
        } catch (Exception unused3) {
            finish();
        }
    }

    public static void setHtmlExtra(String str) {
        f14835j = str;
    }

    public static void setInternalBrowserListener(InternalBrowserListener internalBrowserListener) {
        f14836k = internalBrowserListener;
    }

    @Override // android.app.Activity
    public void finish() {
        InternalBrowserListener internalBrowserListener = f14836k;
        super.finish();
        if (internalBrowserListener != null) {
            internalBrowserListener.onInternalBrowserDismissed();
        }
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveBaseActivity, android.app.Activity
    public void onDestroy() {
        LinearLayout linearLayout = this.f14839d;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        WebView webView = this.f14840e;
        if (webView != null) {
            webView.removeAllViews();
            v.a(this.f14840e);
            this.f14840e.destroy();
            this.f14840e = null;
        }
        super.onDestroy();
        setHtmlExtra(null);
    }

    public static void disableWebviewZoomControls(WebView webView) {
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        new o0(webView).run();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setVisible(false);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        com.fyber.inneractive.sdk.util.o.g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        com.fyber.inneractive.sdk.util.o.f();
    }

    public final LinearLayout a() {
        this.f14839d = new LinearLayout(this);
        this.f14839d.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.f14839d.setOrientation(1);
        this.f14839d.setContentDescription("IAInternalBrowserView");
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f14839d.addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(R.integer.ia_ib_toolbar_height_dp)));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        com.fyber.inneractive.sdk.util.o.a(linearLayout, com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_background));
        relativeLayout.addView(linearLayout);
        this.f14841f = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_left_arrow));
        this.f14842g = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_right_arrow));
        this.f14843h = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_refresh));
        this.f14844i = a(com.fyber.inneractive.sdk.util.o.d(R.drawable.ia_ib_close));
        linearLayout.addView(this.f14841f);
        linearLayout.addView(this.f14842g);
        linearLayout.addView(this.f14843h);
        linearLayout.addView(this.f14844i);
        WebView webView = new WebView(IAConfigManager.O.f15027v.a());
        this.f14840e = webView;
        webView.setWebViewClient(new f(this));
        this.f14840e.setId(R.id.ia_inneractive_webview_internal_browser);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, 1);
        this.f14840e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f14840e);
        return this.f14839d;
    }

    public final ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        Resources resources = getResources();
        int i10 = R.integer.ia_ib_button_size_dp;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(com.fyber.inneractive.sdk.util.o.b(resources.getInteger(i10)), com.fyber.inneractive.sdk.util.o.b(getResources().getInteger(i10)), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}
