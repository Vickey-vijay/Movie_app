package com.google.protobuf;

/* JADX INFO: compiled from: FieldMaskKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class FieldMaskKtKt {
    /* JADX INFO: renamed from: -initializefieldMask, reason: not valid java name */
    public static final FieldMask m224initializefieldMask(bk.l<? super FieldMaskKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builderNewBuilder = FieldMask.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FieldMask copy(FieldMask fieldMask, bk.l<? super FieldMaskKt.Dsl, mj.r> lVar) {
        ck.p.j(fieldMask, "<this>");
        ck.p.j(lVar, "block");
        FieldMaskKt.Dsl.Companion companion = FieldMaskKt.Dsl.Companion;
        FieldMask.Builder builder = fieldMask.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        FieldMaskKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
