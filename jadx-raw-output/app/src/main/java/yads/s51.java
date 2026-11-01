package yads;

import com.ironsource.G5;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class s51 implements Map, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient um2 f82526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient vm2 f82527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient wm2 f82528d;

    /* JADX WARN: Multi-variable type inference failed */
    public static s51 a(HashMap map) {
        if ((map instanceof s51) && !(map instanceof SortedMap)) {
            s51 s51Var = (s51) map;
            s51Var.getClass();
            return s51Var;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        q51 q51Var = new q51(z10 ? setEntrySet.size() : 4);
        if (z10) {
            q51Var.a(setEntrySet.size());
        }
        for (Map.Entry entry : setEntrySet) {
            q51Var.a(entry.getKey(), entry.getValue());
        }
        return xm2.a(q51Var.f81713b, q51Var.f81712a);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((xm2) this).size() == 0;
    }

    public final String toString() {
        int size = ((xm2) this).size();
        kx.a(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append(G5.T);
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final u51 entrySet() {
        um2 um2Var = this.f82526b;
        if (um2Var != null) {
            return um2Var;
        }
        xm2 xm2Var = (xm2) this;
        um2 um2Var2 = new um2(xm2Var, xm2Var.f84638f, xm2Var.f84639g);
        this.f82526b = um2Var2;
        return um2Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        wm2 wm2Var = this.f82528d;
        if (wm2Var == null) {
            xm2 xm2Var = (xm2) this;
            wm2 wm2Var2 = new wm2(xm2Var.f84638f, 1, xm2Var.f84639g);
            this.f82528d = wm2Var2;
            wm2Var = wm2Var2;
        }
        return wm2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((u51) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public final Set keySet() {
        vm2 vm2Var = this.f82527c;
        if (vm2Var != null) {
            return vm2Var;
        }
        xm2 xm2Var = (xm2) this;
        vm2 vm2Var2 = new vm2(xm2Var, new wm2(xm2Var.f84638f, 0, xm2Var.f84639g));
        this.f82527c = vm2Var2;
        return vm2Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Collection values() {
        wm2 wm2Var = this.f82528d;
        if (wm2Var != null) {
            return wm2Var;
        }
        xm2 xm2Var = (xm2) this;
        wm2 wm2Var2 = new wm2(xm2Var.f84638f, 1, xm2Var.f84639g);
        this.f82528d = wm2Var2;
        return wm2Var2;
    }

    public Object writeReplace() {
        return new r51(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return ly2.a(entrySet());
    }

    public static q51 a() {
        return new q51(4);
    }
}
