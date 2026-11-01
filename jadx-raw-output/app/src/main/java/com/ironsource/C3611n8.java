package com.ironsource;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.ironsource.mediationsdk.logger.IronLog;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3611n8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC3573l8 f30283a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WebView f30285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f30286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f30287e = C3611n8.class.getSimpleName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f30288f = {"handleGetViewVisibility"};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String[] f30289g = {C3537j8.f29254h, C3537j8.f29255i, C3537j8.f29253g, "handleGetViewVisibility", C3537j8.f29256j};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C3637og f30284b = new C3637og();

    /* JADX INFO: renamed from: com.ironsource.n8$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30291b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f30292c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ JSONObject f30293d;

        public a(String str, String str2, String str3, JSONObject jSONObject) {
            this.f30290a = str;
            this.f30291b = str2;
            this.f30292c = str3;
            this.f30293d = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!C3611n8.this.b(this.f30290a)) {
                    String str = "ISNAdViewLogic | handleMessageFromController | cannot handle command: " + this.f30290a;
                    Log.e(C3611n8.this.f30287e, str);
                    C3611n8.this.a(this.f30291b, str);
                    return;
                }
                if (this.f30290a.equalsIgnoreCase("handleGetViewVisibility")) {
                    C3611n8.this.e(this.f30292c);
                } else if (this.f30290a.equalsIgnoreCase(C3537j8.f29256j) || this.f30290a.equalsIgnoreCase(C3537j8.f29255i)) {
                    C3611n8.this.a(this.f30293d.getString("params"), this.f30292c, this.f30291b);
                }
            } catch (Exception e10) {
                C3676r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
                String str2 = "ISNAdViewLogic | handleMessageFromController | Error while trying handle message: " + this.f30290a;
                Log.e(C3611n8.this.f30287e, str2);
                C3611n8.this.a(this.f30291b, str2);
            }
        }
    }

    /* JADX INFO: renamed from: com.ironsource.n8$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f30295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f30296b;

        public b(String str, String str2) {
            this.f30295a = str;
            this.f30296b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C3611n8.this.f30285c.evaluateJavascript(this.f30295a, null);
            } catch (Throwable th2) {
                C3676r4.d().a(th2);
                Log.e(C3611n8.this.f30287e, "injectJavaScriptIntoWebView | Error while trying inject JS into external adUnit: " + this.f30296b + "Android API level: " + Build.VERSION.SDK_INT);
            }
        }
    }

    private void d() {
        if (this.f30283a == null || this.f30284b == null) {
            return;
        }
        a(C3537j8.f29247a, a());
    }

    public void a(WebView webView) {
        this.f30285c = webView;
    }

    public void b() {
        this.f30283a = null;
        this.f30284b = null;
    }

    public String c() {
        return this.f30286d;
    }

    public void e() {
        if (this.f30283a == null || this.f30284b == null) {
            return;
        }
        a(C3537j8.f29248b, a());
    }

    private boolean h(String str) {
        for (String str2 : this.f30288f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    private boolean i(String str) {
        return str.equalsIgnoreCase(C3537j8.f29257k);
    }

    public void a(InterfaceC3573l8 interfaceC3573l8) {
        this.f30283a = interfaceC3573l8;
    }

    public void c(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
            String strOptString = jSONObjectJsonObjectInit.optString("method");
            if (TextUtils.isEmpty(strOptString) || !h(strOptString)) {
                a(jSONObjectJsonObjectInit.optString(C3537j8.f29268v, C3537j8.f29249c), jSONObjectJsonObjectInit);
            } else if (strOptString.equalsIgnoreCase("handleGetViewVisibility")) {
                a(jSONObjectJsonObjectInit, (String) null, (String) null);
            }
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            Log.e(this.f30287e, "ISNAdViewLogic | receiveMessageFromExternal | Error while trying handle message: " + str);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void g(String str) {
        this.f30286d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        for (String str2 : this.f30289g) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public void a(String str, JSONObject jSONObject) {
        InterfaceC3573l8 interfaceC3573l8 = this.f30283a;
        if (interfaceC3573l8 != null) {
            interfaceC3573l8.a(str, jSONObject);
        }
    }

    private void d(String str) {
        V7.f27797a.d(new b("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public void e(String str) throws JSONException {
        JSONObject jSONObjectA = this.f30284b.a();
        jSONObjectA.put("adViewId", this.f30286d);
        a(str, jSONObjectA);
    }

    public void a(String str, String str2) {
        InterfaceC3573l8 interfaceC3573l8 = this.f30283a;
        if (interfaceC3573l8 != null) {
            interfaceC3573l8.a(str, str2, this.f30286d);
        }
    }

    public void f(String str) {
        try {
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit.put("adViewId", this.f30286d);
            a(str, jSONObjectJsonObjectInit);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void a(String str, JSONObject jSONObject, String str2, String str3) {
        if (this.f30283a == null) {
            A8.a(C3472fe.f28928t, new C3748v8().a(G5.f26614y, "mDelegate is null").a());
        } else {
            V7.f27797a.d(new a(str, str3, str2, jSONObject));
        }
    }

    public void a(String str, int i10, boolean z10) {
        this.f30284b.a(str, i10, z10);
        if (i(str)) {
            d();
        }
    }

    public JSONObject a() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
            jSONObjectJsonObjectInit2.put(C3537j8.f29265s, this.f30284b.a());
            jSONObjectJsonObjectInit.put(C3537j8.f29262p, jSONObjectJsonObjectInit2);
            jSONObjectJsonObjectInit.put("adViewId", c());
            return jSONObjectJsonObjectInit;
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    public void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        a(a(jSONObject).toString(), str, str2);
    }

    public void a(String str, String str2, String str3) throws JSONException {
        if (this.f30285c == null) {
            String str4 = "No external adUnit attached to ISNAdView while trying to send message: " + str;
            Log.e(this.f30287e, str4);
            this.f30283a.a(str3, str4, this.f30286d);
            return;
        }
        try {
            IronSourceVideoBridge.jsonObjectInit(str);
        } catch (JSONException e10) {
            C3676r4.d().a(e10);
            str = "\"" + str + "\"";
        }
        d(a(str));
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        jSONObjectJsonObjectInit.put("adViewId", this.f30286d);
        a(str2, jSONObjectJsonObjectInit);
    }

    private String a(String str) {
        return String.format(C3537j8.f29267u, str);
    }

    private JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put("id", jSONObject.getString("id"));
            jSONObjectJsonObjectInit.put("data", this.f30284b.a());
        } catch (Exception e10) {
            C3676r4.d().a(e10);
            Log.e(this.f30287e, "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObjectJsonObjectInit;
    }
}
