package c;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.yk.e.AbstractC4043il;
import com.yk.e.I1I;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends f {
    public Activity B;
    public MainRewardVideoAdCallBack C;
    public String D = "";
    public String E = "";
    public final i F = new i(this);
    public final n G = new n(this);

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = activity;
        this.C = b2Var;
        i.e eVar = this.f61590k;
        this.D = eVar.f54036a;
        this.E = eVar.f54038c;
        Context applicationContext = activity.getApplicationContext();
        String str = this.D;
        j0 j0Var = new j0(this);
        if (!AbstractC4043il.IL1Iii) {
            UnityAds.initialize(applicationContext, str, false, new I1I(j0Var));
        } else {
            AdLog.i("unityAd has success");
            j0Var.onInitializationComplete();
        }
    }

    @Override // c.f
    public final void C() {
        UnityAds.show(this.B, this.E, new UnityAdsShowOptions(), this.G);
    }
}
