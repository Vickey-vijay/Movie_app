package k;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.yk.e.AbstractC4043il;
import com.yk.e.I1I;
import com.yk.e.callBack.MainSplashAdCallBack;
import com.yk.e.util.AdLog;
import j.e2;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends t0 {
    public Activity C;
    public MainSplashAdCallBack D;
    public String E = "";
    public String F = "";
    public final b0 G = new b0(this);
    public final d H = new d(this);

    @Override // k.t0
    public final void B(Activity activity, ViewGroup viewGroup, e2 e2Var) {
        this.C = activity;
        this.D = e2Var;
        i.e eVar = this.f61590k;
        this.E = eVar.f54036a;
        this.F = eVar.f54038c;
        Context applicationContext = activity.getApplicationContext();
        String str = this.E;
        s sVar = new s(this);
        if (!AbstractC4043il.IL1Iii) {
            UnityAds.initialize(applicationContext, str, false, new I1I(sVar));
        } else {
            AdLog.i("unityAd has success");
            sVar.onInitializationComplete();
        }
    }

    @Override // k.t0
    public final void C() {
        try {
            Activity activity = this.C;
            if (activity == null || activity.isFinishing()) {
                v("SplashAD activity is finish!");
            } else {
                UnityAds.show(this.C, this.F, new UnityAdsShowOptions(), this.H);
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
