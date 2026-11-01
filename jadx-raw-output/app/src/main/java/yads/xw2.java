package yads;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes11.dex */
public final class xw2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final xw2 f84726c = new xw2(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f84728b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xw2.class != obj.getClass()) {
            return false;
        }
        xw2 xw2Var = (xw2) obj;
        return this.f84727a == xw2Var.f84727a && this.f84728b == xw2Var.f84728b;
    }

    public final int hashCode() {
        return (((int) this.f84727a) * 31) + ((int) this.f84728b);
    }

    public final String toString() {
        return "[timeUs=" + this.f84727a + ", position=" + this.f84728b + C3426d4.j.f28588e;
    }

    public xw2(long j10, long j11) {
        this.f84727a = j10;
        this.f84728b = j11;
    }
}
