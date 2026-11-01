package com.google.protobuf;

/* JADX INFO: compiled from: SourceContextKt.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class SourceContextKtKt {
    /* JADX INFO: renamed from: -initializesourceContext, reason: not valid java name */
    public static final SourceContext m233initializesourceContext(bk.l<? super SourceContextKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builderNewBuilder = SourceContext.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext copy(SourceContext sourceContext, bk.l<? super SourceContextKt.Dsl, mj.r> lVar) {
        ck.p.j(sourceContext, "<this>");
        ck.p.j(lVar, "block");
        SourceContextKt.Dsl.Companion companion = SourceContextKt.Dsl.Companion;
        SourceContext.Builder builder = sourceContext.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        SourceContextKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
