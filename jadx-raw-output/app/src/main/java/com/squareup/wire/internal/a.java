package com.squareup.wire.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: Internal.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    public static int c(Object obj, Object obj2, Object obj3) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0) + (obj3 == null ? 0 : 1);
    }

    public static <T> List<T> a(String str, List<T> list) {
        if (list != null) {
            return (list == Collections.emptyList() || (list instanceof ImmutableList)) ? new MutableOnWriteList(list) : new ArrayList(list);
        }
        throw new NullPointerException(str + " == null");
    }

    public static <K, V> Map<K, V> b(String str, Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        throw new NullPointerException(str + " == null");
    }

    public static boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static <T> List<T> e(String str, List<T> list) {
        if (list == null) {
            throw new NullPointerException(str + " == null");
        }
        if (list instanceof MutableOnWriteList) {
            list = ((MutableOnWriteList) list).mutableList;
        }
        if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
            return list;
        }
        ImmutableList immutableList = new ImmutableList(list);
        if (!immutableList.contains(null)) {
            return immutableList;
        }
        throw new IllegalArgumentException(str + ".contains(null)");
    }

    public static <K, V> Map<K, V> f(String str, Map<K, V> map) {
        if (map == null) {
            throw new NullPointerException(str + " == null");
        }
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (linkedHashMap.containsKey(null)) {
            throw new IllegalArgumentException(str + ".containsKey(null)");
        }
        if (!linkedHashMap.containsValue(null)) {
            return Collections.unmodifiableMap(linkedHashMap);
        }
        throw new IllegalArgumentException(str + ".containsValue(null)");
    }

    public static <T> List<T> g() {
        return new MutableOnWriteList(Collections.emptyList());
    }

    public static <K, V> Map<K, V> h() {
        return new LinkedHashMap();
    }
}
