package com.google.protobuf;

/* JADX INFO: compiled from: FloatValueKt.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class FloatValueKtKt {
    /* JADX INFO: renamed from: -initializefloatValue, reason: not valid java name */
    public static final FloatValue m226initializefloatValue(bk.l<? super FloatValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builderNewBuilder = FloatValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FloatValue copy(FloatValue floatValue, bk.l<? super FloatValueKt.Dsl, mj.r> lVar) {
        ck.p.j(floatValue, "<this>");
        ck.p.j(lVar, "block");
        FloatValueKt.Dsl.Companion companion = FloatValueKt.Dsl.Companion;
        FloatValue.Builder builder = floatValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        FloatValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
