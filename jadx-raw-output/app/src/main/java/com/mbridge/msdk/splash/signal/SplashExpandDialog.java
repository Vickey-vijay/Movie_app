package com.mbridge.msdk.splash.signal;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.SafeDKWebAppInterface;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SplashExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f37174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f37175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f37176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f37177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f37178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.splash.middle.a f37179i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f37180j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SplashExpandDialog.this.dismiss();
        }
    }

    public class b extends com.mbridge.msdk.mbsignalcommon.listener.b {

        public class a implements ValueCallback<String> {
            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(String str) {
            }

            public a() {
            }
        }

        public b() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            webView.evaluateJavascript(SafeDKWebAppInterface.f44738f + com.mbridge.msdk.setting.util.a.a().b(), new a());
            SplashExpandDialog.this.c();
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            SplashExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            SplashExpandDialog.this.a();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (SplashExpandDialog.this.f37179i != null) {
                SplashExpandDialog.this.f37179i.a(false);
                SplashExpandDialog.this.f37179i.close();
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(SplashExpandDialog.this.f37175e, null, "", "text/html", G5.N, null);
            SplashExpandDialog.this.f37174d.removeView(SplashExpandDialog.this.f37175e);
            SplashExpandDialog.this.f37175e.release();
            SplashExpandDialog.this.f37175e = null;
            SplashExpandDialog.this.f37179i = null;
        }
    }

    public class e implements com.mbridge.msdk.mbsignalcommon.mraid.b {
        public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
            Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
            if (p11 == null) {
                return;
            }
            BrandSafetyUtils.detectAdClick(p11, g.f44969o);
            p10.startActivity(p11);
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void expand(String str, boolean z10) {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public CampaignEx getMraidCampaign() {
            return null;
        }

        public e() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void close() {
            SplashExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (SplashExpandDialog.this.f37175e == null || System.currentTimeMillis() - SplashExpandDialog.this.f37175e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f32945d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) SplashExpandDialog.this.f37178h.get(0), SplashExpandDialog.this.f37175e.getUrl(), com.mbridge.msdk.click.utils.a.f32942a)) {
                    q0.b("SplashExpandDialog", str);
                    if (SplashExpandDialog.this.f37178h.size() > 1) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.mbridge.msdk.foundation.controller.c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (SplashExpandDialog.this.f37179i != null) {
                        SplashExpandDialog.this.f37179i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                SplashExpandDialog.this.f37176f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("SplashExpandDialog", "useCustomClose", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f37174d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f37175e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f37174d.addView(this.f37175e);
        TextView textView = new TextView(getContext());
        this.f37176f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f37176f.setLayoutParams(layoutParams);
        this.f37176f.setVisibility(this.f37173c ? 4 : 0);
        this.f37176f.setOnClickListener(new a());
        this.f37174d.addView(this.f37176f);
        setContentView(this.f37174d);
        a();
        this.f37175e.setWebViewListener(new b());
        this.f37175e.setObject(this.f37180j);
        MintegralNetworkBridge.webviewLoadUrl(this.f37175e, this.f37172b);
        List<CampaignEx> list = this.f37178h;
        if (list != null && !list.isEmpty()) {
            CampaignEx campaignEx = this.f37178h.get(0);
            if (campaignEx != null) {
                b1.a(this.f37175e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f37174d.addView(mBAdChoice, layoutParams2);
            }
        }
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f37177g, 297);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f37174d.getResources().getDisplayMetrics());
            this.f37174d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        setOnDismissListener(new d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        String str;
        try {
            int i10 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            if (i10 == 2) {
                str = C3426d4.i.C;
            } else {
                str = i10 == 1 ? C3426d4.i.D : "undefined";
            }
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", "expanded");
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            this.f37175e.getLocationInWindow(iArr);
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView = this.f37175e;
            aVarA.b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f37175e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView2 = this.f37175e;
            aVarA2.a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f37175e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f37175e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37175e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37175e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f37175e);
        } catch (Throwable th2) {
            q0.b("SplashExpandDialog", "notifyMraid", th2);
        }
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f37177g = str;
        this.f37178h = list;
    }

    public SplashExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.splash.middle.a aVar) {
        super(context);
        this.f37171a = "SplashExpandDialog";
        this.f37180j = new e();
        if (bundle != null) {
            this.f37172b = bundle.getString("url");
            this.f37173c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f37179i = aVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            getWindow().getDecorView().setSystemUiVisibility(4615);
        }
    }
}
