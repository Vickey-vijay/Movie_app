package com.google.protobuf;

/* JADX INFO: compiled from: ListValueKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ListValueKtKt {
    /* JADX INFO: renamed from: -initializelistValue, reason: not valid java name */
    public static final ListValue m229initializelistValue(bk.l<? super ListValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builderNewBuilder = ListValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ListValue copy(ListValue listValue, bk.l<? super ListValueKt.Dsl, mj.r> lVar) {
        ck.p.j(listValue, "<this>");
        ck.p.j(lVar, "block");
        ListValueKt.Dsl.Companion companion = ListValueKt.Dsl.Companion;
        ListValue.Builder builder = listValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        ListValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
