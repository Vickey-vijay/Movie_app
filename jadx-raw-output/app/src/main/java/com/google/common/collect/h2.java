package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h2 {
    public static <T> T[] b(T[] tArr, int i10) {
        if (tArr.length != 0) {
            tArr = (T[]) Arrays.copyOf(tArr, 0);
        }
        return (T[]) Arrays.copyOf(tArr, i10);
    }

    public static <T> T[] a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    public static <K, V> Map<K, V> c(int i10) {
        return CompactHashMap.createWithExpectedSize(i10);
    }

    public static <K, V> Map<K, V> d(int i10) {
        return CompactLinkedHashMap.createWithExpectedSize(i10);
    }

    public static <E> Set<E> e(int i10) {
        return CompactLinkedHashSet.createWithExpectedSize(i10);
    }

    public static <E> Set<E> f() {
        return CompactHashSet.create();
    }

    public static <K, V> Map<K, V> g() {
        return CompactHashMap.create();
    }

    public static MapMaker h(MapMaker mapMaker) {
        return mapMaker.l();
    }
}
