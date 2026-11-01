package com.google.protobuf;

/* JADX INFO: compiled from: TimestampKt.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class TimestampKtKt {
    /* JADX INFO: renamed from: -initializetimestamp, reason: not valid java name */
    public static final Timestamp m236initializetimestamp(bk.l<? super TimestampKt.Dsl, mj.r> lVar) {
        ck.p.j(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builderNewBuilder = Timestamp.newBuilder();
        ck.p.i(builderNewBuilder, "newBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builderNewBuilder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp copy(Timestamp timestamp, bk.l<? super TimestampKt.Dsl, mj.r> lVar) {
        ck.p.j(timestamp, "<this>");
        ck.p.j(lVar, "block");
        TimestampKt.Dsl.Companion companion = TimestampKt.Dsl.Companion;
        Timestamp.Builder builder = timestamp.toBuilder();
        ck.p.i(builder, "this.toBuilder()");
        TimestampKt.Dsl dsl_create = companion._create(builder);
        lVar.invoke(dsl_create);
        return dsl_create._build();
    }
}
