package c;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.safedk.android.utils.Logger;
import com.yk.e.activity.RewardVideoActivity;
import com.yk.e.activity.RewardWebActivity;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdSdkStateCode;
import com.yk.e.object.SendLoader;
import com.yk.e.pl.OktVideoView;
import com.yk.e.pl.PreloadManager;
import com.yk.e.util.AdLog;
import com.yk.e.util.AdPlayer;
import com.yk.e.util.Constant;
import com.yk.e.util.MainPreloadService;
import com.yk.e.util.StringUtil;
import gl.r0;
import io.bidmachine.iab.vast.tags.VastAttributes;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class v extends f {
    public MainRewardVideoAdCallBack B;
    public Activity C;
    public int D;
    public boolean E = false;
    public boolean F = false;
    public AdPlayer G;
    public View H;
    public OktVideoView I;
    public String J;

    public static void safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(Activity p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        String strOptString = "";
        this.C = activity;
        this.D = i10;
        this.B = b2Var;
        try {
            strOptString = this.f61591l.optString("videoWebUrl", "");
        } catch (Exception e10) {
            b.d.a(e10, new StringBuilder("getStringValue2 error, msg = "), e10);
        }
        this.J = strOptString;
        try {
            if (StringUtil.isAppInstalled(this.C, this.f61589j.packageName)) {
                j(AdSdkStateCode.MAIN_OWN_FAILED, e("main_app_exist"));
            } else if (TextUtils.isEmpty(this.f61589j.videoUrl)) {
                MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.B;
                if (mainRewardVideoAdCallBack != null) {
                    mainRewardVideoAdCallBack.onAdVideoCache();
                }
            } else {
                PreloadManager.getInstance(this.C.getApplicationContext()).addPlayLoadTask(this.f61589j.videoUrl, (int) System.currentTimeMillis(), false, new f0(this));
                new Handler().postDelayed(new m0(this), 60000L);
            }
        } catch (Exception e11) {
            AdLog.e("MainRewardView loadAd error, msg = " + e11.getMessage(), e11);
            n(e11);
        }
    }

    @Override // c.f
    public final void C() {
        try {
            Class cls = !TextUtils.isEmpty(this.f61589j.videoUrl) ? RewardVideoActivity.class : RewardWebActivity.class;
            SendLoader sendLoader = new SendLoader(this.f61589j, this.f61585f, this.D, this.B);
            sendLoader.setAdPlayer(this.G);
            sendLoader.setOktVideoView(this.I);
            sendLoader.setRootView(this.H);
            Constant.rewardVideoAdMap.put(this.f61589j.adID, sendLoader);
            Intent intent = new Intent(this.C, (Class<?>) cls);
            intent.putExtra(VastAttributes.AD_ID, this.f61589j.adID);
            intent.putExtra("videoWebUrl", this.J);
            intent.setFlags(268435456);
            AdLog.d("put mainParams.adID " + this.f61589j.adID);
            safedk_Activity_startActivity_9d898b58165fa4ba0e12c3900a2b8533(this.C, intent);
            o(new l0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            n(e10);
        }
    }

    @Override // j.n0
    public final void z() {
        f(r0.a(this.f61589j.webPrice));
        MainRewardVideoAdCallBack mainRewardVideoAdCallBack = this.B;
        if (mainRewardVideoAdCallBack != null) {
            mainRewardVideoAdCallBack.onAdVideoCache();
        }
        System.currentTimeMillis();
        MainPreloadService.IL1Iii(this.C);
    }
}
