package gl;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import com.yk.e.callBack.MainInitSdkCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.AppUtil;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f53588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainInitSdkCallback f53589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a1 f53590c;

    public s(a1 a1Var, Context context, MainInitSdkCallback mainInitSdkCallback) {
        this.f53590c = a1Var;
        this.f53588a = context;
        this.f53589b = mainInitSdkCallback;
    }

    @Override // gl.r
    public final void a(String str) {
        String lowerCase;
        a1.f53439i = r0.d(this.f53588a);
        a1.f53440j = r0.e(this.f53588a, "OKT_SDK_APP_KEY");
        a1 a1Var = this.f53590c;
        if (!TextUtils.isEmpty(a1Var.f53445d)) {
            str = this.f53590c.f53445d;
        }
        a1Var.f53445d = str;
        this.f53590c.f53446e = AppUtil.getAppName(this.f53588a);
        this.f53590c.f53443b = this.f53588a.getPackageName();
        this.f53590c.f53444c = AppUtil.getAppSHA1(this.f53588a);
        this.f53590c.f53447f = AppUtil.getAppVersionName(this.f53588a);
        a1 a1Var2 = this.f53590c;
        String str2 = "en-us";
        try {
            Configuration configuration = this.f53588a.getResources().getConfiguration();
            str2 = configuration.locale.getLanguage() + "-" + configuration.locale.getCountry();
            lowerCase = str2.toLowerCase(Locale.US);
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            lowerCase = str2;
        }
        a1Var2.f53448g = lowerCase;
        AdLog.ad("initSdk appID = " + a1.f53439i);
        AdLog.ad("CommonApi " + Constant.commonApi);
        AdLog.ad("ApiVersion " + Constant.apiVersion);
        AdLog.ad("DebugFlag " + Constant.debugFlag);
        Context context = this.f53588a;
        AdLog.i("initAdShowCountData");
        String str3 = Constant.fileAdShowCount;
        HashMap<String, List<String>> map = Constant.adShowCountMap;
        g.e(context, str3, map);
        AdLog.d("initAdShowCountData " + map.toString());
        Context context2 = this.f53588a;
        AdLog.i("initAdAreaCountData");
        String str4 = Constant.fileAdAreaTypeCount;
        HashMap<String, List<String>> map2 = Constant.adAreaNumMap;
        g.e(context2, str4, map2);
        AdLog.d("initAdAreaCountData " + map2.toString());
        CoreUtils.initCacheAdsID(this.f53588a);
        a1.g(this.f53590c, this.f53588a, Constant.ReqInitPath, this.f53589b);
    }
}
