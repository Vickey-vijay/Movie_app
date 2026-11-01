package yads;

import android.net.Uri;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes11.dex */
public final class pl2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f81458d;

    public final pl2 a(pl2 pl2Var, String str) {
        String strA = oa3.a(str, this.f81457c);
        if (pl2Var != null && strA.equals(oa3.a(str, pl2Var.f81457c))) {
            long j10 = this.f81456b;
            if (j10 != -1) {
                long j11 = this.f81455a;
                if (j11 + j10 == pl2Var.f81455a) {
                    long j12 = pl2Var.f81456b;
                    return new pl2(strA, j11, j12 != -1 ? j10 + j12 : -1L);
                }
            }
            long j13 = pl2Var.f81456b;
            if (j13 != -1) {
                long j14 = pl2Var.f81455a;
                if (j14 + j13 == this.f81455a) {
                    return new pl2(strA, j14, j10 == -1 ? -1L : j13 + j10);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pl2.class != obj.getClass()) {
            return false;
        }
        pl2 pl2Var = (pl2) obj;
        return this.f81455a == pl2Var.f81455a && this.f81456b == pl2Var.f81456b && this.f81457c.equals(pl2Var.f81457c);
    }

    public final int hashCode() {
        if (this.f81458d == 0) {
            this.f81458d = this.f81457c.hashCode() + ((((((int) this.f81455a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) this.f81456b)) * 31);
        }
        return this.f81458d;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.f81457c + ", start=" + this.f81455a + ", length=" + this.f81456b + ")";
    }

    public pl2(String str, long j10, long j11) {
        this.f81457c = str == null ? "" : str;
        this.f81455a = j10;
        this.f81456b = j11;
    }

    public final Uri a(String str) {
        return Uri.parse(oa3.a(str, this.f81457c));
    }
}
