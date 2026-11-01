package yads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes11.dex */
public class z extends x implements List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f85158g;

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, List list, x xVar) {
        super(a0Var, obj, list, xVar);
        this.f85158g = a0Var;
    }

    public final List e() {
        return (List) this.f84390c;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean zIsEmpty = this.f84390c.isEmpty();
        ((List) this.f84390c).add(i10, obj);
        this.f85158g.f75345g++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f84390c.size();
        boolean zAddAll = ((List) this.f84390c).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f84390c.size();
            a0 a0Var = this.f85158g;
            a0Var.f75345g = (size2 - size) + a0Var.f75345g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f84390c).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f84390c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f84390c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new y(this, i10);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = ((List) this.f84390c).remove(i10);
        this.f85158g.f75345g--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f84390c).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        a0 a0Var = this.f85158g;
        Object obj = this.f84389b;
        List listSubList = ((List) this.f84390c).subList(i10, i11);
        x xVar = this.f84391d;
        if (xVar == null) {
            xVar = this;
        }
        a0Var.getClass();
        if (listSubList instanceof RandomAccess) {
            return new t(a0Var, obj, listSubList, xVar);
        }
        return new z(a0Var, obj, listSubList, xVar);
    }
}
