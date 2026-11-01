package f;

import android.app.Activity;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainBannerCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.p1;

/* JADX INFO: loaded from: classes4.dex */
public final class q extends x {
    public Activity D;
    public MainBannerCallBack E;
    public MBNativeAdvancedHandler F;
    public String G = "";
    public String H = "";
    public String I = "";
    public String J = "";
    public final l K = new l(this);

    @Override // f.x
    public final void B(Activity activity, p1 p1Var) {
        this.D = activity;
        this.E = p1Var;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54037b;
            this.G = str;
            String str2 = eVar.f54036a;
            this.H = str2;
            String str3 = eVar.f54038c;
            this.I = str3;
            String str4 = eVar.f54041f;
            this.J = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.H, this.G, new d(this, activity));
            Constant.addFragmentListener(activity, new a0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }
}
