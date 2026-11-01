package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class d0 extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f76496b;

    public d0(sx1 sx1Var) {
        this.f76496b = sx1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a0 a0Var = (a0) this.f76496b;
        Iterator it = a0Var.f75344f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f75344f.clear();
        a0Var.f75345g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = ((qi1) this.f76496b.a().values()).iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.f76496b;
        a0Var.getClass();
        return new j(a0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ((a0) this.f76496b).f75345g;
    }
}
