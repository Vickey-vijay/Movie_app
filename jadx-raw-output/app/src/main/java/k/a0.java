package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.vungle.ads.InterstitialAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.e2;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public boolean E = false;
    public boolean F = false;
    public String G = "";
    public String H = "";
    public InterstitialAd I;

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        this.E = false;
        this.F = false;
        i.e eVar = this.f61590k;
        this.G = eVar.f54036a;
        this.H = eVar.f54038c;
        AdLog.d("appID " + this.G + ", posID " + this.H);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.G, new e0(this, activity));
    }

    @Override // k.t0
    public final void C() {
        try {
            Activity activity = this.C;
            if (activity != null && !activity.isFinishing()) {
                InterstitialAd interstitialAd = this.I;
                if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
                    this.I.play(this.C);
                } else if (!this.F) {
                    super.v("SplashAD cannot play!");
                }
            } else if (!this.F) {
                super.v("SplashAD activity is finish!");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.F) {
            return;
        }
        super.v(str);
    }
}
