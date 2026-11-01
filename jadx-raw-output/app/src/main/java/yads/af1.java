package yads;

/* JADX INFO: loaded from: classes.dex */
public final class af1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f75497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f75498b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1Var = (af1) obj;
        return ck.p.e(this.f75497a, af1Var.f75497a) && ck.p.e(this.f75498b, af1Var.f75498b);
    }

    public final int hashCode() {
        Integer num = this.f75497a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f75498b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "LayoutParamsSize(width=" + this.f75497a + ", height=" + this.f75498b + ")";
    }

    public af1(Integer num, Integer num2) {
        this.f75497a = num;
        this.f75498b = num2;
    }
}
