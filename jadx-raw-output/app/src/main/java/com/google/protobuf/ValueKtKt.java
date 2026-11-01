package com.google.protobuf;

/* JADX INFO: compiled from: ValueKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ValueKtKt {
    /* JADX INFO: renamed from: -initializevalue, reason: not valid java name */
    public static final Value m240initializevalue(bk.l<? super ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builderNewBuilder = Value.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Value copy(Value value, bk.l<? super ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(value, "<this>");
        ck.p.j(lVar, "block");
        ValueKt.Dsl.Companion companion = ValueKt.Dsl.Companion;
        Value.Builder builder = value.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        ValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue getListValueOrNull(ValueOrBuilder valueOrBuilder) {
        ck.p.j(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasListValue()) {
            return valueOrBuilder.getListValue();
        }
        return null;
    }

    public static final Struct getStructValueOrNull(ValueOrBuilder valueOrBuilder) {
        ck.p.j(valueOrBuilder, "<this>");
        if (valueOrBuilder.hasStructValue()) {
            return valueOrBuilder.getStructValue();
        }
        return null;
    }
}
