package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map.Entry f81184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Iterator f81185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f81186d;

    public p(q qVar, Iterator it) {
        this.f81186d = qVar;
        this.f81185c = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81185c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f81185c.next();
        this.f81184b = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Map.Entry entry = this.f81184b;
        if (!(entry != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        Collection collection = (Collection) entry.getValue();
        this.f81185c.remove();
        this.f81186d.f81667c.f75345g -= collection.size();
        collection.clear();
        this.f81184b = null;
    }
}
