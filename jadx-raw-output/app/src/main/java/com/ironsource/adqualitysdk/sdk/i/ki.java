package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ki {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2972 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f2973 = 0;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f2974 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static e f2975;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2976;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static e f2977;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2978;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char f2979;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f2980;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2981;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2982;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f2983;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f2984;

    public static class e {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private boolean f2986;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private boolean f2987;

        private e() {
            this.f2986 = false;
            this.f2987 = false;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m2919() {
            this.f2987 = true;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final void m2921() {
            this.f2986 = true;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2917() {
            return this.f2986;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final boolean m2918() {
            return this.f2987;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m2920() {
            if (!m2917() && !m2918()) {
                return false;
            }
            return true;
        }

        public /* synthetic */ e(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2902(WebView webView, String str) {
        int i10 = f2972;
        int i11 = i10 + 121;
        f2974 = i11 % 128;
        int i12 = i11 % 2;
        if (!(webView != null)) {
            return;
        }
        int i13 = i10 + 43;
        f2974 = i13 % 128;
        if (i13 % 2 == 0) {
            webView.getHandler();
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!(webView.getHandler() != null) && webView.getRootView() == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2915("⋳雀浄낺뤉ﬠ⠉襘舫愍嶩딹浄낺ጤ\u0018㪒组\udcc6㡨矗뫀", ExpandableListView.getPackedPositionGroup(0L) + 22).intern());
        sb2.append(str);
        sb2.append(m2915("鿉㽞蠠韒", (ViewConfiguration.getEdgeSlop() >> 16) + 4).intern());
        IronSourceNetworkBridge.webviewLoadUrl(webView, sb2.toString());
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized au m2903() {
        int i10 = f2974 + 111;
        f2972 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            ar.m483().mo494();
            throw null;
        }
        au auVarMo494 = ar.m483().mo494();
        int i11 = f2974 + 73;
        f2972 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 6 : (char) 24) != 6) {
            return auVarMo494;
        }
        int i12 = 76 / 0;
        return auVarMo494;
        throw th;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x0055  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebViewClient m2907(WebView webView) {
        boolean z10;
        int i10 = f2972 + 113;
        f2974 = i10 % 128;
        if (i10 % 2 == 0) {
            if ((Build.VERSION.SDK_INT >= 32 ? '-' : '_') == '-') {
                if (m2903().m648()) {
                    int i11 = f2974 + 3;
                    f2972 = i11 % 128;
                    int i12 = i11 % 2;
                    if (m2906(webView.getContext())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        WebViewClient webViewClient = webView.getWebViewClient();
                        int i13 = f2974 + 123;
                        f2972 = i13 % 128;
                        int i14 = i13 % 2;
                        return webViewClient;
                    }
                }
            }
        } else {
            if ((Build.VERSION.SDK_INT >= 26 ? '8' : '[') == '8') {
                if (m2903().m648()) {
                    int i15 = f2974 + 3;
                    f2972 = i15 % 128;
                    int i16 = i15 % 2;
                    if (m2906(webView.getContext())) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        WebViewClient webViewClient2 = webView.getWebViewClient();
                        int i17 = f2974 + 123;
                        f2972 = i17 % 128;
                        int i18 = i17 % 2;
                        return webViewClient2;
                    }
                }
            }
        }
        hv<WebViewClient> hvVarM2904 = m2904(webView);
        if (hvVarM2904 != null) {
            return hvVarM2904.mo2354();
        }
        throw new RuntimeException(m2915("官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕键錭멥뤛猣ꅌł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭", Color.red(0) + 33).intern());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2910() {
        f2979 = (char) 6083;
        f2976 = (char) 30494;
        f2973 = (char) 62869;
        f2978 = (char) 43732;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2913(WebView webView) {
        int i10 = f2974 + 117;
        f2972 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = m2907(webView) instanceof hk;
        int i12 = f2972 + 37;
        f2974 = i12 % 128;
        int i13 = i12 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static hv<WebChromeClient> m2914(WebView webView) {
        int i10 = f2972 + 63;
        f2974 = i10 % 128;
        int i11 = i10 % 2;
        m2901(webView.getContext());
        hv<WebChromeClient> hvVarM2905 = m2905(webView, m2900(), f2977);
        int i12 = f2972 + 21;
        f2974 = i12 % 128;
        int i13 = i12 % 2;
        return hvVarM2905;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static hv<WebViewClient> m2904(WebView webView) {
        int i10 = f2974 + 123;
        f2972 = i10 % 128;
        if ((i10 % 2 != 0 ? '$' : '\b') != '$') {
            m2901(webView.getContext());
            return m2905(webView, m2912(), f2975);
        }
        m2901(webView.getContext());
        int i11 = 47 / 0;
        return m2905(webView, m2912(), f2975);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static <T> hv<T> m2911(Object obj, ia iaVar, final List<String> list, int i10) {
        hv<T> hvVarM2452 = hu.m2349().m2351().m2452(obj, iaVar, new hm() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.2
            @Override // com.ironsource.adqualitysdk.sdk.i.hm
            /* JADX INFO: renamed from: ﻐ */
            public final Field[] mo2264(Object obj2) {
                hu.m2349().m2352();
                return hq.m2295(obj2.getClass(), true, -1, list);
            }
        }, list, i10);
        int i11 = f2974 + 77;
        f2972 = i11 % 128;
        int i12 = i11 % 2;
        return hvVarM2452;
    }

    static {
        char c10;
        m2910();
        f2981 = true;
        f2983 = true;
        f2980 = true;
        byte b10 = 0;
        f2984 = false;
        f2982 = false;
        f2975 = new e(b10);
        f2977 = new e(b10);
        int i10 = f2974 + 29;
        f2972 = i10 % 128;
        if (i10 % 2 != 0) {
            c10 = 22;
        } else {
            c10 = 'T';
        }
        if (c10 == 'T') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static ia m2912() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.8
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1866(hv hvVar) {
                return WebViewClient.class.equals(hvVar.mo2353().getType());
            }
        };
        int i10 = f2974 + 65;
        f2972 = i10 % 128;
        int i11 = i10 % 2;
        return iaVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static WebChromeClient m2898(WebView webView) {
        WebChromeClient webChromeClient;
        hv<WebChromeClient> hvVarM2914;
        int i10 = f2974 + 3;
        f2972 = i10 % 128;
        if (i10 % 2 != 0 || Build.VERSION.SDK_INT >= 26) {
            if ((m2903().m646()) && m2916(webView.getContext())) {
                int i11 = f2974 + 9;
                f2972 = i11 % 128;
                int i12 = i11 % 2;
                webChromeClient = webView.getWebChromeClient();
            } else {
                hvVarM2914 = m2914(webView);
                if (hvVarM2914 != null) {
                    webChromeClient = hvVarM2914.mo2354();
                } else {
                    throw new RuntimeException(m2915("官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕⇣\uda8c缌䯄陒蛐\uece0㮫ł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭", 35 - KeyEvent.normalizeMetaState(0)).intern());
                }
            }
        } else {
            hvVarM2914 = m2914(webView);
            if (hvVarM2914 != null) {
                webChromeClient = hvVarM2914.mo2354();
            } else {
                throw new RuntimeException(m2915("官\ue84d\ue2f9⪾퇲⋕\ude11㌜鷿貘\ue4b4赸李퍲娓̕⇣\uda8c缌䯄陒蛐\uece0㮫ł蠣藸顓Ꮾ贲\uee49鲺Կ阡ᐒ৭", 35 - KeyEvent.normalizeMetaState(0)).intern());
            }
        }
        int i13 = f2972 + 11;
        f2974 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        return webChromeClient;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2916(Context context) {
        int i10 = f2974 + 99;
        f2972 = i10 % 128;
        if (i10 % 2 == 0) {
            if (f2980) {
                boolean z10 = false;
                f2980 = false;
                WebView webView = new WebView(context);
                hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.4
                });
                webView.setWebChromeClient(hiVar);
                if ((hiVar == webView.getWebChromeClient() ? 'G' : '?') != '?') {
                    int i11 = f2974 + 51;
                    f2972 = i11 % 128;
                    if ((i11 % 2 != 0 ? '!' : (char) 1) != '!') {
                        z10 = true;
                    }
                }
                f2982 = z10;
                int i12 = f2972 + 115;
                f2974 = i12 % 128;
                int i13 = i12 % 2;
            }
            return f2982;
        }
        throw null;
    }

    @RequiresApi(api = 26)
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2906(Context context) {
        boolean z10;
        if (f2983) {
            try {
                f2983 = false;
                WebView webView = new WebView(context);
                hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.1
                    @Override // android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, view, url);
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
                    }
                });
                webView.setWebViewClient(hkVar);
                if ((hkVar == webView.getWebViewClient() ? '^' : '\t') != '^') {
                    z10 = false;
                } else {
                    int i10 = f2972 + 15;
                    f2974 = i10 % 128;
                    int i11 = i10 % 2;
                    z10 = true;
                }
                f2984 = z10;
                int i12 = f2974 + 87;
                f2972 = i12 % 128;
                int i13 = i12 % 2;
            } catch (Throwable th2) {
                kd.m2872(m2915("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - Color.red(0)).intern(), m2915("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a\uf535\u1cce\uf217\ue3c5鴤锓⍡둧ᄚ㸤䯢◑ꙓ\udf00翱瓩\uf773\uf8f5멥뤛䦦筚", ImageFormat.getBitsPerPixel(0) + 37).intern(), th2, false);
            }
        }
        return f2984;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> e m2909(WebView webView, T t10, ia iaVar) {
        e eVar = new e((byte) 0);
        hv hvVarM2899 = m2899(webView, iaVar, m2903().m647(), m2903().m651());
        if (hvVarM2899 != null) {
            Object objMo2354 = hvVarM2899.mo2354();
            if (objMo2354 == t10) {
                int i10 = f2974 + 79;
                f2972 = i10 % 128;
                byte b10 = i10 % 2 == 0 ? (byte) 1 : (byte) 0;
                eVar.m2921();
                if (b10 == 0) {
                    throw null;
                }
            } else {
                hv hvVarM2908 = m2908(objMo2354, iaVar, m2903().m650(), m2903().m649());
                if ((hvVarM2908 == null ? (byte) 1 : (byte) 0) == 0) {
                    int i11 = f2972 + 93;
                    f2974 = i11 % 128;
                    int i12 = i11 % 2;
                    if ((hvVarM2908.mo2354() == t10 ? '@' : 'U') == '@') {
                        eVar.m2919();
                        int i13 = f2974 + 47;
                        f2972 = i13 % 128;
                        int i14 = i13 % 2;
                    }
                }
            }
        }
        return eVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m2901(Context context) {
        int i10 = f2972 + 31;
        f2974 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            int i11 = 39 / 0;
            if (!f2981) {
                return;
            }
        } else if (!f2981) {
            return;
        }
        f2981 = false;
        try {
            WebView webView = new WebView(context);
            hk hkVar = new hk(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.3
                @Override // android.webkit.WebViewClient
                public void onLoadResource(WebView view, String url) {
                    super.onLoadResource(view, url);
                    CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44960f, view, url);
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);
                    CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44960f, view, url);
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                    return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44960f, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                }

                @Override // android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
                    return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44960f, view, url, super.shouldInterceptRequest(view, url));
                }
            });
            webView.setWebViewClient(hkVar);
            hi hiVar = new hi(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.5
            });
            webView.setWebChromeClient(hiVar);
            f2975 = m2909(webView, hkVar, m2912());
            f2977 = m2909(webView, hiVar, m2900());
            int i12 = f2974 + 101;
            f2972 = i12 % 128;
            if (i12 % 2 == 0) {
                return;
            }
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            kd.m2872(m2915("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", TextUtils.indexOf("", "") + 12).intern(), m2915("ᢧន횻\ud90e籄ⴂ閮\ue706丌獹띣鵢\ueea8\ue39a鷿貘愎骹\uf535\u1cceত◹蓍鎿\ue318橔ł蠣藸顓䲐뿋", 32 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), th3, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2915(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2979)) ^ ((c11 >>> 5) + f2973)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2976) ^ ((c12 + i12) ^ ((c12 << 4) + f2978))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> hv<T> m2905(WebView webView, ia iaVar, e eVar) {
        int i10 = f2972 + 107;
        f2974 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                eVar.m2920();
                throw null;
            }
            if (eVar.m2920()) {
                hv<T> hvVarM2899 = m2899(webView, iaVar, m2903().m647(), m2903().m651());
                boolean z10 = true;
                if (!eVar.m2918()) {
                    return hvVarM2899;
                }
                int i11 = f2972 + 83;
                f2974 = i11 % 128;
                if ((i11 % 2 == 0 ? (char) 24 : ' ') != ' ') {
                    throw null;
                }
                if (hvVarM2899 == null) {
                    return hvVarM2899;
                }
                T tMo2354 = hvVarM2899.mo2354();
                if (tMo2354 != null) {
                    if (!tMo2354.getClass().equals(hvVarM2899.mo2353().getType())) {
                        z10 = false;
                    }
                    if (!z10) {
                        return m2908(tMo2354, iaVar, m2903().m650(), m2903().m649());
                    }
                }
                int i12 = f2974 + 39;
                f2972 = i12 % 128;
                int i13 = i12 % 2;
                return hvVarM2899;
            }
            return null;
        } catch (Throwable th2) {
            kd.m2872(m2915("娓̕键錭멥뤛ꋇঁɀ諻\udc3a\udeed", 12 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), m2915("ᢧន횻\ud90e籄ⴂ禺恗鷖엤\ue4b4赸\ufafc뎸\uef66벫멥뤛䦦筚鷿貘멥뤛ɻ♡", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> hv<T> m2899(WebView webView, ia iaVar, List<String> list, int i10) {
        int i11 = f2974 + 31;
        f2972 = i11 % 128;
        int i12 = i11 % 2;
        hv<T> hvVarM2911 = m2911(webView, iaVar, list, i10);
        int i13 = f2972 + 89;
        f2974 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 19 : 'Z') == 'Z') {
            return hvVarM2911;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ia m2900() {
        ia iaVar = new ia() { // from class: com.ironsource.adqualitysdk.sdk.i.ki.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ia
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1866(hv hvVar) {
                return WebChromeClient.class.equals(hvVar.mo2353().getType());
            }
        };
        int i10 = f2972 + 71;
        f2974 = i10 % 128;
        if (i10 % 2 != 0) {
            return iaVar;
        }
        int i11 = 49 / 0;
        return iaVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> hv<T> m2908(T t10, ia iaVar, List<String> list, int i10) {
        int i11 = f2972 + 33;
        f2974 = i11 % 128;
        if ((i11 % 2 == 0 ? '-' : '&') == '-') {
            m2911(t10, iaVar, list, i10);
            throw null;
        }
        hv<T> hvVarM2911 = m2911(t10, iaVar, list, i10);
        int i12 = f2974 + 9;
        f2972 = i12 % 128;
        if ((i12 % 2 != 0 ? '/' : '!') == '!') {
            return hvVarM2911;
        }
        throw null;
    }
}
