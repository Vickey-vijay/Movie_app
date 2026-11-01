package n6;

import java.util.Objects;

/* JADX INFO: compiled from: ExpandedPair.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6.b f64685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m6.b f64686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m6.c f64687c;

    public m6.c a() {
        return this.f64687c;
    }

    public m6.b b() {
        return this.f64685a;
    }

    public m6.b c() {
        return this.f64686b;
    }

    public boolean d() {
        return this.f64686b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f64685a, bVar.f64685a) && Objects.equals(this.f64686b, bVar.f64686b) && Objects.equals(this.f64687c, bVar.f64687c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f64685a) ^ Objects.hashCode(this.f64686b)) ^ Objects.hashCode(this.f64687c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f64685a);
        sb2.append(" , ");
        sb2.append(this.f64686b);
        sb2.append(" : ");
        m6.c cVar = this.f64687c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }

    public b(m6.b bVar, m6.b bVar2, m6.c cVar) {
        this.f64685a = bVar;
        this.f64686b = bVar2;
        this.f64687c = cVar;
    }
}
