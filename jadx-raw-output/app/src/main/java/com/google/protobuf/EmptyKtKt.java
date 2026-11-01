package com.google.protobuf;

/* JADX INFO: compiled from: EmptyKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class EmptyKtKt {
    /* JADX INFO: renamed from: -initializeempty, reason: not valid java name */
    public static final Empty m220initializeempty(bk.l<? super EmptyKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builderNewBuilder = Empty.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Empty copy(Empty empty, bk.l<? super EmptyKt.Dsl, mj.r> lVar) {
        ck.p.j(empty, "<this>");
        ck.p.j(lVar, "block");
        EmptyKt.Dsl.Companion companion = EmptyKt.Dsl.Companion;
        Empty.Builder builder = empty.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        EmptyKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
