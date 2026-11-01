package com.google.protobuf;

/* JADX INFO: compiled from: OptionKt.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class OptionKtKt {
    /* JADX INFO: renamed from: -initializeoption, reason: not valid java name */
    public static final Option m232initializeoption(bk.l<? super OptionKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builderNewBuilder = Option.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Option copy(Option option, bk.l<? super OptionKt.Dsl, mj.r> lVar) {
        ck.p.j(option, "<this>");
        ck.p.j(lVar, "block");
        OptionKt.Dsl.Companion companion = OptionKt.Dsl.Companion;
        Option.Builder builder = option.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        OptionKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Any getValueOrNull(OptionOrBuilder optionOrBuilder) {
        ck.p.j(optionOrBuilder, "<this>");
        if (optionOrBuilder.hasValue()) {
            return optionOrBuilder.getValue();
        }
        return null;
    }
}
