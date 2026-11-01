package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public abstract class x extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f84389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f84390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f84391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f84392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f84393f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f84393f = a0Var;
        this.f84389b = obj;
        this.f84390c = collection;
        this.f84391d = xVar;
        this.f84392e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.f84391d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f84393f.f75344f.put(this.f84389b, this.f84390c);
        }
    }

    public final Collection b() {
        return this.f84390c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.f84391d;
        if (xVar != null) {
            xVar.c();
            if (this.f84391d.f84390c != this.f84392e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f84390c.isEmpty() || (collection = (Collection) this.f84393f.f75344f.get(this.f84389b)) == null) {
                return;
            }
            this.f84390c = collection;
        }
    }

    public final void d() {
        x xVar = this.f84391d;
        if (xVar != null) {
            xVar.d();
        } else if (this.f84390c.isEmpty()) {
            this.f84393f.f75344f.remove(this.f84389b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f84390c.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f84390c.isEmpty();
        boolean zAdd = this.f84390c.add(obj);
        if (zAdd) {
            this.f84393f.f75345g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f84390c.size();
        boolean zAddAll = this.f84390c.addAll(collection);
        if (zAddAll) {
            int size2 = this.f84390c.size();
            a0 a0Var = this.f84393f;
            a0Var.f75345g = (size2 - size) + a0Var.f75345g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.f84390c.size();
        if (size == 0) {
            return;
        }
        this.f84390c.clear();
        this.f84393f.f75345g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f84390c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f84390c.containsAll(collection);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f84390c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f84390c.remove(obj);
        if (zRemove) {
            this.f84393f.f75345g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f84390c.size();
        boolean zRemoveAll = this.f84390c.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f84390c.size();
            a0 a0Var = this.f84393f;
            a0Var.f75345g = (size2 - size) + a0Var.f75345g;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.f84390c.size();
        boolean zRetainAll = this.f84390c.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f84390c.size();
            a0 a0Var = this.f84393f;
            a0Var.f75345g = (size2 - size) + a0Var.f75345g;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f84390c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f84390c.toString();
    }
}
