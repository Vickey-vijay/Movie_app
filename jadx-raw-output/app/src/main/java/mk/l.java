package mk;

import ck.p;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class l<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f64574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64575b;

    public l(T t10, long j10) {
        this.f64574a = t10;
        this.f64575b = j10;
    }

    public /* synthetic */ l(Object obj, long j10, ck.i iVar) {
        this(obj, j10);
    }

    public final T a() {
        return this.f64574a;
    }

    public final long b() {
        return this.f64575b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p.e(this.f64574a, lVar.f64574a) && b.k(this.f64575b, lVar.f64575b);
    }

    public int hashCode() {
        T t10 = this.f64574a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + b.y(this.f64575b);
    }

    public String toString() {
        return "TimedValue(value=" + this.f64574a + ", duration=" + ((Object) b.K(this.f64575b)) + ')';
    }

    public final T c() {
        return this.f64574a;
    }
}
