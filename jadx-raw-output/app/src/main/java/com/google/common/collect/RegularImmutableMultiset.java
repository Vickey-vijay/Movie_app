package com.google.common.collect;

import com.google.common.primitives.Ints;
import java.io.Serializable;

/* JADX INFO: loaded from: classes6.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    public static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(e2.b());
    public final transient e2<E> contents;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f20535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient ImmutableSet<E> f20536f;

    public final class ElementSet extends IndexedImmutableSet<E> {
        public ElementSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return RegularImmutableMultiset.this.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i10) {
            return RegularImmutableMultiset.this.contents.i(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableMultiset.this.contents.C();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final int[] counts;
        public final Object[] elements;

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            ImmutableMultiset.b bVar = new ImmutableMultiset.b(this.elements.length);
            int i10 = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i10 >= objArr.length) {
                    return bVar.k();
                }
                bVar.j(objArr[i10], this.counts[i10]);
                i10++;
            }
        }

        public SerializedForm(b2<? extends Object> b2Var) {
            int size = b2Var.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i10 = 0;
            for (b2.a<? extends Object> aVar : b2Var.entrySet()) {
                this.elements[i10] = aVar.getElement();
                this.counts[i10] = aVar.getCount();
                i10++;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.b2
    public int count(Object obj) {
        return this.contents.f(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.b2
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.f20536f;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.f20536f = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public b2.a<E> getEntry(int i10) {
        return this.contents.g(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.b2
    public int size() {
        return this.f20535e;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public RegularImmutableMultiset(e2<E> e2Var) {
        this.contents = e2Var;
        long jK = 0;
        for (int i10 = 0; i10 < e2Var.C(); i10++) {
            jK += (long) e2Var.k(i10);
        }
        this.f20535e = Ints.m(jK);
    }
}
