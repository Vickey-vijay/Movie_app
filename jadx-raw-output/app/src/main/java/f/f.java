package f;

import android.app.Activity;
import com.facebook.ads.NativeAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends x {
    public Activity D;
    public MainBannerCallBack E;
    public NativeAd F;
    public String G = "";
    public final c0 H = new c0(this);

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = activity;
        this.E = p1Var;
        try {
            this.G = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.G);
            AbstractC4043il.I1I(activity.getApplicationContext(), new y(this, activity));
            Constant.addFragmentListener(activity, new w(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
