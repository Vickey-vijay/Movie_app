package nj;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f64734b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f64733a == d0Var.f64733a && ck.p.e(this.f64734b, d0Var.f64734b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f64733a) * 31;
        T t10 = this.f64734b;
        return iHashCode + (t10 == null ? 0 : t10.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f64733a + ", value=" + this.f64734b + ')';
    }

    public final int a() {
        return this.f64733a;
    }

    public final T b() {
        return this.f64734b;
    }

    public d0(int i10, T t10) {
        this.f64733a = i10;
        this.f64734b = t10;
    }
}
