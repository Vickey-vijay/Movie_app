package com.google.common.base;

import java.io.Serializable;
import m5.e;
import m5.i;
import m5.l;
import m5.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        public static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class EquivalentToPredicate<T> implements m<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EquivalentToPredicate)) {
                return false;
            }
            EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
            return this.equivalence.equals(equivalentToPredicate.equivalence) && i.a(this.target, equivalentToPredicate.target);
        }

        public int hashCode() {
            return i.b(this.equivalence, this.target);
        }

        @Override // m5.m
        public boolean apply(T t10) {
            return this.equivalence.equivalent(t10, this.target);
        }

        public String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }

        public EquivalentToPredicate(Equivalence<T> equivalence, T t10) {
            this.equivalence = (Equivalence) l.m(equivalence);
            this.target = t10;
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        public static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        private Object readResolve() {
            return INSTANCE;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;
        private final T reference;

        public Wrapper(Equivalence<? super T> equivalence, T t10) {
            this.equivalence = (Equivalence) l.m(equivalence);
            this.reference = t10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    public abstract boolean doEquivalent(T t10, T t11);

    public abstract int doHash(T t10);

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    public final boolean equivalent(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return doEquivalent(t10, t11);
    }

    public final m<T> equivalentTo(T t10) {
        return new EquivalentToPredicate(this, t10);
    }

    public final int hash(T t10) {
        if (t10 == null) {
            return 0;
        }
        return doHash(t10);
    }

    public final <F> Equivalence<F> onResultOf(e<? super F, ? extends T> eVar) {
        return new FunctionalEquivalence(eVar, this);
    }

    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(S s10) {
        return new Wrapper<>(s10);
    }
}
