package e;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends c0 {
    public Activity L;
    public MainWdNativeAdCallback M;
    public String N = "";
    public String O = "";
    public final y P = new y(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = activity;
        this.M = d0Var;
        i.e eVar = this.f61590k;
        this.N = eVar.f54036a;
        this.O = eVar.f54038c;
        AdLog.d("appID " + this.N + ", posID " + this.O);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.N, new g0(this, activity));
    }
}
