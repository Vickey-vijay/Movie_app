package com.google.protobuf;

/* JADX INFO: compiled from: StructKt.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class StructKtKt {
    /* JADX INFO: renamed from: -initializestruct, reason: not valid java name */
    public static final Struct m235initializestruct(bk.l<? super StructKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builderNewBuilder = Struct.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        StructKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Struct copy(Struct struct, bk.l<? super StructKt.Dsl, mj.r> lVar) {
        ck.p.j(struct, "<this>");
        ck.p.j(lVar, "block");
        StructKt.Dsl.Companion companion = StructKt.Dsl.Companion;
        Struct.Builder builder = struct.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        StructKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
