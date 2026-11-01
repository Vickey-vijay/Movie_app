package e;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import sg.bigo.ads.api.NativeAd;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends c0 {
    public MainWdNativeAdCallback L;
    public NativeAd M;
    public String N = "";
    public final v O = new v(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = d0Var;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.N = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new o(this, activity));
    }
}
