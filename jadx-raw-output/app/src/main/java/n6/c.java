package n6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ExpandedRow.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<b> f64688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f64690c;

    public List<b> a() {
        return this.f64688a;
    }

    public int b() {
        return this.f64689b;
    }

    public boolean c(List<b> list) {
        return this.f64688a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f64688a.equals(cVar.f64688a) && this.f64690c == cVar.f64690c;
    }

    public int hashCode() {
        return this.f64688a.hashCode() ^ Boolean.valueOf(this.f64690c).hashCode();
    }

    public String toString() {
        return "{ " + this.f64688a + " }";
    }

    public c(List<b> list, int i10, boolean z10) {
        this.f64688a = new ArrayList(list);
        this.f64689b = i10;
        this.f64690c = z10;
    }
}
