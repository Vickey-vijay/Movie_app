package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes2.dex */
public final class va0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mx0 f83860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mx0 f83861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f83863e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || va0.class != obj.getClass()) {
            return false;
        }
        va0 va0Var = (va0) obj;
        return this.f83862d == va0Var.f83862d && this.f83863e == va0Var.f83863e && this.f83859a.equals(va0Var.f83859a) && this.f83860b.equals(va0Var.f83860b) && this.f83861c.equals(va0Var.f83861c);
    }

    public final int hashCode() {
        return this.f83861c.hashCode() + ((this.f83860b.hashCode() + k4.a(this.f83859a, (((this.f83862d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f83863e) * 31, 31)) * 31);
    }

    public va0(String str, mx0 mx0Var, mx0 mx0Var2, int i10, int i11) {
        boolean z10;
        if (i10 != 0 && i11 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        ni.a(z10);
        this.f83859a = ni.a(str);
        this.f83860b = (mx0) ni.a(mx0Var);
        this.f83861c = (mx0) ni.a(mx0Var2);
        this.f83862d = i10;
        this.f83863e = i11;
    }
}
