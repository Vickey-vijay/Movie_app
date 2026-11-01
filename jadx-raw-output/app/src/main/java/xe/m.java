package xe;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainInterstitialAdCallBack;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends i0 {
    public MainInterstitialAdCallBack C;
    public MBNewInterstitialHandler D;
    public String E = "";
    public String F = "";
    public String G = "";
    public String H = "";
    public final o I = new o(this);

    @Override // j.n0
    public final boolean t() {
        try {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.D;
            if (mBNewInterstitialHandler != null) {
                return true ^ mBNewInterstitialHandler.isReady();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return true;
    }

    @Override // xe.i0
    public final void B(Activity activity, j.p pVar) {
        this.C = pVar;
        try {
            i.e eVar = this.f61590k;
            String str = eVar.f54037b;
            this.E = str;
            String str2 = eVar.f54036a;
            this.F = str2;
            String str3 = eVar.f54038c;
            this.G = str3;
            String str4 = eVar.f54041f;
            this.H = str4;
            AdLog.i("appKey " + str + ", appID " + str2 + ", placementId " + str3 + ", unitID " + str4);
            AbstractC4043il.IL1Iii(activity.getApplicationContext(), this.F, this.E, new b0(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // xe.i0
    public final void C() {
        try {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.D;
            if (mBNewInterstitialHandler == null) {
                v("ad instance is null");
            } else if (mBNewInterstitialHandler.isReady()) {
                this.D.show();
            } else {
                v("ad not ready");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            v(e10.getMessage());
        }
    }
}
