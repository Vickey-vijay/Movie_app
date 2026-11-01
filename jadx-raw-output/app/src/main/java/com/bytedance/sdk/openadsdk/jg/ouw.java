package com.bytedance.sdk.openadsdk.jg;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.model.th;
import com.bytedance.sdk.openadsdk.core.model.vm;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.widget.ouw.fkw;
import com.bytedance.sdk.openadsdk.core.widget.ouw.yu;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.ra.vt;
import com.bytedance.sdk.openadsdk.utils.bs;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.lh;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ouw {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private static int f13209lh = 2;
    private static volatile ouw ouw = null;
    private static long yu = 3600000;
    private LinkedHashMap<Integer, SoftReference<le>> fkw;
    private final Handler vt;

    public static boolean lh(vpp vppVar) {
        return th.pno(vppVar) || th.vt(vppVar) || th.lh(vppVar);
    }

    public ouw() {
        f13209lh = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_count", 2);
        long jOuw = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("pre_render_duration", 3600000);
        yu = jOuw;
        if (f13209lh <= 0) {
            f13209lh = 2;
        }
        if (jOuw <= 0) {
            yu = 3600000L;
        }
        this.fkw = new LinkedHashMap<>();
        this.vt = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.1
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(@NonNull Message message) {
                SoftReference softReference;
                int i10 = message.what;
                if (ouw.this.fkw == null || (softReference = (SoftReference) ouw.this.fkw.get(Integer.valueOf(i10))) == null) {
                    return false;
                }
                le leVar = (le) softReference.get();
                ouw.this.ouw(i10, 2, new vpp(), leVar == null ? "" : leVar.getTag());
                ko.vt("LPPreRenderManager", "time to delete PreRenderModel, reason is MODEL_DESTROY_REASON_OVER_TIME");
                return false;
            }
        });
    }

    public final le vt(vpp vppVar) {
        if (vppVar == null || TextUtils.isEmpty(vppVar.osn)) {
            return null;
        }
        String str = vppVar.osn;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iHashCode = str.hashCode();
        SoftReference<le> softReference = this.fkw.get(Integer.valueOf(iHashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        le leVar = softReference.get();
        ouw(vppVar, leVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue(), "web_use_pre_render");
        ouw(iHashCode, 3, vppVar, leVar.getTag());
        return leVar;
    }

    public static ouw ouw() {
        if (ouw == null) {
            synchronized (ouw.class) {
                if (ouw == null) {
                    ouw = new ouw();
                }
            }
        }
        return ouw;
    }

    public final void ouw(final vpp vppVar) {
        final String str;
        if (vppVar == null || !lh(vppVar)) {
            return;
        }
        vm vmVar = vppVar.f12863mb;
        if (vmVar == null) {
            vmVar = new vm();
        }
        ko.ouw("LPPreRenderManager", "open pre render:", Boolean.valueOf(vppVar.ucs()));
        if (vppVar.ucs()) {
            String str2 = vppVar.osn;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            final int iHashCode = str2.hashCode();
            if (th.vt(vppVar)) {
                str = "landingpage_split_screen";
            } else if (th.yu(vppVar)) {
                str = "landingpage_direct";
            } else {
                str = th.lh(vppVar) ? "landingpage_split_ceiling" : "";
            }
            LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
            if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(iHashCode))) {
                ko.vt("LPPreRenderManager", "mPreRenderLPModelMap has target url, return");
                return;
            }
            HashMap map = new HashMap();
            map.put(vppVar.f12856ki, vppVar);
            int i10 = vmVar.bly;
            if (i10 == 2) {
                vt.ouw().ouw((Map<String, vpp>) map, new vt.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.2
                    @Override // com.bytedance.sdk.openadsdk.ra.vt.ouw
                    public final void ouw() {
                        ouw.this.ouw(iHashCode, vppVar, str, true);
                    }
                }, true);
                return;
            }
            if (i10 == 1) {
                vt.ouw().ouw((Map<String, vpp>) map, (vt.ouw) null, true);
                ouw(iHashCode, vppVar, str, true);
            } else if (i10 == 0) {
                ouw(iHashCode, vppVar, str, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(final int i10, final vpp vppVar, final String str, final boolean z10) {
        ko.ouw("LPPreRenderManager", "begin pre render, useGecko", Boolean.valueOf(z10));
        bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3
            /* JADX WARN: Code duplicated, block: B:30:0x00ce  */
            @Override // java.lang.Runnable
            public final void run() {
                Activity activityOuw;
                if (ouw.this.fkw != null && ouw.this.fkw.size() >= ouw.f13209lh) {
                    Map.Entry entry = (Map.Entry) ouw.this.fkw.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        le leVar = (le) softReference.get();
                        ouw.this.ouw(((Integer) entry.getKey()).intValue(), 1, vppVar, leVar == null ? "" : leVar.getTag());
                    }
                }
                if (ouw.this.vt != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = i10;
                    ouw.this.vt.sendMessageDelayed(messageObtain, ouw.yu);
                }
                SoftReference softReference2 = new SoftReference(new le(zih.ouw(), false, le.lh.LANDING_PAGE_PRE_RENDER));
                final le leVar2 = (le) softReference2.get();
                if (leVar2 == null) {
                    return;
                }
                com.bytedance.sdk.openadsdk.core.bs bsVar = null;
                leVar2.setLayerType(2, null);
                osn.ouw((View) leVar2, 4);
                leVar2.setTag(str);
                leVar2.setLandingPage(true);
                vm vmVar = vppVar.f12863mb;
                int i11 = vmVar != null ? vmVar.tlj : 3;
                if (i11 == 2) {
                    int iYu = osn.yu(zih.ouw());
                    int iLe = osn.le(zih.ouw());
                    int iJqy = vppVar.jqy();
                    if (iJqy == 1) {
                        if (iYu >= iLe) {
                            leVar2.layout(0, 0, iLe, iYu);
                        } else {
                            leVar2.layout(0, 0, iYu, iLe);
                        }
                    } else if (iJqy == 2) {
                        if (iYu < iLe) {
                            leVar2.layout(0, 0, iLe, iYu);
                        } else {
                            leVar2.layout(0, 0, iYu, iLe);
                        }
                    }
                } else if (i11 == 1) {
                    ko.vt("LPPreRenderManager", "trigger preloadLandingPage, addType is WEBVIEW_ADD_TYPE_TOP_ACTIVITY");
                    com.bytedance.sdk.openadsdk.utils.ouw ouwVar = com.bytedance.sdk.openadsdk.core.ko.ouw.ouw.ouw;
                    if (ouwVar != null && (activityOuw = ouwVar.ouw()) != null) {
                        final int iHashCode = activityOuw.hashCode();
                        ouwVar.ouw(new com.bytedance.sdk.component.adexpress.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3.1
                            @Override // com.bytedance.sdk.component.adexpress.ouw
                            public final void ouw(Activity activity) {
                                int i12 = iHashCode;
                                if (i12 == 0 || activity == null || i12 != activity.hashCode() || leVar2.fkw) {
                                    return;
                                }
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                ouw.this.ouw(i10, 5, vppVar, str);
                            }
                        });
                        FrameLayout frameLayout = (FrameLayout) activityOuw.findViewById(R.id.content);
                        if (frameLayout != null) {
                            frameLayout.addView(leVar2);
                        }
                    }
                }
                vt.ouw();
                ILoader iLoaderVt = vt.vt();
                vt.ouw();
                int iOuw = vt.ouw(iLoaderVt, vppVar.f12856ki);
                mwh mwhVar = new mwh(vppVar, leVar2.getWebView());
                mwhVar.fak = iOuw > 0 ? 2 : 0;
                mwhVar.f13540rn = 1;
                mwhVar.jae = true;
                fkw fkwVar = new fkw(zih.ouw(), null, vppVar.pv, mwhVar) { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final void onPageFinished(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/jg/ouw$3$3;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
                        CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str2);
                        safedk_ouw$3$3_onPageFinished_5a6b127744d33142379b76f4b20eb7b2(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/jg/ouw$3$3;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str2, safedk_ouw$3$3_shouldInterceptRequest_f4a1481b85a1206f1b576863a4c58674(webView, str2));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/jg/ouw$3$3;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
                        boolean zSafedk_ouw$3$3_shouldOverrideUrlLoading_48a889af5c71b6a32bac9be3da260616 = safedk_ouw$3$3_shouldOverrideUrlLoading_48a889af5c71b6a32bac9be3da260616(webView, str2);
                        BrandSafetyUtils.onShouldOverrideUrlLoading(g.f44975u, webView, str2, zSafedk_ouw$3$3_shouldOverrideUrlLoading_48a889af5c71b6a32bac9be3da260616);
                        return zSafedk_ouw$3$3_shouldOverrideUrlLoading_48a889af5c71b6a32bac9be3da260616;
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        ko.vt("LPPreRenderManager", "pre render trigger onPageStarted");
                        le leVar3 = leVar2;
                        if (leVar3 != null) {
                            leVar3.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ouw.this.ouw(i10, 4, vppVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    public void safedk_ouw$3$3_onPageFinished_5a6b127744d33142379b76f4b20eb7b2(WebView p10, String p11) {
                        ko.vt("LPPreRenderManager", "pre render trigger onPageFinished");
                        le leVar3 = leVar2;
                        if (leVar3 != null) {
                            leVar3.setPreFinish(true);
                        }
                        super.onPageFinished(p10, p11);
                    }

                    public WebResourceResponse safedk_ouw$3$3_shouldInterceptRequest_f4a1481b85a1206f1b576863a4c58674(WebView p10, String p11) {
                        try {
                            if (!z10) {
                                return super.shouldInterceptRequest(p10, p11);
                            }
                            le leVar3 = leVar2;
                            if (leVar3 != null) {
                                leVar3.f11636ra++;
                            }
                            vt.ouw();
                            ILoader iLoaderVt2 = vt.vt();
                            String str2 = vppVar.f12856ki;
                            vt.ouw();
                            WebResourceResponseModel webResourceResponseModelOuw = vt.ouw(iLoaderVt2, str2, p11);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                ko.vt("LPPreRenderManager", "GeckoLog: hit++");
                                le leVar4 = leVar2;
                                if (leVar4 != null) {
                                    leVar4.pno++;
                                }
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (leVar2 != null && webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                leVar2.bly++;
                            }
                            return super.shouldInterceptRequest(p10, p11);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(p10, p11);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
                    public final void onReceivedError(WebView webView, int i12, String str2, String str3) {
                        boolean z11;
                        String strOuw = fkw.ouw(str3);
                        boolean z12 = true;
                        if (strOuw != null && strOuw.startsWith("image")) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (strOuw == null || !strOuw.startsWith("mp4")) {
                            z12 = false;
                        }
                        if (!z11 && !z12 && !leVar2.fkw) {
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            ouw.this.ouw(i10, 4, vppVar, str);
                        }
                        super.onReceivedError(webView, i12, str2, str3);
                    }

                    public boolean safedk_ouw$3$3_shouldOverrideUrlLoading_48a889af5c71b6a32bac9be3da260616(WebView p10, String p11) {
                        return super.shouldOverrideUrlLoading(p10, p11);
                    }
                };
                fkwVar.f13107ko = vppVar;
                fkwVar.tlj = str;
                leVar2.setWebViewClient(fkwVar);
                leVar2.setWebChromeClient(new yu(bsVar, mwhVar) { // from class: com.bytedance.sdk.openadsdk.jg.ouw.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                    public final void onProgressChanged(WebView webView, int i12) {
                        super.onProgressChanged(webView, i12);
                        if (i12 == 100) {
                            leVar2.setPreProgressHundred(true);
                        }
                    }
                });
                ouw.ouw(leVar2, vppVar.osn);
                ouw.ouw(vppVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - vpp.ouw(vppVar.fak())).floatValue(), "web_start_pre_render");
                if (ouw.this.fkw != null) {
                    ouw.this.fkw.put(Integer.valueOf(i10), softReference2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(int i10, int i11, vpp vppVar, String str) {
        LinkedHashMap<Integer, SoftReference<le>> linkedHashMap = this.fkw;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i10))) {
            this.fkw.remove(Integer.valueOf(i10));
        }
        Handler handler = this.vt;
        if (handler != null) {
            handler.removeMessages(i10);
        }
        ouw(vppVar, str, i11);
    }

    public static void ouw(vpp vppVar, String str, final float f10, String str2) {
        lh.ouw(System.currentTimeMillis(), vppVar, str, str2, new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.4
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject vt() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", f10);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onWebPreRender", Float.valueOf(f10));
                return jSONObject;
            }
        });
    }

    private static void ouw(vpp vppVar, final String str, final int i10) {
        lh.ouw(System.currentTimeMillis(), vppVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.rn.lh.ouw() { // from class: com.bytedance.sdk.openadsdk.jg.ouw.5
            @Override // com.bytedance.sdk.openadsdk.rn.lh.ouw, com.bytedance.sdk.openadsdk.rn.lh.vt
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i10);
                } catch (Throwable unused) {
                }
                ko.ouw("LPPreRenderManager", "onDeletePreRenderWeb", jSONObject, str);
                return jSONObject;
            }
        });
    }

    public static /* synthetic */ void ouw(le leVar, String str) {
        if (leVar != null) {
            com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(zih.ouw());
            lhVarOuw.vt = false;
            lhVarOuw.ouw = false;
            lhVarOuw.ouw(leVar.getWebView());
            leVar.setMixedContentMode(0);
            ko.ouw("LPPreRenderManager", "begin to render,url is", str);
            zin.ouw(leVar, str);
        }
    }
}
