package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f80874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f80875c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Collection f80876d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f80877e = yd1.INSTANCE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f80878f;

    public abstract Object a(Object obj, Object obj2);

    public o(a0 a0Var) {
        this.f80878f = a0Var;
        this.f80874b = a0Var.f75344f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f80874b.hasNext() || this.f80877e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f80877e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f80874b.next();
            this.f80875c = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f80876d = collection;
            this.f80877e = collection.iterator();
        }
        return a(this.f80875c, this.f80877e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f80877e.remove();
        Collection collection = this.f80876d;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f80874b.remove();
        }
        this.f80878f.f75345g--;
    }
}
