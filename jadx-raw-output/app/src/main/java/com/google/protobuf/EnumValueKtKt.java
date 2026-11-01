package com.google.protobuf;

/* JADX INFO: compiled from: EnumValueKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumValueKtKt {
    /* JADX INFO: renamed from: -initializeenumValue, reason: not valid java name */
    public static final EnumValue m222initializeenumValue(bk.l<? super EnumValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builderNewBuilder = EnumValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final EnumValue copy(EnumValue enumValue, bk.l<? super EnumValueKt.Dsl, mj.r> lVar) {
        ck.p.j(enumValue, "<this>");
        ck.p.j(lVar, "block");
        EnumValueKt.Dsl.Companion companion = EnumValueKt.Dsl.Companion;
        EnumValue.Builder builder = enumValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        EnumValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
