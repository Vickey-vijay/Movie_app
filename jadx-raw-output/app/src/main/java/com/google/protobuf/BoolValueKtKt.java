package com.google.protobuf;

/* JADX INFO: compiled from: BoolValueKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class BoolValueKtKt {
    /* JADX INFO: renamed from: -initializeboolValue, reason: not valid java name */
    public static final BoolValue m216initializeboolValue(bk.l<? super BoolValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builderNewBuilder = BoolValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BoolValue copy(BoolValue boolValue, bk.l<? super BoolValueKt.Dsl, mj.r> lVar) {
        ck.p.j(boolValue, "<this>");
        ck.p.j(lVar, "block");
        BoolValueKt.Dsl.Companion companion = BoolValueKt.Dsl.Companion;
        BoolValue.Builder builder = boolValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        BoolValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
