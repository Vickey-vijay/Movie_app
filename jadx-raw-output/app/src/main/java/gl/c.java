package gl;

import android.app.Activity;
import android.content.Intent;
import com.safedk.android.utils.Logger;
import com.yk.e.MainSDK;
import com.yk.e.activity.WebActivity;
import com.yk.e.object.MainParams;
import com.yk.e.object.SendLoader;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import com.yk.e.util.CoreUtils;
import com.yk.e.util.DownloadManager;
import com.yk.e.util.StringUtil;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f53460b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f53461a = 0;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public static void b(Activity activity, MainParams mainParams, String str, String str2) {
        Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
        Constant.appDetailAdMap.put(mainParams.adID, new SendLoader(mainParams, str2));
        intent.putExtra(VastAttributes.AD_ID, mainParams.adID);
        intent.putExtra("url", str);
        intent.setFlags(268435456);
        safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(activity, intent);
    }

    public final void a(Activity activity, int i10, MainParams mainParams, String str, boolean z10) {
        if (mainParams == null) {
            AdLog.i("点击事件无效，mainParams为空！");
            return;
        }
        if (System.currentTimeMillis() - this.f53461a < 1500) {
            AdLog.i("频繁点击，请稍候！");
            return;
        }
        this.f53461a = System.currentTimeMillis();
        try {
            int i11 = mainParams.type;
            if (i11 == 0) {
                b(activity, mainParams, mainParams.clickUrl, str);
            } else if (i11 != 1) {
                if (i11 == 2) {
                    if (!mainParams.isUserWebUrl && StringUtil.gotoProtocol(activity, mainParams.clickUrl)) {
                        i.d dVar = new i.d();
                        dVar.f54020a = str;
                        dVar.f54021b = i10;
                        dVar.f54022c = mainParams.adID;
                        dVar.f54025f = 7;
                        MainSDK.getInstance().statAd(dVar);
                    } else {
                        String str2 = mainParams.webUrl;
                        if (!".apk".equals(str2.substring(str2.lastIndexOf(".")).toLowerCase(Locale.ROOT))) {
                            CoreUtils.openBrowser(activity, mainParams.webUrl);
                        } else if (z10) {
                            new DownloadManager().start(activity, mainParams.webUrl);
                        } else {
                            new DownloadManager().get(activity, mainParams, str, mainParams.webUrl);
                        }
                    }
                }
            } else if (z10) {
                new DownloadManager().start(activity, mainParams.webUrl);
            } else {
                new DownloadManager().page(activity, mainParams, str);
            }
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("mainAdClick error, msg = "), e10);
        }
    }
}
