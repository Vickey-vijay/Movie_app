package com.google.protobuf;

/* JADX INFO: compiled from: AnyKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class AnyKtKt {
    /* JADX INFO: renamed from: -initializeany, reason: not valid java name */
    public static final Any m214initializeany(bk.l<? super AnyKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builderNewBuilder = Any.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any copy(Any any, bk.l<? super AnyKt.Dsl, mj.r> lVar) {
        ck.p.j(any, "<this>");
        ck.p.j(lVar, "block");
        AnyKt.Dsl.Companion companion = AnyKt.Dsl.Companion;
        Any.Builder builder = any.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        AnyKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
