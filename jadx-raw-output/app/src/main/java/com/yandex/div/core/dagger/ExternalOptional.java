package com.yandex.div.core.dagger;

import ck.i;

/* JADX INFO: compiled from: ExternalOptional.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ExternalOptional<T> {
    public static final Companion Companion = new Companion(null);
    private final qe.b<T> optional;

    /* JADX INFO: compiled from: ExternalOptional.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final <T> ExternalOptional<T> empty() {
            return new ExternalOptional<>(qe.b.f66572b.a());
        }

        public final <T> ExternalOptional<T> of(T t10) {
            return new ExternalOptional<>(qe.b.f66572b.b(t10));
        }

        public final <T> ExternalOptional<T> ofNullable(T t10) {
            return t10 != null ? of(t10) : empty();
        }
    }

    public static final <T> ExternalOptional<T> empty() {
        return Companion.empty();
    }

    public static final <T> ExternalOptional<T> of(T t10) {
        return Companion.of(t10);
    }

    public final qe.b<T> getOptional() {
        return this.optional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExternalOptional(qe.b<? extends T> bVar) {
        this.optional = bVar;
    }
}
