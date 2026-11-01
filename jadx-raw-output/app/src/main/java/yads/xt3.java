package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xt3 implements RewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dr2 f84689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp3 f84690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk f84691c;

    public final boolean equals(Object obj) {
        return (obj instanceof xt3) && ck.p.e(((xt3) obj).f84689a, this.f84689a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final List getAdAttributes() {
        List<gc> list = this.f84689a.f76788g;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        for (gc gcVar : list) {
            this.f84691c.getClass();
            arrayList.add(new kk(gcVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getInfo() {
        xp3 xp3Var = this.f84690b;
        c00 c00Var = this.f84689a.f76787f;
        xp3Var.getClass();
        return xp3.a(c00Var);
    }

    public final int hashCode() {
        return this.f84689a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        eu3 eu3Var = new eu3(rewardedAdEventListener);
        dr2 dr2Var = this.f84689a;
        dr2Var.f76784c.a();
        dr2Var.f76783b.f83943c = eu3Var;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        this.f84689a.a(activity);
    }

    public xt3(dr2 dr2Var, xp3 xp3Var, lk lkVar) {
        this.f84689a = dr2Var;
        this.f84690b = xp3Var;
        this.f84691c = lkVar;
    }
}
