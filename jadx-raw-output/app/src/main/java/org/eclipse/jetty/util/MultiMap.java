package org.eclipse.jetty.util;

import com.ironsource.G5;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes11.dex */
public class MultiMap<K> implements ConcurrentMap<K, Object>, Serializable {
    private static final long serialVersionUID = -6878723138353851005L;
    public ConcurrentMap<K, Object> _cmap;
    public Map<K, Object> _map;

    public MultiMap() {
        this._map = new HashMap();
    }

    public void addValues(K k10, List<? extends Object> list) {
        Object obj = this._map.get(k10);
        Object objAddCollection = LazyList.addCollection(obj, list);
        if (obj != objAddCollection) {
            this._map.put(k10, objAddCollection);
        }
    }

    public Object putValues(K k10, List<? extends Object> list) {
        return this._map.put(k10, list);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this._map.remove(obj);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean replace(K k10, Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k10, obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public void add(K k10, Object obj) {
        Object obj2 = this._map.get(k10);
        Object objAdd = LazyList.add(obj2, obj);
        if (obj2 != objAdd) {
            this._map.put(k10, objAdd);
        }
    }

    @Override // java.util.Map
    public void clear() {
        this._map.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this._map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this._map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, Object>> entrySet() {
        return this._map.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this._map.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size != 0) {
            return size != 1 ? LazyList.getList(obj2, true) : LazyList.get(obj2, 0);
        }
        return null;
    }

    public String getString(Object obj) {
        Object obj2 = this._map.get(obj);
        int size = LazyList.size(obj2);
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            Object obj3 = LazyList.get(obj2, 0);
            if (obj3 == null) {
                return null;
            }
            return obj3.toString();
        }
        StringBuilder sb2 = new StringBuilder(128);
        for (int i10 = 0; i10 < LazyList.size(obj2); i10++) {
            Object obj4 = LazyList.get(obj2, i10);
            if (obj4 != null) {
                if (sb2.length() > 0) {
                    sb2.append(',');
                }
                sb2.append(obj4.toString());
            }
        }
        return sb2.toString();
    }

    public Object getValue(Object obj, int i10) {
        Object obj2 = this._map.get(obj);
        if (i10 == 0 && LazyList.size(obj2) == 0) {
            return null;
        }
        return LazyList.get(obj2, i10);
    }

    public List getValues(Object obj) {
        return LazyList.getList(this._map.get(obj), true);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this._map.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this._map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this._map.keySet();
    }

    @Override // java.util.Map
    public Object put(K k10, Object obj) {
        return this._map.put(k10, LazyList.add(null, obj));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends Object> map) {
        if (!(map instanceof MultiMap)) {
            this._map.putAll(map);
            return;
        }
        for (Map.Entry<? extends K, ? extends Object> entry : map.entrySet()) {
            this._map.put(entry.getKey(), LazyList.clone(entry.getValue()));
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object putIfAbsent(K k10, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.putIfAbsent(k10, obj);
        }
        throw new UnsupportedOperationException();
    }

    public Object putValues(K k10, String... strArr) {
        Object objAdd = null;
        for (String str : strArr) {
            objAdd = LazyList.add(objAdd, str);
        }
        return this._map.put(k10, objAdd);
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.remove(obj, obj2);
        }
        throw new UnsupportedOperationException();
    }

    public boolean removeValue(K k10, Object obj) {
        Object objRemove = this._map.get(k10);
        int size = LazyList.size(objRemove);
        if (size > 0) {
            objRemove = LazyList.remove(objRemove, obj);
            if (objRemove == null) {
                this._map.remove(k10);
            } else {
                this._map.put(k10, objRemove);
            }
        }
        return LazyList.size(objRemove) != size;
    }

    @Override // java.util.Map
    public int size() {
        return this._map.size();
    }

    public String toString() {
        Object obj = this._cmap;
        if (obj == null) {
            obj = this._map;
        }
        return obj.toString();
    }

    public Map<K, String[]> toStringArrayMap() {
        HashMap<K, String[]> map = new HashMap<K, String[]>((this._map.size() * 3) / 2) { // from class: org.eclipse.jetty.util.MultiMap.1
            @Override // java.util.AbstractMap
            public String toString() {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('{');
                for (K k10 : keySet()) {
                    if (sb2.length() > 1) {
                        sb2.append(',');
                    }
                    sb2.append(k10);
                    sb2.append(G5.T);
                    sb2.append(Arrays.asList(get(k10)));
                }
                sb2.append('}');
                return sb2.toString();
            }
        };
        for (Map.Entry<K, Object> entry : this._map.entrySet()) {
            map.put(entry.getKey(), LazyList.toStringArray(entry.getValue()));
        }
        return map;
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this._map.values();
    }

    public MultiMap(Map<K, Object> map) {
        if (map instanceof ConcurrentMap) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(map);
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap(map);
    }

    public void addValues(K k10, String[] strArr) {
        Object obj = this._map.get(k10);
        Object objAddCollection = LazyList.addCollection(obj, Arrays.asList(strArr));
        if (obj != objAddCollection) {
            this._map.put(k10, objAddCollection);
        }
    }

    @Override // java.util.concurrent.ConcurrentMap, java.util.Map
    public Object replace(K k10, Object obj) {
        ConcurrentMap<K, Object> concurrentMap = this._cmap;
        if (concurrentMap != null) {
            return concurrentMap.replace(k10, obj);
        }
        throw new UnsupportedOperationException();
    }

    public MultiMap(MultiMap<K> multiMap) {
        if (multiMap._cmap != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(multiMap._cmap);
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap(multiMap._map);
    }

    public MultiMap(int i10) {
        this._map = new HashMap(i10);
    }

    public MultiMap(boolean z10) {
        if (z10) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this._cmap = concurrentHashMap;
            this._map = concurrentHashMap;
            return;
        }
        this._map = new HashMap();
    }
}
