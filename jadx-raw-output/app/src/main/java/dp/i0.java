package dp;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainMaterialCallback;
import com.yk.e.util.AdLog;
import j.l1;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes10.dex */
public final class i0 extends u {
    public MainMaterialCallback F;
    public NativeAd G;
    public d.a H;
    public String I = "";
    public final r J = new r(this);
    public final t K = new t(this);

    @Override // dp.u
    public final void B(Activity activity, l1 l1Var) {
        this.F = l1Var;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.I = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new i(this, activity));
    }

    @Override // dp.u
    public final void C() {
        try {
            d.a aVar = this.H;
            if (aVar != null) {
                gl.h.a(aVar.f51749d);
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
