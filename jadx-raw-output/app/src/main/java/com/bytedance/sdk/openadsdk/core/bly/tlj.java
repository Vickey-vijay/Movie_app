package com.bytedance.sdk.openadsdk.core.bly;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.model.pd;
import com.bytedance.sdk.openadsdk.rn.ouw.lh;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class tlj extends com.bytedance.sdk.openadsdk.core.widget.ouw.fkw {

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private static final byte[] f12568vm = {-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, 31, 21, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    public ArrayList<Integer> ouw;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.vt.mwh f12569rn;
    private final com.bytedance.sdk.openadsdk.core.model.vpp vt;
    private boolean zih;

    private com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(String str, com.bytedance.sdk.component.adexpress.yu.bly.ouw ouwVar) {
        pd.ouw ouwVar2;
        JSONArray jSONArray;
        pd pdVar = this.vt.lht;
        if (pdVar != null && (ouwVar2 = pdVar.f12796le) != null && (jSONArray = ouwVar2.ouw) != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str) && ouwVar == com.bytedance.sdk.component.adexpress.yu.bly.ouw.IMAGE) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar3 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar3.vt = 5;
                    ouwVar3.ouw = ouw(str, com.bytedance.sdk.component.utils.fkw.ouw(str));
                    return ouwVar3;
                }
            }
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public void onLoadResource(WebView view, String url) {
        super.onLoadResource(view, url);
        CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(g.f44975u, webView, str);
        safedk_tlj_onPageFinished_e8df1030b3a35da4ddaaeaa8a3ff4ff1(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.pno = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.vt.mwh mwhVar = this.f12569rn;
        if (mwhVar != null && mwhVar.vpp && this.zih) {
            com.bytedance.sdk.component.utils.ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in pageStart, templateInfo is：", mwhVar.ouw());
            com.bytedance.sdk.component.utils.jg.ouw(webView, "javascript:window.SDK_INJECT_DATA=" + this.f12569rn.ouw());
        }
    }

    public void safedk_tlj_onPageFinished_e8df1030b3a35da4ddaaeaa8a3ff4ff1(WebView p10, String p11) {
        this.f13110ra = false;
        super.onPageFinished(p10, p11);
    }

    @TargetApi(21)
    public WebResourceResponse safedk_tlj_shouldInterceptRequest_68d40b014a29af937101b744ccc763f2(WebView p10, WebResourceRequest p11) {
        try {
            return shouldInterceptRequest(p10, p11.getUrl().toString());
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "shouldInterceptRequest error1", th2);
            return super.shouldInterceptRequest(p10, p11);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    @TargetApi(21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->shouldInterceptRequest(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, webView, webResourceRequest, safedk_tlj_shouldInterceptRequest_68d40b014a29af937101b744ccc763f2(webView, webResourceRequest));
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/core/bly/tlj;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str, safedk_tlj_shouldInterceptRequest_160388f2b5674a08feb27961edeb09e3(webView, str));
    }

    public tlj(Context context, bs bsVar, com.bytedance.sdk.openadsdk.core.model.vpp vppVar, com.bytedance.sdk.openadsdk.yu.mwh mwhVar, com.bytedance.sdk.component.adexpress.vt.mwh mwhVar2) {
        super(context, bsVar, vppVar.pv, mwhVar, false);
        this.zih = false;
        this.ouw = new ArrayList<>();
        this.vt = vppVar;
        this.f12569rn = mwhVar2;
        this.zih = com.bytedance.sdk.openadsdk.vpp.ouw.ouw("inject_data_normal_open", 0) == 1;
    }

    private static WebResourceResponse yu() {
        InputStream inputStreamOpenRawResource;
        int iBly = com.bytedance.sdk.openadsdk.core.bly.ouw().bly();
        if (iBly == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.zih.ouw().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(iBly, 0, typedValue, true);
                CharSequence charSequence = typedValue.string;
                if (charSequence != null && charSequence.toString().endsWith(".xml")) {
                    inputStreamOpenRawResource = new ByteArrayInputStream(f12568vm);
                } else {
                    inputStreamOpenRawResource = resources.openRawResource(iBly);
                }
            } catch (Resources.NotFoundException e10) {
                com.bytedance.sdk.component.utils.qbp.lh("ExpressClient", e10.toString());
                inputStreamOpenRawResource = null;
            }
        } else {
            inputStreamOpenRawResource = null;
        }
        if (inputStreamOpenRawResource == null) {
            return null;
        }
        return new WebResourceResponse(com.bytedance.sdk.component.adexpress.yu.bly.ouw.IMAGE.fkw, "UTF-8", inputStreamOpenRawResource);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    public WebResourceResponse safedk_tlj_shouldInterceptRequest_160388f2b5674a08feb27961edeb09e3(WebView p10, String p11) {
        com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar;
        com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar2;
        com.bytedance.sdk.openadsdk.core.model.zih zihVar;
        pd.ouw ouwVar3;
        JSONArray jSONArray;
        pd.ouw ouwVar4;
        JSONArray jSONArray2;
        WebResourceResponse webResourceResponse;
        try {
            com.bytedance.sdk.component.utils.ko.vt("ExpressClient", "ExpressClient shouldInterceptRequest start url:".concat(String.valueOf(p11)));
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(p11)) {
                ouwVar2 = null;
            } else {
                com.bytedance.sdk.component.utils.ko.ouw("intercept_music", "url is:", p11);
                if (!p11.equals("local://pag_open_icon_id") && !p11.equals(com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw)) {
                    com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar5 = this.vt.f12886xn;
                    if (ouwVar5 != null && !TextUtils.isEmpty(p11) && p11.equals(ouwVar5.bly)) {
                        ouwVar2 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                        ouwVar2.vt = 5;
                        if (TextUtils.isEmpty(p11)) {
                            webResourceResponse = null;
                        } else {
                            com.bytedance.sdk.openadsdk.core.fkw.ouw unused = com.bytedance.sdk.openadsdk.core.fkw.ouw.C0123ouw.ouw;
                            InputStream inputStreamOuw = com.bytedance.sdk.openadsdk.core.fkw.ouw.ouw(p11);
                            if (inputStreamOuw != null) {
                                com.bytedance.sdk.component.utils.ko.vt("intercept_music", "get inputStream from disk");
                                webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", inputStreamOuw);
                                ouw(webResourceResponse);
                            } else {
                                webResourceResponse = null;
                            }
                        }
                        ouwVar2.ouw = webResourceResponse;
                        final boolean z10 = webResourceResponse != null;
                        com.bytedance.sdk.component.utils.ko.ouw("intercept_music", "webview cache result is:", Boolean.valueOf(z10));
                        final com.bytedance.sdk.openadsdk.core.fkw.ouw ouwVar6 = com.bytedance.sdk.openadsdk.core.fkw.ouw.C0123ouw.ouw;
                        com.bytedance.sdk.openadsdk.rn.lh.ouw("music_cache", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.core.fkw.ouw.4
                            public final /* synthetic */ boolean ouw;

                            public AnonymousClass4() {
                                z = z10;
                            }

                            @Override // com.bytedance.sdk.openadsdk.rn.vt
                            public final lh ouw() throws Exception {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("result", z);
                                yu yuVar = new yu();
                                yuVar.ouw = "music_cache";
                                yuVar.bly = jSONObject.toString();
                                ko.ouw("MusicCacheManager", "report music_cache", yuVar.ouw());
                                return yuVar;
                            }
                        });
                    } else {
                        com.bytedance.sdk.component.adexpress.yu.bly.ouw ouwVarOuw = com.bytedance.sdk.component.adexpress.yu.bly.ouw(p11);
                        if (jg.vt(this.vt)) {
                            com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVarOuw2 = ouw(p11, ouwVarOuw);
                            if (ouwVarOuw2 == null) {
                                pd pdVar = this.vt.lht;
                                ouwVarOuw2 = (pdVar == null || (ouwVar3 = pdVar.f12796le) == null || (jSONArray = ouwVar3.vt) == null || jSONArray.length() <= 0) ? null : ouw(jSONArray, p11, ouwVarOuw);
                                if (ouwVarOuw2 != null) {
                                    Log.d("ExpressClient", "interceptTemplate: Hit fetch file cache url=".concat(p11));
                                } else {
                                    pd pdVar2 = this.vt.lht;
                                    ouwVarOuw2 = (pdVar2 == null || (ouwVar4 = pdVar2.f12796le) == null || (jSONArray2 = ouwVar4.f12798lh) == null || jSONArray2.length() <= 0) ? null : ouw(jSONArray2, p11, ouwVarOuw);
                                    if (ouwVarOuw2 != null) {
                                    }
                                }
                            }
                            ouwVar2 = ouwVarOuw2;
                        }
                        if (ouwVarOuw == com.bytedance.sdk.component.adexpress.yu.bly.ouw.IMAGE) {
                            zihVar = null;
                            break;
                        }
                        Iterator<com.bytedance.sdk.openadsdk.core.model.zih> it = this.vt.f12877tc.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                zihVar = null;
                                break;
                            }
                            com.bytedance.sdk.openadsdk.core.model.zih next = it.next();
                            if (!TextUtils.isEmpty(next.ouw) && !TextUtils.isEmpty(p11)) {
                                String strReplaceFirst = next.ouw;
                                if (strReplaceFirst.startsWith("https")) {
                                    strReplaceFirst = strReplaceFirst.replaceFirst("https", "http");
                                }
                                if ((p11.startsWith("https") ? p11.replaceFirst("https", "http") : p11).equals(strReplaceFirst)) {
                                    zihVar = next;
                                    break;
                                }
                            }
                        }
                        if (ouwVarOuw != com.bytedance.sdk.component.adexpress.yu.bly.ouw.IMAGE && zihVar == null) {
                            ouwVar = com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(p11, ouwVarOuw, ouw());
                        } else {
                            ouwVar = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                            ouwVar.vt = 5;
                            ouwVar.ouw = ouw(p11, com.bytedance.sdk.openadsdk.core.bly.ouw.ouw.ouw(this.vt, p11));
                        }
                    }
                } else {
                    ouwVar = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar.vt = 5;
                    ouwVar.ouw = yu();
                }
                ouwVar2 = ouwVar;
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            int i10 = (ouwVar2 == null || ouwVar2.ouw == null) ? 2 : 1;
            com.bytedance.sdk.openadsdk.yu.mwh mwhVar = this.f13108le;
            if (mwhVar != null && mwhVar.f13537od != null) {
                com.bytedance.sdk.component.adexpress.yu.bly.ouw ouwVarOuw3 = com.bytedance.sdk.component.adexpress.yu.bly.ouw(p11);
                if (ouwVarOuw3 == com.bytedance.sdk.component.adexpress.yu.bly.ouw.HTML) {
                    this.f13108le.f13537od.ouw(p11, jCurrentTimeMillis, jCurrentTimeMillis2, i10);
                } else if (ouwVarOuw3 == com.bytedance.sdk.component.adexpress.yu.bly.ouw.JS) {
                    this.f13108le.f13537od.vt(p11, jCurrentTimeMillis, jCurrentTimeMillis2, i10);
                }
            }
            if (ouwVar2 != null && ouwVar2.vt != 5) {
                com.bytedance.sdk.component.utils.ko.yu("ExpressClient", "mEngineCacheType:" + ouwVar2.vt + " url:" + p11);
                this.ouw.add(Integer.valueOf(ouwVar2.vt));
            }
            if (ouwVar2 != null && ouwVar2.ouw != null) {
                com.bytedance.sdk.component.utils.ko.ouw("intercept_music", "return WebResourceResponse by cache, url is:", p11);
                return ouwVar2.ouw;
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "shouldInterceptRequest error2", th2);
        }
        return super.shouldInterceptRequest(p10, p11);
    }

    private static com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouw(JSONArray jSONArray, String str, com.bytedance.sdk.component.adexpress.yu.bly.ouw ouwVar) {
        InputStream inputStreamLh;
        WebResourceResponse webResourceResponse = null;
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.cf.lh.ouw(jSONArray.optString(i10), com.bytedance.sdk.openadsdk.core.settings.cf.vt().tlj()), str)) {
                    com.bytedance.sdk.component.adexpress.ouw.vt.ouw ouwVar2 = new com.bytedance.sdk.component.adexpress.ouw.vt.ouw();
                    ouwVar2.vt = 5;
                    if (!TextUtils.isEmpty(str) && (inputStreamLh = jg.lh(str)) != null) {
                        webResourceResponse = new WebResourceResponse(ouwVar.fkw, "UTF-8", inputStreamLh);
                        ouw(webResourceResponse);
                    }
                    ouwVar2.ouw = webResourceResponse;
                    return ouwVar2;
                }
            }
        }
        return null;
    }

    public final String ouw() {
        com.bytedance.sdk.openadsdk.core.model.vpp vppVar = this.vt;
        if (vppVar == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.core.model.vpp.ouw ouwVar = vppVar.f12886xn;
        if (ouwVar != null) {
            return ouwVar.tlj;
        }
        if (vppVar.lht != null) {
            return "v3";
        }
        return null;
    }

    private static WebResourceResponse ouw(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOuw = com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(str, str2);
            if (inputStreamOuw == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(com.bytedance.sdk.component.adexpress.yu.bly.ouw.IMAGE.fkw, G5.N, inputStreamOuw);
            try {
                ouw(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th2) {
                th = th2;
                webResourceResponse = webResourceResponse2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
        com.bytedance.sdk.component.utils.qbp.ouw("ExpressClient", "get image WebResourceResponse error", th);
        return webResourceResponse;
    }

    private static void ouw(WebResourceResponse webResourceResponse) {
        HashMap map = new HashMap();
        map.put("Access-Control-Allow-Origin", "*");
        webResourceResponse.setResponseHeaders(map);
    }
}
