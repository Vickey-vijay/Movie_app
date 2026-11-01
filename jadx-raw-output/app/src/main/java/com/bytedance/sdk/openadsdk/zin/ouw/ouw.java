package com.bytedance.sdk.openadsdk.zin.ouw;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.ouw.ko;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.od;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.ryl;
import com.bytedance.sdk.openadsdk.core.widget.bly;
import com.bytedance.sdk.openadsdk.core.widget.tlj;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.yu.th;
import com.bytedance.sdk.openadsdk.zin.fkw;
import com.bytedance.sdk.openadsdk.zin.pno;
import com.bytedance.sdk.openadsdk.zin.ra;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ouw {
    public boolean bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public AtomicBoolean f13611cf;
    private boolean ex;
    public String fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public long f13612jg;
    private com.bytedance.sdk.openadsdk.core.lh.ouw jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public StringBuilder f13613ko;
    private int ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final String f13614le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public le f13615lh;
    public vt mwh;
    public final vpp ouw;

    @Nullable
    public com.bytedance.sdk.openadsdk.mwh.le pno;
    private volatile boolean qbp;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public pno f13616ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public InterfaceC0162ouw f13617rn;
    public bly ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private int f13618tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final FrameLayout f13619th;
    public volatile boolean tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final int f13620vm;
    private AtomicBoolean vpp;

    @Nullable
    public tlj vt;
    public bs yu;
    private final Context zih;
    private int zin;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.zin.ouw.ouw$ouw, reason: collision with other inner class name */
    public interface InterfaceC0162ouw {
        void ouw(int i10);
    }

    public interface vt {
        void ouw();
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout) {
        this(context, vppVar, i10, z10, frameLayout, false);
    }

    private void vt(boolean z10) {
        ko koVar;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.ouw.pv);
            jSONObject.put("log_extra", this.ouw.yhj);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (com.bytedance.sdk.openadsdk.core.bly.ouw().jg()) {
            ra.ouw = new ra.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.1
                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2) {
                    com.bytedance.sdk.component.utils.ko.vt(str, str2);
                }

                @Override // com.bytedance.sdk.openadsdk.zin.ra.ouw
                public final void ouw(String str, String str2, Throwable th3) {
                    com.bytedance.sdk.component.utils.ko.lh(str, str2, th3);
                }
            };
        }
        Context contextOuw = zih.ouw();
        WebView webView = this.f13615lh.getWebView();
        com.bytedance.sdk.openadsdk.zin.lh lhVar = new com.bytedance.sdk.openadsdk.zin.lh() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.2
            @Override // com.bytedance.sdk.openadsdk.zin.lh
            public final void ouw(String str, JSONObject jSONObject2) {
                bs bsVar = ouw.this.yu;
                if (bsVar != null) {
                    bsVar.ouw(str, jSONObject2);
                }
            }
        };
        com.bytedance.sdk.openadsdk.zin.ouw ouwVar = new com.bytedance.sdk.openadsdk.zin.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3
            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final com.bytedance.sdk.openadsdk.zin.yu ouw() {
                String strOuw = com.bytedance.sdk.openadsdk.common.lh.ouw();
                strOuw.hashCode();
                switch (strOuw) {
                    case "2g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_2G;
                    case "3g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_3G;
                    case "4g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_4G;
                    case "5g":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_5G;
                    case "wifi":
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_WIFI;
                    default:
                        return com.bytedance.sdk.openadsdk.zin.yu.TYPE_UNKNOWN;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void lh() {
                com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar = ouw.this.yu.uq;
                if (vtVar != null) {
                    vtVar.ra();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void vt() {
                ouw ouwVar2 = ouw.this;
                ouwVar2.yu.f12590th = true;
                com.bytedance.sdk.openadsdk.mwh.le leVar = ouwVar2.pno;
                if (leVar != null) {
                    leVar.ouw();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(final JSONObject jSONObject2) {
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ouw ouwVar2 = ouw.this;
                com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.3.1
                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject lh() {
                        return jSONObject2;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                    public final JSONObject ouw() {
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("is_new_playable", 1);
                            if (ouw.this.ouw.wp()) {
                                jSONObject3.put("is_pre_render", 1);
                            }
                            return jSONObject3;
                        } catch (JSONException e10) {
                            qbp.lh("PlayableManager", e10.getMessage());
                            return null;
                        }
                    }
                });
            }

            @Override // com.bytedance.sdk.openadsdk.zin.ouw
            public final void ouw(int i10) {
                ouw ouwVar2 = ouw.this;
                ouwVar2.bly = false;
                if (i10 == 2 || i10 == 3 || i10 == 4) {
                    ouwVar2.ouw(2, i10);
                } else if (i10 == 5) {
                    ouwVar2.ouw(3, i10);
                } else {
                    ouwVar2.ouw(1, 0);
                }
            }
        };
        pno pnoVar = webView == null ? new pno(contextOuw, lhVar, ouwVar) : new pno(contextOuw, webView, lhVar, ouwVar, pno.ouw.LAND_PAGE);
        this.f13616ra = pnoVar;
        pno pnoVarLh = pnoVar.lh(this.f13614le);
        pnoVarLh.mt = ryl.ouw(zih.ouw());
        pnoVarLh.f13632cj = com.bytedance.sdk.openadsdk.core.bly.ouw().pno();
        pnoVarLh.f13654ub = "open_news";
        pnoVarLh.pv = uoy.bly();
        pnoVarLh.f13638kn = jSONObject;
        pno pnoVarVt = pnoVarLh.vt(od.bly(this.ouw)).ouw().ouw(z10).vt(false);
        long jRyl = od.ryl(this.ouw);
        if (jRyl <= 0) {
            pnoVarVt.zih = 10L;
        } else {
            pnoVarVt.zih = jRyl;
        }
        long jRyl2 = od.ryl(this.ouw);
        if (jRyl2 <= 0) {
            pnoVarVt.f13659vm = 10L;
        } else {
            pnoVarVt.f13659vm = jRyl2;
        }
        pnoVarVt.wp.put("sdkEdition", BuildConfig.VERSION_NAME);
        pnoVarVt.coz = od.le(this.ouw);
        pnoVarVt.f13636jg = this.fkw;
        this.f13616ra.yhj = fkw.vt(this.zih);
        Set<String> setOuw = this.f13616ra.hun.ouw();
        final WeakReference weakReference = new WeakReference(this.f13616ra);
        for (String str : setOuw) {
            if (!"subscribe_app_ad".equals(str) && !"adInfo".equals(str) && !"webview_time_track".equals(str) && !"download_app_ad".equals(str) && (koVar = this.yu.vpp) != null) {
                koVar.ouw(str, new com.bytedance.sdk.component.ouw.yu<JSONObject, JSONObject>() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.4
                    @Override // com.bytedance.sdk.component.ouw.yu
                    public final /* bridge */ /* synthetic */ JSONObject ouw(String str2, @NonNull JSONObject jSONObject2) throws Exception {
                        return ouw(jSONObject2);
                    }

                    private JSONObject ouw(@NonNull JSONObject jSONObject2) {
                        try {
                            pno pnoVar2 = (pno) weakReference.get();
                            if (pnoVar2 == null) {
                                return null;
                            }
                            String strOuw = ouw();
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (ra.ouw()) {
                                StringBuilder sb2 = new StringBuilder("PlayablePlugin JSB-REQ [");
                                sb2.append(strOuw);
                                sb2.append("] ");
                                sb2.append(jSONObject2 != null ? jSONObject2.toString() : "");
                                ra.ouw("PlayablePlugin", sb2.toString());
                            }
                            JSONObject jSONObjectOuw = pnoVar2.hun.ouw(strOuw, jSONObject2);
                            if (ra.ouw()) {
                                StringBuilder sb3 = new StringBuilder("PlayablePlugin JSB-RSP [");
                                sb3.append(strOuw);
                                sb3.append("] time:");
                                sb3.append(System.currentTimeMillis() - jCurrentTimeMillis);
                                sb3.append(Z7.f27998r);
                                sb3.append(jSONObjectOuw != null ? jSONObjectOuw.toString() : "");
                                ra.ouw("PlayablePlugin", sb3.toString());
                            }
                            return jSONObjectOuw;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }
                });
            }
        }
    }

    public final void ouw(boolean z10, com.bytedance.sdk.openadsdk.mwh.le leVar) {
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar;
        this.pno = leVar;
        this.f13616ra.myk = z10;
        com.bytedance.sdk.openadsdk.core.mwh.lh.ouw ouwVarOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw();
        vpp vppVar = this.ouw;
        if (vppVar != null && (vtVar = vppVar.f12874sd) != null && !TextUtils.isEmpty(vtVar.bly) && com.bytedance.sdk.openadsdk.vpp.ouw.ouw("can_cancel_playable", false)) {
            com.bytedance.sdk.component.ra.vt.ouw ouwVar = ouwVarOuw.ouw.get(vppVar.f12874sd.bly);
            if (ouwVar != null) {
                ouwVar.lh();
            }
        }
        this.f13615lh.a_(this.f13614le);
        pno pnoVar = this.f13616ra;
        if (pnoVar != null) {
            pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
            pno pnoVar2 = this.f13616ra;
            pnoVar2.osn = 1;
            JSONObject jSONObject = new JSONObject();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                pnoVar2.zin = jCurrentTimeMillis;
                long j10 = pnoVar2.qbp;
                jSONObject.put("playable_page_show_duration", j10 != -1 ? jCurrentTimeMillis - j10 : 0L);
            } catch (Throwable th2) {
                ra.ouw("PlayablePlugin", "reportUrlLoadStart error", th2);
            }
            pnoVar2.vt("PL_sdk_html_load_start", jSONObject);
            pnoVar2.lvd = true;
            pnoVar2.f13650sd = true;
            if (pnoVar2.coz) {
                pnoVar2.bly();
                pnoVar2.lvd = false;
                pnoVar2.f13650sd = false;
            }
            if (pnoVar2.pno) {
                try {
                    StringBuffer stringBuffer = new StringBuffer();
                    StringBuffer stringBuffer2 = new StringBuffer();
                    StringBuffer stringBuffer3 = new StringBuffer();
                    if (fkw.ouw(pnoVar2.rrs, fkw.ryl)) {
                        stringBuffer.append("Microphone_");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs, "android.permission.RECORD_AUDIO")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.f13600cf)) {
                        stringBuffer.append("Magetometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.tlj)) {
                        stringBuffer.append("Accelerometer_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.bly)) {
                        stringBuffer.append("Gyro_");
                        stringBuffer2.append("1");
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.pno)) {
                        stringBuffer.append("Camera_");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs, "android.permission.CAMERA")) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    if (fkw.ouw(pnoVar2.rrs, fkw.f13603ra)) {
                        stringBuffer.append("Photo");
                        stringBuffer2.append("1");
                        if (fkw.ouw(pnoVar2.rrs)) {
                            stringBuffer3.append("1");
                        } else {
                            stringBuffer3.append("0");
                        }
                    } else {
                        stringBuffer2.append("0");
                        stringBuffer3.append("0");
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                    jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                    jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                    pnoVar2.vt("PL_sdk_hardware_detect", jSONObject2);
                    pnoVar2.pno = false;
                } catch (Throwable th3) {
                    ra.ouw("PlayablePlugin", "Hardware detect error", th3);
                }
            }
        }
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11) {
        this(context, vppVar, i10, z10, frameLayout, z11, 0);
    }

    public final boolean fkw() {
        bs bsVar = this.yu;
        if (bsVar != null) {
            return bsVar.f12590th;
        }
        return false;
    }

    public final void lh() {
        if (!this.f13611cf.get() || this.f13616ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onPause() called");
        this.f13616ra.vt(false);
    }

    public final void yu() {
        pno pnoVar = this.f13616ra;
        if (pnoVar != null) {
            pnoVar.jg();
        }
        le leVar = this.f13615lh;
        if (leVar != null) {
            leVar.bly();
        }
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.lh();
        }
        this.f13612jg = System.currentTimeMillis();
        this.f13613ko = new StringBuilder();
        try {
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                StringBuilder sb2 = this.f13613ko;
                sb2.append(stackTraceElement);
                sb2.append("\n");
            }
        } catch (Throwable th2) {
            qbp.ouw("PlayableManager", "onDestroy() error", th2);
        }
        this.f13615lh = null;
    }

    public ouw(Context context, vpp vppVar, int i10, boolean z10, FrameLayout frameLayout, boolean z11, int i11) {
        com.bytedance.sdk.openadsdk.core.model.ouw ouwVar;
        List<vpp> list;
        this.bly = true;
        this.f13611cf = new AtomicBoolean(false);
        this.vpp = new AtomicBoolean(false);
        this.ksc = 0;
        this.f13612jg = 0L;
        this.zih = context;
        this.ouw = vppVar;
        this.f13618tc = i11;
        if (vppVar != null && (ouwVar = vppVar.f12885vm) != null && (list = ouwVar.yu) != null) {
            this.ksc = list.size();
        }
        this.f13620vm = i10;
        String strLh = uoy.lh(vppVar.yiz.getDurationSlotType());
        this.fkw = strLh;
        int iOuw = uoy.ouw(strLh);
        this.ex = z11;
        if (z11) {
            this.fkw = uoy.vt(iOuw);
        }
        this.f13614le = od.cf(vppVar);
        this.f13619th = frameLayout;
        le leVar = new le(context, true, le.lh.PLAYABLE);
        this.f13615lh = leVar;
        leVar.o_();
        this.f13615lh.setLayerType(2, null);
        this.f13615lh.setVisibility(4);
        this.f13615lh.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.f13615lh.setEnabled(true);
        this.f13615lh.setTag(this.fkw);
        this.f13615lh.setMaterialMeta(vppVar.bs());
        this.f13615lh.setLandingPage(true);
        frameLayout.addView(this.f13615lh, new FrameLayout.LayoutParams(-1, -1));
        bly blyVar = new bly(context);
        this.ryl = blyVar;
        String str = this.fkw;
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar2 = this.jqy;
        boolean z12 = this.ex;
        blyVar.ouw = vppVar;
        blyVar.vt = str;
        blyVar.f13099lh = z12;
        blyVar.yu = ouwVar2;
        frameLayout.addView(blyVar, new FrameLayout.LayoutParams(-1, -1));
        com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar = vppVar.f12874sd;
        if (vtVar == null || vtVar.f10455jg != 1) {
            tlj tljVar = new tlj(context);
            this.vt = tljVar;
            tljVar.vt();
            frameLayout.addView(this.vt, new FrameLayout.LayoutParams(-1, -1));
        }
        HashMap map = new HashMap();
        map.put("click_scence", 3);
        this.yu = new bs(context);
        String strHun = vppVar.hun();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isMultiAd", vppVar.tpk);
            jSONObject.put("currentIndex", this.f13618tc);
            jSONObject.put("totalAdCount", this.ksc);
        } catch (JSONException e10) {
            com.bytedance.sdk.component.utils.ko.yu("PlayableManager", e10);
        }
        bs bsVarOuw = this.yu.vt(this.f13615lh).ouw(this.ouw);
        bsVarOuw.ryl = com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.ouw, true, jSONObject);
        vpp vppVar2 = this.ouw;
        bsVarOuw.f12584lh = vppVar2.pv;
        bsVarOuw.fkw = vppVar2.yhj;
        bsVarOuw.f12583le = iOuw;
        bsVarOuw.f12587ra = strHun;
        bs bsVarOuw2 = bsVarOuw.ouw(this.f13615lh);
        bsVarOuw2.ouw = this.fkw;
        bsVarOuw2.ouw(map).zin = new th(3, this.fkw, this.ouw);
        vt(z10);
        this.f13615lh.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(zih.ouw(), this.yu, this.ouw.pv, null) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.5
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public void onLoadResource(WebView view, String url) {
                super.onLoadResource(view, url);
                CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final void onPageFinished(WebView webView, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zin/ouw/ouw$5;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str2);
                safedk_ouw$5_onPageFinished_d64d363eede4ac1fff4bf3e0f2ed227f(webView, str2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedError(WebView webView, int i12, String str2, String str3) {
                super.onReceivedError(webView, i12, str2, str3);
                ouw ouwVar3 = ouw.this;
                ouwVar3.bly = false;
                pno pnoVar = ouwVar3.f13616ra;
                if (pnoVar != null) {
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.f13616ra.ouw(i12, str2, str3);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
            public final WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/zin/ouw/ouw$5;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str2, safedk_ouw$5_shouldInterceptRequest_f12cfcaccb1cf2d9d8bc1b30c4bb316d(webView, str2));
            }

            public WebResourceResponse safedk_ouw$5_shouldInterceptRequest_f12cfcaccb1cf2d9d8bc1b30c4bb316d(WebView p10, String p11) {
                try {
                    com.bykv.vk.openvk.ouw.ouw.ouw.lh.vt vtVar2 = ouw.this.ouw.f12874sd;
                    if (vtVar2 != null && !TextUtils.isEmpty(vtVar2.bly)) {
                        pno pnoVar = ouw.this.f13616ra;
                        if (pnoVar != null) {
                            pnoVar.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.2
                                public AnonymousClass2() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.ksc++;
                                }
                            });
                        }
                        WebResourceResponse webResourceResponseOuw = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw.f12874sd.bly, od.cf(ouw.this.ouw), p11);
                        if (webResourceResponseOuw == null) {
                            com.bytedance.sdk.component.utils.ko.ouw("PlayableManager", "Plb res: hit no ", p11);
                            return super.shouldInterceptRequest(p10, p11);
                        }
                        com.bytedance.sdk.component.utils.ko.ouw("PlayableManager", "Plb res: hit++ ", p11);
                        pno pnoVar2 = ouw.this.f13616ra;
                        if (pnoVar2 != null) {
                            pnoVar2.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.3
                                public AnonymousClass3() {
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    pno.this.jae++;
                                }
                            });
                        }
                        return webResourceResponseOuw;
                    }
                    return super.shouldInterceptRequest(p10, p11);
                } catch (Throwable unused) {
                    return super.shouldInterceptRequest(p10, p11);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.f13616ra;
                    if (pnoVar != null) {
                        pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                        ouw.this.f13616ra.ouw(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                    }
                }
            }

            public void safedk_ouw$5_onPageFinished_d64d363eede4ac1fff4bf3e0f2ed227f(WebView p10, String p11) {
                boolean z13;
                WebView webView;
                super.onPageFinished(p10, p11);
                pno pnoVar = ouw.this.f13616ra;
                if (pnoVar != null) {
                    if (pnoVar.osn == -1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    pnoVar.osn = 2;
                    if (!z13) {
                        pnoVar.f13657vh = p11;
                        JSONObject jSONObject2 = new JSONObject();
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            pnoVar.vpp = jCurrentTimeMillis;
                            long j10 = 0;
                            long j11 = pnoVar.zin;
                            if (j11 != -1) {
                                j10 = jCurrentTimeMillis - j11;
                            }
                            jSONObject2.put("playable_html_load_start_duration", j10);
                            jSONObject2.put("playable_has_show", pnoVar.ko());
                        } catch (Throwable th2) {
                            ra.ouw("PlayablePlugin", "reportUrlLoadFinish error", th2);
                        }
                        pnoVar.vt("PL_sdk_html_load_finish", jSONObject2);
                    }
                    pnoVar.lvd = false;
                    pnoVar.ouw.removeCallbacks(pnoVar.vt);
                    try {
                        if (pnoVar.uoy == 0) {
                            if (pnoVar.f13647ra && (webView = pnoVar.jvy) != null) {
                                pnoVar.f13647ra = false;
                                webView.evaluateJavascript("function playable_callJS(){return \"Android call the JS method is callJS\";}", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.zin.pno.11
                                    public AnonymousClass11() {
                                    }

                                    @Override // android.webkit.ValueCallback
                                    public final /* synthetic */ void onReceiveValue(String str2) {
                                        ra.ouw("Playable_CrashMonitor", "load inject js=".concat(String.valueOf(str2)));
                                    }
                                });
                            }
                            pnoVar.ryl();
                        }
                    } catch (Throwable th3) {
                        ra.ouw("PlayablePlugin", "crashMonitor error", th3);
                    }
                }
                ouw ouwVar3 = ouw.this;
                if (ouwVar3.bly) {
                    ouwVar3.ouw(0, 0);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    ouw ouwVar4 = ouw.this;
                    com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis2, ouwVar4.ouw, ouwVar4.fkw, "py_loading_success");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
            @RequiresApi(api = 23)
            public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                if (webResourceRequest.isForMainFrame()) {
                    ouw ouwVar3 = ouw.this;
                    ouwVar3.bly = false;
                    pno pnoVar = ouwVar3.f13616ra;
                    if (pnoVar == null || webResourceError == null) {
                        return;
                    }
                    pnoVar.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(ouw.this.ouw);
                    ouw.this.f13616ra.ouw(webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), String.valueOf(webResourceRequest.getUrl()));
                }
            }
        });
        this.f13615lh.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.yu) { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.6
            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return super.onConsoleMessage(consoleMessage);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i12) {
                super.onProgressChanged(webView, i12);
                tlj tljVar2 = ouw.this.vt;
                if (tljVar2 != null && tljVar2.getVisibility() == 0) {
                    ouw.this.vt.setProgress(i12);
                }
            }
        });
        com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.zih);
        lhVarOuw.vt = false;
        lhVarOuw.ouw = false;
        lhVarOuw.ouw(this.f13615lh.getWebView());
        le leVar2 = this.f13615lh;
        leVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.th.ouw(leVar2.getWebView()));
        this.f13615lh.setMixedContentMode(0);
    }

    public final void vt() {
        if (!this.f13611cf.get() || this.f13616ra == null) {
            return;
        }
        qbp.ouw("PlayableManager", "onResume() called");
        this.f13616ra.vt(true);
    }

    public void ouw() {
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        tlj tljVar;
        final boolean z10 = true;
        if (this.f13611cf.getAndSet(true)) {
            return;
        }
        FrameLayout frameLayout = this.f13619th;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        qbp.ouw("PlayableManager", "showPlayable() called with: hasLoading = [false], loadingViewIsHide = [" + this.qbp + C3426d4.j.f28588e);
        if (!this.qbp && (tljVar = this.vt) != null) {
            vpp vppVar = this.ouw;
            if (!tljVar.isShown()) {
                tljVar.vt();
                tljVar.setVisibility(0);
                tljVar.ouw = SystemClock.elapsedRealtime();
                tljVar.ouw(vppVar);
            }
            pno pnoVar = this.f13616ra;
            if (pnoVar != null) {
                pnoVar.bly();
            }
        } else {
            this.f13616ra.vt(true);
            bs bsVar = this.yu;
            if (bsVar != null && (vtVar = bsVar.uq) != null) {
                vtVar.le();
            }
            InterfaceC0162ouw interfaceC0162ouw = this.f13617rn;
            if (interfaceC0162ouw != null) {
                interfaceC0162ouw.ouw(this.zin);
            }
            z10 = false;
        }
        if (this.f13616ra != null) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw(System.currentTimeMillis(), this.ouw, this.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.7
                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject lh() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("playable_event", "start_show_plb");
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }

                @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                public final JSONObject ouw() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("webview_state", ouw.this.f13616ra.euf);
                        jSONObject.put("has_loading", z10);
                        jSONObject.put("is_new_playable", 1);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
            this.f13616ra.njr = com.bytedance.sdk.openadsdk.core.mwh.lh.ouw.ouw().ouw(this.ouw);
        }
        le leVar = this.f13615lh;
        if (leVar != null) {
            leVar.setVisibility(0);
        } else {
            com.bytedance.sdk.openadsdk.rn.lh.ouw("plb_npe_crash", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.8
                @Override // com.bytedance.sdk.openadsdk.rn.vt
                public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("crash_ts", System.currentTimeMillis());
                    StringBuilder sb2 = ouw.this.f13613ko;
                    if (sb2 != null) {
                        jSONObject.put("destroy_stack_trace", sb2.toString());
                    }
                    jSONObject.put("destroy_ts", ouw.this.f13612jg);
                    com.bytedance.sdk.openadsdk.rn.ouw.yu yuVar = new com.bytedance.sdk.openadsdk.rn.ouw.yu();
                    yuVar.ouw = "plb_npe_crash";
                    yuVar.bly = jSONObject.toString();
                    return yuVar;
                }
            });
        }
    }

    public final void ouw(final int i10, final int i11) {
        InterfaceC0162ouw interfaceC0162ouw;
        com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar;
        pno pnoVar;
        vt vtVar2;
        if (this.qbp) {
            return;
        }
        this.qbp = true;
        this.zin = i10;
        qbp.ouw("PlayableManager", "onHidePlayableLoading() called with: hideReason = [" + i10 + "], errorDetail = [" + i11 + C3426d4.j.f28588e);
        if (i10 == 2) {
            this.tlj = true;
            this.f13616ra.euf = 3;
        } else if (i10 == 1) {
            this.tlj = true;
            this.f13616ra.euf = 2;
        } else if (i10 == 3) {
            this.tlj = true;
            this.f13616ra.euf = 4;
        } else if (i10 == 0) {
            this.f13616ra.euf = 1;
        }
        if (this.tlj && (vtVar2 = this.mwh) != null) {
            vtVar2.ouw();
        }
        if (this.f13611cf.get() && (pnoVar = this.f13616ra) != null) {
            pnoVar.vt(true);
        }
        bs bsVar = this.yu;
        if (bsVar != null && (vtVar = bsVar.uq) != null) {
            vtVar.le();
        }
        if (!this.tlj && (interfaceC0162ouw = this.f13617rn) != null) {
            interfaceC0162ouw.ouw(i10);
        }
        tlj tljVar = this.vt;
        if (tljVar != null) {
            tljVar.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9
                @Override // java.lang.Runnable
                public final void run() {
                    if (ouw.this.tlj) {
                        ouw.this.ryl.setVisibility(0);
                        InterfaceC0162ouw interfaceC0162ouw2 = ouw.this.f13617rn;
                        if (interfaceC0162ouw2 != null) {
                            interfaceC0162ouw2.ouw(i10);
                        }
                        ouw.this.ouw(true);
                    }
                    ouw ouwVar = ouw.this;
                    ouwVar.f13616ra.mq = ouwVar.tlj;
                    ouw.this.vt.lh();
                    if (ouw.this.f13611cf.get()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        ouw ouwVar2 = ouw.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(jCurrentTimeMillis, ouwVar2.ouw, ouwVar2.fkw, "playable_track", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.zin.ouw.ouw.9.1
                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject lh() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("playable_event", "remove_loading_page");
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
                            public final JSONObject ouw() {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("remove_loading_page_type", i10);
                                    jSONObject.put("remove_loading_page_reason", i11);
                                    jSONObject.put("playable_url", ouw.this.f13614le);
                                    jSONObject.put("duration", ouw.this.vt.getDisplayDuration());
                                    jSONObject.put("is_new_playable", 1);
                                    return jSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    }
                }
            });
        }
    }

    public final void ouw(boolean z10) {
        pno pnoVar = this.f13616ra;
        if (pnoVar != null) {
            pnoVar.ouw(z10);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar) {
        this.jqy = ouwVar;
        tlj tljVar = this.vt;
        if (tljVar != null && tljVar.getDownloadButton() != null) {
            com.bytedance.sdk.openadsdk.core.le.pno downloadButton = this.vt.getDownloadButton();
            downloadButton.setOnClickListener(ouwVar);
            downloadButton.setOnTouchListener(ouwVar);
        }
        bly blyVar = this.ryl;
        if (blyVar != null) {
            blyVar.setClickListener(ouwVar);
        }
    }

    public final void ouw(com.bytedance.sdk.openadsdk.core.mwh.yu.vt vtVar) {
        bs bsVar = this.yu;
        if (bsVar != null) {
            bsVar.uq = vtVar;
        }
    }
}
