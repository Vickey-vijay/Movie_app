package yads;

import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class sd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f82619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj3 f82620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u41 f82621c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd3)) {
            return false;
        }
        sd3 sd3Var = (sd3) obj;
        return ck.p.e(this.f82619a, sd3Var.f82619a) && ck.p.e(this.f82620b, sd3Var.f82620b) && ck.p.e(this.f82621c, sd3Var.f82621c);
    }

    public final je3 a() {
        return (je3) nj.b0.f0(this.f82619a);
    }

    public final int hashCode() {
        int iHashCode = this.f82619a.hashCode() * 31;
        mj3 mj3Var = this.f82620b;
        int iHashCode2 = (iHashCode + (mj3Var == null ? 0 : mj3Var.hashCode())) * 31;
        u41 u41Var = this.f82621c;
        return iHashCode2 + (u41Var != null ? u41Var.hashCode() : 0);
    }

    public final String toString() {
        return "Video(videoAdsInfo=" + this.f82619a + ", videoSettings=" + this.f82620b + ", preview=" + this.f82621c + ")";
    }

    public sd3(List list, mj3 mj3Var, u41 u41Var) {
        this.f82619a = list;
        this.f82620b = mj3Var;
        this.f82621c = u41Var;
    }
}
