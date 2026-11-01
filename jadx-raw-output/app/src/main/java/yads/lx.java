package yads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes10.dex */
public abstract class lx extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f79955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final og2 f79956c;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        wd1 wd1Var = (wd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (wd1Var.hasNext()) {
            arrayList.add(wd1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        if (this.f79956c.apply(obj)) {
            return this.f79955b.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.f79955b;
        og2 og2Var = this.f79956c;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            og2Var.getClass();
            while (it.hasNext()) {
                if (og2Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        og2Var.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!og2Var.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i11; size--) {
                            if (og2Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i12 = i11 - 1; i12 >= i10; i12--) {
                            list.remove(i12);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i11; size2--) {
                            if (og2Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i13 = i11 - 1; i13 >= i10; i13--) {
                            list.remove(i13);
                        }
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection collection = this.f79955b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f79956c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f79955b;
        og2 og2Var = this.f79956c;
        Iterator it = collection.iterator();
        if (og2Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z10 = false;
        int i10 = 0;
        while (it.hasNext()) {
            if (og2Var.apply(it.next())) {
                if (i10 == -1) {
                    break;
                }
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f79955b.iterator();
        og2 og2Var = this.f79956c;
        it.getClass();
        og2Var.getClass();
        return new wd1(it, og2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f79955b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f79956c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f79955b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f79956c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f79955b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f79956c.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    public lx(Collection collection, og2 og2Var) {
        this.f79955b = collection;
        this.f79956c = og2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f79956c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f79955b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (contains(obj) && this.f79955b.remove(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        wd1 wd1Var = (wd1) iterator();
        ArrayList arrayList = new ArrayList();
        while (wd1Var.hasNext()) {
            arrayList.add(wd1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
