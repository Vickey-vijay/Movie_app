package com.yandex.div.internal.template;

import ck.p;

/* JADX INFO: compiled from: Field.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class FieldKt {
    public static final <T> Field<T> clone(Field<T> field, boolean z10) {
        if (field == null || p.e(field, Field.Null.INSTANCE) || p.e(field, Field.Placeholder.INSTANCE)) {
            return Field.Companion.nullField(z10);
        }
        if (field instanceof Field.Value) {
            return new Field.Value(z10, ((Field.Value) field).value);
        }
        if (field instanceof Field.Reference) {
            return new Field.Reference(z10, ((Field.Reference) field).reference);
        }
        throw new IllegalStateException("Unknown field type");
    }
}
