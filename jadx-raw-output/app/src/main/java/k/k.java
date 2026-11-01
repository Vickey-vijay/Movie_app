package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.e2;
import sg.bigo.ads.api.SplashAd;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public SplashAd E;
    public String F = "";
    public final j0 G = new j0(this);

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.F = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new w(this, activity));
    }

    @Override // k.t0
    public final void C() {
        try {
            SplashAd splashAd = this.E;
            if (splashAd == null) {
                v("channelSplashAd is null");
                return;
            }
            if (splashAd.isExpired()) {
                this.E.destroy();
                v("channelSplashAd is expired");
                return;
            }
            Activity activity = this.C;
            if (activity == null || activity.isFinishing()) {
                v("SplashAD activity is finish!");
            } else {
                this.E.show();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
