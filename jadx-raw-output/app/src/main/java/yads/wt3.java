package yads;

import com.yandex.mobile.ads.rewarded.Reward;

/* JADX INFO: loaded from: classes9.dex */
public final class wt3 implements Reward {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pq2 f84313a;

    public final boolean equals(Object obj) {
        return (obj instanceof wt3) && ck.p.e(((wt3) obj).f84313a, this.f84313a);
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final int getAmount() {
        return ((bw2) this.f84313a).f75997a;
    }

    @Override // com.yandex.mobile.ads.rewarded.Reward
    public final String getType() {
        return ((bw2) this.f84313a).f75998b;
    }

    public final int hashCode() {
        return this.f84313a.hashCode();
    }

    public wt3(pq2 pq2Var) {
        this.f84313a = pq2Var;
    }
}
