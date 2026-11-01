package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.facebook.ads.InterstitialAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.e2;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public InterstitialAd E;
    public String F = "";
    public final o0 G = new o0(this);

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        try {
            this.F = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.F);
            AbstractC4043il.I1I(activity.getApplicationContext(), new t(this, activity));
            Constant.addFragmentListener(activity, new v(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }

    @Override // k.t0
    public final void C() {
        try {
            if (this.E != null) {
                Activity activity = this.C;
                if (activity == null || activity.isFinishing()) {
                    v("SplashAD activity is finish!");
                } else {
                    this.E.show();
                }
            } else {
                v("interstitialAd is null");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
