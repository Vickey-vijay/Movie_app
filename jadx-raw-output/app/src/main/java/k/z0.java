package k;

import android.app.Activity;
import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.e2;

/* JADX INFO: loaded from: classes2.dex */
public final class z0 extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public ViewGroup F;
    public MBSplashHandler K;
    public final int E = 10;
    public String G = "";
    public String H = "";
    public String I = "";
    public String J = "";
    public final q L = new q(this);
    public final h0 M = new h0(this);

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        this.F = viewGroup;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.H = str;
        String str2 = eVar.f54037b;
        this.G = str2;
        String str3 = eVar.f54038c;
        this.I = str3;
        String str4 = eVar.f54041f;
        this.J = str4;
        AdLog.i("appKey " + str2 + ", appID " + str + ", placementId " + str3 + ", unitID " + str4);
        try {
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.H, this.G, new s0(this, activity));
            Constant.addFragmentListener(activity, new l(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }

    @Override // k.t0
    public final void C() {
        try {
            Activity activity = this.C;
            if (activity == null || activity.isFinishing()) {
                v("SplashAD activity is finish!");
            } else if (this.K.isReady()) {
                this.K.show(this.F);
            } else {
                this.K.loadAndShow(this.F);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
