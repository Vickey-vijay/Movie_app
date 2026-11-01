package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class bw2 implements pq2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75998b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw2)) {
            return false;
        }
        bw2 bw2Var = (bw2) obj;
        return this.f75997a == bw2Var.f75997a && ck.p.e(this.f75998b, bw2Var.f75998b);
    }

    public final int hashCode() {
        return this.f75998b.hashCode() + (Integer.hashCode(this.f75997a) * 31);
    }

    public final String toString() {
        return "SdkReward(amount=" + this.f75997a + ", type=" + this.f75998b + ")";
    }

    public bw2(int i10, String str) {
        this.f75997a = i10;
        this.f75998b = str;
    }
}
