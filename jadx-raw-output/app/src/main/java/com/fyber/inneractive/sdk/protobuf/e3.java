package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e3 extends AbstractMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f18171h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18172a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile d3 f18176e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile x2 f18178g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f18173b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f18174c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f18177f = Collections.emptyMap();

    public final Object a(Comparable comparable, Object obj) {
        a();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((b3) this.f18173b.get(iA)).setValue(obj);
        }
        a();
        if (this.f18173b.isEmpty() && !(this.f18173b instanceof ArrayList)) {
            this.f18173b = new ArrayList(this.f18172a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f18172a) {
            return c().put(comparable, obj);
        }
        int size = this.f18173b.size();
        int i11 = this.f18172a;
        if (size == i11) {
            b3 b3Var = (b3) this.f18173b.remove(i11 - 1);
            c().put(b3Var.f18154a, b3Var.f18155b);
        }
        this.f18173b.add(i10, new b3(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3)) {
            return super.equals(obj);
        }
        e3 e3Var = (e3) obj;
        int size = size();
        if (size != e3Var.size()) {
            return false;
        }
        int size2 = this.f18173b.size();
        if (size2 != e3Var.f18173b.size()) {
            return entrySet().equals(e3Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!((Map.Entry) this.f18173b.get(i10)).equals((Map.Entry) e3Var.f18173b.get(i10))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f18174c.equals(e3Var.f18174c);
        }
        return true;
    }

    public final Iterable b() {
        return this.f18174c.isEmpty() ? a3.f18150b : this.f18174c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f18174c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f18176e == null) {
            this.f18176e = new d3(this);
        }
        return this.f18176e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((b3) this.f18173b.get(iA)).f18155b : this.f18174c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.f18173b.size();
        int iHashCode = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode += ((b3) this.f18173b.get(i10)).hashCode();
        }
        return this.f18174c.size() > 0 ? iHashCode + this.f18174c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f18174c.size() + this.f18173b.size();
    }

    public e3(int i10) {
        this.f18172a = i10;
    }

    public final SortedMap c() {
        a();
        if (this.f18174c.isEmpty() && !(this.f18174c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f18174c = treeMap;
            this.f18177f = treeMap.descendingMap();
        }
        return (SortedMap) this.f18174c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        a();
        if (!this.f18173b.isEmpty()) {
            this.f18173b.clear();
        }
        if (!this.f18174c.isEmpty()) {
            this.f18174c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            a();
            Object obj2 = ((b3) this.f18173b.remove(iA)).f18155b;
            if (!this.f18174c.isEmpty()) {
                Iterator it = c().entrySet().iterator();
                this.f18173b.add(new b3(this, (Map.Entry) it.next()));
                it.remove();
            }
            return obj2;
        }
        if (this.f18174c.isEmpty()) {
            return null;
        }
        return this.f18174c.remove(comparable);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i10;
        int i11;
        int i12;
        int iCompareTo;
        int size = this.f18173b.size();
        int i13 = size - 1;
        if (i13 < 0) {
            i10 = 0;
            while (i10 <= i13) {
                i12 = (i10 + i13) / 2;
                iCompareTo = comparable.compareTo(((b3) this.f18173b.get(i12)).f18154a);
                if (iCompareTo < 0) {
                    i13 = i12 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i12;
                    }
                    i10 = i12 + 1;
                }
            }
            i11 = i10 + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((b3) this.f18173b.get(i13)).f18154a);
            if (iCompareTo2 > 0) {
                i11 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i13;
                }
                i10 = 0;
                while (i10 <= i13) {
                    i12 = (i10 + i13) / 2;
                    iCompareTo = comparable.compareTo(((b3) this.f18173b.get(i12)).f18154a);
                    if (iCompareTo < 0) {
                        i13 = i12 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i12;
                        }
                        i10 = i12 + 1;
                    }
                }
                i11 = i10 + 1;
            }
        }
        return -i11;
    }

    public final void a() {
        if (this.f18175d) {
            throw new UnsupportedOperationException();
        }
    }
}
