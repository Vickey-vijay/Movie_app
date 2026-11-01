package com.bytedance.sdk.openadsdk.core.cf.lh;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.jg;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.rn;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.fkw;
import com.bytedance.sdk.openadsdk.utils.ey;
import com.bytedance.sdk.openadsdk.utils.th;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class yu implements cf, lh<le> {
    private final boolean bly;
    private le fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private String f12633le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private Context f12634lh;
    public bs ouw;
    private int pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.cf.lh.ouw f12635ra;
    private boolean tlj = false;
    public ouw vt;
    private vpp yu;

    public interface ouw {
        void pno();
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(jg jgVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void lh() {
        bs bsVar = this.ouw;
        if (bsVar != null) {
            bsVar.ouw();
        }
        this.ouw = null;
        try {
            le leVar = this.fkw;
            if (leVar != null) {
                ViewGroup viewGroup = (ViewGroup) leVar.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(this.fkw);
                }
                this.fkw.bly();
            }
        } catch (Throwable unused) {
        }
        if (this.vt != null) {
            this.vt = null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw() {
        le leVar = new le(this.f12634lh, le.lh.EASY_PLAYABLE);
        this.fkw = leVar;
        leVar.setBackgroundColor(0);
        this.fkw.setBackgroundResource(R.color.transparent);
        this.fkw.setVisibility(8);
        le leVar2 = this.fkw;
        if (leVar2 != null) {
            try {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.f12634lh);
                lhVarOuw.vt = false;
                lhVarOuw.ouw(leVar2.getWebView());
                leVar2.setVerticalScrollBarEnabled(false);
                leVar2.setHorizontalScrollBarEnabled(false);
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(leVar2);
                leVar2.ra();
                leVar2.setUserAgentString(th.ouw(leVar2.getWebView()));
                leVar2.setMixedContentMode(0);
                leVar2.setJavaScriptEnabled(true);
                leVar2.setJavaScriptCanOpenWindowsAutomatically(true);
                leVar2.setDomStorageEnabled(true);
                leVar2.setDatabaseEnabled(true);
                leVar2.setAllowFileAccess(false);
                leVar2.setSupportZoom(true);
                leVar2.setBuiltInZoomControls(true);
                leVar2.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                leVar2.setUseWideViewPort(true);
                leVar2.setCacheMode(-1);
            } catch (Exception e10) {
                ko.fkw("EasyPlayableRender", e10.toString());
            }
        }
        if (this.yu != null) {
            this.fkw.setWebViewClient(new fkw(this.f12634lh, this.ouw, this.yu.pv, null) { // from class: com.bytedance.sdk.openadsdk.core.cf.lh.yu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public final void onPageFinished(WebView webView, String str) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/cf/lh/yu$2;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                    CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str);
                    safedk_yu$2_onPageFinished_7c37c7e045f4a9696fafb0d9e67c211e(webView, str);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                    return CreativeInfoManager.onWebViewResponse(g.f44975u, view, url, super.shouldInterceptRequest(view, url));
                }

                public void safedk_yu$2_onPageFinished_7c37c7e045f4a9696fafb0d9e67c211e(WebView p10, String p11) {
                    super.onPageFinished(p10, p11);
                    if (yu.this.vt != null) {
                        yu.this.vt.pno();
                    }
                }
            });
        }
        com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.fkw, this.ouw);
        this.fkw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.ouw));
        bs bsVar = new bs(this.f12634lh);
        this.ouw = bsVar;
        bs bsVarOuw = bsVar.vt(this.fkw).ouw(this.yu);
        vpp vppVar = this.yu;
        bsVarOuw.f12584lh = vppVar.pv;
        bsVarOuw.fkw = vppVar.yhj;
        bsVarOuw.f12587ra = vppVar.hun();
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(0.0f, 0.0f, false, this.yu, null, null);
        bsVarOuw.tlj = this;
        bsVarOuw.ouw(this.fkw);
        if (this.bly) {
            return;
        }
        ey.ouw(this.fkw, false, this.yu.lna, false, new ey.vt() { // from class: com.bytedance.sdk.openadsdk.core.cf.lh.yu.1
            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw(View view, boolean z10) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw(boolean z10) {
                yu.this.ouw(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void ouw() {
                yu.this.ouw(true);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.ey.vt
            public final void vt() {
                yu.this.ouw(false);
            }
        }, null);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void vt() {
        if (TextUtils.isEmpty(this.f12633le)) {
            this.fkw.setVisibility(8);
        } else {
            this.fkw.a_(this.f12633le);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final /* bridge */ /* synthetic */ View yu() {
        return this.fkw;
    }

    public yu(Context context, vpp vppVar, boolean z10) {
        rn rnVar;
        rn rnVar2;
        this.pno = 1;
        this.f12634lh = context;
        this.yu = vppVar;
        int iJqy = vppVar.jqy();
        this.pno = iJqy;
        this.bly = z10;
        rn.ouw ouwVar = null;
        if (z10) {
            vpp vppVar2 = this.yu;
            if (vppVar2 != null && (rnVar2 = vppVar2.f12841ak) != null) {
                ouwVar = rnVar2.vt;
            }
            this.f12633le = ouwVar.ouw(iJqy == 1);
            return;
        }
        vpp vppVar3 = this.yu;
        if (vppVar3 != null && (rnVar = vppVar3.f12841ak) != null) {
            ouwVar = rnVar.ouw;
        }
        this.f12633le = ouwVar.ouw(iJqy == 1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar) {
        this.f12635ra = ouwVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.cf.lh.lh
    public final void ouw(com.bytedance.sdk.openadsdk.core.bly.ko koVar) {
        bs bsVar = this.ouw;
        if (bsVar != null) {
            bsVar.f12579cf = koVar;
        }
    }

    public final void ouw(boolean z10) {
        if (z10 == this.tlj) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visibleState", z10 ? 0 : 1);
        } catch (Exception e10) {
            ko.fkw("EasyPlayableRender", e10.getMessage());
        }
        this.ouw.ouw("visibleStateChange", jSONObject);
        this.tlj = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i10, com.bytedance.sdk.component.adexpress.lh lhVar) {
        com.bytedance.sdk.openadsdk.core.cf.lh.ouw ouwVar = this.f12635ra;
        if (ouwVar != null) {
            ouwVar.ouw(view, i10, lhVar);
        }
    }
}
