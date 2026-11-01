package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import j.e2;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends t0 {
    public static String J = "";
    public Activity C;
    public MainSplashAdCallBack D;
    public AppOpenAd E;
    public AdInfo G;
    public long F = 0;
    public final j H = new j(this);
    public final c I = new c(this);

    @Override // j.n0
    public final boolean t() {
        try {
            return System.currentTimeMillis() - this.F > 3600000;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return true;
        }
    }

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        J = this.f61590k.f54038c;
        AdLog.d("unitID " + J);
        AbstractC4043il.IL1Iii(activity, new f(this, activity));
    }

    @Override // k.t0
    public final void C() {
        try {
            this.E.setFullScreenContentCallback(this.I);
            Activity activity = this.C;
            if (activity == null || activity.isFinishing()) {
                v("SplashAD activity is finish!");
            } else {
                this.E.show(this.C);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
