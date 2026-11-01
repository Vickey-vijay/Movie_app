package com.bytedance.sdk.openadsdk.core.bly;

import android.R;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.utils.fvf;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.f;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ex extends com.bytedance.sdk.component.adexpress.fkw.ouw {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.model.vpp f12506cf;
    private final com.bytedance.sdk.component.pno.pno ex;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public bs f12507jg;
    private volatile int jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public tlj f12508ko;
    public com.bytedance.sdk.openadsdk.yu.yu.fkw mwh;
    private final Map<String, com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh> qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.utils.ouw f12509rn;
    public JSONObject ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private final Runnable f12510tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.yu.mwh f12511th;
    public String tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private String f12512vm;
    private com.bytedance.sdk.openadsdk.core.model.vpp.ouw vpp;
    private Context zih;
    private com.bytedance.sdk.component.adexpress.vt.ra zin;

    /* JADX INFO: Access modifiers changed from: private */
    public void bly() {
        if (this.f11492le.getWebView() == null || !com.bytedance.sdk.openadsdk.utils.bs.le()) {
            this.jqy = 1;
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.3
                @Override // java.lang.Runnable
                public final void run() {
                    ex.this.tlj();
                }
            });
        } else {
            tlj();
        }
        if (!jg.vt(this.f12506cf) || this.vt) {
            return;
        }
        jg.ouw(this.f12506cf);
    }

    private void cf() {
        com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar;
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.f12506cf;
        if (vppVar == null || (ouwVar = vppVar.f12886xn) == null) {
            return;
        }
        this.vpp = ouwVar;
    }

    private void ryl() {
        com.bytedance.sdk.component.bly.le leVar = this.f11492le;
        if (leVar == null || leVar.getWebView() == null) {
            return;
        }
        this.f11492le.setBackgroundColor(0);
        this.f11492le.setBackgroundResource(R.color.transparent);
        ouw(this.f11492le);
        if (this.f11492le != null) {
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = new com.bytedance.sdk.openadsdk.yu.mwh(this.f12506cf, this.f11492le.getWebView());
            mwhVar.jae = false;
            this.f12511th = mwhVar;
        }
        this.f12511th.f13537od = this.mwh;
        tlj tljVar = new tlj(this.zih, this.f12507jg, this.f12506cf, this.f12511th, this.fkw);
        this.f12508ko = tljVar;
        this.f11492le.setWebViewClient(tljVar);
        this.f11492le.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.f12507jg, this.f12511th));
        com.bytedance.sdk.component.adexpress.fkw.fkw.ouw().ouw(this.f11492le, this.f12507jg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tlj() {
        com.bytedance.sdk.component.bly.le leVar = this.f11492le;
        if (leVar == null || leVar.getWebView() == null || this.jqy == 2) {
            return;
        }
        this.f12512vm = ouw(this.f12506cf);
        this.f11492le.setDisplayZoomControls(false);
        ouw(fvf.ouw(this.f12512vm));
        cf();
        bs bsVar = new bs(this.zih);
        this.f12507jg = bsVar;
        bsVar.f12585od = true;
        ryl();
        this.jqy = 2;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void fkw() {
        bs bsVar = this.f12507jg;
        if (bsVar == null) {
            return;
        }
        bsVar.ouw("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void le() {
        super.le();
        if (this.f12507jg == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.f12507jg.ouw("expressShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.ouw
    public final void onThemeChanged(int i10) {
        if (this.f12507jg == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i10);
        } catch (JSONException unused) {
        }
        this.f12507jg.ouw("themeChange", jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void pno() {
        super.pno();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = this.f12509rn;
        if (ouwVar != null) {
            ouwVar.fkw.remove(new WeakReference(this));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ra() {
        super.ra();
        com.bytedance.sdk.openadsdk.utils.ouw ouwVar = com.bytedance.sdk.openadsdk.core.ko.ouw.ouw.ouw;
        this.f12509rn = ouwVar;
        ouwVar.ouw(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final int vt() {
        return this.f12506cf.kfa;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void yu() {
        if (this.bly.get()) {
            return;
        }
        super.yu();
        bs bsVar = this.f12507jg;
        if (bsVar != null) {
            bsVar.ouw();
            this.f12507jg.lh();
            this.f12507jg = null;
        }
        com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.f12511th;
        if (mwhVar != null) {
            mwhVar.ouw(false);
        }
        com.bytedance.sdk.openadsdk.core.jg.lh().removeCallbacks(this.f12510tc);
        this.qbp.clear();
    }

    public ex(Context context, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.openadsdk.yu.yu.fkw fkwVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        super(context, mwhVar, themeStatusBroadcastReceiver);
        this.qbp = Collections.synchronizedMap(new HashMap());
        this.jqy = 0;
        this.ex = new com.bytedance.sdk.component.pno.pno("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.1
            @Override // java.lang.Runnable
            public final void run() {
                if (ex.this.bly.get()) {
                    return;
                }
                ex exVar = ex.this;
                exVar.ryl = exVar.fkw.ouw();
                ex exVar2 = ex.this;
                exVar2.ouw(exVar2.ryl);
                if (ex.this.jqy == 0) {
                    ex.this.bly();
                }
                com.bytedance.sdk.openadsdk.core.jg.lh().post(ex.this.f12510tc);
            }
        };
        this.f12510tc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.2
            @Override // java.lang.Runnable
            public final void run() {
                bs bsVar;
                if (ex.this.bly.get() || ex.this.zin == null) {
                    return;
                }
                ex exVar = ex.this;
                com.bytedance.sdk.component.bly.le leVar = exVar.f11492le;
                if (leVar != null && leVar.getWebView() != null && (bsVar = exVar.f12507jg) != null) {
                    bs bsVarOuw = bsVar.vt(exVar.f11492le).ouw(exVar.f12506cf);
                    com.bytedance.sdk.openadsdk.core.model.vpp vppVar2 = exVar.f12506cf;
                    bsVarOuw.f12584lh = vppVar2.pv;
                    bsVarOuw.fkw = vppVar2.yhj;
                    bsVarOuw.f12583le = uoy.ouw(exVar.tlj);
                    bsVarOuw.f12587ra = exVar.f12506cf.hun();
                    bsVarOuw.tlj = exVar;
                    bsVarOuw.ryl = exVar.ryl;
                    bsVarOuw.ouw(exVar.f11492le).zin = exVar.mwh;
                }
                ex exVar2 = ex.this;
                ex.super.ouw(exVar2.zin);
            }
        };
        if (this.f11492le == null) {
            return;
        }
        this.zih = context;
        this.tlj = mwhVar.ouw;
        this.f12506cf = vppVar;
        this.mwh = fkwVar;
        themeStatusBroadcastReceiver.ouw(this);
        bly();
    }

    private static String ouw(com.bytedance.sdk.openadsdk.core.model.vpp vppVar) {
        return com.bytedance.sdk.component.adexpress.ouw.vt.vt.yu((vppVar == null || !vppVar.th()) ? null : "v3");
    }

    public static boolean vt(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.yu
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.ra raVar) {
        this.zin = raVar;
        com.bytedance.sdk.openadsdk.utils.bs.vt(this.ex);
    }

    private void ouw(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
            lhVarOuw.vt = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setVerticalScrollBarEnabled(false);
            leVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(leVar);
            leVar.ra();
            leVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar.getWebView()));
            leVar.setMixedContentMode(0);
            leVar.setJavaScriptEnabled(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setDatabaseEnabled(true);
            leVar.setAllowFileAccess(false);
            leVar.setSupportZoom(true);
            leVar.setBuiltInZoomControls(true);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            leVar.setUseWideViewPort(true);
            leVar.setCacheMode(-1);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.qbp.lh("TTAD.WebViewRender", e10.toString());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    /* JADX INFO: renamed from: ouw */
    public final com.bytedance.sdk.component.bly.le lh() {
        return this.f11492le;
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw
    public final void ouw(int i10) {
        if (i10 == this.pno) {
            return;
        }
        this.pno = i10;
        boolean z10 = i10 == 0;
        if (this.f12507jg == null || this.f11492le == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f.O, z10);
            this.f12507jg.ouw("expressAdShow", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.fkw.ouw, com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        super.ouw(jgVar);
        if (this.f11493lh) {
            com.bytedance.sdk.component.utils.bly.vt().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.bly.ex.4
                @Override // java.lang.Runnable
                public final void run() {
                    com.bytedance.sdk.component.utils.ko.vt("TTAD.WebViewRender", "resumeTimers..........");
                    WebView webView = ex.this.f11492le.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }
}
