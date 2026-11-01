package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.safedk.android.internal.partials.PangleVideoBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class od {
    private static final HashMap<String, ouw> ouw = new HashMap<>();

    public static class ouw {
        public final int vt;
        private final String yu;
        public final HashSet<String> ouw = new HashSet<>();

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public final ArrayList<WebView> f11922lh = new ArrayList<>();

        public final WebView ouw() {
            if (this.f11922lh.isEmpty()) {
                return null;
            }
            return this.f11922lh.remove(0);
        }

        public ouw(String str, JSONObject jSONObject) {
            this.yu = str;
            this.vt = jSONObject.optInt("max_count");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("scene");
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.ouw.add(strOptString);
                    }
                }
            }
        }
    }

    public static com.bytedance.sdk.component.bly.le ouw(Context context, AttributeSet attributeSet, com.bytedance.sdk.component.bly.le.lh lhVar) {
        WebView webViewOuw = ouw(context, attributeSet, lhVar, false);
        if (webViewOuw == null) {
            return null;
        }
        com.bytedance.sdk.component.bly.le leVar = new com.bytedance.sdk.component.bly.le(context, true, lhVar);
        leVar.setWebView(webViewOuw);
        leVar.o_();
        return leVar;
    }

    public static WebView vt(Context context, AttributeSet attributeSet, com.bytedance.sdk.component.bly.le.lh lhVar) {
        return ouw(context, attributeSet, lhVar, true);
    }

    public static void vt(com.bytedance.sdk.component.bly.le leVar) {
        if (leVar == null) {
            return;
        }
        try {
            leVar.removeAllViews();
            leVar.vt();
            leVar.setWebChromeClient(null);
            leVar.setWebViewClient(null);
            leVar.setDownloadListener(null);
            leVar.setJavaScriptEnabled(true);
            leVar.setCacheMode(-1);
            leVar.setSupportZoom(false);
            leVar.setUseWideViewPort(true);
            leVar.setJavaScriptCanOpenWindowsAutomatically(true);
            leVar.setDomStorageEnabled(true);
            leVar.setBuiltInZoomControls(false);
            leVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            leVar.setLoadWithOverviewMode(false);
            leVar.setDefaultTextEncodingName("UTF-8");
            leVar.setDefaultFontSize(16);
        } catch (Throwable unused) {
        }
    }

    private static WebView ouw(Context context, AttributeSet attributeSet, com.bytedance.sdk.component.bly.le.lh lhVar, boolean z10) {
        WebView webViewOuw;
        ouw ouwVar;
        if (lhVar == null || attributeSet != null || (ouwVar = ouw.get(lhVar.mwh)) == null) {
            webViewOuw = null;
        } else {
            webViewOuw = ouwVar.ouw();
            if (webViewOuw != null) {
                if (webViewOuw instanceof com.bytedance.sdk.component.bly.fkw) {
                    ((com.bytedance.sdk.component.bly.fkw) webViewOuw).setRecycler(false);
                }
                ouw(lhVar, false);
            }
        }
        if (webViewOuw != null || !z10) {
            return webViewOuw;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        ouw(lhVar, true);
        return new com.bytedance.sdk.component.bly.fkw(context, attributeSet);
    }

    private static void ouw(final com.bytedance.sdk.component.bly.le.lh lhVar, final boolean z10) {
        jqy.ouw("webview_allocate", new jqy.ouw() { // from class: com.bytedance.sdk.component.utils.od.1
            @Override // com.bytedance.sdk.component.utils.jqy.ouw
            public final JSONObject ouw() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z10 ? 1 : 0);
                    jSONObject.put("scene", lhVar.mwh);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    public static void ouw(com.bytedance.sdk.component.bly.le leVar) {
        WebView webView;
        if (leVar == null || (webView = leVar.getWebView()) == null) {
            return;
        }
        ouw ouwVar = ouw.get(leVar.getScene().mwh);
        if (ouwVar != null) {
            boolean z10 = true;
            if (ouwVar.f11922lh.size() >= ouwVar.vt || ouwVar.f11922lh.contains(webView)) {
                z10 = false;
            } else {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.bly.fkw) {
                        ((com.bytedance.sdk.component.bly.fkw) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    ouwVar.f11922lh.add(webView);
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                vt(leVar);
                return;
            }
        }
        try {
            Context context2 = webView.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent2 = webView.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static boolean vt(com.bytedance.sdk.component.bly.le.lh lhVar) {
        return (lhVar == null || ouw.get(lhVar.mwh) == null) ? false : true;
    }

    public static void ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObjectJsonObjectInit = PangleVideoBridge.jsonObjectInit(str);
            Iterator<String> itKeys = jSONObjectJsonObjectInit.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (!TextUtils.isEmpty(next)) {
                    ouw ouwVar = new ouw(next, jSONObjectJsonObjectInit.getJSONObject(next));
                    Iterator<String> it = ouwVar.ouw.iterator();
                    while (it.hasNext()) {
                        ouw.put(it.next(), ouwVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static int ouw(com.bytedance.sdk.component.bly.le.lh lhVar) {
        ouw ouwVar;
        if (lhVar == null || (ouwVar = ouw.get(lhVar.mwh)) == null) {
            return 0;
        }
        return ouwVar.f11922lh.size();
    }
}
