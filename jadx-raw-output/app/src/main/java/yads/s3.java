package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes10.dex */
public final class s3 extends WebViewClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f82512d = {wb.a(s3.class, GAMConfig.KEY_CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f82513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3 f82514b = cs2.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final db3 f82515c = new db3();

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        if (str.length() != 0) {
            String strReplaceFirst = new Regex("http(s?)://").replaceFirst(str, "");
            ab3.f75456c.getClass();
            ab3[] ab3VarArr = {ab3.f75457d, ab3.f75458e, ab3.f75459f, ab3.f75460g};
            for (int i10 = 0; i10 < 4; i10++) {
                if (!lk.x.R(strReplaceFirst, ab3VarArr[i10].f75462b, false, 2, null)) {
                }
            }
            if (URLUtil.isNetworkUrl(str)) {
                return false;
            }
        } else if (URLUtil.isNetworkUrl(str)) {
            return false;
        }
        return this.f82515c.a(webView.getContext(), str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (this.f82514b.a(webView.getContext(), sslError)) {
            sslErrorHandler.proceed();
        }
    }

    public s3(Context context) {
        this.f82513a = mm2.a(context);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        t3 t3Var;
        super.onPageFinished(webView, str);
        lm2 lm2Var = this.f82513a;
        jk.k kVar = f82512d[0];
        Object obj = (Context) lm2Var.f79854a.get();
        if (obj instanceof t3) {
            t3Var = (t3) obj;
        } else {
            t3Var = null;
        }
        if (t3Var != null) {
            ((t1) t3Var).a(8);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        t3 t3Var;
        super.onPageStarted(webView, str, bitmap);
        lm2 lm2Var = this.f82513a;
        jk.k kVar = f82512d[0];
        Object obj = (Context) lm2Var.f79854a.get();
        if (obj instanceof t3) {
            t3Var = (t3) obj;
        } else {
            t3Var = null;
        }
        if (t3Var != null) {
            ((t1) t3Var).a(0);
        }
    }
}
