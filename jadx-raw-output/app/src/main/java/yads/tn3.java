package yads;

/* JADX INFO: loaded from: classes11.dex */
public final class tn3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn3 f83119a;

    public /* synthetic */ tn3() {
        this(vn3.f83963e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn3) && this.f83119a == ((tn3) obj).f83119a;
    }

    public final int hashCode() {
        return this.f83119a.hashCode();
    }

    public final String toString() {
        return "WebViewAdSettings(cacheMode=" + this.f83119a + ")";
    }

    public tn3(vn3 vn3Var) {
        this.f83119a = vn3Var;
    }
}
