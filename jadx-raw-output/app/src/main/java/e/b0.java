package e;

import android.app.Activity;
import com.google.android.gms.ads.nativead.NativeAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends c0 {
    public MainWdNativeAdCallback L;
    public NativeAd M;
    public d.b N;
    public AdInfo P;
    public String O = "";
    public final d Q = new d(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = d0Var;
        this.O = this.f61590k.f54038c;
        AdLog.d("unitID " + this.O);
        AbstractC4043il.IL1Iii(activity, new c(this, activity));
        Constant.addFragmentListener(activity, new i(this));
    }
}
