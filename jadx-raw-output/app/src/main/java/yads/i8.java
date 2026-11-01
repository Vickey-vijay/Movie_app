package yads;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class i8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f78518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f78519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f78520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f78521e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj;
        return this.f78517a == i8Var.f78517a && this.f78518b == i8Var.f78518b && this.f78519c == i8Var.f78519c && ck.p.e(this.f78520d, i8Var.f78520d) && ck.p.e(this.f78521e, i8Var.f78521e);
    }

    public final int hashCode() {
        return this.f78521e.hashCode() + ((this.f78520d.hashCode() + ((Boolean.hashCode(this.f78519c) + ((Boolean.hashCode(this.f78518b) + (Integer.hashCode(this.f78517a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationPolicy(usagePercent=" + this.f78517a + ", enabled=" + this.f78518b + ", blockAdOnInternalError=" + this.f78519c + ", adNetworksCustomParameters=" + this.f78520d + ", enabledAdUnits=" + this.f78521e + ")";
    }

    public i8(int i10, boolean z10, boolean z11, LinkedHashMap linkedHashMap, Set set) {
        this.f78517a = i10;
        this.f78518b = z10;
        this.f78519c = z11;
        this.f78520d = linkedHashMap;
        this.f78521e = set;
    }
}
