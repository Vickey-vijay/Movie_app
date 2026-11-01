package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient int[] f20339f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int[] f20340g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f20341h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f20342i;

    public CompactLinkedHashSet() {
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return d2.f(this);
    }

    public final void u(int i10, int i11) {
        if (i10 == -2) {
            this.f20341h = i11;
        } else {
            v(i10, i11);
        }
        if (i11 == -2) {
            this.f20342i = i10;
        } else {
            t(i11, i10);
        }
    }

    public CompactLinkedHashSet(int i10) {
        super(i10);
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactLinkedHashSetCreateWithExpectedSize.addAll(collection);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i10) {
        return new CompactLinkedHashSet<>(i10);
    }

    @Override // com.google.common.collect.CompactHashSet
    public int firstEntryIndex() {
        return this.f20341h;
    }

    public final int[] r() {
        int[] iArr = this.f20339f;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final int[] s() {
        int[] iArr = this.f20340g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) d2.g(this, tArr);
    }

    @Override // com.google.common.collect.CompactHashSet
    public int adjustAfterRemove(int i10, int i11) {
        if (i10 >= size()) {
            return i11;
        }
        return i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.f20339f = new int[iAllocArrays];
        this.f20340g = new int[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f20341h = -2;
        this.f20342i = -2;
        int[] iArr = this.f20339f;
        if (iArr != null && this.f20340g != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f20340g, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    public Set<E> convertToHashFloodingResistantImplementation() {
        Set<E> setConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.f20339f = null;
        this.f20340g = null;
        return setConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashSet
    public int getSuccessor(int i10) {
        return s()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void init(int i10) {
        super.init(i10);
        this.f20341h = -2;
        this.f20342i = -2;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void insertEntry(int i10, E e10, int i11, int i12) {
        super.insertEntry(i10, e10, i11, i12);
        u(this.f20342i, i10);
        u(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    public void moveLastEntry(int i10, int i11) {
        int size = size() - 1;
        super.moveLastEntry(i10, i11);
        u(q(i10), getSuccessor(i10));
        if (i10 < size) {
            u(q(size), i10);
            u(i10, getSuccessor(size));
        }
        r()[size] = 0;
        s()[size] = 0;
    }

    public final int q(int i10) {
        return r()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    public void resizeEntries(int i10) {
        super.resizeEntries(i10);
        this.f20339f = Arrays.copyOf(r(), i10);
        this.f20340g = Arrays.copyOf(s(), i10);
    }

    public final void t(int i10, int i11) {
        r()[i10] = i11 + 1;
    }

    public final void v(int i10, int i11) {
        s()[i10] = i11 + 1;
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactLinkedHashSetCreateWithExpectedSize, eArr);
        return compactLinkedHashSetCreateWithExpectedSize;
    }
}
