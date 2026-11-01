package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class h4 extends im3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f78053d = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m4 f78054c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ck.p.e(h4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        ck.p.h(obj, "null cannot be cast to non-null type com.monetization.ads.base.AdFetchError");
        return this.f78054c == ((h4) obj).f78054c;
    }

    public final int hashCode() {
        return this.f78054c.hashCode();
    }

    public h4(m4 m4Var, e82 e82Var) {
        super(e82Var);
        this.f78054c = m4Var;
    }
}
