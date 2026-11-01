package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.e2;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public PAGAppOpenAd F;
    public final int E = 10000;
    public String G = "";
    public String H = "";
    public final u I = new u(this);
    public final e J = new e(this);

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        i.e eVar = this.f61590k;
        this.G = eVar.f54036a;
        this.H = eVar.f54038c;
        AdLog.d("appID " + this.G + ", posID " + this.H);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), new o(this), this.G);
    }

    @Override // k.t0
    public final void C() {
        try {
            PAGAppOpenAd pAGAppOpenAd = this.F;
            if (pAGAppOpenAd == null) {
                v("channelAppOpenAd is null");
                return;
            }
            pAGAppOpenAd.setAdInteractionListener(this.J);
            Activity activity = this.C;
            if (activity == null || activity.isFinishing()) {
                v("SplashAD activity is finish!");
            } else {
                this.F.show(this.C);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
