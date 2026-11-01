package dp;

import android.app.Activity;
import android.view.View;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;

/* JADX INFO: loaded from: classes11.dex */
public final class m0 extends u {
    public Activity F;
    public MainMaterialCallback G;
    public NativeBannerAd H;
    public View I;
    public String J = "";
    public final z K = new z(this);
    public final b L = new b(this);

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = activity;
        this.G = l1Var;
        try {
            this.J = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.J);
            AbstractC4043il.I1I(activity.getApplicationContext(), new f0(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }

    @Override // dp.u
    public final void C() {
        try {
            View view = this.I;
            if (view != null) {
                gl.h.a(view);
            }
            NativeBannerAd nativeBannerAd = this.H;
            if (nativeBannerAd != null) {
                nativeBannerAd.destroy();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
