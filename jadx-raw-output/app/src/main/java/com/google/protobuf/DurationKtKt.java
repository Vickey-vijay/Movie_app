package com.google.protobuf;

/* JADX INFO: compiled from: DurationKt.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DurationKtKt {
    /* JADX INFO: renamed from: -initializeduration, reason: not valid java name */
    public static final Duration m219initializeduration(bk.l<? super DurationKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builderNewBuilder = Duration.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Duration copy(Duration duration, bk.l<? super DurationKt.Dsl, mj.r> lVar) {
        ck.p.j(duration, "<this>");
        ck.p.j(lVar, "block");
        DurationKt.Dsl.Companion companion = DurationKt.Dsl.Companion;
        Duration.Builder builder = duration.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        DurationKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
