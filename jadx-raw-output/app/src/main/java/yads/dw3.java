package yads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dw3 extends ka {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WebView f76830g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f76831h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f76832i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f76833j;

    @Override // yads.ka
    public final void a(wv3 wv3Var, ia iaVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapUnmodifiableMap = Collections.unmodifiableMap(iaVar.f78537d);
        for (String str : mapUnmodifiableMap.keySet()) {
            md3 md3Var = (md3) mapUnmodifiableMap.get(str);
            md3Var.getClass();
            JSONObject jSONObject2 = new JSONObject();
            lw3.a(jSONObject2, "vendorKey", md3Var.f80147a);
            lw3.a(jSONObject2, "resourceUrl", md3Var.f80148b.toString());
            lw3.a(jSONObject2, "verificationParameters", md3Var.f80149c);
            lw3.a(jSONObject, str, jSONObject2);
        }
        a(wv3Var, iaVar, jSONObject);
    }

    @Override // yads.ka
    public final void b() {
        this.f79343b.clear();
        new Handler().postDelayed(new zv3(this), Math.max(4000 - (this.f76831h == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f76831h.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f76830g = null;
    }

    @Override // yads.ka
    public final void c() {
        WebView webView = new WebView(fx3.f77541b.f77542a);
        this.f76830g = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f76830g.getSettings().setAllowContentAccess(false);
        this.f76830g.getSettings().setAllowFileAccess(false);
        this.f76830g.setWebViewClient(new yv3(this));
        this.f79343b = new hw3(this.f76830g);
        ix3.a(this.f76830g, this.f76833j);
        for (String str : this.f76832i.keySet()) {
            String externalForm = ((md3) this.f76832i.get(str)).f80148b.toExternalForm();
            WebView webView2 = this.f76830g;
            if (externalForm != null && !TextUtils.isEmpty(str)) {
                ix3.a(webView2, "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};Object.defineProperty(this.omidVerificationProperties, 'injectionId', {get: function() {var currentScript = document && document.currentScript;return currentScript && currentScript.getAttribute('data-injection-id');}, configurable: true});var script = document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");script.setAttribute(\"data-injection-id\",\"%INJECTION_ID%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", str));
            }
        }
        this.f76831h = Long.valueOf(System.nanoTime());
    }

    public dw3(String str, String str2, Map map) {
        super(str);
        this.f76831h = null;
        this.f76832i = map;
        this.f76833j = str2;
    }
}
