package com.google.common.collect;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {
    private final boolean accessOrder;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f20337i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public transient int f20338j;
    public transient long[] links;

    public CompactLinkedHashMap() {
        this(3);
    }

    public final void y(int i10, int i11) {
        if (i10 == -2) {
            this.f20337i = i11;
        } else {
            z(i10, i11);
        }
        if (i11 == -2) {
            this.f20338j = i10;
        } else {
            x(i11, i10);
        }
    }

    public CompactLinkedHashMap(int i10) {
        this(i10, false);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactLinkedHashMap<>(i10);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void accessEntry(int i10) {
        if (this.accessOrder) {
            y(t(i10), getSuccessor(i10));
            y(this.f20338j, i10);
            y(i10, -2);
            incrementModCount();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> createHashFloodingResistantDelegate(int i10) {
        return new LinkedHashMap(i10, 1.0f, this.accessOrder);
    }

    @Override // com.google.common.collect.CompactHashMap
    public int firstEntryIndex() {
        return this.f20337i;
    }

    public final long[] v() {
        long[] jArr = this.links;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    public CompactLinkedHashMap(int i10, boolean z10) {
        super(i10);
        this.accessOrder = z10;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int adjustAfterRemove(int i10, int i11) {
        if (i10 >= size()) {
            return i11;
        }
        return i10;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int allocArrays() {
        int iAllocArrays = super.allocArrays();
        this.links = new long[iAllocArrays];
        return iAllocArrays;
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (needsAllocArrays()) {
            return;
        }
        this.f20337i = -2;
        this.f20338j = -2;
        long[] jArr = this.links;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    public Map<K, V> convertToHashFloodingResistantImplementation() {
        Map<K, V> mapConvertToHashFloodingResistantImplementation = super.convertToHashFloodingResistantImplementation();
        this.links = null;
        return mapConvertToHashFloodingResistantImplementation;
    }

    @Override // com.google.common.collect.CompactHashMap
    public int getSuccessor(int i10) {
        return ((int) u(i10)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void init(int i10) {
        super.init(i10);
        this.f20337i = -2;
        this.f20338j = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    public void insertEntry(int i10, K k10, V v10, int i11, int i12) {
        super.insertEntry(i10, k10, v10, i11, i12);
        y(this.f20338j, i10);
        y(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void moveLastEntry(int i10, int i11) {
        int size = size() - 1;
        super.moveLastEntry(i10, i11);
        y(t(i10), getSuccessor(i10));
        if (i10 < size) {
            y(t(size), i10);
            y(i10, getSuccessor(size));
        }
        w(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    public void resizeEntries(int i10) {
        super.resizeEntries(i10);
        this.links = Arrays.copyOf(v(), i10);
    }

    public final int t(int i10) {
        return ((int) (u(i10) >>> 32)) - 1;
    }

    public final long u(int i10) {
        return v()[i10];
    }

    public final void w(int i10, long j10) {
        v()[i10] = j10;
    }

    public final void x(int i10, int i11) {
        w(i10, (u(i10) & 4294967295L) | (((long) (i11 + 1)) << 32));
    }

    public final void z(int i10, int i11) {
        w(i10, (u(i10) & (-4294967296L)) | (((long) (i11 + 1)) & 4294967295L));
    }
}
