package com.google.protobuf;

/* JADX INFO: compiled from: BytesValueKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BytesValueKtKt {
    /* JADX INFO: renamed from: -initializebytesValue, reason: not valid java name */
    public static final BytesValue m217initializebytesValue(bk.l<? super BytesValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builderNewBuilder = BytesValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final BytesValue copy(BytesValue bytesValue, bk.l<? super BytesValueKt.Dsl, mj.r> lVar) {
        ck.p.j(bytesValue, "<this>");
        ck.p.j(lVar, "block");
        BytesValueKt.Dsl.Companion companion = BytesValueKt.Dsl.Companion;
        BytesValue.Builder builder = bytesValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        BytesValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
