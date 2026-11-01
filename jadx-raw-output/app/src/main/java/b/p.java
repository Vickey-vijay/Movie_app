package b;

import android.webkit.JavascriptInterface;
import com.yk.e.activity.BaseVideoActivity;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseVideoActivity f4733a;

    public p(RewardVideoActivity rewardVideoActivity) {
        this.f4733a = rewardVideoActivity;
    }

    @JavascriptInterface
    public void adClick(String str) {
        try {
            this.f4733a.IL1Iii();
            this.f4733a.I1I.onAdClick();
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
            this.f4733a.closeAd();
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
