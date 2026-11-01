package yads;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class u5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5 f83374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f83375b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5)) {
            return false;
        }
        u5 u5Var = (u5) obj;
        return this.f83374a == u5Var.f83374a && ck.p.e(this.f83375b, u5Var.f83375b);
    }

    public final int hashCode() {
        return this.f83375b.hashCode() + (this.f83374a.hashCode() * 31);
    }

    public final String toString() {
        return "AdLoadingPhase(adLoadingPhaseType=" + this.f83374a + ", reportParameters=" + this.f83375b + ")";
    }

    public u5(v5 v5Var, Map map) {
        this.f83374a = v5Var;
        this.f83375b = map;
    }
}
