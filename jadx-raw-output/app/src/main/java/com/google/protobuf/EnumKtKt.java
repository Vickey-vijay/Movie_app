package com.google.protobuf;

/* JADX INFO: compiled from: EnumKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumKtKt {
    /* JADX INFO: renamed from: -initializeenum, reason: not valid java name */
    public static final Enum m221initializeenum(bk.l<? super EnumKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builderNewBuilder = Enum.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Enum copy(Enum r10, bk.l<? super EnumKt.Dsl, mj.r> lVar) {
        ck.p.j(r10, "<this>");
        ck.p.j(lVar, "block");
        EnumKt.Dsl.Companion companion = EnumKt.Dsl.Companion;
        Enum.Builder builder = r10.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        EnumKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final SourceContext getSourceContextOrNull(EnumOrBuilder enumOrBuilder) {
        ck.p.j(enumOrBuilder, "<this>");
        if (enumOrBuilder.hasSourceContext()) {
            return enumOrBuilder.getSourceContext();
        }
        return null;
    }
}
