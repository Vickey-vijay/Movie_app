package com.google.protobuf;

/* JADX INFO: compiled from: TypeKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TypeKtKt {
    /* JADX INFO: renamed from: -initializetype, reason: not valid java name */
    public static final Type m237initializetype(bk.l<? super TypeKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builderNewBuilder = Type.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Type copy(Type type, bk.l<? super TypeKt.Dsl, mj.r> lVar) {
        ck.p.j(type, "<this>");
        ck.p.j(lVar, "block");
        TypeKt.Dsl.Companion companion = TypeKt.Dsl.Companion;
        Type.Builder builder = type.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        TypeKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(TypeOrBuilder typeOrBuilder) {
        ck.p.j(typeOrBuilder, "<this>");
        if (typeOrBuilder.hasSourceContext()) {
            return typeOrBuilder.getSourceContext();
        }
        return null;
    }
}
