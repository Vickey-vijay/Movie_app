package s5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes11.dex */
public final class e extends h implements Iterable<h> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<h> f67027b = new ArrayList();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof e) && ((e) obj).f67027b.equals(this.f67027b));
    }

    public int hashCode() {
        return this.f67027b.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<h> iterator() {
        return this.f67027b.iterator();
    }

    public void l(h hVar) {
        if (hVar == null) {
            hVar = i.f67028b;
        }
        this.f67027b.add(hVar);
    }
}
