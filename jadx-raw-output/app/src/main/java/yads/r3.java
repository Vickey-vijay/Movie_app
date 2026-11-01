package yads;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class r3 extends WebChromeClient {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ jk.k[] f82085b = {wb.a(r3.class, GAMConfig.KEY_CONTEXT, "getContext()Landroid/content/Context;", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lm2 f82086a;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        lm2 lm2Var = this.f82086a;
        jk.k kVar = f82085b[0];
        Object obj = (Context) lm2Var.f79854a.get();
        t3 t3Var = obj instanceof t3 ? (t3) obj : null;
        if (t3Var != null) {
            t1 t1Var = (t1) t3Var;
            int i11 = i10 * 100;
            t1Var.f82858i.setProgress(i11);
            if (10000 > i11) {
                t1Var.a(0);
            } else {
                t1Var.f82857h.setText(webView.getTitle());
                t1Var.a(8);
            }
        }
    }

    public r3(Context context) {
        this.f82086a = mm2.a(context);
    }
}
