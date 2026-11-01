package com.google.protobuf;

/* JADX INFO: compiled from: Int64ValueKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Int64ValueKtKt {
    /* JADX INFO: renamed from: -initializeint64Value, reason: not valid java name */
    public static final Int64Value m228initializeint64Value(bk.l<? super Int64ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builderNewBuilder = Int64Value.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Int64Value copy(Int64Value int64Value, bk.l<? super Int64ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(int64Value, "<this>");
        ck.p.j(lVar, "block");
        Int64ValueKt.Dsl.Companion companion = Int64ValueKt.Dsl.Companion;
        Int64Value.Builder builder = int64Value.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        Int64ValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
