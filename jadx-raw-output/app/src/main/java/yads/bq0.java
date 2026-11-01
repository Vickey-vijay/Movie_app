package yads;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes11.dex */
public final class bq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RectF f75931b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq0)) {
            return false;
        }
        bq0 bq0Var = (bq0) obj;
        return this.f75930a == bq0Var.f75930a && ck.p.e(this.f75931b, bq0Var.f75931b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f75930a) * 31;
        RectF rectF = this.f75931b;
        return iHashCode + (rectF == null ? 0 : rectF.hashCode());
    }

    public final String toString() {
        return "Exposure(exposedPercentage=" + this.f75930a + ", visibleRectangle=" + this.f75931b + ")";
    }

    public bq0(int i10, RectF rectF) {
        this.f75930a = i10;
        this.f75931b = rectF;
    }
}
