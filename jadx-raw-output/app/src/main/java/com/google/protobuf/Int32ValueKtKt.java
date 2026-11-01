package com.google.protobuf;

/* JADX INFO: compiled from: Int32ValueKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Int32ValueKtKt {
    /* JADX INFO: renamed from: -initializeint32Value, reason: not valid java name */
    public static final Int32Value m227initializeint32Value(bk.l<? super Int32ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builderNewBuilder = Int32Value.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        Int32ValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Int32Value copy(Int32Value int32Value, bk.l<? super Int32ValueKt.Dsl, mj.r> lVar) {
        ck.p.j(int32Value, "<this>");
        ck.p.j(lVar, "block");
        Int32ValueKt.Dsl.Companion companion = Int32ValueKt.Dsl.Companion;
        Int32Value.Builder builder = int32Value.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        Int32ValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
