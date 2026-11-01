package b;

import android.webkit.JavascriptInterface;
import com.yk.e.activity.MainInterstitialActivity;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MainInterstitialActivity f4726a;

    public k(MainInterstitialActivity mainInterstitialActivity) {
        this.f4726a = mainInterstitialActivity;
    }

    @JavascriptInterface
    public void adClick(String str) {
        try {
            MainInterstitialActivity mainInterstitialActivity = this.f4726a;
            MainInterstitialActivity mainInterstitialActivity2 = mainInterstitialActivity.IL1Iii;
            if (gl.c.f53460b == null) {
                gl.c.f53460b = new gl.c();
            }
            gl.c.f53460b.a(mainInterstitialActivity2, 6, mainInterstitialActivity.ILil, mainInterstitialActivity.f3297ILl.adPlcID, false);
            this.f4726a.f51168Lil.onAdClick();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }

    @JavascriptInterface
    public void extendMethod(String str) {
        AdLog.d("extendMethod, jsonStr = " + str);
    }

    @JavascriptInterface
    public void finish(String str) {
        try {
            this.f4726a.f51168Lil.onAdClose();
            MainInterstitialActivity mainInterstitialActivity = this.f4726a;
            mainInterstitialActivity.IL1Iii(mainInterstitialActivity.IL1Iii);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
