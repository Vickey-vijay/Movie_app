package m6;

/* JADX INFO: compiled from: DataCharacter.java */
/* JADX INFO: loaded from: classes11.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64151b;

    public final int a() {
        return this.f64151b;
    }

    public final int b() {
        return this.f64150a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f64150a == bVar.f64150a && this.f64151b == bVar.f64151b;
    }

    public final int hashCode() {
        return this.f64150a ^ this.f64151b;
    }

    public final String toString() {
        return this.f64150a + "(" + this.f64151b + ')';
    }

    public b(int i10, int i11) {
        this.f64150a = i10;
        this.f64151b = i11;
    }
}
