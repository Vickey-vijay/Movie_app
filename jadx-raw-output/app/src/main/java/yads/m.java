package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f80003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f80004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f80005d;

    public m(n nVar) {
        this.f80005d = nVar;
        this.f80003b = nVar.f80487d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80003b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f80003b.next();
        this.f80004c = (Collection) entry.getValue();
        return this.f80005d.a(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!(this.f80004c != null)) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.f80003b.remove();
        this.f80005d.f80488e.f75345g -= this.f80004c.size();
        this.f80004c.clear();
        this.f80004c = null;
    }
}
