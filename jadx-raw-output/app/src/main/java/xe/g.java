package xe;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import sg.bigo.ads.api.InterstitialAd;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends i0 {
    public MainInterstitialAdCallBack C;
    public InterstitialAd D;
    public String E = "";
    public final a0 F = new a0(this);

    @Override // xe.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.E = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new r(this));
    }

    @Override // xe.i0
    public final void C() {
        try {
            InterstitialAd interstitialAd = this.D;
            if (interstitialAd == null) {
                v("channelAd is null");
            } else if (!interstitialAd.isExpired()) {
                this.D.show();
            } else {
                this.D.destroy();
                v("channelAd is expired");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
