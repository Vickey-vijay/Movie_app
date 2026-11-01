package f;

import android.app.Activity;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class z extends x {
    public MainBannerCallBack D;
    public NativeAd E;
    public d.b F;
    public AdInfo G = null;
    public long H = 0;
    public String I = "";
    public final d0 J = new d0(this);
    public final a K = new a(this);

    @Override // j.n0
    public final boolean t() {
        try {
            return System.currentTimeMillis() - this.H > 3600000;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return true;
        }
    }

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = p1Var;
        this.I = this.f61590k.f54038c;
        AdLog.d("unitID " + this.I);
        AbstractC4043il.IL1Iii(activity, new t(this, activity));
        Constant.addFragmentListener(activity, new b(this));
    }
}
