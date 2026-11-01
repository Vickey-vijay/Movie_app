package com.google.protobuf;

/* JADX INFO: compiled from: ApiKt.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class ApiKtKt {
    /* JADX INFO: renamed from: -initializeapi, reason: not valid java name */
    public static final Api m215initializeapi(bk.l<? super ApiKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builderNewBuilder = Api.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Api copy(Api api, bk.l<? super ApiKt.Dsl, mj.r> lVar) {
        ck.p.j(api, "<this>");
        ck.p.j(lVar, "block");
        ApiKt.Dsl.Companion companion = ApiKt.Dsl.Companion;
        Api.Builder builder = api.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        ApiKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(ApiOrBuilder apiOrBuilder) {
        ck.p.j(apiOrBuilder, "<this>");
        if (apiOrBuilder.hasSourceContext()) {
            return apiOrBuilder.getSourceContext();
        }
        return null;
    }
}
