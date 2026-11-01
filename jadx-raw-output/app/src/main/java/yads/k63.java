package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class k63 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sj2 f79316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f79317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ic0 f79318c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yv f79319d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lw f79320e;

    public /* synthetic */ k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar) {
        this(sj2Var, u2Var, ic0Var, yvVar, new lw());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k63)) {
            return false;
        }
        k63 k63Var = (k63) obj;
        return ck.p.e(this.f79316a, k63Var.f79316a) && ck.p.e(this.f79317b, k63Var.f79317b) && ck.p.e(this.f79318c, k63Var.f79318c) && ck.p.e(this.f79319d, k63Var.f79319d) && ck.p.e(this.f79320e, k63Var.f79320e);
    }

    public final yv a() {
        return this.f79319d;
    }

    public final lw b() {
        return this.f79320e;
    }

    public final ic0 c() {
        return this.f79318c;
    }

    public final sj2 d() {
        return this.f79316a;
    }

    public final int hashCode() {
        return this.f79320e.hashCode() + ((this.f79319d.hashCode() + ((this.f79318c.hashCode() + ((this.f79317b.hashCode() + (this.f79316a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TimeProviderContainer(progressIncrementer=" + this.f79316a + ", adBlockDurationProvider=" + this.f79317b + ", defaultContentDelayProvider=" + this.f79318c + ", closableAdChecker=" + this.f79319d + ", closeTimerProgressIncrementer=" + this.f79320e + ")";
    }

    public k63(sj2 sj2Var, u2 u2Var, ic0 ic0Var, yv yvVar, lw lwVar) {
        this.f79316a = sj2Var;
        this.f79317b = u2Var;
        this.f79318c = ic0Var;
        this.f79319d = yvVar;
        this.f79320e = lwVar;
    }
}
