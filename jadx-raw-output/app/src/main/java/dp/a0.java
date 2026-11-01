package dp;

import android.app.Activity;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.l1;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 extends u {
    public MainMaterialCallback F;
    public NativeAd G;
    public AdInfo H;
    public d.b I;
    public String J = "";
    public final f K = new f(this);
    public final h L = new h(this);

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = l1Var;
        this.J = this.f61590k.f54038c;
        AdLog.d("unitID " + this.J);
        AbstractC4043il.IL1Iii(activity, new k(this, activity));
        Constant.addFragmentListener(activity, new j0(this));
    }

    @Override // dp.u
    public final void C() {
        try {
            d.b bVar = this.I;
            if (bVar != null) {
                gl.h.a(bVar.f51752a);
            }
            NativeAd nativeAd = this.G;
            if (nativeAd != null) {
                nativeAd.destroy();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
    }
}
