package yads;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f77326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f77328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77329e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f77330f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f77331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f77332h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.f77325a == f8Var.f77325a && this.f77326b == f8Var.f77326b && ck.p.e(this.f77327c, f8Var.f77327c) && this.f77328d == f8Var.f77328d && this.f77329e == f8Var.f77329e && this.f77330f == f8Var.f77330f && ck.p.e(this.f77331g, f8Var.f77331g) && ck.p.e(this.f77332h, f8Var.f77332h);
    }

    public final boolean a() {
        return this.f77325a;
    }

    public final int hashCode() {
        return this.f77332h.hashCode() + ((this.f77331g.hashCode() + ((Boolean.hashCode(this.f77330f) + nd3.a(this.f77329e, (Long.hashCode(this.f77328d) + k4.a(this.f77327c, (Boolean.hashCode(this.f77326b) + (Boolean.hashCode(this.f77325a) * 31)) * 31, 31)) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdQualityVerificationConfiguration(enabled=" + this.f77325a + ", debug=" + this.f77326b + ", apiKey=" + this.f77327c + ", validationTimeoutInSec=" + this.f77328d + ", usagePercent=" + this.f77329e + ", blockAdOnInternalError=" + this.f77330f + ", enabledAdUnits=" + this.f77331g + ", adNetworksCustomParameters=" + this.f77332h + ")";
    }

    public f8(boolean z10, boolean z11, String str, long j10, int i10, boolean z12, Set set, Map map) {
        this.f77325a = z10;
        this.f77326b = z11;
        this.f77327c = str;
        this.f77328d = j10;
        this.f77329e = i10;
        this.f77330f = z12;
        this.f77331g = set;
        this.f77332h = map;
    }
}
