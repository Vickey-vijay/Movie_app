package l;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends r {
    public MainNativeAdCallBack B;
    public d.q C;
    public int D;
    public int E;
    public String F = "";
    public String G = "";
    public final x H = new x(this);
    public final n I = new n(this);

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = zVar;
        this.D = i10;
        this.E = i11;
        i.e eVar = this.f61590k;
        this.F = eVar.f54036a;
        this.G = eVar.f54038c;
        AdLog.d("appID " + this.F + ", posID " + this.G);
        this.C = new d.q(activity);
        AbstractC4043il.IL1Iii(activity.getApplicationContext(), new s(this, activity), this.F);
    }
}
