package yads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class n extends ri1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f80487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a0 f80488e;

    public n(a0 a0Var, Map map) {
        this.f80488e = a0Var;
        this.f80487d = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.f80487d;
        a0 a0Var = this.f80488e;
        Map map2 = a0Var.f75344f;
        if (map != map2) {
            m mVar = new m(this);
            while (mVar.hasNext()) {
                mVar.next();
                mVar.remove();
            }
            return;
        }
        Iterator it = map2.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        a0Var.f75344f.clear();
        a0Var.f75345g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f80487d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f80487d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f80487d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        i iVar = (i) this.f80488e;
        iVar.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new t(iVar, obj, list, null) : new z(iVar, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f80487d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        a0 a0Var = this.f80488e;
        q qVar = a0Var.f76855c;
        if (qVar != null) {
            return qVar;
        }
        q qVarC = ((sx1) a0Var).c();
        a0Var.f76855c = qVarC;
        return qVarC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f80487d.remove(obj);
        if (collection == null) {
            return null;
        }
        List list = (List) ((sx1) this.f80488e).f82825h.get();
        list.addAll(collection);
        this.f80488e.f75345g -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f80487d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f80487d.toString();
    }

    public final k51 a(Map.Entry entry) {
        Object zVar;
        Object key = entry.getKey();
        a0 a0Var = this.f80488e;
        Collection collection = (Collection) entry.getValue();
        i iVar = (i) a0Var;
        iVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            zVar = new t(iVar, key, list, null);
        } else {
            zVar = new z(iVar, key, list, null);
        }
        return new k51(key, zVar);
    }
}
