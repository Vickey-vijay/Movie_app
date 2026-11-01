package com.google.protobuf;

/* JADX INFO: compiled from: MixinKt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class MixinKtKt {
    /* JADX INFO: renamed from: -initializemixin, reason: not valid java name */
    public static final Mixin m231initializemixin(bk.l<? super MixinKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builderNewBuilder = Mixin.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Mixin copy(Mixin mixin, bk.l<? super MixinKt.Dsl, mj.r> lVar) {
        ck.p.j(mixin, "<this>");
        ck.p.j(lVar, "block");
        MixinKt.Dsl.Companion companion = MixinKt.Dsl.Companion;
        Mixin.Builder builder = mixin.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        MixinKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
