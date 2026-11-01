package l;

import android.app.Activity;
import com.facebook.ads.NativeBannerAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends r {
    public Activity B;
    public MainNativeAdCallBack C;
    public NativeBannerAd D;
    public int E;
    public int F;
    public String G = "";
    public final b0 H = new b0(this);

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = activity;
        this.C = zVar;
        this.E = i10;
        this.F = i11;
        try {
            this.G = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.G);
            AbstractC4043il.I1I(activity.getApplicationContext(), new j(this, activity));
            Constant.addFragmentListener(activity, new o(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
