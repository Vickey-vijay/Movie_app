package com.google.protobuf.kotlin;

import ck.p;
import dk.a;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: UnmodifiableCollections.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class UnmodifiableMapEntries<K, V> extends UnmodifiableCollection<Map.Entry<? extends K, ? extends V>> implements Set<Map.Entry<? extends K, ? extends V>> {
    private final Set<Map.Entry<K, V>> delegate;

    /* JADX INFO: renamed from: com.google.protobuf.kotlin.UnmodifiableMapEntries$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: UnmodifiableCollections.kt */
    public static final class AnonymousClass1 implements Iterator<Map.Entry<? extends K, ? extends V>>, a {
        private final /* synthetic */ Iterator<Map.Entry<K, V>> $$delegate_0;
        public final /* synthetic */ Iterator<Map.Entry<K, V>> $itr;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.$$delegate_0.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
            this.$itr = it;
            this.$$delegate_0 = it;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            return new UnmodifiableMapEntry(this.$itr.next());
        }
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return contains((Map.Entry<? extends Object, ? extends Object>) obj);
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntries(Set<? extends Map.Entry<? extends K, ? extends V>> set) {
        super(set);
        p.j(set, "delegate");
        this.delegate = set;
    }

    public /* bridge */ boolean contains(Map.Entry<? extends Object, ? extends Object> entry) {
        return super.contains(entry);
    }

    @Override // com.google.protobuf.kotlin.UnmodifiableCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new AnonymousClass1(this.delegate.iterator());
    }
}
