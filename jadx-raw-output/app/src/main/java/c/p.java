package c;

import android.app.Activity;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import j.b2;
import sg.bigo.ads.api.RewardVideoAd;

/* JADX INFO: loaded from: classes9.dex */
public final class p extends f {
    public MainRewardVideoAdCallBack B;
    public RewardVideoAd C;
    public String D = "";
    public final h E = new h(this);

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = b2Var;
        i.e eVar = this.f61590k;
        String str = eVar.f54036a;
        this.D = eVar.f54038c;
        AbstractC4043il.IL1Iii(activity, str, new b0(this));
    }

    @Override // c.f
    public final void C() {
        try {
            RewardVideoAd rewardVideoAd = this.C;
            if (rewardVideoAd == null) {
                v("channelRewardAd is null");
            } else if (!rewardVideoAd.isExpired()) {
                this.C.show();
            } else {
                this.C.destroy();
                v("channelRewardAd is expired");
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }
}
