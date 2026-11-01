package c;

import android.app.Activity;
import android.os.Handler;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes10.dex */
public final class k0 extends f {
    public MainRewardVideoAdCallBack B;
    public MaxRewardedAd C;
    public boolean D = false;
    public boolean E = false;
    public String F = "";
    public final u G = new u(this);

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // j.n0
    public final boolean t() {
        try {
            MaxRewardedAd maxRewardedAd = this.C;
            if (maxRewardedAd != null) {
                return true ^ maxRewardedAd.isReady();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
        }
        return true;
    }

    @Override // c.f
    public final void C() {
        try {
            MaxRewardedAd maxRewardedAd = this.C;
            if (maxRewardedAd == null) {
                v("ChannelAD is null!");
            } else if (maxRewardedAd.isReady()) {
                this.C.showAd(this.f61585f);
            } else {
                v("ChannelAD is not ready!");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // j.n0
    public final void v(String str) {
        if (this.E) {
            return;
        }
        this.E = true;
        super.v(str);
    }

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = b2Var;
        try {
            this.F = this.f61590k.f54038c;
            AdLog.d("unitID " + this.F);
            AbstractC4043il.ILil(activity.getApplicationContext(), new y(this, activity, b2Var));
            if (!this.f61598s) {
                new Handler().postDelayed(new k(this), this.f61603x);
            } else {
                AdLog.d("refreshAdCache, do not turn on the countdown");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
