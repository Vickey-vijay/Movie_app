package gj;

import com.ironsource.C3426d4;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: Timed.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f53429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f53430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f53431c;

    public long a() {
        return this.f53430b;
    }

    public T b() {
        return this.f53429a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return qi.a.c(this.f53429a, bVar.f53429a) && this.f53430b == bVar.f53430b && qi.a.c(this.f53431c, bVar.f53431c);
    }

    public int hashCode() {
        T t10 = this.f53429a;
        int iHashCode = t10 != null ? t10.hashCode() : 0;
        long j10 = this.f53430b;
        return (((iHashCode * 31) + ((int) (j10 ^ (j10 >>> 31)))) * 31) + this.f53431c.hashCode();
    }

    public String toString() {
        return "Timed[time=" + this.f53430b + ", unit=" + this.f53431c + ", value=" + this.f53429a + C3426d4.j.f28588e;
    }

    public b(T t10, long j10, TimeUnit timeUnit) {
        this.f53429a = t10;
        this.f53430b = j10;
        this.f53431c = (TimeUnit) qi.a.e(timeUnit, "unit is null");
    }
}
