package com.google.protobuf;

/* JADX INFO: compiled from: DoubleValueKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DoubleValueKtKt {
    /* JADX INFO: renamed from: -initializedoubleValue, reason: not valid java name */
    public static final DoubleValue m218initializedoubleValue(bk.l<? super DoubleValueKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builderNewBuilder = DoubleValue.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        DoubleValueKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DoubleValue copy(DoubleValue doubleValue, bk.l<? super DoubleValueKt.Dsl, mj.r> lVar) {
        ck.p.j(doubleValue, "<this>");
        ck.p.j(lVar, "block");
        DoubleValueKt.Dsl.Companion companion = DoubleValueKt.Dsl.Companion;
        DoubleValue.Builder builder = doubleValue.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        DoubleValueKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
