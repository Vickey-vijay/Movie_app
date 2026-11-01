package com.google.protobuf;

/* JADX INFO: compiled from: StringValueKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class StringValueKtKt {
    /* JADX INFO: renamed from: -initializestringValue, reason: not valid java name */
    public static final StringValue m234initializestringValue(bk.l<? super StringValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builderNewBuilder = StringValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StringValue copy(StringValue stringValue, bk.l<? super StringValueKt.Dsl, mj.r> lVar) {
        ck.p.j(stringValue, "<this>");
        ck.p.j(lVar, "block");
        StringValueKt.Dsl.Companion companion = StringValueKt.Dsl.Companion;
        StringValue.Builder builder = stringValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        StringValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
