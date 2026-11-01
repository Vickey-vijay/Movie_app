package com.fyber.inneractive.sdk.protobuf;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f18154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f18156c;

    public b3(e3 e3Var, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f18156c = e3Var;
        this.f18154a = comparable;
        this.f18155b = value;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f18154a;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f18155b;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f18154a.compareTo(((b3) obj).f18154a);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18154a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18155b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f18154a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f18155b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f18156c.a();
        Object obj2 = this.f18155b;
        this.f18155b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f18154a + "=" + this.f18155b;
    }

    public b3(e3 e3Var, Comparable comparable, Object obj) {
        this.f18156c = e3Var;
        this.f18154a = comparable;
        this.f18155b = obj;
    }
}
