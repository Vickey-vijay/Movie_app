package k;

import android.app.Activity;
import android.os.Handler;
import android.view.ViewGroup;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.e2;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public MaxAppOpenAd E;
    public boolean F = false;
    public boolean G = false;
    public String H = "";
    public final n I = new n(this);

    @Override // j.n0
    public final boolean t() {
        try {
            MaxAppOpenAd maxAppOpenAd = this.E;
            if (maxAppOpenAd != null) {
                return true ^ maxAppOpenAd.isReady();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return true;
    }

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        this.H = this.f61590k.f54038c;
        AdLog.d("unitID " + this.H);
        AbstractC4043il.ILil(activity.getApplicationContext(), new p0(this, activity));
        if (this.f61598s) {
            AdLog.d("refreshAdCache, do not turn on the countdown");
        } else {
            new Handler().postDelayed(new g0(this), this.f61603x);
        }
    }

    @Override // k.t0
    public final void C() {
        try {
            Activity activity = this.C;
            if (activity != null && !activity.isFinishing() && !this.C.isDestroyed()) {
                MaxAppOpenAd maxAppOpenAd = this.E;
                if (maxAppOpenAd == null) {
                    v("SplashAD is null!");
                    return;
                } else if (maxAppOpenAd.isReady()) {
                    this.E.showAd(this.f61585f);
                    return;
                } else {
                    v("SplashAD is not ready!");
                    return;
                }
            }
            v("SplashAD activity is finish!");
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.G) {
            return;
        }
        this.G = true;
        super.v(str);
    }
}
