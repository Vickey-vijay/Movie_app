package gl;

import android.webkit.JavascriptInterface;
import com.yk.e.util.AdLog;
import com.yk.e.util.OktWebView;

/* JADX INFO: loaded from: classes2.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OktWebView f53577a;

    public p1(OktWebView oktWebView) {
        this.f53577a = oktWebView;
    }

    @JavascriptInterface
    public void adClick(String str) {
        try {
            OktWebView oktWebView = this.f53577a;
            int i10 = OktWebView.IL1Iii;
            oktWebView.getClass();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @JavascriptInterface
    public void extendMethod(String str) {
        AdLog.d("extendMethod, jsonStr = " + str);
        OktWebView oktWebView = this.f53577a;
        int i10 = OktWebView.IL1Iii;
        oktWebView.getClass();
    }

    @JavascriptInterface
    public void finish(String str) {
        try {
            OktWebView oktWebView = this.f53577a;
            int i10 = OktWebView.IL1Iii;
            oktWebView.getClass();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
