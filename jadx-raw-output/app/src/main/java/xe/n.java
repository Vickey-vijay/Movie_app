package xe;

import android.app.Activity;
import android.content.Context;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.yk.e.AbstractC4043il;
import com.yk.e.I1I;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends i0 {
    public Activity C;
    public MainInterstitialAdCallBack D;
    public String E = "";
    public String F = "";
    public final h0 G = new h0(this);
    public final h H = new h(this);

    @Override // xe.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = activity;
        this.D = pVar;
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

    @Override // xe.i0
    public final void C() {
        UnityAds.show(this.C, this.F, new UnityAdsShowOptions(), this.H);
    }
}
