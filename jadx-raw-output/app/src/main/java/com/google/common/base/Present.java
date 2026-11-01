package com.google.common.base;

import java.util.Collections;
import java.util.Set;
import m5.e;
import m5.l;
import m5.p;

/* JADX INFO: loaded from: classes4.dex */
final class Present<T> extends Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.google.common.base.Optional
    public T or(T t10) {
        l.n(t10, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.Optional
    public boolean equals(Object obj) {
        if (obj instanceof Present) {
            return this.reference.equals(((Present) obj).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public String toString() {
        return "Optional.of(" + this.reference + ")";
    }

    @Override // com.google.common.base.Optional
    public <V> Optional<V> transform(e<? super T, V> eVar) {
        return new Present(l.n(eVar.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    public Present(T t10) {
        this.reference = t10;
    }

    @Override // com.google.common.base.Optional
    public Optional<T> or(Optional<? extends T> optional) {
        l.m(optional);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(p<? extends T> pVar) {
        l.m(pVar);
        return this.reference;
    }
}
