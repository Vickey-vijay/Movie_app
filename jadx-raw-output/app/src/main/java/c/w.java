package c;

import android.app.Activity;
import com.facebook.ads.RewardedVideoAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.util.AdLog;
import com.yk.e.util.Constant;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends f {
    public MainRewardVideoAdCallBack B;
    public RewardedVideoAd C;
    public String D = "";
    public final d0 E = new d0(this);

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = b2Var;
        try {
            this.D = this.f61590k.f54038c;
            AdLog.i("placement_id " + this.D);
            AbstractC4043il.I1I(activity.getApplicationContext(), new r(this, activity));
            Constant.addFragmentListener(activity, new g0(this));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }

    @Override // c.f
    public final void C() {
        try {
            RewardedVideoAd rewardedVideoAd = this.C;
            if (rewardedVideoAd == null) {
                v("interstitialAd is null");
                return;
            }
            if (!rewardedVideoAd.isAdLoaded()) {
                v("interstitialAd is not loaded successfully");
            } else if (this.C.isAdInvalidated()) {
                v("interstitialAd is invalidated");
            } else {
                this.C.show();
            }
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            x(e10.getMessage());
        }
    }
}
