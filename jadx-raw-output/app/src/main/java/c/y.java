package c;

import android.app.Activity;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.yk.e.callBack.MainRewardVideoAdCallBack;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import gl.v0;
import j.b2;

/* JADX INFO: loaded from: classes9.dex */
public final class y implements IComCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f5595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainRewardVideoAdCallBack f5596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k0 f5597c;

    public y(k0 k0Var, Activity activity, b2 b2Var) {
        this.f5597c = k0Var;
        this.f5595a = activity;
        this.f5596b = b2Var;
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onFailed(int i10, String str) {
        this.f5597c.v(str);
    }

    @Override // com.yk.e.inf.IComCallback
    public final void onSuccess() {
        MaxAd maxAd;
        k0 k0Var = this.f5597c;
        k0Var.C = MaxRewardedAd.getInstance(k0Var.F, this.f5595a);
        k0 k0Var2 = this.f5597c;
        MaxRewardedAd maxRewardedAd = k0Var2.C;
        if (maxRewardedAd == null) {
            k0Var2.a("rewardedAd is null");
            return;
        }
        maxRewardedAd.setListener(k0Var2.G);
        v0 v0VarA = v0.a();
        String str = this.f5597c.F;
        synchronized (v0VarA) {
            MaxAd maxAd2 = null;
            try {
                maxAd = (MaxAd) v0VarA.f53600a.get(str);
                if (maxAd != null) {
                    try {
                        v0VarA.f53600a.remove(str);
                    } catch (Exception e10) {
                        e = e10;
                        maxAd2 = maxAd;
                        AdLog.e(e.getMessage(), e);
                        maxAd = maxAd2;
                    }
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        if (!this.f5597c.C.isReady() || maxAd == null) {
            this.f5597c.C.loadAd();
            return;
        }
        AdLog.i("applovin ad has ready");
        k0 k0Var3 = this.f5597c;
        k0Var3.D = true;
        k0Var3.f(maxAd.getRevenue());
        this.f5597c.f61605z = "applovin_" + maxAd.getNetworkName();
        v0.a().b(this.f5597c.F, maxAd);
        this.f5596b.onAdVideoCache();
    }
}
