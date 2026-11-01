package com.mbridge.msdk.mbbanner.common.communication;

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

/* JADX INFO: loaded from: classes9.dex */
public class BannerExpandDialog extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f35585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f35586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f35587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private FrameLayout f35588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WindVaneWebView f35589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private TextView f35590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f35591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<CampaignEx> f35592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.listener.a f35593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.mbsignalcommon.mraid.b f35594j;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BannerExpandDialog.this.dismiss();
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
            BannerExpandDialog.this.c();
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
            BannerExpandDialog.this.a();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BannerExpandDialog.this.a();
        }
    }

    public class d implements DialogInterface.OnDismissListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (BannerExpandDialog.this.f35593i != null) {
                BannerExpandDialog.this.f35593i.a(false);
            }
            MintegralNetworkBridge.webviewLoadDataWithBaseURL(BannerExpandDialog.this.f35589e, null, "", "text/html", G5.N, null);
            BannerExpandDialog.this.f35588d.removeView(BannerExpandDialog.this.f35589e);
            BannerExpandDialog.this.f35589e.release();
            BannerExpandDialog.this.f35589e = null;
            BannerExpandDialog.this.f35593i = null;
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
            BannerExpandDialog.this.dismiss();
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void open(String str) {
            try {
                if (BannerExpandDialog.this.f35589e == null || System.currentTimeMillis() - BannerExpandDialog.this.f35589e.lastTouchTime <= com.mbridge.msdk.click.utils.a.f32945d || !com.mbridge.msdk.click.utils.a.a((CampaignEx) BannerExpandDialog.this.f35592h.get(0), BannerExpandDialog.this.f35589e.getUrl(), com.mbridge.msdk.click.utils.a.f32942a)) {
                    q0.b("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f35592h.size() > 1) {
                        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(com.mbridge.msdk.foundation.controller.c.n().d(), new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f35593i != null) {
                        BannerExpandDialog.this.f35593i.a(true, str);
                    }
                }
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "open", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void useCustomClose(boolean z10) {
            try {
                BannerExpandDialog.this.f35590f.setVisibility(z10 ? 4 : 0);
            } catch (Throwable th2) {
                q0.b("BannerExpandDialog", "useCustomClose", th2);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.mraid.b
        public void unload() {
            close();
        }
    }

    private void b() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f35588d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f35589e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f35588d.addView(this.f35589e);
        TextView textView = new TextView(getContext());
        this.f35590f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f35590f.setLayoutParams(layoutParams);
        this.f35590f.setVisibility(this.f35587c ? 4 : 0);
        this.f35590f.setOnClickListener(new a());
        BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f35591g, 296);
        if (bitmapDrawableA != null) {
            ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
            v0.a(imageView, bitmapDrawableA, this.f35588d.getResources().getDisplayMetrics());
            this.f35588d.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f35588d.addView(this.f35590f);
        setContentView(this.f35588d);
        a();
        this.f35589e.setWebViewListener(new b());
        this.f35589e.setObject(this.f35594j);
        MintegralNetworkBridge.webviewLoadUrl(this.f35589e, this.f35586b);
        List<CampaignEx> list = this.f35592h;
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = this.f35592h.get(0);
            if (campaignEx != null) {
                b1.a(this.f35589e, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            }
            if (campaignEx != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.n().d());
                mBAdChoice.setCampaign(campaignEx);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f), v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 12.0f));
                layoutParams2.gravity = 85;
                layoutParams2.bottomMargin = layoutParams.topMargin;
                layoutParams2.rightMargin = layoutParams.rightMargin;
                mBAdChoice.setFeedbackDialogEventListener(new c());
                this.f35588d.addView(mBAdChoice, layoutParams2);
            }
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
            this.f35589e.getLocationInWindow(iArr);
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView = this.f35589e;
            aVarA.b(windVaneWebView, iArr[0], iArr[1], windVaneWebView.getWidth(), this.f35589e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a aVarA2 = com.mbridge.msdk.mbsignalcommon.mraid.a.a();
            WindVaneWebView windVaneWebView2 = this.f35589e;
            aVarA2.a(windVaneWebView2, iArr[0], iArr[1], windVaneWebView2.getWidth(), this.f35589e.getHeight());
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(this.f35589e, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35589e, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35589e, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(this.f35589e);
        } catch (Throwable th2) {
            q0.b("BannerExpandDialog", "notifyMraid", th2);
        }
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f35591g = str;
        this.f35592h = list;
    }

    public BannerExpandDialog(Context context, Bundle bundle, com.mbridge.msdk.mbbanner.common.listener.a aVar) {
        super(context);
        this.f35585a = "BannerExpandDialog";
        this.f35594j = new e();
        if (bundle != null) {
            this.f35586b = bundle.getString("url");
            this.f35587c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f35593i = aVar;
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
