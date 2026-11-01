package k3;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4.r.a f62163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f62165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f62167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f62168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f62169g;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i0.class != obj.getClass()) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f62164b == i0Var.f62164b && this.f62165c == i0Var.f62165c && this.f62166d == i0Var.f62166d && this.f62167e == i0Var.f62167e && this.f62168f == i0Var.f62168f && this.f62169g == i0Var.f62169g && g5.k0.c(this.f62163a, i0Var.f62163a);
    }

    public i0 a(long j10) {
        return j10 == this.f62165c ? this : new i0(this.f62163a, this.f62164b, j10, this.f62166d, this.f62167e, this.f62168f, this.f62169g);
    }

    public i0 b(long j10) {
        return j10 == this.f62164b ? this : new i0(this.f62163a, j10, this.f62165c, this.f62166d, this.f62167e, this.f62168f, this.f62169g);
    }

    public int hashCode() {
        return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f62163a.hashCode()) * 31) + ((int) this.f62164b)) * 31) + ((int) this.f62165c)) * 31) + ((int) this.f62166d)) * 31) + ((int) this.f62167e)) * 31) + (this.f62168f ? 1 : 0)) * 31) + (this.f62169g ? 1 : 0);
    }

    public i0(k4.r.a aVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11) {
        this.f62163a = aVar;
        this.f62164b = j10;
        this.f62165c = j11;
        this.f62166d = j12;
        this.f62167e = j13;
        this.f62168f = z10;
        this.f62169g = z11;
    }
}
