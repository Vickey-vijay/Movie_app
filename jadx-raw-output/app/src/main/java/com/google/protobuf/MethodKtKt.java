package com.google.protobuf;

/* JADX INFO: compiled from: MethodKt.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class MethodKtKt {
    /* JADX INFO: renamed from: -initializemethod, reason: not valid java name */
    public static final Method m230initializemethod(bk.l<? super MethodKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builderNewBuilder = Method.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Method copy(Method method, bk.l<? super MethodKt.Dsl, mj.r> lVar) {
        ck.p.j(method, "<this>");
        ck.p.j(lVar, "block");
        MethodKt.Dsl.Companion companion = MethodKt.Dsl.Companion;
        Method.Builder builder = method.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        MethodKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
