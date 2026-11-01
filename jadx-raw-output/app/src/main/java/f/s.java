package f;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends x {
    public MainBannerCallBack D;
    public d.q E;
    public String F = "";
    public String G = "";
    public final e H = new e(this);
    public final b0 I = new b0(this);

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = p1Var;
        i.e eVar = this.f61590k;
        this.F = eVar.f54036a;
        this.G = eVar.f54038c;
        AdLog.d("appID " + this.F + ", posID " + this.G);
        this.E = new d.q(activity);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), new c(this, activity), this.F);
    }
}
