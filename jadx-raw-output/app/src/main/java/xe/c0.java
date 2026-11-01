package xe;

import android.app.Activity;
import com.facebook.ads.InterstitialAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends i0 {
    public MainInterstitialAdCallBack C;
    public InterstitialAd D;
    public String E = "";
    public final f0 F = new f0(this);

    @Override // xe.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        try {
            this.E = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.E);
            AbstractC4043il.I1I(activity.getApplicationContext(), new p(this, activity));
            Constant.addFragmentListener(activity, new q(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }

    @Override // xe.i0
    public final void C() {
        try {
            InterstitialAd interstitialAd = this.D;
            if (interstitialAd == null) {
                v("interstitialAd is null");
            } else if (interstitialAd.isAdInvalidated()) {
                v("interstitialAd is invalidated");
            } else {
                this.D.show();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
