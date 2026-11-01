package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class ByFunctionOrdering<F, T> extends Ordering<F> implements Serializable {
    private static final long serialVersionUID = 0;
    public final m5.e<F, ? extends T> function;
    public final Ordering<T> ordering;

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByFunctionOrdering)) {
            return false;
        }
        ByFunctionOrdering byFunctionOrdering = (ByFunctionOrdering) obj;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public int hashCode() {
        return m5.i.b(this.function, this.ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.ordering.compare(this.function.apply(f10), this.function.apply(f11));
    }

    public String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }

    public ByFunctionOrdering(m5.e<F, ? extends T> eVar, Ordering<T> ordering) {
        this.function = (m5.e) m5.l.m(eVar);
        this.ordering = (Ordering) m5.l.m(ordering);
    }
}
