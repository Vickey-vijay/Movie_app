package com.yandex.div.internal.parser;

import bk.l;

/* JADX INFO: compiled from: TypeHelpers.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface TypeHelper<T> {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: TypeHelpers.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final <T> TypeHelper<T> from(final T t10, final l<Object, Boolean> lVar) {
            return new TypeHelper<T>(t10, lVar) { // from class: com.yandex.div.internal.parser.TypeHelper$Companion$from$1
                public final /* synthetic */ l<Object, Boolean> $validator;
                private final T typeDefault;

                {
                    this.$validator = lVar;
                    this.typeDefault = t10;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public T getTypeDefault() {
                    return this.typeDefault;
                }

                @Override // com.yandex.div.internal.parser.TypeHelper
                public boolean isTypeValid(Object obj) {
                    return this.$validator.invoke(obj).booleanValue();
                }
            };
        }
    }

    T getTypeDefault();

    boolean isTypeValid(Object obj);
}
