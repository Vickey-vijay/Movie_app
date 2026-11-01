package xe;

import android.app.Activity;
import com.vungle.ads.InterstitialAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends i0 {
    public Activity C;
    public MainInterstitialAdCallBack D;
    public InterstitialAd G;
    public boolean E = false;
    public boolean F = false;
    public String H = "";
    public String I = "";

    @Override // xe.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = activity;
        this.D = pVar;
        i.e eVar = this.f61590k;
        this.H = eVar.f54036a;
        this.I = eVar.f54038c;
        AdLog.d("appID " + this.H + ", posID " + this.I);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.H, new p0(this, activity));
    }

    @Override // xe.i0
    public final void C() {
        try {
            InterstitialAd interstitialAd = this.G;
            if (interstitialAd != null && interstitialAd.canPlayAd().booleanValue()) {
                this.G.play(this.C);
            } else if (!this.F) {
                super.v("interstitialAd cannot play!");
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
