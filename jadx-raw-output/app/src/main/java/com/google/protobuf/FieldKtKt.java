package com.google.protobuf;

/* JADX INFO: compiled from: FieldKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class FieldKtKt {
    /* JADX INFO: renamed from: -initializefield, reason: not valid java name */
    public static final Field m223initializefield(bk.l<? super FieldKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builderNewBuilder = Field.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Field copy(Field field, bk.l<? super FieldKt.Dsl, mj.r> lVar) {
        ck.p.j(field, "<this>");
        ck.p.j(lVar, "block");
        FieldKt.Dsl.Companion companion = FieldKt.Dsl.Companion;
        Field.Builder builder = field.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        FieldKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
