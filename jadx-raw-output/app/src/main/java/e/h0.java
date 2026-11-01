package e;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes10.dex */
public final class h0 extends c0 {
    public Activity L;
    public MainWdNativeAdCallback M;
    public d.q N;
    public String O = "";
    public String P = "";
    public final l Q = new l(this);
    public final k R = new k(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = activity;
        this.M = d0Var;
        i.e eVar = this.f61590k;
        this.O = eVar.f54036a;
        this.P = eVar.f54038c;
        AdLog.d("appID " + this.O + ", posID " + this.P);
        this.N = new d.q(activity);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), new w(this, activity), this.O);
    }
}
