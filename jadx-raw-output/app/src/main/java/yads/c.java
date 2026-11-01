package yads;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f76072b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return ck.p.e(this.f76071a, cVar.f76071a) && ck.p.e(this.f76072b, cVar.f76072b);
    }

    public final String a() {
        return this.f76071a;
    }

    public final Set b() {
        return this.f76072b;
    }

    public final int hashCode() {
        return this.f76072b.hashCode() + (this.f76071a.hashCode() * 31);
    }

    public final String toString() {
        return "AbExperimentData(experiments=" + this.f76071a + ", triggeredTestIds=" + this.f76072b + ")";
    }

    public c(String str, Set set) {
        this.f76071a = str;
        this.f76072b = set;
    }
}
