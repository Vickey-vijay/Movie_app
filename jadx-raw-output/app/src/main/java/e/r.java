package e;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends c0 {
    public Activity L;
    public MainWdNativeAdCallback M;
    public NativeBannerAd N;
    public String O = "";
    public final x P = new x(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = activity;
        this.M = d0Var;
        try {
            this.O = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.O);
            AbstractC4043il.I1I(activity.getApplicationContext(), new m(this, activity));
            Constant.addFragmentListener(activity, new n(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
