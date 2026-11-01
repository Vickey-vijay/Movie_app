package com.google.common.collect;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class LinkedHashMultiset<E> extends AbstractMapBasedMultiset<E> {
    public static <E> LinkedHashMultiset<E> create() {
        return create(3);
    }

    public static <E> LinkedHashMultiset<E> create(int i10) {
        return new LinkedHashMultiset<>(i10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultiset
    public e2<E> newBackingMap(int i10) {
        return new f2(i10);
    }

    public LinkedHashMultiset(int i10) {
        super(i10);
    }

    public static <E> LinkedHashMultiset<E> create(Iterable<? extends E> iterable) {
        LinkedHashMultiset<E> linkedHashMultisetCreate = create(Multisets.g(iterable));
        y1.a(linkedHashMultisetCreate, iterable);
        return linkedHashMultisetCreate;
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.d, com.google.common.collect.b2
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.d, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }
}
