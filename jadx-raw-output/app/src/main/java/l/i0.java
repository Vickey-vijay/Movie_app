package l;

import android.app.Activity;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainNativeAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends r {
    public Activity B;
    public MainNativeAdCallBack C;
    public MBNativeAdvancedHandler D;
    public int E;
    public int F;
    public String G = "";
    public String H = "";
    public String I = "";
    public String J = "";
    public final f0 K = new f0(this);

    @Override // l.r
    public final void B(Activity activity, int i10, int i11, j.z zVar) {
        this.B = activity;
        this.C = zVar;
        this.E = i10;
        this.F = i11;
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
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.H, this.G, new a(this, activity));
            Constant.addFragmentListener(activity, new a0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }
}
