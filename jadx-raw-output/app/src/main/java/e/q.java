package e;

import android.app.Activity;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainWdNativeAdCallback;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends c0 {
    public Activity L;
    public MainWdNativeAdCallback M;
    public MBNativeAdvancedHandler N;
    public String O = "";
    public String P = "";
    public String Q = "";
    public String R = "";
    public final i0 S = new i0(this);

    @Override // e.c0
    public final void B(Activity activity, j.d0 d0Var) {
        this.L = activity;
        this.M = d0Var;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54037b;
            this.O = str;
            String str2 = eVar.f54036a;
            this.P = str2;
            String str3 = eVar.f54038c;
            this.Q = str3;
            String str4 = eVar.f54041f;
            this.R = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.P, this.O, new z(this, activity));
            Constant.addFragmentListener(activity, new f0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }
}
