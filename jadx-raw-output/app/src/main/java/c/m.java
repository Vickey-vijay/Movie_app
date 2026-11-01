package c;

import android.app.Activity;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends f {
    public MainRewardVideoAdCallBack B;
    public MBRewardVideoHandler C;
    public String D = "";
    public String E = "";
    public String F = "";
    public String G = "";
    public final o H = new o(this);

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = b2Var;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54037b;
            this.D = str;
            String str2 = eVar.f54036a;
            this.E = str2;
            String str3 = eVar.f54038c;
            this.F = str3;
            String str4 = eVar.f54041f;
            this.G = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.E, this.D, new c0(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }

    @Override // c.f
    public final void C() {
        try {
            MBRewardVideoHandler mBRewardVideoHandler = this.C;
            if (mBRewardVideoHandler == null) {
                v("ad instance is null");
            } else if (mBRewardVideoHandler.isReady()) {
                this.C.show();
            } else {
                v("ad not ready");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }
}
