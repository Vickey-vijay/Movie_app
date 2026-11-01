package com.google.common.base;

import java.io.Serializable;
import m5.e;
import m5.i;
import m5.l;

/* JADX INFO: loaded from: classes11.dex */
final class FunctionalEquivalence<F, T> extends Equivalence<F> implements Serializable {
    private static final long serialVersionUID = 0;
    private final e<? super F, ? extends T> function;
    private final Equivalence<T> resultEquivalence;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FunctionalEquivalence)) {
            return false;
        }
        FunctionalEquivalence functionalEquivalence = (FunctionalEquivalence) obj;
        return this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence);
    }

    public int hashCode() {
        return i.b(this.function, this.resultEquivalence);
    }

    @Override // com.google.common.base.Equivalence
    public boolean doEquivalent(F f10, F f11) {
        return this.resultEquivalence.equivalent(this.function.apply(f10), this.function.apply(f11));
    }

    @Override // com.google.common.base.Equivalence
    public int doHash(F f10) {
        return this.resultEquivalence.hash(this.function.apply(f10));
    }

    public String toString() {
        return this.resultEquivalence + ".onResultOf(" + this.function + ")";
    }

    public FunctionalEquivalence(e<? super F, ? extends T> eVar, Equivalence<T> equivalence) {
        this.function = (e) l.m(eVar);
        this.resultEquivalence = (Equivalence) l.m(equivalence);
    }
}
