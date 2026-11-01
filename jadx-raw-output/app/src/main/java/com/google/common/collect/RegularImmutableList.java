package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
class RegularImmutableList<E> extends ImmutableList<E> {
    public static final ImmutableList<Object> EMPTY = new RegularImmutableList(new Object[0], 0);
    public final transient Object[] array;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient int f20523d;

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public int copyIntoArray(Object[] objArr, int i10) {
        System.arraycopy(this.array, 0, objArr, i10, this.f20523d);
        return i10 + this.f20523d;
    }

    @Override // java.util.List
    public E get(int i10) {
        m5.l.k(i10, this.f20523d);
        E e10 = (E) this.array[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int internalArrayEnd() {
        return this.f20523d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20523d;
    }

    public RegularImmutableList(Object[] objArr, int i10) {
        this.array = objArr;
        this.f20523d = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
