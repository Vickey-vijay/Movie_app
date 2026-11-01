package c;

import android.app.Activity;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.yk.e.AbstractC4043il;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.object.AdInfo;
import com.yk.e.util.AdLog;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 extends f {
    public Activity B;
    public MainRewardVideoAdCallBack C;
    public RewardedAd D;
    public AdInfo E;
    public long F = 0;
    public String G = "";
    public final g H = new g(this);
    public final c I = new c(this);

    @Override // j.n0
    public final boolean b() {
        return false;
    }

    @Override // j.n0
    public final boolean t() {
        try {
            return System.currentTimeMillis() - this.F > 3600000;
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            return true;
        }
    }

    @Override // c.f
    public final void B(Activity activity, int i10, b2 b2Var) {
        this.B = activity;
        this.C = b2Var;
        this.G = this.f61590k.f54038c;
        AdLog.d("unitID " + this.G);
        try {
            AbstractC4043il.IL1Iii(activity, new e(this, activity));
        } catch (Exception e10) {
            AdLog.e(e10.getMessage(), e10);
            q(e10);
        }
    }

    @Override // c.f
    public final void C() {
        RewardedAd rewardedAd = this.D;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(this.H);
            this.D.show(this.B, new j(this));
        }
    }

    public final void D(AdValue adValue) {
        String str;
        f(adValue.getValueMicros() / 1000000);
        this.f61605z = "admob_" + this.D.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName();
        AdInfo adInfo = new AdInfo();
        this.E = adInfo;
        adInfo.setRevenue(adValue.getValueMicros() / 1000000);
        int precisionType = adValue.getPrecisionType();
        if (precisionType != 0) {
            if (precisionType != 1) {
                if (precisionType != 3) {
                    str = "PUBLISHER_PROVIDED";
                } else {
                    str = "PRECISE";
                }
            } else {
                str = "ESTIMATED";
            }
        } else {
            str = "UNKNOWN";
        }
        this.E.setRevenuePrecision(str);
        String mediationAdapterClassName = this.D.getResponseInfo().getMediationAdapterClassName();
        this.E.setNetworkName(this.D.getResponseInfo().getLoadedAdapterResponseInfo().getAdSourceName() + "-" + mediationAdapterClassName);
        r(this.E);
    }

    public final void E() {
        this.F = System.currentTimeMillis();
        this.D.setOnPaidEventListener(new OnPaidEventListener() { // from class: c.h0
            @Override // com.google.android.gms.ads.OnPaidEventListener
            public final void onPaidEvent(AdValue adValue) {
                this.f5574a.D(adValue);
            }
        });
        this.C.onAdVideoCache();
    }
}
