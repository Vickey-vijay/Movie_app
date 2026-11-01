package com.bytedance.sdk.openadsdk.common;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class th {
    private final vpp fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final String f12225le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw f12226lh;
    public final com.bytedance.sdk.component.bly.le ouw;
    private ImageView pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private ImageView f12227ra;
    public final Context vt;
    private final LinearLayout yu;

    public final void ouw(WebView webView, com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar) {
        this.f12226lh = ouwVar;
        try {
            if (this.f12227ra != null) {
                if (webView.canGoBack()) {
                    this.f12227ra.setClickable(true);
                    this.f12227ra.clearColorFilter();
                } else {
                    this.f12227ra.setClickable(false);
                    this.f12227ra.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
            if (this.pno != null) {
                if (webView.canGoForward()) {
                    this.pno.setClickable(true);
                    this.pno.clearColorFilter();
                } else {
                    this.pno.setClickable(false);
                    this.pno.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void vt() {
        if (this.yu.getAlpha() == 1.0f) {
            ObjectAnimator.ofFloat(this.yu, "alpha", 1.0f, 0.0f).setDuration(300L).start();
        }
    }

    public th(Context context, LinearLayout linearLayout, com.bytedance.sdk.component.bly.le leVar, vpp vppVar, String str) {
        this.vt = context;
        this.yu = linearLayout;
        this.ouw = leVar;
        this.fkw = vppVar;
        this.f12225le = str;
        this.f12227ra = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.euf);
        this.pno = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.njr);
        ImageView imageView = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.mq);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13406an);
        this.f12227ra.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/th$1;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_th$1_onClick_7bf6c65484a4123d089db22c60d473bd(view);
            }

            public void safedk_th$1_onClick_7bf6c65484a4123d089db22c60d473bd(View p10) {
                com.bytedance.sdk.component.bly.le leVar2 = th.this.ouw;
                if (leVar2 == null || !leVar2.lh()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar = th.this.f12226lh;
                if (ouwVar != null) {
                    ouwVar.ouw();
                }
                th.ouw(th.this, ToolBar.BACKWARD);
                th.this.ouw.yu();
            }
        });
        this.pno.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/th$2;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_th$2_onClick_f4ce1294d9c59ca068bf09e24a8499c1(view);
            }

            public void safedk_th$2_onClick_f4ce1294d9c59ca068bf09e24a8499c1(View p10) {
                com.bytedance.sdk.component.bly.le leVar2 = th.this.ouw;
                if (leVar2 == null || !leVar2.fkw()) {
                    return;
                }
                th.ouw(th.this, ToolBar.FORWARD);
                try {
                    th.this.ouw.ouw.goForward();
                } catch (Throwable unused) {
                }
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/th$3;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_th$3_onClick_194f2e4f21af288834a0b1964345e0be(view);
            }

            public void safedk_th$3_onClick_194f2e4f21af288834a0b1964345e0be(View p10) {
                th thVar = th.this;
                if (thVar.ouw != null) {
                    th.vt(thVar, ToolBar.REFRESH);
                    try {
                        th.this.ouw.ouw.reload();
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/th$4;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_th$4_onClick_352c90d0bdd36df2b379904a16e99352(view);
            }

            public void safedk_th$4_onClick_352c90d0bdd36df2b379904a16e99352(View p10) {
                th thVar = th.this;
                if (thVar.ouw != null) {
                    th.vt(thVar, "external_btn_click");
                    Intent intent = new Intent("android.intent.action.VIEW");
                    String url = th.this.ouw.getUrl();
                    if (TextUtils.isEmpty(url)) {
                        return;
                    }
                    intent.setData(Uri.parse(url));
                    com.bytedance.sdk.component.utils.vt.ouw(th.this.vt, intent, null);
                }
            }
        });
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.th.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/common/th$5;->onClick(Landroid/view/View;)V");
                CreativeInfoManager.onViewClicked(g.f44975u, view);
                safedk_th$5_onClick_90bd0ece1e3f97c678f553fe0d6ebe58(view);
            }

            public void safedk_th$5_onClick_90bd0ece1e3f97c678f553fe0d6ebe58(View p10) {
            }
        });
        this.f12227ra.setClickable(false);
        this.pno.setClickable(false);
        this.f12227ra.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
        this.pno.setColorFilter(Color.parseColor("#A8FFFFFF"), PorterDuff.Mode.ADD);
    }

    public static /* synthetic */ void vt(th thVar, String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (thVar.ouw.getWebView() != null && (webBackForwardListCopyBackForwardList = thVar.ouw.getWebView().copyBackForwardList()) != null) {
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex()).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = thVar.ouw.getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("first_page", Integer.valueOf(webBackForwardListCopyBackForwardList.getCurrentIndex() == 0 ? 1 : 0));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.fkw, thVar.f12225le, str, jSONObject);
    }

    public final void ouw() {
        if (this.yu.getAlpha() == 0.0f) {
            ObjectAnimator.ofFloat(this.yu, "alpha", 0.0f, 1.0f).setDuration(300L).start();
        }
    }

    public static /* synthetic */ void ouw(th thVar, String str) {
        WebBackForwardList webBackForwardListCopyBackForwardList;
        JSONObject jSONObject = new JSONObject();
        try {
            if (thVar.ouw.getWebView() != null && (webBackForwardListCopyBackForwardList = thVar.ouw.getWebView().copyBackForwardList()) != null) {
                int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                String url = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex).getUrl();
                if (TextUtils.isEmpty(url)) {
                    url = thVar.ouw.getUrl();
                }
                String url2 = str.equals(ToolBar.BACKWARD) ? webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1).getUrl() : "";
                int i10 = 1;
                if (str.equals(ToolBar.FORWARD)) {
                    url2 = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex + 1).getUrl();
                }
                jSONObject.putOpt("url", url);
                jSONObject.putOpt("next_url", url2);
                if (webBackForwardListCopyBackForwardList.getCurrentIndex() != 0) {
                    i10 = 0;
                }
                jSONObject.putOpt("first_page", Integer.valueOf(i10));
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), thVar.fkw, thVar.f12225le, str, jSONObject);
    }
}
