package yads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
public final class jy2 extends iy2 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f79955b).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f79955b.iterator();
        og2 og2Var = this.f79956c;
        it.getClass();
        og2Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (og2Var.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new jy2(((SortedSet) this.f79955b).headSet(obj), this.f79956c);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f79955b;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f79956c.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new jy2(((SortedSet) this.f79955b).subSet(obj, obj2), this.f79956c);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new jy2(((SortedSet) this.f79955b).tailSet(obj), this.f79956c);
    }

    public jy2(SortedSet sortedSet, og2 og2Var) {
        super(sortedSet, og2Var);
    }
}
