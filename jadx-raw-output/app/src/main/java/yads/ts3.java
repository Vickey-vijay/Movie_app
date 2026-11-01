package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ts3 implements InterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jd1 f83165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xp3 f83166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lk f83167c;

    public final boolean equals(Object obj) {
        return (obj instanceof ts3) && ck.p.e(((ts3) obj).f83165a, this.f83165a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final List getAdAttributes() {
        List<gc> listA = this.f83165a.f78999a.f82028f.a();
        ArrayList arrayList = new ArrayList(nj.t.v(listA, 10));
        for (gc gcVar : listA) {
            this.f83167c.getClass();
            arrayList.add(new kk(gcVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getInfo() {
        xp3 xp3Var = this.f83166b;
        c00 c00VarD = this.f83165a.f78999a.d();
        xp3Var.getClass();
        return xp3.a(c00VarD);
    }

    public final int hashCode() {
        return this.f83165a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        zs3 zs3Var = new zs3(interstitialAdEventListener);
        jd1 jd1Var = this.f83165a;
        jd1Var.f79001c.a();
        jd1Var.f79000b.f83074c = zs3Var;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        this.f83165a.a(activity);
    }

    public ts3(jd1 jd1Var, xp3 xp3Var, lk lkVar) {
        this.f83165a = jd1Var;
        this.f83166b = xp3Var;
        this.f83167c = lkVar;
    }
}
