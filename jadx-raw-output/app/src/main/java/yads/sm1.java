package yads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes10.dex */
public final class sm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ym1 f82688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f82689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f82690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f82691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f82692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f82693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f82694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f82695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f82696i;

    public sm1(ym1 ym1Var, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14 = false;
        ni.a(!z13 || z11);
        ni.a(!z12 || z11);
        if (!z10 || (!z11 && !z12 && !z13)) {
            z14 = true;
        }
        ni.a(z14);
        this.f82688a = ym1Var;
        this.f82689b = j10;
        this.f82690c = j11;
        this.f82691d = j12;
        this.f82692e = j13;
        this.f82693f = z10;
        this.f82694g = z11;
        this.f82695h = z12;
        this.f82696i = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sm1.class != obj.getClass()) {
            return false;
        }
        sm1 sm1Var = (sm1) obj;
        return this.f82689b == sm1Var.f82689b && this.f82690c == sm1Var.f82690c && this.f82691d == sm1Var.f82691d && this.f82692e == sm1Var.f82692e && this.f82693f == sm1Var.f82693f && this.f82694g == sm1Var.f82694g && this.f82695h == sm1Var.f82695h && this.f82696i == sm1Var.f82696i && ib3.a(this.f82688a, sm1Var.f82688a);
    }

    public final int hashCode() {
        return ((((((((((((((((this.f82688a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f82689b)) * 31) + ((int) this.f82690c)) * 31) + ((int) this.f82691d)) * 31) + ((int) this.f82692e)) * 31) + (this.f82693f ? 1 : 0)) * 31) + (this.f82694g ? 1 : 0)) * 31) + (this.f82695h ? 1 : 0)) * 31) + (this.f82696i ? 1 : 0);
    }
}
